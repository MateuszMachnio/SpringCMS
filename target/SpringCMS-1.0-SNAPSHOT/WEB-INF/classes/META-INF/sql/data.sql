INSERT INTO spring_homework.authors (id, first_name, last_name) VALUES (1, 'NAME1', 'surname1');
INSERT INTO spring_homework.authors (id, first_name, last_name) VALUES (2, 'NAME2', 'surname2');
INSERT INTO spring_homework.authors (id, first_name, last_name) VALUES (3, 'NAME3', 'surname3');
INSERT INTO spring_homework.authors (id, first_name, last_name) VALUES (4, 'NAME4', 'surname4');
INSERT INTO spring_homework.authors (id, first_name, last_name) VALUES (5, 'NAME5', 'surname5');


INSERT INTO spring_homework.articles (content, created_on, title, author_id) VALUES ('zawartość1', NOW(), 'jakiś tytuł1', 1);
INSERT INTO spring_homework.articles (content, created_on, title, author_id) VALUES ('zawartość2', NOW(), 'jakiś tytuł2', 2);
INSERT INTO spring_homework.articles (content, created_on, title, author_id) VALUES ('zawartość3', NOW(), 'jakiś tytuł3', 3);
INSERT INTO spring_homework.articles (content, created_on, title, author_id) VALUES ('zawartość4', NOW(), 'jakiś tytuł4', 4);
INSERT INTO spring_homework.articles (content, created_on, title, author_id) VALUES ('zawartość5', NOW(), 'jakiś tytuł5', 5);


INSERT INTO spring_homework.categories (id, description, name, article_id) VALUES (1, 'Opis1', 'name1', 1);
INSERT INTO spring_homework.categories (id, description, name, article_id) VALUES (2, 'Opis2', 'name2', 1);
INSERT INTO spring_homework.categories (id, description, name, article_id) VALUES (3, 'Opis3', 'name3', 1);
INSERT INTO spring_homework.categories (id, description, name, article_id) VALUES (4, 'Opis4', 'name4', 2);
INSERT INTO spring_homework.categories (id, description, name, article_id) VALUES (5, 'Opis5', 'name5', 2);
INSERT INTO spring_homework.categories (id, description, name, article_id) VALUES (6, 'Opis6', 'name6', 3);