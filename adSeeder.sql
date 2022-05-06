USE adlister_db;

INSERT INTO users (username, email, password) VALUES
('kiki123','kiki@mail.com','password');

INSERT ads(user_id, title, description) VALUES
(1, 'New Ad', 'New Ad Desc'),
(1,'Another New Ad 1','Another desc 1'),
(1,'Another New Ad 2','Another desc 2'),
(1,'Another New Ad 3','Another desc 3'),
(1,'Another New Ad 4','Another desc 4');