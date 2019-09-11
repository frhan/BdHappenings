CREATE TABLE role (
  id SERIAL PRIMARY KEY,
  name varchar(100) NOT NULL UNIQUE,
  enabled BOOLEAN NOT NULL DEFAULT TRUE,
  created_at timestamp NOT NULL,
  updated_at timestamp NOT NULL

);

CREATE TABLE "users" (
  id SERIAL PRIMARY KEY,
  username varchar(255) NOT NULL UNIQUE ,
  password varchar(255) NOT NULL,
  email varchar(255) NOT NULL UNIQUE,
  first_name varchar(255),
  last_name varchar(255),
  json text,
  enabled BOOLEAN NOT NULL DEFAULT TRUE,
  created_at timestamp NOT NULL,
  updated_at timestamp NOT NULL,
  role_id INTEGER  REFERENCES role(id)
);
