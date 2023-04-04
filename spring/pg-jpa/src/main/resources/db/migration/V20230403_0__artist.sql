CREATE TABLE artist
(
    id SERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    year_est INT
);

CREATE INDEX ON artist(name);