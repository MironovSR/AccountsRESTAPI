DROP TABLE IF EXISTS TBL_ACCOUNT_OWNER;

CREATE TABLE ACCOUNT_OWNER (
 id INT AUTO_INCREMENT  PRIMARY KEY,
 first_name VARCHAR(250) NOT NULL,
 last_name VARCHAR(250) NOT NULL,
 email VARCHAR(250) DEFAULT NULL
);

DROP TABLE IF EXISTS ACCOUNT;

CREATE TABLE ACCOUNT (
id int NOT NULL AUTO_INCREMENT,
money int,
owner_id int,
PRIMARY KEY (id),
FOREIGN KEY (owner_id) REFERENCES ACCOUNT_OWNER(id)
);
