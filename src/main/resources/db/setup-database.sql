CREATE DATABASE IF NOT EXISTS `distinctride`;

CREATE USER 'flyway'@'localhost' IDENTIFIED BY 'flyway-pw';
GRANT USAGE ON *.* to 'flyway'@'localhost';
GRANT SELECT, INSERT, UPDATE, CREATE, DELETE, REFERENCES, INDEX, ALTER, CREATE VIEW ON distinctride.* TO 'flyway'@'localhost';

CREATE USER 'distinctride'@'localhost' IDENTIFIED BY 'distinctride-pw';
GRANT USAGE ON *.* to 'distinctride'@'localhost';
GRANT SELECT, INSERT, UPDATE, CREATE, DELETE, REFERENCES, INDEX, ALTER, CREATE VIEW ON distinctride.* TO 'distinctride'@'localhost';

FLUSH PRIVILEGES;

