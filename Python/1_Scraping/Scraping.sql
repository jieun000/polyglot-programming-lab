CREATE DATABASE scraping;
USE scraping;
CREATE TABLE pages (
	id BIGINT(7) NOT NULL AUTO_INCREMENT,
    title VARCHAR(200),
    content VARCHAR(10000),
    created TIMESTAMP DEFAULT CURRENT_TIMESTAMP, PRIMARY KEY(id)
);
INSERT INTO pages(title, content) VALUES("Test page title", "This is some test page content. It can be up to 10,000 characters long");
INSERT INTO pages(id, title, content, created) 
VALUES(
	3, 
	"Test page title", 
	"This is some test page content. It can be up to 10,000 characters long", 
	"2014-09-21 10:25:32"
);
SELECT * FROM pages;

