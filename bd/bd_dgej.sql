-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-05-2026 a las 13:08:36
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_dgej`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `DNI` varchar(9) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `Apellidos` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Teléfono` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `encargos`
--

CREATE TABLE `encargos` (
  `ID_ENCARGO` varchar(9) NOT NULL,
  `FECHA` date NOT NULL,
  `ENTREGADO` tinyint(1) NOT NULL,
  `FACTURA` int(11) NOT NULL,
  `DNI_CLIENTE` varchar(9) NOT NULL,
  `DNI_TECNICO` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tecnico`
--

CREATE TABLE `tecnico` (
  `DNI` varchar(9) NOT NULL,
  `NOMBRE` varchar(20) NOT NULL,
  `APELLIDOS` varchar(50) NOT NULL,
  `EMAIL` varchar(50) NOT NULL,
  `TELEFONO` int(9) NOT NULL,
  `TITULACION` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`DNI`);

--
-- Indices de la tabla `encargos`
--
ALTER TABLE `encargos`
  ADD PRIMARY KEY (`ID_ENCARGO`),
  ADD KEY `fk_cliente` (`DNI_CLIENTE`),
  ADD KEY `fk_tecnico` (`DNI_TECNICO`);

--
-- Indices de la tabla `tecnico`
--
ALTER TABLE `tecnico`
  ADD PRIMARY KEY (`DNI`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `encargos`
--
ALTER TABLE `encargos`
  ADD CONSTRAINT `fk_cliente` FOREIGN KEY (`DNI_CLIENTE`) REFERENCES `cliente` (`DNI`),
  ADD CONSTRAINT `fk_tecnico` FOREIGN KEY (`DNI_TECNICO`) REFERENCES `tecnico` (`DNI`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
