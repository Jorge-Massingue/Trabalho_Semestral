/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.7.14 : Database - verdant
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`verdant` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `verdant`;

/*Table structure for table `cliente` */

DROP TABLE IF EXISTS `cliente`;

CREATE TABLE `cliente` (
  `CodCliente` int(4) NOT NULL AUTO_INCREMENT,
  `NrBI` char(13) NOT NULL,
  `NomeCompleto` varchar(20) DEFAULT NULL,
  `Sexo` char(9) DEFAULT NULL,
  `Morada` varchar(20) DEFAULT NULL,
  `DataNascimento` varchar(10) DEFAULT NULL,
  `Contacto` char(13) DEFAULT NULL,
  `Email` varchar(20) DEFAULT NULL,
  `Status` tinyint(1) DEFAULT '1',
  `Contrato` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`NrBI`),
  UNIQUE KEY `Contacto` (`Contacto`),
  KEY `CodCliente` (`CodCliente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cliente` */

LOCK TABLES `cliente` WRITE;

UNLOCK TABLES;

/*Table structure for table `funcionario` */

DROP TABLE IF EXISTS `funcionario`;

CREATE TABLE `funcionario` (
  `CodFuncionario` int(4) NOT NULL AUTO_INCREMENT,
  `NrBI` char(13) NOT NULL,
  `NomeCompleto` varchar(20) DEFAULT NULL,
  `Sexo` char(9) DEFAULT NULL,
  `Morada` varchar(20) DEFAULT NULL,
  `DataNascimento` varchar(10) DEFAULT NULL,
  `Departamento` varchar(20) DEFAULT NULL,
  `Cargo` varchar(20) DEFAULT NULL,
  `Contacto` char(13) DEFAULT NULL,
  `Email` varchar(20) DEFAULT NULL,
  `Status` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`NrBI`),
  UNIQUE KEY `Contacto` (`Contacto`),
  UNIQUE KEY `Email` (`Email`),
  KEY `CodFuncionario` (`CodFuncionario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `funcionario` */

LOCK TABLES `funcionario` WRITE;

UNLOCK TABLES;

/*Table structure for table `levantamento` */

DROP TABLE IF EXISTS `levantamento`;

CREATE TABLE `levantamento` (
  `CodLevantamento` int(4) NOT NULL AUTO_INCREMENT,
  `Data` varchar(10) DEFAULT NULL,
  `Hora` varchar(10) DEFAULT NULL,
  `NomeLevantamento` varchar(20) DEFAULT NULL,
  `Preco` float(12,6) DEFAULT '0.000000',
  `CodParqueamento` int(4) DEFAULT NULL,
  `Status` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`CodLevantamento`),
  KEY `CodParqueamneto` (`CodParqueamento`),
  CONSTRAINT `CodParqueamneto` FOREIGN KEY (`CodParqueamento`) REFERENCES `parqueamento` (`CodParqueamento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `levantamento` */

LOCK TABLES `levantamento` WRITE;

UNLOCK TABLES;

/*Table structure for table `parqueamento` */

DROP TABLE IF EXISTS `parqueamento`;

CREATE TABLE `parqueamento` (
  `CodParqueamento` int(4) NOT NULL AUTO_INCREMENT,
  `Data` varchar(10) DEFAULT NULL,
  `Hora` varchar(10) DEFAULT NULL,
  `NomeAlternativo` varchar(20) DEFAULT NULL,
  `NrBIAlternativo` char(13) DEFAULT NULL,
  `CodVaga` int(4) DEFAULT NULL,
  `Matricula` char(8) DEFAULT NULL,
  `NrBI` char(13) DEFAULT NULL,
  `CodUtilizador` int(4) DEFAULT NULL,
  `Status` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`CodParqueamento`),
  KEY `CodVaga` (`CodVaga`),
  KEY `Matricula` (`Matricula`),
  KEY `NrBI` (`NrBI`),
  KEY `CodUtilizador` (`CodUtilizador`),
  CONSTRAINT `CodUtilizador` FOREIGN KEY (`CodUtilizador`) REFERENCES `utilizador` (`CodUtilizador`),
  CONSTRAINT `CodVaga` FOREIGN KEY (`CodVaga`) REFERENCES `vaga` (`CodVaga`),
  CONSTRAINT `NrBI` FOREIGN KEY (`NrBI`) REFERENCES `cliente` (`NrBI`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `parqueamento` */

LOCK TABLES `parqueamento` WRITE;

UNLOCK TABLES;

/*Table structure for table `utilizador` */

DROP TABLE IF EXISTS `utilizador`;

CREATE TABLE `utilizador` (
  `CodUtilizador` int(4) NOT NULL AUTO_INCREMENT,
  `NomeUtilizador` varchar(20) DEFAULT NULL,
  `Password` varchar(20) DEFAULT NULL,
  `Perfil` varchar(20) DEFAULT NULL,
  `Estado` tinyint(1) DEFAULT '1',
  `Status` tinyint(1) DEFAULT '1',
  `NrBI` char(13) DEFAULT NULL,
  PRIMARY KEY (`CodUtilizador`),
  UNIQUE KEY `NomeUtilizador` (`NomeUtilizador`),
  UNIQUE KEY `Password` (`Password`),
  KEY `NrBI` (`NrBI`),
  CONSTRAINT `utilizador_ibfk_1` FOREIGN KEY (`NrBI`) REFERENCES `funcionario` (`NrBI`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `utilizador` */

LOCK TABLES `utilizador` WRITE;

UNLOCK TABLES;

/*Table structure for table `vaga` */

DROP TABLE IF EXISTS `vaga`;

CREATE TABLE `vaga` (
  `CodVaga` int(4) NOT NULL AUTO_INCREMENT,
  `Categoria` varchar(10) NOT NULL,
  `Descricao` char(2) NOT NULL,
  `Valor` float(12,2) NOT NULL,
  `Status` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`CodVaga`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `vaga` */

LOCK TABLES `vaga` WRITE;

UNLOCK TABLES;

/*Table structure for table `viatura` */

DROP TABLE IF EXISTS `viatura`;

CREATE TABLE `viatura` (
  `CodViatura` int(4) NOT NULL AUTO_INCREMENT,
  `Matricula` varchar(8) DEFAULT NULL,
  `CodMotor` varchar(20) DEFAULT NULL,
  `CodChassi` varchar(20) DEFAULT NULL,
  `Fabricante` varchar(10) DEFAULT NULL,
  `Modelo` varchar(10) DEFAULT NULL,
  `Cor` varchar(10) DEFAULT NULL,
  `Tipo` varchar(10) DEFAULT NULL,
  `Estado` varchar(10) DEFAULT NULL,
  `Status` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`CodViatura`),
  UNIQUE KEY `CodChassi` (`CodChassi`),
  UNIQUE KEY `CodMotor` (`CodMotor`),
  KEY `CodViatura` (`CodViatura`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `viatura` */

LOCK TABLES `viatura` WRITE;

UNLOCK TABLES;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
