-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 30, 2022 at 05:30 AM
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
-- Database: `demo2`
--

-- --------------------------------------------------------

--
-- Table structure for table `clientcontact`
--

CREATE TABLE `clientcontact` (
  `sno` int(11) NOT NULL,
  `contact_name` varchar(100) NOT NULL,
  `contact_number` varchar(20) DEFAULT NULL,
  `alternate_number` varchar(20) DEFAULT NULL,
  `email_id` varchar(60) DEFAULT NULL,
  `facebook` varchar(30) DEFAULT NULL,
  `instagram` varchar(30) DEFAULT NULL,
  `linked_in` varchar(30) DEFAULT NULL,
  `others_media_id` varchar(30) DEFAULT NULL,
  `status` tinyint(1) DEFAULT 1,
  `created_by` varchar(60) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_by` varchar(60) DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL,
  `history` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `clientcontact`
--

INSERT INTO `clientcontact` (`sno`, `contact_name`, `contact_number`, `alternate_number`, `email_id`, `facebook`, `instagram`, `linked_in`, `others_media_id`, `status`, `created_by`, `created_date`, `updated_by`, `updated_date`, `history`) VALUES
(1, 'Raman', '8989898989', '', 'raman@gmai.com', '', '', '', '', 1, NULL, '2022-06-23 02:58:18', NULL, '2022-06-25 15:26:30', NULL),
(2, 'Arjuna', '889898989', '1234567789', '', '', '', '', '', 1, NULL, '2022-06-23 02:58:29', NULL, '2022-06-25 15:28:04', NULL),
(3, 'Lakshmi', '98989812121', '121212112', 'lakshmi@gmail.com', 'lak.vibi', 'lak.vibi', 'laklln', NULL, 1, NULL, '2022-06-25 15:31:27', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `company_contact`
--

CREATE TABLE `company_contact` (
  `sno` int(11) NOT NULL,
  `company_name` varchar(100) DEFAULT NULL,
  `office_address` varchar(250) DEFAULT NULL,
  `contact_person` varchar(100) DEFAULT NULL,
  `person_contact` varchar(20) DEFAULT NULL,
  `office_contact` varchar(20) DEFAULT NULL,
  `email` varchar(60) DEFAULT NULL,
  `gst_no` varchar(20) DEFAULT NULL,
  `company_level` varchar(10) DEFAULT NULL,
  `reference` varchar(60) DEFAULT NULL,
  `assignto` varchar(60) DEFAULT NULL,
  `status` tinyint(1) DEFAULT 1,
  `created_by` varchar(60) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_by` varchar(60) DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `company_contact`
--

INSERT INTO `company_contact` (`sno`, `company_name`, `office_address`, `contact_person`, `person_contact`, `office_contact`, `email`, `gst_no`, `company_level`, `reference`, `assignto`, `status`, `created_by`, `created_date`, `updated_by`, `updated_date`) VALUES
(1, 'rama', 'Madurai', 'abirami', NULL, NULL, 'rama@gmail.com', NULL, 'L2', 'Advertise', 'Abirami', 0, 'admin', '2022-06-12 17:08:41', NULL, '2022-06-26 16:18:31'),
(2, 'KASPON TECH WORKS', 'PERUNGUDI', 'RANJITH', '9875874589', '1234567890', 'KASPON@GMAIL.COM', 'ASAASASDASD', 'L2', 'RAMESH', 'VINOTH KUMAR', 1, 'ADMIN', '2022-06-13 12:12:10', 'ADMIN', '2022-06-13 17:27:17'),
(37, 'test1', '', '', NULL, NULL, '', '', '', '', '', 0, NULL, '2022-06-15 18:10:34', NULL, '2022-06-25 15:29:54'),
(38, 'test2', '', '', '', NULL, '', '', '', '', '', 0, NULL, '2022-06-15 18:28:07', NULL, NULL),
(39, 'test3', '', '', '', NULL, '', '', '', '', '', 0, NULL, '2022-06-15 18:29:35', NULL, NULL),
(40, 'test 4', '', '', '', NULL, '', '', '', '', '', 0, NULL, '2022-06-15 18:31:48', NULL, NULL),
(41, 'test5', '', '', '', NULL, '', '', '', '', '', 0, NULL, '2022-06-15 18:34:53', NULL, '2022-06-30 03:09:34'),
(42, 'test 6', 'Madurai', 'aaa', NULL, NULL, '', '', 'L3', 'Advertise', '', 0, NULL, '2022-06-16 16:12:18', NULL, '2022-06-17 19:39:54'),
(43, 'test7', '', '', '', NULL, '', '', '', '', '', 0, NULL, '2022-06-16 17:00:07', NULL, NULL),
(44, 'test 8', '', '', '', NULL, '', '', '', '', '', 0, NULL, '2022-06-16 17:11:21', NULL, NULL),
(45, 'test11', '', '', '', NULL, '', '', '', '', '', 0, NULL, '2022-06-17 02:58:53', NULL, NULL),
(46, 'test12', '', '', '', NULL, '', '', '', '', '', 0, NULL, '2022-06-17 03:04:10', NULL, NULL),
(47, 'test 13', '', '', '', NULL, '', '', '', '', '', 0, NULL, '2022-06-17 03:25:56', NULL, NULL),
(48, 'test14', '', '', '', NULL, '', '', '', '', '', 0, NULL, '2022-06-17 03:26:21', NULL, NULL),
(49, 'test15', '', '', '', NULL, '', '', '', '', '', 0, NULL, '2022-06-17 03:27:02', NULL, NULL),
(50, 'twst 16', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, '2022-06-17 03:27:07', NULL, NULL),
(51, 'test 17', '', '', '', NULL, '', '', '', '', '', 0, NULL, '2022-06-17 16:14:54', NULL, NULL),
(52, 'test 18', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, '2022-06-17 17:49:47', NULL, NULL),
(53, 'test 19', '', '', '', NULL, '', '', '', '', '', 0, NULL, '2022-06-17 17:51:03', NULL, NULL),
(54, 'test 20', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, '2022-06-17 17:51:11', NULL, NULL),
(55, 'test 21', '', '', '', NULL, '', '', '', '', '', 0, NULL, '2022-06-17 17:52:51', NULL, NULL),
(56, 'test22', '', '', '', NULL, '', '', '', '', '', 0, NULL, '2022-06-17 18:48:34', NULL, NULL),
(57, 'test22', '', '', '', NULL, '', '', '', '', '', 0, NULL, '2022-06-17 18:49:01', NULL, NULL),
(58, 'test23', '', '', '', NULL, '', '', '', '', '', 0, NULL, '2022-06-17 18:50:06', NULL, NULL),
(59, 'test 24', '', '', '', NULL, '', '', '', '', '', 0, NULL, '2022-06-17 18:50:32', NULL, NULL),
(60, 'test 26', '', '', '', NULL, '', '', '', '', '', 0, NULL, '2022-06-17 18:53:49', NULL, NULL),
(61, 'test 26', '', '', '', NULL, '', '', '', '', '', 0, NULL, '2022-06-17 18:54:13', NULL, NULL),
(62, 'ViBi Software Solutions', 'Madurai', 'Vinothkumar', NULL, '9600233969', 'vibisoftwares@gmail.com', '33BEJPM1610J1ZR', 'L3', 'Advertise', 'Abirami', 1, NULL, '2022-06-17 19:38:11', NULL, NULL),
(63, 'aaaa', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, '2022-06-17 19:42:31', NULL, NULL),
(64, 'sss', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, NULL, '2022-06-17 19:42:36', NULL, '2022-06-26 16:19:06'),
(65, 'sss', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, '2022-06-17 19:43:13', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `employees_personal_info`
--

CREATE TABLE `employees_personal_info` (
  `sno` int(11) NOT NULL,
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
  `status` tinyint(1) NOT NULL DEFAULT 1,
  `created_by` varchar(60) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_by` varchar(60) DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `leads_personal_info`
--

CREATE TABLE `leads_personal_info` (
  `sno` int(11) NOT NULL,
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
  `followupdate` datetime DEFAULT NULL,
  `source` varchar(30) DEFAULT NULL,
  `is_convert` char(1) DEFAULT NULL,
  `status` tinyint(1) NOT NULL DEFAULT 1,
  `created_by` varchar(60) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_by` varchar(60) DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `leads_personal_info`
--

INSERT INTO `leads_personal_info` (`sno`, `title`, `firstname`, `middlename`, `lastname`, `gender`, `email`, `contact`, `marital_status`, `guardian_type`, `guardian_name`, `guardian_contact`, `occupation`, `dob`, `relegion`, `community`, `caste`, `address_line1`, `address_line2`, `area`, `district`, `state`, `country`, `pincode`, `followupdate`, `source`, `is_convert`, `status`, `created_by`, `created_date`, `updated_by`, `updated_date`) VALUES
(1, 'Mr', 'Josep', '', '', '', '', '89898988998', '', '', '', '', '', '0000-00-00', '', '', '', '', '', '', '', '', '', '', '2022-06-25 20:17:57', '', '', 1, NULL, NULL, NULL, NULL),
(2, 'Mr', 'RAKKI', '', '', '', '', '89898988998', '', '', '', '', '', '0000-00-00', '', '', '', '', '', '', '', '', '', '', '2022-06-25 20:17:57', '', '', 1, NULL, NULL, NULL, NULL),
(3, 'Mr', 'Janaki', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2022-04-14', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2022-07-24 00:00:00', NULL, NULL, 0, NULL, '2022-06-25 18:52:17', NULL, '2022-06-27 18:10:28'),
(4, 'Mr', 'Janaki', 'testing', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2022-04-14', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2022-07-24 00:00:00', NULL, NULL, 0, NULL, '2022-06-26 05:45:28', NULL, '2022-06-27 18:07:12'),
(5, 'Mrs', 'Janaki', 'sundaram', 'rai', 'female', 'admin@admin.com', NULL, 'Divorce', 'Father', 'aaa', NULL, 'Self Business', '2022-04-14', NULL, 'ob', 'oc', 'test', NULL, 'Adaiyar', 'Chennai', 'Tamilnadu', 'India', '600096', '2022-07-24 00:00:00', '', NULL, 0, NULL, '2022-06-26 05:46:30', NULL, '2022-06-27 15:24:28'),
(6, 'Mr', 'ramki', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2022-04-14', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2022-07-24 00:00:00', NULL, NULL, 0, NULL, '2022-06-29 02:20:21', NULL, '2022-06-30 01:50:35'),
(7, 'Mrs', 'keerthana', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2022-04-14', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2022-07-24 00:00:00', NULL, NULL, 1, NULL, '2022-06-29 02:23:58', NULL, NULL),
(8, 'Miss', 'Shylaja', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2022-04-14', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2022-07-24 00:00:00', NULL, NULL, 1, NULL, '2022-06-29 02:28:23', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `lead_appointment`
--

CREATE TABLE `lead_appointment` (
  `sno` int(11) NOT NULL,
  `lead_sno` int(11) DEFAULT NULL,
  `appointment_datetime` datetime DEFAULT NULL,
  `status` varchar(60) DEFAULT NULL,
  `comments` text DEFAULT NULL,
  `last_appointment_sno` int(11) DEFAULT NULL,
  `is_escalated` tinyint(1) DEFAULT 0,
  `created_by` varchar(60) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_by` varchar(60) DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `lead_appointment`
--

INSERT INTO `lead_appointment` (`sno`, `lead_sno`, `appointment_datetime`, `status`, `comments`, `last_appointment_sno`, `is_escalated`, `created_by`, `created_date`, `updated_by`, `updated_date`) VALUES
(1, 8, '2022-07-04 00:00:00', NULL, NULL, NULL, 0, NULL, '2022-06-29 02:28:23', NULL, '2022-06-30 03:16:06'),
(2, 1, '2022-06-30 00:00:00', NULL, NULL, NULL, 0, NULL, '2022-06-29 02:28:23', NULL, '2022-06-30 02:02:15'),
(3, 2, '2022-07-04 00:00:00', NULL, NULL, NULL, 0, NULL, '2022-06-29 02:28:23', NULL, '2022-06-30 03:16:06'),
(4, 3, '2022-07-05 00:00:00', NULL, NULL, NULL, 0, NULL, '2022-06-29 02:28:23', NULL, '2022-06-30 02:44:22'),
(5, 4, '2022-07-04 00:00:00', NULL, NULL, NULL, 0, NULL, '2022-06-29 02:28:23', NULL, '2022-06-30 03:16:06'),
(6, 5, '2022-07-04 00:00:00', NULL, NULL, NULL, 0, NULL, '2022-06-29 02:28:23', NULL, '2022-06-30 03:16:06'),
(7, 6, '2022-06-30 00:00:00', NULL, NULL, NULL, 0, NULL, '2022-06-29 02:28:23', NULL, '2022-06-30 02:02:15'),
(8, 7, '2022-06-30 00:00:00', NULL, NULL, NULL, 0, NULL, '2022-06-29 02:28:23', NULL, '2022-06-30 02:02:15');

-- --------------------------------------------------------

--
-- Table structure for table `lead_trade_info`
--

CREATE TABLE `lead_trade_info` (
  `sno` int(11) NOT NULL,
  `lead_sno` int(11) DEFAULT NULL,
  `branch` varchar(60) DEFAULT NULL,
  `kyc_number` varchar(60) DEFAULT NULL,
  `kyc_type` varchar(60) DEFAULT NULL,
  `brokerage_offer` varchar(60) DEFAULT NULL,
  `cheque_amount` varchar(60) DEFAULT NULL,
  `plan_type` varchar(60) DEFAULT NULL,
  `gst%` varchar(60) DEFAULT NULL,
  `total_cost` varchar(60) DEFAULT NULL,
  `trade_amount` varchar(60) DEFAULT NULL,
  `payment_date` varchar(60) DEFAULT NULL,
  `account_no` varchar(60) DEFAULT NULL,
  `payment_mode` varchar(60) DEFAULT NULL,
  `trans_id` varchar(60) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `lead_trade_info_temp`
--

CREATE TABLE `lead_trade_info_temp` (
  `sno` int(11) NOT NULL,
  `lead_sno` int(11) DEFAULT NULL,
  `branch` varchar(60) DEFAULT NULL,
  `kyc_number` varchar(60) DEFAULT NULL,
  `kyc_type` varchar(60) DEFAULT NULL,
  `brokerage_offer` varchar(60) DEFAULT NULL,
  `cheque_amount` varchar(60) DEFAULT NULL,
  `plan_type` varchar(60) DEFAULT NULL,
  `gst%` varchar(60) DEFAULT NULL,
  `total_cost` varchar(60) DEFAULT NULL,
  `trade_amount` varchar(60) DEFAULT NULL,
  `payment_date` varchar(60) DEFAULT NULL,
  `account_no` varchar(60) DEFAULT NULL,
  `payment_mode` varchar(60) DEFAULT NULL,
  `trans_id` varchar(60) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `person_contact`
--

CREATE TABLE `person_contact` (
  `sno` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `address` varchar(250) NOT NULL,
  `primary_no` varchar(20) NOT NULL,
  `alternate_no` varchar(60) NOT NULL,
  `email` varchar(60) NOT NULL,
  `reference` varchar(60) NOT NULL,
  `assignto` varchar(60) NOT NULL,
  `status` tinyint(1) DEFAULT 1,
  `created_by` varchar(60) NOT NULL,
  `created_date` datetime NOT NULL,
  `updated_by` varchar(60) NOT NULL,
  `updated_date` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `trade_info`
--

CREATE TABLE `trade_info` (
  `sno` int(11) NOT NULL,
  `lead_sno` int(11) DEFAULT NULL,
  `branch` varchar(60) DEFAULT NULL,
  `kyc_number` varchar(60) DEFAULT NULL,
  `kyc_type` varchar(60) DEFAULT NULL,
  `brokerage_offer` varchar(60) DEFAULT NULL,
  `cheque_amount` varchar(60) DEFAULT NULL,
  `plan_type` varchar(60) DEFAULT NULL,
  `gst%` varchar(60) DEFAULT NULL,
  `total_cost` varchar(60) DEFAULT NULL,
  `trade_amount` varchar(60) DEFAULT NULL,
  `payment_date` varchar(60) DEFAULT NULL,
  `account_no` varchar(60) DEFAULT NULL,
  `payment_mode` varchar(60) DEFAULT NULL,
  `trans_id` varchar(60) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `sno` int(11) NOT NULL,
  `userid` varchar(60) DEFAULT NULL,
  `user_name` varchar(60) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `location` varchar(60) DEFAULT NULL,
  `status` tinyint(1) DEFAULT 1,
  `created_by` varchar(60) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_by` varchar(60) DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `clientcontact`
--
ALTER TABLE `clientcontact`
  ADD PRIMARY KEY (`sno`);

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
-- Indexes for table `lead_trade_info`
--
ALTER TABLE `lead_trade_info`
  ADD PRIMARY KEY (`sno`);

--
-- Indexes for table `trade_info`
--
ALTER TABLE `trade_info`
  ADD PRIMARY KEY (`sno`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`sno`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `clientcontact`
--
ALTER TABLE `clientcontact`
  MODIFY `sno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `company_contact`
--
ALTER TABLE `company_contact`
  MODIFY `sno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=66;

--
-- AUTO_INCREMENT for table `leads_personal_info`
--
ALTER TABLE `leads_personal_info`
  MODIFY `sno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `lead_appointment`
--
ALTER TABLE `lead_appointment`
  MODIFY `sno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `lead_trade_info`
--
ALTER TABLE `lead_trade_info`
  MODIFY `sno` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `trade_info`
--
ALTER TABLE `trade_info`
  MODIFY `sno` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `sno` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
