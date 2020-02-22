DROP TABLE IF EXISTS fin_transaction;
DROP TABLE IF EXISTS account;
DROP TABLE IF EXISTS customer;
DROP SEQUENCE IF EXISTS global_seq_finance;

CREATE SEQUENCE global_seq_finance START WITH 100000;

CREATE TABLE customer
(
  id               INTEGER PRIMARY KEY DEFAULT nextval('global_seq_finance'),
  name             VARCHAR                 NOT NULL,
  address          VARCHAR                 NOT NULL
);
CREATE UNIQUE INDEX customer_unique_name_idx ON customer (name);

CREATE TABLE account
(
  id               INTEGER PRIMARY KEY DEFAULT nextval('global_seq_finance'),
  customer_id      INTEGER                 NOT NULL,
  acc_number       INTEGER                 NOT NULL,
  description      VARCHAR                 NOT NULL,
  FOREIGN KEY (customer_id) REFERENCES customer (id) ON DELETE CASCADE
);
CREATE UNIQUE INDEX account_unique_acc_number_idx ON account (acc_number);

CREATE TABLE fin_transaction
(
  id               INTEGER PRIMARY KEY DEFAULT nextval('global_seq_finance'),
  account_id       INTEGER                 NOT NULL,
  date_time        TIMESTAMP               NOT NULL,
  amount           INTEGER                 NOT NULL,
  description      VARCHAR                 NOT NULL,
  FOREIGN KEY (account_id) REFERENCES account (id) ON DELETE CASCADE
);