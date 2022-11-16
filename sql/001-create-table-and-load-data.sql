DROP TABLE IF EXISTS movies;

CREATE TABLE movies (
   id int unsigned AUTO_INCREMENT,
   name VARCHAR(100) NOT NULL,
   age int unsigned NOT NULL,
   PRIMARY KEY(id)
  );


INSERT INTO movies (id, name,published_Year) VALUES (1, "風の谷のナウシカ",1984);
INSERT INTO movies (id, name,published_Year) VALUES (2, "天空の城ラピュタ",1986);
INSERT INTO movies (id, name,published_Year) VALUES (3, "となりのトトロ",1989);
INSERT INTO movies (id, name,published_Year) VALUES (4, "もののけ姫",1997);
INSERT INTO movies (id, name,published_Year) VALUES (5, "千と千尋の神隠し",2002);
INSERT INTO movies (id, name,published_Year) VALUES (6, "崖の上のポニョ",2008);
INSERT INTO movies (id, name,published_Year) VALUES (7, "借りぐらしのアリエッティ",2010);
