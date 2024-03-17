-- create table if not exists article (
--        id BIGINT AUTO_INCREMENT primary key,
--        title varchar(255) not null,
--         content varchar(255) not null
--     );
--
-- drop table if exists comment cascade;
-- create table comment (
--     id INT AUTO_INCREMENT PRIMARY KEY ,
--     article_id INT,
--     content VARCHAR(255),
--     created_at TIMESTAMP DEFAULT  CURRENT_TIMESTAMP,
--     FOREIGN KEY (article_id) REFERENCES article(id)
--         on update cascade
--         on delete cascade
-- );
INSERT INTO article(title, content) VALUES ('제목1', '내용1');
INSERT INTO article(title, content) VALUES ('제목2', '내용2');
INSERT INTO article(title, content) VALUES ('제목3', '내용3');

INSERT INTO comment(article_id, body, created_at) VALUES (1, '블로그 댓글 1', now());
INSERT INTO comment(article_id, body, created_at) VALUES (2, '블로그 댓글 2', now());
INSERT INTO comment(article_id, body, created_at) VALUES (3, '블로그 댓글 3', now());