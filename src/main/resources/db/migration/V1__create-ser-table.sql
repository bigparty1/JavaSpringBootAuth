--Criação da tabela "user" (user entre aspas duplas, pois é uma palavra reservada do PostgresSQL)
CREATE TABLE IF NOT EXISTS "user" (
    user_id BIGSERIAL PRIMARY KEY,
    username VARCHAR(100) NOT NULL UNIQUE,
    hash VARCHAR(255) NOT NULL,
    salt VARCHAR(255) NOT NULL,
    role VARCHAR(50) NOT NULL CHECK (role IN ('USER', 'ADMIN')) -- Restrição para garantir que o papel seja 'USER' ou 'ADMIN'
);