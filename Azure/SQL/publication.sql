DROP TABLE IF EXISTS Publication;
CREATE TABLE Publication (
    PublicationID INT PRIMARY KEY,
    Title VARCHAR(50),
    Author VARCHAR(50),
    Copyright VARCHAR(50),
    Runtime INT
);

INSERT INTO Publication
VALUES (1, 'DUNE', 'Frank Herbert', '1965', 0);

INSERT INTO Publication
VALUES (2, 'No Country for Old Men', 'Cormac McCarthy', '2005', 0);

INSERT INTO Publication
VALUES (3, 'Hunger Games', 'Suzanne Collins', '2008', 0);

SELECT *
FROM Publication;

