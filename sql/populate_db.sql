INSERT INTO worker (name, birthday, level, salary)
VALUES
    ('Taylor Swift', '1989-12-13', 'Senior', 9000),
    ('Leonardo DiCaprio', '1974-11-11', 'Middle', 3000),
    ('Dwayne Johnson', '1972-05-02', 'Junior', 1000),
    ('Emma Watson', '1990-04-15', 'Junior', 1200),
    ('Cristiano Ronaldo', '1985-02-05', 'Trainee', 200),
    ('Scarlett Johansson', '1984-11-22', 'Middle', 6500),
    ('Oprah Winfrey', '1954-01-29', 'Middle', 5000),
    ('Jennifer Lawrence', '1990-08-15', 'Junior', 1700),
    ('Brad Pitt', '1963-12-18', 'Trainee', 200),
    ('Lady Gaga', '1986-03-28', 'Junior', 2000),
    ('Chris Hemsworth', '1983-08-11', 'Trainee', 300),
    ('Keanu Reeves', '1964-09-02', 'Junior', 2500),
    ('Selena Gomez', '1992-07-22', 'Senior', 8000),
    ('LeBron James', '1984-12-30', 'Middle', 3500),
    ('Tom Holland', '1996-06-01', 'Senior', 9000);

INSERT INTO client (name)
VALUES
    ('Taylor Swift'),
    ('Selena Gomez'),
    ('Selena Gomez'),
    ('Tom Holland'),
    ('Taylor Swift'),
    ('Scarlett Johansson'),
    ('Tom Holland');

INSERT INTO project (client_ID, start_date, finish_date)
VALUES
    (1, '2018-03-31', '2026-07-30'),
    (2,'2018-12-31', '2020-03-02'),
    (1, '2019-06-09', '2025-10-30'),
    (3, '2019-09-11', '2019-10-12'),
    (4, '2019-11-09', '2025-04-22'),
    (5, '2021-12-13', '2022-07-07'),
    (6, '2022-05-25', '2025-07-25'),
    (6,'2022-08-24', '2025-04-14'),
    (3, '2022-08-31', '2025-06-13'),
    (7, '2023-07-13', '2024-05-18'),
    (1, '2024-02-03', '2025-01-01');

INSERT INTO project_worker (project_ID, worker_ID)
VALUES
    (1, 1),
    (2, 13),
    (3, 1),
    (3, 6),
    (4, 13),
    (4, 2),
    (5, 15),
    (5, 2),
    (5, 4),
    (6, 1),
    (7, 6),
    (7, 14),
    (7, 7),
    (8, 6),
    (8, 13),
    (8, 12),
    (8, 14),
    (8, 2),
    (9, 13),
    (9, 7),
    (10, 15),
    (11, 1),
    (11, 11),
    (11, 8),
    (11, 7);