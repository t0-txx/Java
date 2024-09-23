-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Sep 23, 2024 at 06:22 AM
-- Server version: 8.0.17
-- PHP Version: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `oop2567`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `customerCode` int(6) UNSIGNED ZEROFILL NOT NULL,
  `customerName` varchar(150) NOT NULL,
  `address` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customerCode`, `customerName`, `address`) VALUES
(000001, 'สมใจ', 'เชียงราย'),
(000002, 'สมศรี', 'เชียงราย'),
(000003, 'สมดี', 'เชียงราย'),
(000004, 'ณัฏฐธิดา', 'เชียงราย'),
(000005, 'ประภัสสร', 'เชียงราย'),
(000006, 'วรกานต์', 'เชียงราย'),
(000007, 'เลอลักษณ์', 'เชียงราย'),
(000008, 'ชนิภา', 'เชียงราย');

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `departmentCode` char(2) NOT NULL,
  `departmentName` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`departmentCode`, `departmentName`) VALUES
('01', 'การตลาด'),
('02', 'การขาย'),
('03', 'บัญชี'),
('05', 'บริการลูกค้า'),
('06', 'IT');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `employeeCode` char(4) NOT NULL,
  `employeeName` varchar(150) NOT NULL,
  `departmentCode` char(2) NOT NULL,
  `sex` char(1) NOT NULL,
  `salary` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`employeeCode`, `employeeName`, `departmentCode`, `sex`, `salary`) VALUES
('01', 'พันธ์พงษ์', '01', 'M', 15000),
('02', 'ปัญจพล', '02', 'F', 15000),
('03', 'อารักษ์', '02', 'U', 15000),
('04', 'ทวีเดช', '03', 'M', 15000),
('05', 'สุทธิพงษ์', '05', 'U', 15000),
('06', 'ณรงค์', '02', 'F', 15000),
('07', 'มงคล', '03', 'U', 15000),
('08', 'อารักษ์', '02', 'F', 15000),
('09', 'ประชา', '04', 'U', 15000);

-- --------------------------------------------------------

--
-- Table structure for table `invoice`
--

CREATE TABLE `invoice` (
  `invoiceNo` char(8) NOT NULL,
  `invoiceDate` date NOT NULL,
  `customerCode` char(6) NOT NULL,
  `employeeCode` char(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `invoicedetail`
--

CREATE TABLE `invoicedetail` (
  `invoiceNo` char(8) NOT NULL,
  `itemCode` char(4) NOT NULL,
  `price` int(11) NOT NULL,
  `qty` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

CREATE TABLE `item` (
  `itemCode` char(4) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `itemName` varchar(200) NOT NULL,
  `typeCode` char(2) NOT NULL,
  `price` int(11) NOT NULL,
  `qty` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `item`
--

INSERT INTO `item` (`itemCode`, `itemName`, `typeCode`, `price`, `qty`) VALUES
('1', 'ขนมชั้น', '1', 50, 9),
('2', 'ขนมปัง', '3', 10, 199),
('3', 'ขนมต้ม', '4', 20, 23),
('4', 'ขนมถ้วย', '1', 21, 33),
('5', 'ขนมเบื้อง ', '2', 41, 221),
('6', 'ขนมสอดไส้', '1', 22, 111),
('7', 'ขนมบ้าบิ่น', '4', 222, 11);

-- --------------------------------------------------------

--
-- Table structure for table `itemtype`
--

CREATE TABLE `itemtype` (
  `typeCode` char(4) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `typeName` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `itemtype`
--

INSERT INTO `itemtype` (`typeCode`, `typeName`) VALUES
('1', 'ขนมหวาน'),
('2', 'ขนมกรุบกรอบ'),
('3', 'ขนมอบ'),
('4', 'ขนมไทย'),
('5', 'ขนมทอด');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`customerCode`);

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`departmentCode`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`employeeCode`);

--
-- Indexes for table `invoice`
--
ALTER TABLE `invoice`
  ADD PRIMARY KEY (`invoiceNo`);

--
-- Indexes for table `invoicedetail`
--
ALTER TABLE `invoicedetail`
  ADD PRIMARY KEY (`invoiceNo`,`itemCode`);

--
-- Indexes for table `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`itemCode`);

--
-- Indexes for table `itemtype`
--
ALTER TABLE `itemtype`
  ADD PRIMARY KEY (`typeCode`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
