DELETE FROM books;
DELETE FROM authors;

INSERT INTO authors (id, name) VALUES
(1, "J. K. Rowling"),
(2, "Stephen King"),
(3, "Dan Brown"),
(4, "Dr. Seuss");

INSERT INTO books (id, title, author) VALUES
(1, "Harry Potter and the Sorcerer's Stone", 1),
(2, "Harry Potter and the Prisoner of Azkaban", 1),
(3, "The Green Mile", 2),
(4, "The Stand", 2),
(5, "The Da Vinci Code", 3),
(6, "Angels & Demons", 3),
(7, "Green Eggs and Ham", 4),
(8, "The Cat in the Hat", 4);