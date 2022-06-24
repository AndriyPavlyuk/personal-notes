CREATE TABLE notes
(
    id    BIGSERIAL PRIMARY KEY,
    title TEXT NOT NULL,
    body  TEXT,
    person_id BIGINT REFERENCES persons(id)
)