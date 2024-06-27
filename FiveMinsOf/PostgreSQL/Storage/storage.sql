-- Why is disk space consumption so oddly in PostgreSQL?
-- When executing INSERTS or UPDATES it sometimes bloats the table...
-- ...sometimes it doesn't...

-- Insert Data:
DROP TABLE t_test;
CREATE TABLE t_test (id int) WITH (autovacuum_enabled = off);

INSERT INTO t_test
SELECT * FROM generate_series(1, 100000);

-- How does it look like?
SELECT * FROM t_test;

-- How big am I?
SELECT pg_size_pretty(pg_relation_size('t_test'));

-- We UPDATE:
UPDATE t_test SET id = id + 1;
SELECT * FROM t_test ORDER BY id;

-- How big am I now?
SELECT pg_size_pretty(pg_relation_size('t_test'));

-- We want our money back!
VACUUM t_test;

-- Size?
SELECT pg_size_pretty(pg_relation_size('t_test'));

-- We do another update
UPDATE t_test SET id = id + 1;

-- and now?
SELECT pg_size_pretty(pg_relation_size('t_test'));

UPDATE t_test SET id = id + 1;
SELECT pg_size_pretty(pg_relation_size('t_test'));

-- Let's run some more queries:
VACUUM t_test;
UPDATE t_test SET id = id + 1;
VACUUM t_test;

-- And again: the size hasn't changed:
SELECT pg_size_pretty(pg_relation_size('t_test'));

-- We basically read the disk backwards:
-- (BTW: The order is deterministic!)
SELECT CTID, id from t_test ORDER BY CTID DESC;

-- We delete 2000 rows:
DELETE FROM t_test
WHERE id > 99000
   OR id < 1000;

-- and execute a vacuum again:
VACUUM t_test;
SELECT pg_size_pretty(pg_relation_size('t_test'));

/*
 Although only 2% of the data has been deleted,
 the size of the table has gone down by two-thirds.
 The reason for this is that if VACUUM only finds dead rows after
 a certain position in the table,
 it can return space to the filesystem.
 This is the only case in which you will actually
 see the table size go down.
 Of course, normal users have no control
 over the physical position of data on the disk.
 Therefore, storage consumption will most likely
 stay somewhat the same unless all rows are deleted.
 */

 /*
PostgreSQL Docs:
The FULL option is not recommended for routine use.
...
VACUUM FULL should not be used as a problem solver by default.
...
Rely on the autovacuum tool in Postgres! It knows what to do and when!
*/