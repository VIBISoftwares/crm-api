-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 13, 2022 at 04:40 AM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dg_crm`
--

-- --------------------------------------------------------

--
-- Table structure for table `company_contact`
--

CREATE TABLE `company_contact` (
  `sno` int(11) NOT NULL,
  `company_name` varchar(100) NOT NULL,
  `office_address` varchar(250) NOT NULL,
  `contact_person` varchar(100) NOT NULL,
  `person_contact` varchar(20) NOT NULL,
  `office_contact` varchar(20) NOT NULL,
  `email` varchar(60) NOT NULL,
  `gst_no` varchar(20) NOT NULL,
  `company_level` varchar(10) NOT NULL,
  `reference` varchar(60) NOT NULL,
  `assignto` varchar(60) NOT NULL,
  `status` tinyint(1) DEFAULT 1,
  `created_by` varchar(60) NOT NULL,
  `created_date` datetime NOT NULL,
  `updated_by` varchar(60) NOT NULL,
  `updated_date` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `company_contact`
--

INSERT INTO `company_contact` (`sno`, `company_name`, `office_address`, `contact_person`, `person_contact`, `office_contact`, `email`, `gst_no`, `company_level`, `reference`, `assignto`, `status`, `created_by`, `created_date`, `updated_by`, `updated_date`) VALUES
(1, 'ViBi Software Solutions', 'Madurai', 'Vinothkumar', '8248555365', '9600233969', 'vibisoftwares@gmail.com', '33BEJPM1610J1ZR', 'L3', 'Pandidurai', 'Abirami', 1, 'admin', '2022-06-12 17:08:41', '', '2022-06-12 17:08:41');

-- --------------------------------------------------------

--
-- Table structure for table `dg_leads`
--

CREATE TABLE `dg_leads` (
  `sno` int(11) NOT NULL,
  `title` varchar(10) DEFAULT NULL,
  `firstname` varchar(30) NOT NULL,
  `middlename` varchar(30) NOT NULL,
  `lastname` varchar(30) NOT NULL,
  `gender` varchar(15) NOT NULL,
  `email` varchar(60) NOT NULL,
  `contact` varchar(15) NOT NULL,
  `marital_status` varchar(15) NOT NULL,
  `guardian_type` varchar(15) NOT NULL,
  `guardian_name` varchar(60) NOT NULL,
  `guardian_contact` varchar(15) NOT NULL,
  `occupation` varchar(30) NOT NULL,
  `dob` date NOT NULL,
  `relegion` varchar(30) NOT NULL,
  `community` varchar(30) NOT NULL,
  `caste` varchar(30) NOT NULL,
  `address_line1` varchar(60) NOT NULL,
  `address_line2` varchar(60) NOT NULL,
  `area` varchar(60) NOT NULL,
  `district` varchar(60) NOT NULL,
  `state` varchar(60) NOT NULL,
  `country` varchar(60) NOT NULL,
  `pincode` varchar(10) NOT NULL,
  `followupdate` datetime NOT NULL,
  `source` varchar(30) NOT NULL,
  `is_convert` char(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `company_contact`
--
ALTER TABLE `company_contact`
  ADD PRIMARY KEY (`sno`);

--
-- Indexes for table `dg_leads`
--
ALTER TABLE `dg_leads`
  ADD PRIMARY KEY (`sno`),
  ADD KEY `contact` (`contact`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `company_contact`
--
ALTER TABLE `company_contact`
  MODIFY `sno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `dg_leads`
--
ALTER TABLE `dg_leads`
  MODIFY `sno` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
