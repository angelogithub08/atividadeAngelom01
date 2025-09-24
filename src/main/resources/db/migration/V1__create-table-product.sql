CREATE TABLE product (
    id TEXT PRIMARY KEY NOT NULL,
    name TEXT NOT NULL,
    price INT NOT NULL,
    active BOOLEAN NOT NULL DEFAULT TRUE,
    category TEXT NOT NULL,
    distribution_center VARCHAR(50)
);
