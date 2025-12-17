DROP TABLE IF EXISTS Patron;
CREATE TABLE Patron (
    PatronID INT PRIMARY KEY,
    PatronName VARCHAR(50)
);


INSERT INTO Patron
VALUES (1, 'Aadhitya');

INSERT INTO Patron
VALUES (2, 'Senthil');

INSERT INTO Patron
VALUES (3, 'Kala');

INSERT INTO Patron
VALUES (4, 'Anvita');

SELECT *
FROM Patron;