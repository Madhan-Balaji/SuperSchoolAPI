-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 16, 2019 at 05:42 AM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.3.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `superschool`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertSchool` (IN `id` VARCHAR(50), IN `name` VARCHAR(25), IN `board` VARCHAR(25), IN `startedDate` DATE, IN `joinedDate` DATE, IN `website` VARCHAR(25), IN `primaryContact` INT(10), IN `secondaryContact` INT(10), IN `primaryEmail` VARCHAR(25), IN `secondaryEmail` VARCHAR(25), IN `languages` VARCHAR(25), IN `kinderGardenAvailable` BOOLEAN, IN `primaryAvailable` BOOLEAN, IN `secondaryAvailable` BOOLEAN, IN `higherSecondaryAvailable` BOOLEAN, IN `governmentAided` BOOLEAN, IN `international` BOOLEAN, IN `smartSchool` BOOLEAN, IN `description` VARCHAR(250), IN `logo` VARCHAR(25), IN `image1` VARCHAR(25), IN `image2` VARCHAR(25), IN `image3` VARCHAR(25), IN `doorNo` VARCHAR(25), IN `street` VARCHAR(25), IN `area` VARCHAR(25), IN `city` VARCHAR(25), IN `pincode` INT(6), IN `createdBy` VARCHAR(25), IN `updatedBy` VARCHAR(25), IN `createdDateTime` VARCHAR(25), IN `updatedDateTime` VARCHAR(25))  BEGIN

INSERT INTO school (
    id,
    name,
    board,
    startedDate,
    joinedDate,
    website,
    primaryContact,
    secondaryContact,
    primaryEmail,
    secondaryEmail,
    languages,
    kinderGardenAvailable,
    primaryAvailable,
    secondaryAvailable,
    higherSecondaryAvailable,
    governmentAided,
    international,
    smartSchool,
    description,
    logo,
    image1,
    image2,
    image3,
    doorNo,
    street,
    area,
    city,
    pincode,
    createdBy,
    updatedBy,
    createdDateTime,
    updatedDateTime
    )
    VALUES
    (
    id,
    name,
    board,
    startedDate,
    joinedDate,
    website,
    primaryContact,
    secondaryContact,
    primaryEmail,
    secondaryEmail,
    languages,
    kinderGardenAvailable,
    primaryAvailable,
    secondaryAvailable,
    higherSecondaryAvailable,
    governmentAided,
    international,
    smartSchool,
    description,
    logo,
    image1,
    image2,
    image3,
    doorNo,
    street,
    area,
    city,
    pincode,
    createdBy,
    updatedBy,
    createdDateTime,
    updatedDateTime
    );
    
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` varchar(50) NOT NULL,
  `firstName` varchar(25) NOT NULL,
  `lastName` varchar(25) NOT NULL,
  `email` varchar(25) NOT NULL,
  `password` text NOT NULL,
  `createdDateTime` datetime NOT NULL,
  `updatedDateTime` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `school`
--

CREATE TABLE `school` (
  `id` varchar(50) NOT NULL,
  `name` varchar(25) NOT NULL,
  `board` varchar(25) NOT NULL,
  `startedDate` date NOT NULL,
  `joinedDate` date NOT NULL,
  `primaryContact` int(10) NOT NULL,
  `secondaryContact` int(10) DEFAULT NULL,
  `primaryEmail` varchar(25) NOT NULL,
  `secondaryEmail` varchar(25) DEFAULT NULL,
  `languages` varchar(25) NOT NULL,
  `kinderGardenAvailable` tinyint(1) NOT NULL,
  `primaryAvailable` tinyint(1) NOT NULL,
  `secondaryAvailable` tinyint(1) NOT NULL,
  `higherSecondaryAvailable` tinyint(1) NOT NULL,
  `governmentAided` tinyint(1) NOT NULL,
  `international` tinyint(1) NOT NULL,
  `smartSchool` tinyint(1) NOT NULL,
  `description` varchar(250) NOT NULL,
  `logo` varchar(25) DEFAULT NULL,
  `image1` varchar(25) DEFAULT NULL,
  `image2` varchar(25) DEFAULT NULL,
  `image3` varchar(25) DEFAULT NULL,
  `website` varchar(25) DEFAULT NULL,
  `doorNo` varchar(15) NOT NULL,
  `street` varchar(25) NOT NULL,
  `area` varchar(25) NOT NULL,
  `city` varchar(25) NOT NULL,
  `pincode` int(6) NOT NULL,
  `createdBy` varchar(25) DEFAULT NULL,
  `updatedBy` varchar(25) DEFAULT NULL,
  `createdDateTime` datetime DEFAULT NULL,
  `updatedDateTime` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `school`
--

INSERT INTO `school` (`id`, `name`, `board`, `startedDate`, `joinedDate`, `primaryContact`, `secondaryContact`, `primaryEmail`, `secondaryEmail`, `languages`, `kinderGardenAvailable`, `primaryAvailable`, `secondaryAvailable`, `higherSecondaryAvailable`, `governmentAided`, `international`, `smartSchool`, `description`, `logo`, `image1`, `image2`, `image3`, `website`, `doorNo`, `street`, `area`, `city`, `pincode`, `createdBy`, `updatedBy`, `createdDateTime`, `updatedDateTime`) VALUES
('9d72efb5-13db-4d70-971c-dd1df3411ec5', 'J.G.V.V.', 'Matriculation', '2019-10-16', '2019-10-16', 26262626, 26265874, 'jgvvannanagar@gmail.com', 'jgvv@gmail.com', 'Tamil, English, Sanskrit', 1, 1, 1, 1, 0, 0, 1, 'Best School you can find in anna nagar', NULL, NULL, NULL, NULL, 'www.jgvvannanagar.org', '9', '12th street, K Block', 'Anna Nagar West', 'Chennai', 600040, 'SuperAdmin', 'SuperAdmin', '2019-10-16 09:01:26', '2019-10-16 09:01:26');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `school`
--
ALTER TABLE `school`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
