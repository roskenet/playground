#!/bin/bash

DB_DIR="/var/lib/postgresql/16/main"

rm -rf /var/lib/postgresql/16/main

# Nur initialisieren, wenn leer
if [ ! -f "$DB_DIR/PG_VERSION" ]; then
  echo "Initialisiere PostgreSQL-Datenverzeichnis ..."
  mkdir -p "$DB_DIR"
  chown -R postgres:postgres "$DB_DIR"
  su - postgres -c "/usr/lib/postgresql/16/bin/initdb -D $DB_DIR"
else
  echo "PostgreSQL-Datenverzeichnis bereits vorhanden."
fi

