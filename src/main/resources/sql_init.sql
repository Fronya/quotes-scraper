CREATE DATABASE scraper;

CREATE USER scraperuser WITH PASSWORD '12345678';
GRANT ALL PRIVILEGES ON DATABASE "scraper" to scraperuser;
