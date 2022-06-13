-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 13, 2022 at 03:20 PM
-- Server version: 8.0.29-0ubuntu0.20.04.3
-- PHP Version: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `demo2`
--

-- --------------------------------------------------------

--
-- Table structure for table `company_contact`
--

CREATE TABLE `company_contact` (
  `sno` int NOT NULL,
  `company_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `office_address` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `contact_person` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `person_contact` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `office_contact` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `email` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `gst_no` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `company_level` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `reference` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `assignto` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `status` tinyint(1) DEFAULT '1',
  `created_by` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_by` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `company_contact`
--

INSERT INTO `company_contact` (`sno`, `company_name`, `office_address`, `contact_person`, `person_contact`, `office_contact`, `email`, `gst_no`, `company_level`, `reference`, `assignto`, `status`, `created_by`, `created_date`, `updated_by`, `updated_date`) VALUES
(1, 'ViBi Software Solutions', 'Madurai', 'Vinothkumar', '8248555365', '9600233969', 'vibisoftwares@gmail.com', '33BEJPM1610J1ZR', 'L3', 'Pandidurai', 'Abirami', 1, 'admin', '2022-06-12 17:08:41', '', '2022-06-12 17:08:41'),
(2, 'KASPON TECH WORKS', 'PERUNGUDI', 'RANJITH', '9875874589', '1234567890', 'KASPON@GMAIL.COM', 'ASAASASDASD', 'L2', 'RAMESH', 'VINOTH KUMAR', 1, 'ADMIN', '2022-06-13 12:12:10', 'ADMIN', '2022-06-13 12:30:22');

-- --------------------------------------------------------

--
-- Table structure for table `employees_personal_info`
--

CREATE TABLE `employees_personal_info` (
  `sno` int NOT NULL,
  `title` varchar(10) DEFAULT NULL,
  `firstname` varchar(30) DEFAULT NULL,
  `middlename` varchar(30) DEFAULT NULL,
  `lastname` varchar(30) DEFAULT NULL,
  `gender` varchar(15) DEFAULT NULL,
  `email` varchar(60) DEFAULT NULL,
  `contact` varchar(15) DEFAULT NULL,
  `marital_status` varchar(15) DEFAULT NULL,
  `guardian_type` varchar(15) DEFAULT NULL,
  `guardian_name` varchar(60) DEFAULT NULL,
  `guardian_contact` varchar(15) DEFAULT NULL,
  `occupation` varchar(30) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `relegion` varchar(30) DEFAULT NULL,
  `community` varchar(30) DEFAULT NULL,
  `caste` varchar(30) DEFAULT NULL,
  `address_line1` varchar(60) DEFAULT NULL,
  `address_line2` varchar(60) DEFAULT NULL,
  `area` varchar(60) DEFAULT NULL,
  `district` varchar(60) DEFAULT NULL,
  `state` varchar(60) DEFAULT NULL,
  `country` varchar(60) DEFAULT NULL,
  `pincode` varchar(10) DEFAULT NULL,
  `reference` varchar(30) DEFAULT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1',
  `created_by` varchar(60) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_by` varchar(60) DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `leads_personal_info`
--

CREATE TABLE `leads_personal_info` (
  `sno` int NOT NULL,
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `lead_appointment`
--

CREATE TABLE `lead_appointment` (
  `sno` int NOT NULL,
  `lead_sno` int DEFAULT NULL,
  `appointment_datetime` datetime DEFAULT NULL,
  `status` varchar(60) DEFAULT NULL,
  `comments` text,
  `last_appointment_sno` int DEFAULT NULL,
  `is_escalated` tinyint(1) DEFAULT '0',
  `created_by` varchar(60) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_by` varchar(60) DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `person_contact`
--

CREATE TABLE `person_contact` (
  `sno` int NOT NULL,
  `name` varchar(100) NOT NULL,
  `address` varchar(250) NOT NULL,
  `primary_no` varchar(20) NOT NULL,
  `alternate_no` varchar(60) NOT NULL,
  `email` varchar(60) NOT NULL,
  `reference` varchar(60) NOT NULL,
  `assignto` varchar(60) NOT NULL,
  `status` tinyint(1) DEFAULT '1',
  `created_by` varchar(60) NOT NULL,
  `created_date` datetime NOT NULL,
  `updated_by` varchar(60) NOT NULL,
  `updated_date` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `sno` int NOT NULL,
  `userid` varchar(60) DEFAULT NULL,
  `user_name` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `password` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `location` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `status` tinyint(1) DEFAULT '1',
  `created_by` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_by` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `company_contact`
--
ALTER TABLE `company_contact`
  ADD PRIMARY KEY (`sno`);

--
-- Indexes for table `leads_personal_info`
--
ALTER TABLE `leads_personal_info`
  ADD PRIMARY KEY (`sno`),
  ADD KEY `contact` (`contact`);

--
-- Indexes for table `lead_appointment`
--
ALTER TABLE `lead_appointment`
  ADD PRIMARY KEY (`sno`),
  ADD KEY `lead_sno` (`lead_sno`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`sno`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `company_contact`
--
ALTER TABLE `company_contact`
  MODIFY `sno` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `leads_personal_info`
--
ALTER TABLE `leads_personal_info`
  MODIFY `sno` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `lead_appointment`
--
ALTER TABLE `lead_appointment`
  MODIFY `sno` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `sno` int NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
