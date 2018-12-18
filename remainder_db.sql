-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 18, 2018 at 03:25 AM
-- Server version: 10.1.32-MariaDB
-- PHP Version: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `remainder_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `rem`
--

CREATE TABLE `rem` (
  `id` int(11) NOT NULL,
  `Reminder` text NOT NULL,
  `Reminder_date` text NOT NULL,
  `Reminder_time` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rem`
--

INSERT INTO `rem` (`id`, `Reminder`, `Reminder_date`, `Reminder_time`) VALUES
(20, 'Interview', '2019-01-04', '10:30'),
(21, 'Football Match', '2019-01-11', '15:30'),
(22, 'College Day', '2019-02-08', '09:30'),
(23, ' Birthday', '2019-03-14', '06:00');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `rem`
--
ALTER TABLE `rem`
  ADD PRIMARY KEY (`id`) KEY_BLOCK_SIZE=100;

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `rem`
--
ALTER TABLE `rem`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
