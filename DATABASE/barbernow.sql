CREATE TABLE pessoa (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    telefone VARCHAR(11)
);

CREATE TABLE cliente (
    id INT PRIMARY KEY,
    email VARCHAR(100),
    FOREIGN KEY (id) REFERENCES pessoa(id)
);

CREATE TABLE barbeiro (
    id INT PRIMARY KEY,
    email VARCHAR(100),
    endereco VARCHAR(200),
    FOREIGN KEY (id) REFERENCES pessoa(id)
);

CREATE TABLE barbearia (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    endereco VARCHAR(200)
);

CREATE TABLE barbeiro_barbearia (
    barbeiro_id INT,
    barbearia_id INT,
    PRIMARY KEY (barbeiro_id, barbearia_id),
    FOREIGN KEY (barbeiro_id) REFERENCES barbeiro(id),
    FOREIGN KEY (barbearia_id) REFERENCES barbearia(id)
);

CREATE TABLE agendamento (
    id SERIAL PRIMARY KEY,
    cliente_id INT REFERENCES cliente(id),
    barbeiro_id INT REFERENCES barbeiro(id),
    data_hora TIMESTAMP,
    valor NUMERIC(10,2)
);

