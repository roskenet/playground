CREATE TABLE IF NOT EXISTS artist (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name TEXT,
    created_at TIMESTAMP WITH TIME ZONE,
    last_modified_at TIMESTAMP WITH TIME ZONE
);

CREATE TABLE IF NOT EXISTS song (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name TEXT,
    release_year INT,
    created_at TIMESTAMP WITH TIME ZONE,
    last_modified_at TIMESTAMP WITH TIME ZONE
)