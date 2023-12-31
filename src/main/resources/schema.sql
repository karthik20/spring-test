CREATE TABLE TRAINING (
    ID INT NOT NULL AUTO_INCREMENT,
    NAME VARCHAR(100) NOT NULL,
    STATUS VARCHAR(1) NOT NULL,
    PRIMARY KEY(ID)
);

CREATE TABLE PARTICIPANT (
    ID INT NOT NULL AUTO_INCREMENT,
    NAME VARCHAR(100) NOT NULL,
    TRAINING_ID INT NOT NULL,
    PRIMARY KEY(ID),
    FOREIGN KEY(TRAINING_ID) REFERENCES TRAINING(ID)
);

