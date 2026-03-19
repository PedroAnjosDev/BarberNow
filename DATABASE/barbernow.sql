DROP TABLE IF EXISTS agendamento;
DROP TABLE IF EXISTS cliente, barbeiro;

-- 2. Criar tabelas
CREATE TABLE cliente (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    telefone VARCHAR(11),
    email VARCHAR(100)
);

CREATE TABLE barbeiro (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    telefone VARCHAR(11),
    email VARCHAR(100),
    endereco VARCHAR(200)
);

CREATE TABLE agendamento (
    id SERIAL PRIMARY KEY,
    cliente_id INT REFERENCES cliente(id),
    barbeiro_id INT REFERENCES barbeiro(id),
    data_hora TIMESTAMP,
    valor NUMERIC(10,2)
);

-- 3. Inserir TODOS os dados
INSERT INTO cliente VALUES 
(DEFAULT, 'João Silva', '11987654321', 'joao@email.com'),
(DEFAULT, 'Maria Santos', '11912345678', 'maria@email.com'),
(DEFAULT, 'Pedro Lima', '11876543210', 'pedro@email.com'),
(DEFAULT, 'Ana Costa', '11923456789', 'ana@email.com'),
(DEFAULT, 'Lucas Souza', '11934567890', 'lucas@email.com');

INSERT INTO barbeiro VALUES 
(DEFAULT, 'Pedro Master', '11911111111', 'pedro.master@barbearia.com', 'Rua Central, 123'),
(DEFAULT, 'Carlos Expert', '11922222222', 'carlos@barbearia.com', 'Av Paulista, 456'),
(DEFAULT, 'Rafael Pro', '11933333333', 'rafael@barbearia.com', 'Rua das Flores, 789'),
(DEFAULT, 'Diego Top', '11944444444', 'diego@barbearia.com', 'Rua das Acácias, 101');

INSERT INTO agendamento VALUES 
(DEFAULT, 1, 1, '2026-03-20 09:00', 40.00),
(DEFAULT, 2, 2, '2026-03-20 10:00', 50.00),
(DEFAULT, 1, 3, '2026-03-20 14:00', 35.00),
(DEFAULT, 3, 1, '2026-03-21 09:30', 45.00),
(DEFAULT, 4, 2, '2026-03-21 11:00', 55.00),
(DEFAULT, 5, 4, '2026-03-21 15:00', 60.00);

-- 4. Verificar tudo
SELECT 'CLIENTES' as tabela, * FROM cliente;
SELECT 'BARBEIROS' as tabela, * FROM barbeiro; 
SELECT 'AGENDAMENTOS' as tabela, * FROM agendamento;