-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Jeu 18 Février 2016 à 23:22
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `etab`
--

-- --------------------------------------------------------

--
-- Structure de la table `etablissement1`
--

CREATE TABLE IF NOT EXISTS `etablissement1` (
  `id_etablissement` int(11) NOT NULL AUTO_INCREMENT,
  `nom` text NOT NULL,
  `tel` text NOT NULL,
  `fax` text NOT NULL,
  `adresse` text NOT NULL,
  `raison_social` text NOT NULL,
  PRIMARY KEY (`id_etablissement`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Contenu de la table `etablissement1`
--

INSERT INTO `etablissement1` (`id_etablissement`, `nom`, `tel`, `fax`, `adresse`, `raison_social`) VALUES
(1, 'Ensam', '0623521452', '+2355122', 'Hay ryad', 'zoulay'),
(2, 'EST', '06321452', '+2365412', 'Mkenssia ', 'Société'),
(3, 'HKFJEVFJ', '06675KJKVFJVK', 'CJKHFEIJV', 'CJOHEFIVHIFR', 'VJHFJVHBV');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
