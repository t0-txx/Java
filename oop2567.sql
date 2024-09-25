-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Sep 25, 2024 at 03:33 AM
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
(000008, 'ชนิภา55555', 'เชียงราย');

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
('0001', 'พันธ์พงษ์', '01', 'M', 15000),
('0002', 'ปัญจพล', '02', 'F', 15000),
('0003', 'อารักษ์', '02', 'U', 15000),
('0004', 'ทวีเดช', '03', 'M', 15000),
('0005', 'สุทธิพงษ์', '05', 'U', 15000),
('0006', 'ณรงค์', '02', 'F', 15000),
('0007', 'มงคล', '03', 'U', 15000),
('0008', 'อารักษ์', '02', 'F', 15000),
('0009', 'ประชา', '04', 'U', 15000);

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

--
-- Dumping data for table `invoice`
--

INSERT INTO `invoice` (`invoiceNo`, `invoiceDate`, `customerCode`, `employeeCode`) VALUES
('00000001', '2024-09-25', '000001', '0002'),
('00000002', '2024-09-24', '000002', '0004'),
('00000003', '2024-09-25', '000002', '0002'),
('00000004', '2024-09-25', '000002', '0004');

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

--
-- Dumping data for table `invoicedetail`
--

INSERT INTO `invoicedetail` (`invoiceNo`, `itemCode`, `price`, `qty`) VALUES
('00000001', '0002', 10, 1),
('00000001', '0003', 20, 2),
('00000002', '0002', 10, 2),
('00000002', '0003', 20, 2),
('00000003', '0002', 10, 2),
('00000004', '0004', 21, 2);

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
('0001', 'ขนมชั้น', '01', 50, 10),
('0002', 'ขนมปัง', '03', 10, 45),
('0003', 'ขนมต้ม', '04', 20, 11),
('0004', 'ขนมถ้วย', '01', 21, 28),
('0005', 'ขนมเบื้อง', '02', 41, 221),
('0006', 'ขนมสอดไส้', '01', 22, 111),
('0007', 'ขนมบ้าบิ่น', '04', 222, 11);

-- --------------------------------------------------------

--
-- Table structure for table `itemtype`
--

CREATE TABLE `itemtype` (
  `typeCode` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `typeName` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `itemtype`
--

INSERT INTO `itemtype` (`typeCode`, `typeName`) VALUES
('01', 'ขนมหวาน'),
('02', 'ขนมกรุบกรอบ'),
('03', 'ขนมอบ'),
('04', 'ขนมไทย'),
('05', 'ขนมทอด');

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
