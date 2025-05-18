-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 18, 2025 at 02:06 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pet_adoption`
--

-- --------------------------------------------------------

--
-- Table structure for table `accounts`
--

CREATE TABLE `accounts` (
  `a_id` int(20) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `type` varchar(20) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(50) NOT NULL,
  `contact` varchar(50) NOT NULL,
  `status` varchar(20) NOT NULL,
  `u_image` varchar(50) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `accounts`
--

INSERT INTO `accounts` (`a_id`, `firstname`, `lastname`, `email`, `type`, `username`, `password`, `contact`, `status`, `u_image`) VALUES
(59, 'gwapo', 'mark', 'mark@gmail.com', 'User', 'gwapo', 'aWL9IMyT8Wk8iVyyq16K5bkCwygwNOdA1mZFGILDrwA=', '09890809890', 'Active', 'src/images/images (1).jpg'),
(61, 'Mark Kiven Gie ', 'Paquit', 'marks@gmail.com', 'Admin', 'marks', 'aWL9IMyT8Wk8iVyyq16K5bkCwygwNOdA1mZFGILDrwA=', '09692969501', 'Active', 'src/images/images.jpg'),
(67, 'sdadas', 'dasdas', 'maark@gmail.com', 'User', 'dasdas', '', 'dasdasdasd', 'Pending', ''),
(68, 'sdasdasdasd', 'dasda', 'ad@gmail.com', 'User', 'asdas', 'dasdasdasdasdas', 'asdasd', 'Active', ''),
(69, 'kiven', 'kiven', 'kiven@gmail.com', 'User', 'kvien', 'paquit204', '09692969501', 'Active', 'src/images/Screenshot (72).png');

-- --------------------------------------------------------

--
-- Table structure for table `adoption`
--

CREATE TABLE `adoption` (
  `adoption_id` int(20) NOT NULL,
  `a_id` int(20) NOT NULL,
  `p_id` int(20) NOT NULL,
  `date` varchar(50) NOT NULL,
  `a_status` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `adoption`
--

INSERT INTO `adoption` (`adoption_id`, `a_id`, `p_id`, `date`, `a_status`) VALUES
(2, 59, 1004, '05/18/2025', 'Pending');

-- --------------------------------------------------------

--
-- Table structure for table `pet`
--

CREATE TABLE `pet` (
  `p_id` int(20) NOT NULL,
  `p_type` varchar(50) NOT NULL,
  `p_price` varchar(150) NOT NULL,
  `p_status` varchar(50) NOT NULL,
  `p_image` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pet`
--

INSERT INTO `pet` (`p_id`, `p_type`, `p_price`, `p_status`, `p_image`) VALUES
(1001, 'Chihuahua', '50,000.00', 'Available', ''),
(1003, 'German Dog', '200', 'Available 	', ''),
(1004, 'Beagle', '50000', 'Out of Stocks', ''),
(1005, 'Labrador Retriever', 'sdada', 'Out of Stocks', ''),
(1006, 'Poodle', '5000', 'Available 	', ''),
(1007, 'Beagle', '5000', 'Available 	', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `accounts`
--
ALTER TABLE `accounts`
  ADD PRIMARY KEY (`a_id`);

--
-- Indexes for table `adoption`
--
ALTER TABLE `adoption`
  ADD PRIMARY KEY (`adoption_id`),
  ADD KEY `aid` (`a_id`),
  ADD KEY `pid` (`p_id`);

--
-- Indexes for table `pet`
--
ALTER TABLE `pet`
  ADD PRIMARY KEY (`p_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `accounts`
--
ALTER TABLE `accounts`
  MODIFY `a_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=70;

--
-- AUTO_INCREMENT for table `adoption`
--
ALTER TABLE `adoption`
  MODIFY `adoption_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `pet`
--
ALTER TABLE `pet`
  MODIFY `p_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1008;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `adoption`
--
ALTER TABLE `adoption`
  ADD CONSTRAINT `aid` FOREIGN KEY (`a_id`) REFERENCES `accounts` (`a_id`),
  ADD CONSTRAINT `pid` FOREIGN KEY (`p_id`) REFERENCES `pet` (`p_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
