CREATE TABLE chemelement (
    id UUID PRIMARY KEY,
    atomnr INTEGER NOT NULL UNIQUE,
    symbol TEXT NOT NULL UNIQUE,
    name TEXT NOT NULL UNIQUE
);
