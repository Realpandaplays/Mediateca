-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 01-05-2024 a las 04:19:08
-- Versión del servidor: 8.0.31
-- Versión de PHP: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `desafio_i`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cd`
--

DROP TABLE IF EXISTS `cd`;
CREATE TABLE IF NOT EXISTS `cd` (
  `Id_cd` int NOT NULL AUTO_INCREMENT,
  `idInterno` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `titulo` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `artista` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `genero` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `duracion` time NOT NULL,
  `numCanciones` int NOT NULL,
  `uniDisp` int NOT NULL,
  PRIMARY KEY (`Id_cd`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dvd`
--

DROP TABLE IF EXISTS `dvd`;
CREATE TABLE IF NOT EXISTS `dvd` (
  `Id_dvd` int NOT NULL AUTO_INCREMENT,
  `idInterno` varchar(45) NOT NULL,
  `titulo` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `director` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `duracion` time NOT NULL,
  `genero` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`Id_dvd`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libros`
--

DROP TABLE IF EXISTS `libros`;
CREATE TABLE IF NOT EXISTS `libros` (
  `Id_libro` int NOT NULL AUTO_INCREMENT,
  `idInterno` varchar(45) NOT NULL,
  `titulo` varchar(45) NOT NULL,
  `autor` varchar(45) NOT NULL,
  `numPaginas` smallint NOT NULL,
  `editorial` varchar(45) NOT NULL,
  `ISBN` char(17) NOT NULL,
  `yearPubli` year NOT NULL,
  `uniDispo` smallint NOT NULL,
  PRIMARY KEY (`Id_libro`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `libros`
--

INSERT INTO `libros` (`Id_libro`, `idInterno`, `titulo`, `autor`, `numPaginas`, `editorial`, `ISBN`, `yearPubli`, `uniDispo`) VALUES
(6, 'LRTD2024', 'Los Renglones Torcidos De Dios', 'Torcuato Luca de Tena', 436, 'Booket', '15725435625514', 2016, 16),
(7, 'EJO2008', 'ElJardinOlvidado', 'KateMorron', 536, 'DEBOLS!LLO', '9786073140072', 2016, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `material`
--

DROP TABLE IF EXISTS `material`;
CREATE TABLE IF NOT EXISTS `material` (
  `id_mat` int NOT NULL AUTO_INCREMENT,
  `idInterno` varchar(45) NOT NULL,
  `titulo` varchar(45) NOT NULL,
  `uniDisp` int NOT NULL,
  `Id_matAud` int NOT NULL,
  `Id_matEsc` int NOT NULL,
  PRIMARY KEY (`id_mat`),
  KEY `Id_matAud` (`Id_matAud`),
  KEY `Id_matEsc` (`Id_matEsc`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materialaudiovisual`
--

DROP TABLE IF EXISTS `materialaudiovisual`;
CREATE TABLE IF NOT EXISTS `materialaudiovisual` (
  `Id_matAud` int NOT NULL AUTO_INCREMENT,
  `Id_cd` int NOT NULL,
  `Id_dvd` int NOT NULL,
  PRIMARY KEY (`Id_matAud`),
  KEY `Id_dvd` (`Id_dvd`),
  KEY `Id_cd` (`Id_cd`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materialescrito`
--

DROP TABLE IF EXISTS `materialescrito`;
CREATE TABLE IF NOT EXISTS `materialescrito` (
  `Id_matEsc` int NOT NULL AUTO_INCREMENT,
  `Id_libro` int NOT NULL,
  `Id_revista` int NOT NULL,
  PRIMARY KEY (`Id_matEsc`),
  KEY `Id_libro` (`Id_libro`),
  KEY `Id_revista` (`Id_revista`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `revistas`
--

DROP TABLE IF EXISTS `revistas`;
CREATE TABLE IF NOT EXISTS `revistas` (
  `Id_revista` int NOT NULL AUTO_INCREMENT,
  `idInterno` varchar(45) NOT NULL,
  `titulo` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `editorial` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `periodisidad` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `fechaPubli` date NOT NULL,
  `uniDispo` smallint NOT NULL,
  PRIMARY KEY (`Id_revista`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `material`
--
ALTER TABLE `material`
  ADD CONSTRAINT `material_ibfk_1` FOREIGN KEY (`Id_matAud`) REFERENCES `materialaudiovisual` (`Id_matAud`),
  ADD CONSTRAINT `material_ibfk_2` FOREIGN KEY (`Id_matEsc`) REFERENCES `materialescrito` (`Id_matEsc`);

--
-- Filtros para la tabla `materialaudiovisual`
--
ALTER TABLE `materialaudiovisual`
  ADD CONSTRAINT `materialaudiovisual_ibfk_1` FOREIGN KEY (`Id_cd`) REFERENCES `cd` (`Id_cd`),
  ADD CONSTRAINT `materialaudiovisual_ibfk_2` FOREIGN KEY (`Id_dvd`) REFERENCES `dvd` (`Id_dvd`);

--
-- Filtros para la tabla `materialescrito`
--
ALTER TABLE `materialescrito`
  ADD CONSTRAINT `materialescrito_ibfk_1` FOREIGN KEY (`Id_libro`) REFERENCES `libros` (`Id_libro`),
  ADD CONSTRAINT `materialescrito_ibfk_2` FOREIGN KEY (`Id_revista`) REFERENCES `revistas` (`Id_revista`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
