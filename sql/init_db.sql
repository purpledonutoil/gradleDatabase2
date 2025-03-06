CREATE TABLE worker (
    ID IDENTITY PRIMARY KEY,
    name VARCHAR(1000) NOT NULL CHECK (LENGTH(name) >= 2 AND LENGTH(name) <= 1000),
    birthday DATE CHECK (birthday >= '1900-01-01'),
    level VARCHAR(10) NOT NULL CHECK (level IN ('Trainee', 'Junior', 'Middle', 'Senior')),
    salary INT CHECK(salary >= 100 AND salary <= 100000)
);

CREATE TABLE client (
    ID IDENTITY PRIMARY KEY,
    name VARCHAR(1000) NOT NULL CHECK (LENGTH(name) >= 2 AND LENGTH(name) <= 1000)
);

CREATE TABLE project (
    ID IDENTITY PRIMARY KEY,
    client_ID BIGINT NOT NULL,
    start_date DATE,
    finish_date DATE
);

CREATE TABLE project_worker(
    project_ID BIGINT NOT NULL,
    worker_ID BIGINT NOT NULL,
    PRIMARY KEY(PROJECT_ID, WORKER_ID),
    FOREIGN KEY (PROJECT_ID) REFERENCES project(ID),
    FOREIGN KEY (WORKER_ID) REFERENCES worker(ID)
);