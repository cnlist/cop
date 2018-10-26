CREATE TABLE users
(
    id long AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    create_time DATETIME DEFAULT "CURRENT_TIMESTAMP"(),
    enabled boolean DEFAULT true ,
    block_reason VARCHAR(255)
);
CREATE UNIQUE INDEX users_username_uindex ON users (username);