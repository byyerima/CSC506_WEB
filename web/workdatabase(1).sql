-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 17, 2021 at 05:36 PM
-- Server version: 5.1.53
-- PHP Version: 5.3.4

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `workdatabase`
--

-- --------------------------------------------------------

--
-- Table structure for table `comment`
--

CREATE TABLE IF NOT EXISTS `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `post` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `comment`
--

INSERT INTO `comment` (`id`, `name`, `post`) VALUES
(2, 'Abraham Moses', '  Programming is good and i love it.');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `phone` varchar(50) NOT NULL,
  `address` varchar(100) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `name`, `email`, `phone`, `address`, `password`) VALUES
(1, 'Abraham', 'abraham@gmail.com', '08099653214', 'Jimeta Yola', '1234'),
(2, 'Musa', 'musa@gmail.com', '07032659874', 'Mautech', '0000'),
(3, 'Abraham Moses', 'ab@gmail.com', '07065892314', 'Computer Science MAUTECH', 'PASSWORD'),
(4, 'Wafari', 'wari@gmail.com', '08065659826', 'Mautech YOLA ', '2222'),
(5, 'egegg', 'tttrtr@gmail.com', '2313123', 'sdffrfrgrg', 'trttt'),
(6, 'Amos', 'amos@gmail.com', '08065231456', 'Sangere FUTY', '1234'),
(7, 'Abraham Moses', 'dioahimaaz@gmail.com', '08140876190', 'Mautech', '0000'),
(8, 'gegrg', 'd@gmail.com', 'egee', 'gegegg', '1111');
