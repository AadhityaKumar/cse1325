DROP TABLE IF EXISTS Rentals;

CREATE TABLE Rentals (
    PublicationID INT NOT NULL,
    LoanedTo INT NOT NULL,
    DueDate DATE
    PRIMARY KEY (PublicationID, LoanedTo)
);

INSERT INTO Rentals
VALUES (2, 1, '2025-12-25');

INSERT INTO Rentals
VALUES (3, 2, '2025-12-27');


SELECT *
FROM Rentals;