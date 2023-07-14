-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 10, 2022 at 10:37 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `chat_room`
--

-- --------------------------------------------------------

--
-- Table structure for table `sign_up`
--

CREATE TABLE `sign_up` (
  `id` int(100) NOT NULL,
  `FullName` varchar(255) NOT NULL,
  `InputName` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `PassConfirm` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sign_up`
--

INSERT INTO `sign_up` (`id`, `FullName`, `InputName`, `Password`, `PassConfirm`) VALUES
(1, 'XuanThanh Thi Tran', 'xuanthanh', '123123', '123123'),
(2, 'thanh', 'xuan', '123', '123'),
(3, 'thanh xuan', 'xuan123', '123', '123'),
(4, 'xuân123', 'xuânnn123', '123', '123'),
(12, 'tieuthanh', 'tieuthanh123', '123', '123'),
(16, 'tramy', 'tramy123', '123', '123'),
(17, 'tran thi', 'thanhxuan123', '123', '123'),
(18, '1', '1', '123', '123'),
(19, 'xuan156', 'xaun125', '123', '123'),
(20, 'thãnhuan', 'thanhxuan', '123', '123'),
(21, '2', '2', '123', '123'),
(22, 'thanhxuan', 'thanhxuan1', '123', '123'),
(23, 'Tran Thi My Linh', 'MyLinh', '123123', '123123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `sign_up`
--
ALTER TABLE `sign_up`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `sign_up`
--
ALTER TABLE `sign_up`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
