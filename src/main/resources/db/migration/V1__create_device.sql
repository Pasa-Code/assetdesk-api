CREATE TABLE device (
                        id               BIGSERIAL PRIMARY KEY,
                        inventory_number VARCHAR(50)  NOT NULL UNIQUE,
                        manufacturer     VARCHAR(100) NOT NULL,
                        model            VARCHAR(100) NOT NULL,
                        serial_number    VARCHAR(100),
                        category         VARCHAR(20)  NOT NULL,
                        status           VARCHAR(20)  NOT NULL,
                        created_at       TIMESTAMPTZ  NOT NULL DEFAULT now()
);