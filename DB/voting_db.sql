-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Aug 07, 2019 at 08:31 PM
-- Server version: 5.6.12-log
-- PHP Version: 5.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `voting_db`
--
CREATE DATABASE IF NOT EXISTS `voting_db` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `voting_db`;

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `UserName` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `FirstName` varchar(100) NOT NULL,
  `LastName` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  PRIMARY KEY (`UserName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`UserName`, `Password`, `FirstName`, `LastName`, `email`) VALUES
('ADMIN', '1234', 'Mohammed', 'Osman', 'umagagee@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `audit`
--

CREATE TABLE IF NOT EXISTS `audit` (
  `LoginDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `fk1_UserName` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `financialcandidate`
--

CREATE TABLE IF NOT EXISTS `financialcandidate` (
  `ID` varchar(10) NOT NULL,
  `FIRSTNAME` varchar(50) NOT NULL,
  `LASTNAME` varchar(50) NOT NULL,
  `IMAGE` longblob NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `firstname` (`FIRSTNAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `financialvoting`
--

CREATE TABLE IF NOT EXISTS `financialvoting` (
  `ID` varchar(10) NOT NULL,
  `VOTES` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `logout`
--

CREATE TABLE IF NOT EXISTS `logout` (
  `SignoutTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `Username` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `organizercandidate`
--

CREATE TABLE IF NOT EXISTS `organizercandidate` (
  `ID` varchar(10) NOT NULL,
  `FIRSTNAME` varchar(50) NOT NULL,
  `LASTNAME` varchar(50) NOT NULL,
  `IMAGE` longblob NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `firstname` (`FIRSTNAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `organizervoting`
--

CREATE TABLE IF NOT EXISTS `organizervoting` (
  `ID` varchar(10) NOT NULL,
  `VOTES` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `presidentcandidate`
--

CREATE TABLE IF NOT EXISTS `presidentcandidate` (
  `ID` varchar(11) NOT NULL,
  `FIRSTNAME` varchar(50) NOT NULL,
  `LASTNAME` varchar(50) NOT NULL,
  `IMAGE` longblob NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `firstname` (`FIRSTNAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `presidentvoting`
--

CREATE TABLE IF NOT EXISTS `presidentvoting` (
  `ID` varchar(11) NOT NULL,
  `VOTES` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `secertarycandidate`
--

CREATE TABLE IF NOT EXISTS `secertarycandidate` (
  `ID` varchar(10) NOT NULL,
  `FIRSTNAME` varchar(50) NOT NULL,
  `LASTNAME` varchar(50) NOT NULL,
  `IMAGE` longblob NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `firstname` (`FIRSTNAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `secertaryvoting`
--

CREATE TABLE IF NOT EXISTS `secertaryvoting` (
  `ID` varchar(10) NOT NULL,
  `VOTES` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE IF NOT EXISTS `student` (
  `STUDENTID` varchar(11) NOT NULL,
  `FIRSTNAME` varchar(50) NOT NULL,
  `LASTNAME` varchar(50) NOT NULL,
  `LEVEL` varchar(50) DEFAULT NULL,
  `GENDER` varchar(10) NOT NULL,
  PRIMARY KEY (`STUDENTID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `treasurecandidate`
--

CREATE TABLE IF NOT EXISTS `treasurecandidate` (
  `ID` varchar(10) NOT NULL,
  `FIRSTNAME` varchar(50) NOT NULL,
  `LASTNAME` varchar(50) NOT NULL,
  `IMAGE` longblob NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `treasurevoting`
--

CREATE TABLE IF NOT EXISTS `treasurevoting` (
  `ID` varchar(10) NOT NULL,
  `VOTES` int(10) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `vericationhistory`
--

CREATE TABLE IF NOT EXISTS `vericationhistory` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `StudentID` varchar(11) NOT NULL,
  `code` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `verification`
--

CREATE TABLE IF NOT EXISTS `verification` (
  `fk1_IndexNumber` varchar(10) NOT NULL,
  `code` varchar(10) NOT NULL,
  PRIMARY KEY (`fk1_IndexNumber`),
  UNIQUE KEY `fk1_IndexNumber` (`fk1_IndexNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `votingends`
--

CREATE TABLE IF NOT EXISTS `votingends` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `endtime` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `votingends`
--

INSERT INTO `votingends` (`id`, `endtime`) VALUES
(1, '2019-08-07 17:00:05');

-- --------------------------------------------------------

--
-- Table structure for table `welfarecandidate`
--

CREATE TABLE IF NOT EXISTS `welfarecandidate` (
  `ID` varchar(10) NOT NULL,
  `FIRSTNAME` varchar(50) NOT NULL,
  `LASTNAME` varchar(50) NOT NULL,
  `IMAGE` longblob NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `firstname` (`FIRSTNAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `welfarevoting`
--

CREATE TABLE IF NOT EXISTS `welfarevoting` (
  `ID` varchar(10) NOT NULL,
  `VOTES` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `wucomcandidate`
--

CREATE TABLE IF NOT EXISTS `wucomcandidate` (
  `ID` varchar(10) NOT NULL,
  `FIRSTNAME` varchar(50) NOT NULL,
  `LASTNAME` varchar(50) NOT NULL,
  `IMAGE` longblob NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `firstname` (`FIRSTNAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `wucomvoting`
--

CREATE TABLE IF NOT EXISTS `wucomvoting` (
  `ID` varchar(10) NOT NULL,
  `VOTES` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
