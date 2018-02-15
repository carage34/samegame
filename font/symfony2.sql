-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Client :  127.0.0.1
-- Généré le :  Jeu 15 Février 2018 à 12:08
-- Version du serveur :  5.7.14
-- Version de PHP :  5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `symfony2`
--

-- --------------------------------------------------------

--
-- Structure de la table `annonce`
--

CREATE TABLE `annonce` (
  `id` int(11) NOT NULL,
  `message` longtext COLLATE utf8_unicode_ci,
  `date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Contenu de la table `annonce`
--

INSERT INTO `annonce` (`id`, `message`, `date`) VALUES
(4, 'ececed', '2018-02-09 15:17:52'),
(5, 'tg enculé', '2018-02-09 16:05:25');

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `email` varchar(180) COLLATE utf8_unicode_ci NOT NULL,
  `email_canonical` varchar(180) COLLATE utf8_unicode_ci NOT NULL,
  `enabled` tinyint(1) NOT NULL,
  `salt` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `password` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `last_login` datetime DEFAULT NULL,
  `confirmation_token` varchar(180) COLLATE utf8_unicode_ci DEFAULT NULL,
  `password_requested_at` datetime DEFAULT NULL,
  `roles` longtext COLLATE utf8_unicode_ci NOT NULL COMMENT '(DC2Type:array)',
  `username_canonical` varchar(180) COLLATE utf8_unicode_ci NOT NULL,
  `username` varchar(180) COLLATE utf8_unicode_ci NOT NULL,
  `nom` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `prénom` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `date_de_naissance` date DEFAULT NULL,
  `num_téléphone` int(11) DEFAULT NULL,
  `CU_nom` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Cu_prénom` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CU_num_téléphone` int(11) DEFAULT NULL,
  `CU_profession` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CU_addr_postale` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Contenu de la table `user`
--

INSERT INTO `user` (`id`, `email`, `email_canonical`, `enabled`, `salt`, `password`, `last_login`, `confirmation_token`, `password_requested_at`, `roles`, `username_canonical`, `username`, `nom`, `prénom`, `date_de_naissance`, `num_téléphone`, `CU_nom`, `Cu_prénom`, `CU_num_téléphone`, `CU_profession`, `CU_addr_postale`) VALUES
(2, 'al@dce.vrv', 'al@dce.vrv', 1, NULL, '$2y$13$/f6oEmAnrkYunD13q9tf0OGDztBOK6NrRTZ2rri7cy6mkb5POV6LO', '2018-02-08 09:23:48', NULL, NULL, 'a:0:{}', '123456789', '123456789', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(3, 'alexis@cdcd.fr', 'alexis@cdcd.fr', 1, NULL, '$2y$13$a9GNdi.5JCNUSig9crd98eCy4HC6Sjbm7akJsnhDmZWEtESvo2VQm', '2018-02-01 17:28:00', NULL, NULL, 'a:0:{}', '789', '789', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(4, 'alsa.dz@z.dz', 'alsa.dz@z.dz', 1, NULL, '$2y$13$7X5g.i8McF2YKKgg1MBogeiimOzG6jPLE01fW9UZOzdXdLx5v2M9K', '2018-02-06 18:55:46', NULL, NULL, 'a:0:{}', '145', '145', 'louis', NULL, '1902-01-01', 3030303, 'pd', 'fdp', 1315151, 'mule', 'aszzzaz'),
(5, 'alexis.legrain@orange.fr', 'alexis.legrain@orange.fr', 1, NULL, '$2y$13$7biAib/gnPTF6yrhv2SrfOZTovoWF8amu4jUMrMGHvfBsgn4yMZLq', '2018-02-15 11:45:33', NULL, NULL, 'a:0:{}', '123', '123', 'legrain', 'xaxaz', '1902-01-01', 12121, 'looius', 'czczec', 111321, 'dcdcdcd', 'cdcdcd'),
(6, 'admin@ad.ad', 'admin@ad.ad', 1, NULL, '$2y$13$YebHG7osV9kdtYNnAQmahOEl8JJLNPQq7nklJm24Gq3dgwLyLWDp2', '2018-02-15 11:50:47', NULL, NULL, 'a:1:{i:0;s:10:"ROLE_ADMIN";}', 'admin', 'admin', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

--
-- Index pour les tables exportées
--

--
-- Index pour la table `annonce`
--
ALTER TABLE `annonce`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UNIQ_8D93D649A0D96FBF` (`email_canonical`),
  ADD UNIQUE KEY `UNIQ_8D93D64992FC23A8` (`username_canonical`),
  ADD UNIQUE KEY `UNIQ_8D93D649C05FB297` (`confirmation_token`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `annonce`
--
ALTER TABLE `annonce`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT pour la table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
