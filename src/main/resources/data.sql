INSERT INTO ACCOUNT_OWNER (first_name, last_name, email) VALUES
('Jeffrey', 'Lebowski', 'The_Dude@protonmail.com'),
('Vincent', 'Vega', 'pulpfiction@mail.ru'),
('Boris', 'Yurinov ', 'TheBlade@bulletdodger.com');


INSERT INTO ACCOUNT (money, owner_id) VALUES
( 600,     (SELECT id from ACCOUNT_OWNER WHERE first_name='Jeffrey') ),
( 400,     (SELECT id from ACCOUNT_OWNER WHERE first_name='Jeffrey') ),
( 300,     (SELECT id from ACCOUNT_OWNER WHERE first_name='Jeffrey') ),
( 700,     (SELECT id from ACCOUNT_OWNER WHERE first_name='Vincent') ),
( 100,     (SELECT id from ACCOUNT_OWNER WHERE first_name='Vincent') ),
( 800,     (SELECT id from ACCOUNT_OWNER WHERE first_name='Boris') );
