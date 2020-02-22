DELETE FROM fin_transaction;
DELETE FROM account;
DELETE FROM customer;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO customer (name, address) VALUES
  ('Customer1', 'address1'),
  ('Customer2', 'address2');

INSERT INTO account (acc_number, description, customer_id) VALUES
  (1, 'one', 100000),
  (2, 'two', 100001),
  (3, 'three', 100001);

INSERT INTO fin_transaction (date_time, amount, description, account_id) VALUES
('2020-02-20 10:00:00', 100, 'one hundred', 100002),
('2020-02-20 11:00:00', 200, 'two hundred', 100002),
('2020-02-20 15:00:00', 300, 'three hundred', 100003);
