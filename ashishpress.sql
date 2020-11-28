-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 28, 2020 at 01:29 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.3.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ashishpress`
--

-- --------------------------------------------------------

--
-- Table structure for table `purchase`
--

CREATE TABLE `purchase` (
  `purchased_id` int(11) NOT NULL,
  `date` varchar(200) DEFAULT NULL,
  `party_name` varchar(200) DEFAULT NULL,
  `invoice_no` varchar(200) DEFAULT NULL,
  `payment_method` varchar(200) DEFAULT NULL,
  `purchased_item` varchar(200) DEFAULT NULL,
  `quantity` varchar(200) DEFAULT NULL,
  `debit` double DEFAULT NULL,
  `credit` double DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `remarks` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `purchase`
--

INSERT INTO `purchase` (`purchased_id`, `date`, `party_name`, `invoice_no`, `payment_method`, `purchased_item`, `quantity`, `debit`, `credit`, `amount`, `remarks`) VALUES
(1, 'dsf', 'sdf', 'sdf', 'Cheque', 'sdf', 'sdf', -90, 435, 345, ''),
(2, 'dsf', 'sdf', 'sdf', 'Cheque', 'sdf', 'sdf', -90, 435, 345, ''),
(3, '234', '23423', '234', 'Cheque', '234', '234', 0, 234, 234, '324');

-- --------------------------------------------------------

--
-- Table structure for table `purchase_history`
--

CREATE TABLE `purchase_history` (
  `purchased_id` int(11) NOT NULL,
  `date` varchar(200) DEFAULT NULL,
  `party_name` varchar(200) DEFAULT NULL,
  `invoice_no` varchar(200) DEFAULT NULL,
  `payment_method` varchar(200) DEFAULT NULL,
  `purchased_item` varchar(200) DEFAULT NULL,
  `quantity` varchar(200) DEFAULT NULL,
  `debit` double DEFAULT NULL,
  `credit` double DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `remarks` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `purchase_history`
--

INSERT INTO `purchase_history` (`purchased_id`, `date`, `party_name`, `invoice_no`, `payment_method`, `purchased_item`, `quantity`, `debit`, `credit`, `amount`, `remarks`) VALUES
(1, 'dsf', 'sdf', 'sdf', 'Cheque', 'sdf', 'sdf', -90, 435, 345, ''),
(2, '234', '23423', '234', 'Cheque', '234', '234', 0, 234, 234, '324'),
(3, 'sdf', 'sdf', 'sdf', 'Cheque', 'sdf', 'sdf', 234, 0, 234, '');

-- --------------------------------------------------------

--
-- Table structure for table `sales`
--

CREATE TABLE `sales` (
  `sale_id` int(11) NOT NULL,
  `date` varchar(200) DEFAULT NULL,
  `party_name` varchar(200) DEFAULT NULL,
  `invoice_no` varchar(200) DEFAULT NULL,
  `payment_method` varchar(200) DEFAULT NULL,
  `sale_item` varchar(200) DEFAULT NULL,
  `quantity` varchar(200) DEFAULT NULL,
  `debit` double DEFAULT NULL,
  `credit` double DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `remarks` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sales`
--

INSERT INTO `sales` (`sale_id`, `date`, `party_name`, `invoice_no`, `payment_method`, `sale_item`, `quantity`, `debit`, `credit`, `amount`, `remarks`) VALUES
(1, '2020/01/09', 'James', '123232', 'Cash', 'Ink', '56 box', 40000, 10000, 50000, 'james le paisa deko');

-- --------------------------------------------------------

--
-- Table structure for table `sales_history`
--

CREATE TABLE `sales_history` (
  `sale_id` int(11) NOT NULL,
  `date` varchar(200) DEFAULT NULL,
  `party_name` varchar(200) DEFAULT NULL,
  `invoice_no` varchar(200) DEFAULT NULL,
  `payment_method` varchar(200) DEFAULT NULL,
  `sale_item` varchar(200) DEFAULT NULL,
  `quantity` varchar(200) DEFAULT NULL,
  `debit` double DEFAULT NULL,
  `credit` double DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `remarks` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sales_history`
--

INSERT INTO `sales_history` (`sale_id`, `date`, `party_name`, `invoice_no`, `payment_method`, `sale_item`, `quantity`, `debit`, `credit`, `amount`, `remarks`) VALUES
(1, '2020/01/09', 'James', '123232', 'Cash', 'Ink', '56 box', 20000, 30000, 50000, 'james le paisa deko'),
(2, '2020/01/09', 'James', '123232', 'Cash', 'Ink', '56 box', 40000, 10000, 50000, 'james le paisa deko');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `purchase`
--
ALTER TABLE `purchase`
  ADD PRIMARY KEY (`purchased_id`);

--
-- Indexes for table `purchase_history`
--
ALTER TABLE `purchase_history`
  ADD PRIMARY KEY (`purchased_id`);

--
-- Indexes for table `sales`
--
ALTER TABLE `sales`
  ADD PRIMARY KEY (`sale_id`);

--
-- Indexes for table `sales_history`
--
ALTER TABLE `sales_history`
  ADD PRIMARY KEY (`sale_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `purchase`
--
ALTER TABLE `purchase`
  MODIFY `purchased_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `purchase_history`
--
ALTER TABLE `purchase_history`
  MODIFY `purchased_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `sales`
--
ALTER TABLE `sales`
  MODIFY `sale_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `sales_history`
--
ALTER TABLE `sales_history`
  MODIFY `sale_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
