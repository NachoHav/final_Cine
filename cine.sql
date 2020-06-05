-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.1.9-MariaDB-log - mariadb.org binary distribution
-- SO del servidor:              Win32
-- HeidiSQL Versión:             9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Volcando estructura de base de datos para cine
CREATE DATABASE IF NOT EXISTS `cine` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `cine`;


-- Volcando estructura para tabla cine.butaca
CREATE TABLE IF NOT EXISTS `butaca` (
  `idButaca` int(11) NOT NULL AUTO_INCREMENT,
  `idSala` int(11) NOT NULL DEFAULT '0',
  `fila` varchar(50) DEFAULT NULL,
  `columna` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idButaca`),
  KEY `FK_butaca_butaca` (`idSala`),
  CONSTRAINT `FK_butaca_butaca` FOREIGN KEY (`idSala`) REFERENCES `sala` (`idSala`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla cine.butaca: ~12 rows (aproximadamente)
/*!40000 ALTER TABLE `butaca` DISABLE KEYS */;
INSERT INTO `butaca` (`idButaca`, `idSala`, `fila`, `columna`) VALUES
	(1, 1, 'A', '1'),
	(2, 1, 'A', '2'),
	(3, 1, 'A', '3'),
	(4, 1, 'B', '1'),
	(5, 1, 'B', '2'),
	(6, 1, 'B', '3'),
	(7, 2, 'A', '1'),
	(8, 2, 'A', '2'),
	(9, 2, 'A', '3'),
	(10, 2, 'B', '1'),
	(11, 2, 'B', '2'),
	(12, 2, 'B', '3');
/*!40000 ALTER TABLE `butaca` ENABLE KEYS */;


-- Volcando estructura para tabla cine.cliente
CREATE TABLE IF NOT EXISTS `cliente` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL DEFAULT '0',
  `apellido` varchar(50) NOT NULL DEFAULT '0',
  `dni` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla cine.cliente: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;


-- Volcando estructura para tabla cine.pelicula
CREATE TABLE IF NOT EXISTS `pelicula` (
  `idPelicula` int(11) NOT NULL AUTO_INCREMENT,
  `titulo` varchar(50) NOT NULL DEFAULT '0',
  PRIMARY KEY (`idPelicula`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla cine.pelicula: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `pelicula` DISABLE KEYS */;
INSERT INTO `pelicula` (`idPelicula`, `titulo`) VALUES
	(1, 'Terminator'),
	(2, 'Eterno Resplandor de una Mente sin Recuerdos'),
	(3, 'Titanic 2');
/*!40000 ALTER TABLE `pelicula` ENABLE KEYS */;


-- Volcando estructura para tabla cine.proyeccion
CREATE TABLE IF NOT EXISTS `proyeccion` (
  `idProyeccion` int(11) NOT NULL AUTO_INCREMENT,
  `idPelicula` int(11) NOT NULL DEFAULT '0',
  `idSala` int(11) NOT NULL DEFAULT '0',
  `horario_desde` varchar(50) NOT NULL DEFAULT '0',
  `horario_hasta` varchar(50) NOT NULL DEFAULT '0',
  PRIMARY KEY (`idProyeccion`),
  KEY `FK_horario_pelicula` (`idPelicula`),
  KEY `FK_horario_sala` (`idSala`),
  CONSTRAINT `FK_horario_pelicula` FOREIGN KEY (`idPelicula`) REFERENCES `pelicula` (`idPelicula`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_horario_sala` FOREIGN KEY (`idSala`) REFERENCES `sala` (`idSala`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla cine.proyeccion: ~4 rows (aproximadamente)
/*!40000 ALTER TABLE `proyeccion` DISABLE KEYS */;
INSERT INTO `proyeccion` (`idProyeccion`, `idPelicula`, `idSala`, `horario_desde`, `horario_hasta`) VALUES
	(1, 1, 1, '22:00 hs', '24:00 hs'),
	(2, 1, 2, '22:00 hs', '24:00 hs'),
	(3, 2, 1, '17:00 hs', '20:30 hs'),
	(4, 3, 2, '15:00 hs', '18:00 hs');
/*!40000 ALTER TABLE `proyeccion` ENABLE KEYS */;


-- Volcando estructura para tabla cine.sala
CREATE TABLE IF NOT EXISTS `sala` (
  `idSala` int(11) NOT NULL AUTO_INCREMENT,
  `ubicacion` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idSala`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla cine.sala: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `sala` DISABLE KEYS */;
INSERT INTO `sala` (`idSala`, `ubicacion`) VALUES
	(1, 'Pasillo central, puerta derecha.'),
	(2, 'Pasillo central, puerta izquierda.');
/*!40000 ALTER TABLE `sala` ENABLE KEYS */;


-- Volcando estructura para tabla cine.ticket
CREATE TABLE IF NOT EXISTS `ticket` (
  `idTicket` int(11) NOT NULL AUTO_INCREMENT,
  `idCliente` int(11) NOT NULL DEFAULT '0',
  `idProyeccion` int(11) NOT NULL DEFAULT '0',
  `IdButaca` int(11) NOT NULL DEFAULT '0',
  `fecha_ticket` datetime NOT NULL,
  `monto` decimal(10,2) NOT NULL DEFAULT '0.00',
  `estado` tinyint(4) NOT NULL DEFAULT '0',
  `metodo_pago` varchar(50) NOT NULL DEFAULT '0',
  PRIMARY KEY (`idTicket`),
  KEY `FK_ticket_cliente` (`idCliente`),
  KEY `FK_ticket_horario` (`idProyeccion`),
  KEY `FK_ticket_butaca` (`IdButaca`),
  CONSTRAINT `FK_ticket_butaca` FOREIGN KEY (`IdButaca`) REFERENCES `butaca` (`idButaca`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_ticket_cliente` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_ticket_horario` FOREIGN KEY (`idProyeccion`) REFERENCES `proyeccion` (`idProyeccion`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla cine.ticket: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `ticket` DISABLE KEYS */;
/*!40000 ALTER TABLE `ticket` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
