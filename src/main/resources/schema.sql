CREATE TABLE IF NOT EXISTS persons
(
    id       BIGSERIAL PRIMARY KEY,
    username VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS person_contacts
(
    person_id    BIGINT PRIMARY KEY REFERENCES persons (id),
    email        VARCHAR(255),
    phone_number VARCHAR(20)
);