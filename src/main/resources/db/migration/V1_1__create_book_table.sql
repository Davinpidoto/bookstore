CREATE TABLE books (
  id INT NOT NULL,
  title VARCHAR(255) NULL,
  author INT NULL,
  PRIMARY KEY (id),
  CONSTRAINT books_authors_fk
  FOREIGN KEY (author)
  REFERENCES authors (id)
);
