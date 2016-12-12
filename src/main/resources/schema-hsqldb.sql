DROP TABLE IF EXISTS post_tag;
DROP TABLE IF EXISTS posts;
DROP TABLE IF EXISTS tags;

CREATE TABLE tags(
  tag_id INTEGER IDENTITY PRIMARY KEY NOT NULL,
  tag_name VARCHAR(50) NOT NULL
);

CREATE TABLE posts(
  post_id INTEGER IDENTITY PRIMARY KEY NOT NULL,
  post_header VARCHAR(250) NOT NULL,
  post_text LONGVARCHAR NOT NULL
);

CREATE TABLE post_tag(
  post_id INTEGER NOT NULL ,
  tag_id INTEGER NOT NULL ,
  FOREIGN KEY (post_id) REFERENCES posts,
  FOREIGN KEY (tag_id) REFERENCES tags,
  PRIMARY KEY (post_id, tag_id)
)