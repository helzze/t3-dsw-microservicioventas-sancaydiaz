CREATE DATABASE ventas_db;

USE ventas_db;

CREATE TABLE venta (
    id VARCHAR(36) PRIMARY KEY,
    cliente_id VARCHAR(36) NOT NULL,
    vehiculo_id VARCHAR(36) NOT NULL,
    monto DECIMAL(10, 2) NOT NULL,
    fecha DATE NOT NULL
);

INSERT INTO venta (id, cliente_id, vehiculo_id, monto, fecha) VALUES
('v1', 'c1', 'vh1', 30000.50, '2024-10-01'),
('v2', 'c2', 'vh2', 45000.75, '2024-10-15'),
('v3', 'c3', 'vh3', 52000.00, '2024-10-20');
