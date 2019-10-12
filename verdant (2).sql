-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: 12-Out-2019 às 04:43
-- Versão do servidor: 5.7.26
-- versão do PHP: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `verdant`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE IF NOT EXISTS `cliente` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `contacto` varchar(15) NOT NULL,
  `contrato` varchar(255) NOT NULL,
  `dataNascimento` tinyblob NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `morada` varchar(40) NOT NULL,
  `nomeCompleto` varchar(40) NOT NULL,
  `numBi` varchar(20) NOT NULL,
  `sexo` varchar(15) NOT NULL,
  `status` bit(1) NOT NULL,
  PRIMARY KEY (`idCliente`),
  UNIQUE KEY `UK_7ld7u1h5drnhhj6xdqgwxw33q` (`numBi`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`idCliente`, `contacto`, `contrato`, `dataNascimento`, `email`, `morada`, `nomeCompleto`, `numBi`, `sexo`, `status`) VALUES
(1, 'fgjh', 'Com contrato', 0xaced00057372000d6a6176612e74696d652e536572955d84ba1b2248b20c00007870770703000007d0060778, 'fasthy@gmail.com', 'ghd', 'jgdgd', 'hg', 'Masculino', b'1');

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
CREATE TABLE IF NOT EXISTS `funcionario` (
  `idFuncionario` int(11) NOT NULL AUTO_INCREMENT,
  `cargo` varchar(30) NOT NULL,
  `contacto` varchar(30) NOT NULL,
  `dataNascimento` tinyblob NOT NULL,
  `departamento` varchar(30) NOT NULL,
  `email` varchar(30) DEFAULT NULL,
  `morada` varchar(40) NOT NULL,
  `nomeCompleto` varchar(20) NOT NULL,
  `numBi` varchar(20) NOT NULL,
  `sexo` varchar(10) NOT NULL,
  `status` bit(1) NOT NULL,
  PRIMARY KEY (`idFuncionario`),
  UNIQUE KEY `UK_rcg0s7a76raf580404eyeke4k` (`numBi`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`idFuncionario`, `cargo`, `contacto`, `dataNascimento`, `departamento`, `email`, `morada`, `nomeCompleto`, `numBi`, `sexo`, `status`) VALUES
(1, 'Secretario', '870909099', 0xaced00057372000d6a6176612e74696d652e536572955d84ba1b2248b20c0000787077070300000794010178, 'Seguranca', 'jorgerapapolo@gmail.com', 'Vila dos bandidos', 'George', '12325456B', 'Feminino', b'1');

-- --------------------------------------------------------

--
-- Estrutura da tabela `viatura`
--

DROP TABLE IF EXISTS `viatura`;
CREATE TABLE IF NOT EXISTS `viatura` (
  `idViatura` int(11) NOT NULL AUTO_INCREMENT,
  `codChassi` varchar(20) NOT NULL,
  `codMotor` varchar(20) NOT NULL,
  `cor` varchar(20) NOT NULL,
  `estado` varchar(20) NOT NULL,
  `fabricante` varchar(30) NOT NULL,
  `matricula` varchar(20) NOT NULL,
  `modelo` varchar(20) NOT NULL,
  `status` bit(1) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  PRIMARY KEY (`idViatura`),
  UNIQUE KEY `UK_s4nomjthafg2pa2rkek0esolr` (`matricula`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `viatura`
--

INSERT INTO `viatura` (`idViatura`, `codChassi`, `codMotor`, `cor`, `estado`, `fabricante`, `matricula`, `modelo`, `status`, `tipo`) VALUES
(1, 'ghgjj', 'hjgfj', 'gfjhg', 'jhgjkh', 'ghjh', 'ghghfjh', 'hjghj', b'1', 'hgjh');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
