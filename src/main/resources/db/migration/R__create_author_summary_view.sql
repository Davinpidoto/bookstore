CREATE OR REPLACE VIEW author_summary AS
SELECT a.name AS author, GROUP_CONCAT(b.title) AS titles
FROM authors a
INNER JOIN books b ON a.id = b.author
GROUP BY a.name;
