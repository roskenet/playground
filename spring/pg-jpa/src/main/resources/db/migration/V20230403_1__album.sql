CREATE TABLE album (
    id SERIAL PRIMARY KEY,
    artist_id INT REFERENCES artist(id) NOT NULL,
    name TEXT NOT NULL
)

CREATE INDEX ON album(artist_id);