-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema GestaoHC
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `GestaoHC` ;

-- -----------------------------------------------------
-- Schema GestaoHC
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `GestaoHC` DEFAULT CHARACTER SET utf8 ;
USE `GestaoHC` ;

-- -----------------------------------------------------
-- Table `GestaoHC`.`curso`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GestaoHC`.`curso` ;

CREATE TABLE IF NOT EXISTS `GestaoHC`.`curso` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) NOT NULL,
  `total_horas` DECIMAL(10,2) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GestaoHC`.`atividade_complementar`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GestaoHC`.`atividade_complementar` ;

CREATE TABLE IF NOT EXISTS `GestaoHC`.`atividade_complementar` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) NOT NULL,
  `limite` DECIMAL(10,2) NULL,
  `curso_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_atividade_complementar_cursos`
    FOREIGN KEY (`curso_id`)
    REFERENCES `GestaoHC`.`curso` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_atividade_complementar_cursos_idx` ON `GestaoHC`.`atividade_complementar` (`curso_id` ASC);


-- -----------------------------------------------------
-- Table `GestaoHC`.`aluno`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GestaoHC`.`aluno` ;

CREATE TABLE IF NOT EXISTS `GestaoHC`.`aluno` (
  `ra` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `telefone_cel` VARCHAR(20) NULL,
  `telefone_outro` VARCHAR(20) NULL,
  `login` VARCHAR(45) NOT NULL,
  `senha` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`ra`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GestaoHC`.`horas_complementares`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GestaoHC`.`horas_complementares` ;

CREATE TABLE IF NOT EXISTS `GestaoHC`.`horas_complementares` (
  `aluno_ra` INT NOT NULL,
  `curso_id` INT NOT NULL,
  `atividade_complementar_id` INT NOT NULL,
  `data` DATE NOT NULL,
  `descricao` TEXT NOT NULL,
  `total_horas` DECIMAL(10,2) NOT NULL,
  PRIMARY KEY (`aluno_ra`, `curso_id`, `atividade_complementar_id`),
  CONSTRAINT `fk_horas_complementares_cursos1`
    FOREIGN KEY (`curso_id`)
    REFERENCES `GestaoHC`.`curso` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_horas_complementares_atividade_complementar1`
    FOREIGN KEY (`atividade_complementar_id`)
    REFERENCES `GestaoHC`.`atividade_complementar` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_horas_complementares_aluno1`
    FOREIGN KEY (`aluno_ra`)
    REFERENCES `GestaoHC`.`aluno` (`ra`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_horas_complementares_cursos1_idx` ON `GestaoHC`.`horas_complementares` (`curso_id` ASC);

CREATE INDEX `fk_horas_complementares_atividade_complementar1_idx` ON `GestaoHC`.`horas_complementares` (`atividade_complementar_id` ASC);

CREATE INDEX `fk_horas_complementares_aluno1_idx` ON `GestaoHC`.`horas_complementares` (`aluno_ra` ASC);


-- -----------------------------------------------------
-- Table `GestaoHC`.`funcionario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GestaoHC`.`funcionario` ;

CREATE TABLE IF NOT EXISTS `GestaoHC`.`funcionario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `telefone_cel` VARCHAR(20) NULL,
  `telefone_outro` VARCHAR(20) NULL,
  `login` VARCHAR(45) BINARY NULL,
  `senha` VARCHAR(45) BINARY NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
