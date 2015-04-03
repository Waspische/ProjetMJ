-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Client: localhost
-- Généré le: Ven 03 Avril 2015 à 15:22
-- Version du serveur: 5.6.12-log
-- Version de PHP: 5.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `carpooling`
--
CREATE DATABASE IF NOT EXISTS `carpooling` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `carpooling`;

-- --------------------------------------------------------

--
-- Structure de la table `document`
--

CREATE TABLE IF NOT EXISTS `document` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `libelle` varchar(255) NOT NULL,
  `fichier` blob NOT NULL,
  `id_document_legal` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `document_legal`
--

CREATE TABLE IF NOT EXISTS `document_legal` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_utilisateur` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `etape`
--

CREATE TABLE IF NOT EXISTS `etape` (
  `id` int(11) NOT NULL,
  `ordre` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `notation`
--

CREATE TABLE IF NOT EXISTS `notation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `note` int(11) NOT NULL,
  `date` date NOT NULL,
  `id_utilisateur` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `passager`
--

CREATE TABLE IF NOT EXISTS `passager` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_utilisateur` int(11) NOT NULL,
  `status` int(11) NOT NULL,
  `id_trajet` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Contenu de la table `passager`
--

INSERT INTO `passager` (`id`, `id_utilisateur`, `status`, `id_trajet`) VALUES
(4, 6, 0, 1),
(5, 7, 0, 1);

-- --------------------------------------------------------

--
-- Structure de la table `pays`
--

CREATE TABLE IF NOT EXISTS `pays` (
  `id` int(11) NOT NULL,
  `libelle` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `pays`
--

INSERT INTO `pays` (`id`, `libelle`) VALUES
(1, 'FRANCE');

-- --------------------------------------------------------

--
-- Structure de la table `preferences`
--

CREATE TABLE IF NOT EXISTS `preferences` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fumeur` int(1) NOT NULL,
  `bavard` int(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `reservation`
--

CREATE TABLE IF NOT EXISTS `reservation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date_reservation` varchar(255) DEFAULT NULL,
  `id_utilisateur` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_6j32anxj9k6jhjhprkysk6wxm` (`id_utilisateur`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `role`
--

CREATE TABLE IF NOT EXISTS `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `libelle` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 COMMENT='Table des roles d''utilisateurs' AUTO_INCREMENT=3 ;

--
-- Contenu de la table `role`
--

INSERT INTO `role` (`id`, `libelle`) VALUES
(1, 'ROLE_ADMIN'),
(2, 'ROLE_USER');

-- --------------------------------------------------------

--
-- Structure de la table `trajet`
--

CREATE TABLE IF NOT EXISTS `trajet` (
  `id` int(11) NOT NULL,
  `conducteur` int(11) NOT NULL,
  `nb_passager` int(11) NOT NULL,
  `nb_etape` int(11) NOT NULL,
  `date_creation` datetime NOT NULL,
  `id_ville_depart` int(11) NOT NULL,
  `id_ville_arrivee` int(11) NOT NULL,
  `id_type_voiture` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `trajet`
--

INSERT INTO `trajet` (`id`, `conducteur`, `nb_passager`, `nb_etape`, `date_creation`, `id_ville_depart`, `id_ville_arrivee`, `id_type_voiture`) VALUES
(1, 4, 2, 0, '2015-04-01 10:20:00', 1, 2, 1),
(2, 4, 2, 0, '2015-04-02 10:00:00', 2, 1, 1);

-- --------------------------------------------------------

--
-- Structure de la table `type_voiture`
--

CREATE TABLE IF NOT EXISTS `type_voiture` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `libelle` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Contenu de la table `type_voiture`
--

INSERT INTO `type_voiture` (`id`, `libelle`) VALUES
(1, 'BERLINE');

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE IF NOT EXISTS `utilisateur` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `rol_id` int(11) NOT NULL,
  `nom` varchar(80) DEFAULT NULL,
  `prenom` varchar(80) DEFAULT NULL,
  `email` varchar(80) DEFAULT NULL,
  `telephone` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 COMMENT='Table des utilisateurs' AUTO_INCREMENT=8 ;

--
-- Contenu de la table `utilisateur`
--

INSERT INTO `utilisateur` (`id`, `login`, `password`, `rol_id`, `nom`, `prenom`, `email`, `telephone`) VALUES
(1, 'admin', 'admin', 1, '', '', '', ''),
(2, 'user', 'user', 2, '', '', '', ''),
(4, 'adagbert', 'azerty', 2, 'DAGBERT', 'Anthony', 'dagbert_007@hotmail.com', '0647874695'),
(5, 'test', 'azerty', 2, '', '', '', ''),
(6, 'dgeo', 'azerty', 2, '', '', '', ''),
(7, 'wasp', 'azerty', 2, '', '', '', '');

-- --------------------------------------------------------

--
-- Structure de la table `ville`
--

CREATE TABLE IF NOT EXISTS `ville` (
  `id` int(11) NOT NULL,
  `id_pays` int(11) NOT NULL,
  `code_postal` varchar(100) NOT NULL,
  `libelle` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `ville`
--

INSERT INTO `ville` (`id`, `id_pays`, `code_postal`, `libelle`) VALUES
(1, 1, '59000', 'Lille'),
(2, 1, '69000', 'Lyon');

-- --------------------------------------------------------

--
-- Structure de la table `voiture`
--

CREATE TABLE IF NOT EXISTS `voiture` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `constructeur` varchar(100) NOT NULL,
  `modele` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `reservation`
--
ALTER TABLE `reservation`
  ADD CONSTRAINT `FK_6j32anxj9k6jhjhprkysk6wxm` FOREIGN KEY (`id_utilisateur`) REFERENCES `utilisateur` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
