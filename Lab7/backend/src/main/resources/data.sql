INSERT INTO users (name) VALUES ('Abdoon Nur');
INSERT INTO users (name) VALUES ('Kamal Ahmed');
INSERT INTO users (name) VALUES ('David Stark');

INSERT INTO posts (title, content, author, user_id) VALUES ('Great product!', 'Great product desc', 'John Smith 1', 4);
INSERT INTO posts (title, content, author, user_id) VALUES ('Good value for money', 'Great product desc2', 'John Smith 2', 5);
INSERT INTO posts (title, content, author, user_id) VALUES ('Satisfactory performance', 'Great product desc3', 'John Smith 3', 6);
INSERT INTO posts (title, content, author, user_id) VALUES ('Great product!', 'Great product desc', 'John Smith 1', 6);
INSERT INTO posts (title, content, author, user_id) VALUES ('Good value for money', 'Great product desc2', 'John Smith 2', 6);
INSERT INTO posts (title, content, author, user_id) VALUES ('Satisfactory performance', 'Great product desc3', 'John Smith 3', 5);

INSERT INTO comments (name, post_id) VALUES ('Great blog, plz continue', 7);
INSERT INTO comments (name, post_id) VALUES ('I like it, plz continue', 7);
INSERT INTO comments (name, post_id) VALUES ('Awesome!, plz continue', 8);
INSERT INTO comments (name, post_id) VALUES ('Great blog, plz continue', 8);
INSERT INTO comments (name, post_id) VALUES ('I like it, plz continue', 8);
INSERT INTO comments (name, post_id) VALUES ('Awesome!, plz continue', 9);

