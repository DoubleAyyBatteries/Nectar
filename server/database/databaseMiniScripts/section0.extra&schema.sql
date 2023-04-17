-- MySQL Script generated by MySQL Workbench
-- Tue 11 Apr 2023 07:17:40 PM EDT
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Extra
-- -----------------------------------------------------
### TimeZone ###
SET @EDT := "-4:00";
SET time_zone = @EDT;
# SELECT NOW()

### Credentials; Create UserName and Privliges ###
/*
CREATE USER 'admin'@'localhost' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON *.* TO 'admin'@'localhost' WITH GRANT OPTION;
FLUSH PRIVILEGES;
*/

-- -----------------------------------------------------
-- Schema nectar
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `nectar` ;

-- -----------------------------------------------------
-- Schema nectar
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `nectar` ;
USE `nectar` ;