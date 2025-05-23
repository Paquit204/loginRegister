-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 23, 2025 at 03:13 AM
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
  `a_id` int(11) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `type` varchar(20) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(255) NOT NULL,
  `contact` varchar(50) NOT NULL,
  `status` varchar(10) NOT NULL,
  `u_image` varchar(500) DEFAULT NULL,
  `sq` varchar(150) DEFAULT NULL,
  `ans` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `accounts`
--

INSERT INTO `accounts` (`a_id`, `firstname`, `lastname`, `email`, `type`, `username`, `password`, `contact`, `status`, `u_image`, `sq`, `ans`) VALUES
(83, 'mark', 'markmark', 'mark@gmail.com', 'User', 'marks', 'aWL9IMyT8Wk8iVyyq16K5bkCwygwNOdA1mZFGILDrwA=', '0989089', 'Active', 'src/images/gwapo.png', 'What\'s your favorite food?', 'pizza');

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
(6, 83, 1003, '05/22/2025', 'Approved'),
(7, 83, 1007, '05/22/2025', 'Approved');

-- --------------------------------------------------------

--
-- Table structure for table `logs`
--

CREATE TABLE `logs` (
  `id` int(11) NOT NULL,
  `a_id` int(11) DEFAULT NULL,
  `action` varchar(1000) NOT NULL,
  `date` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `logs`
--

INSERT INTO `logs` (`id`, `a_id`, `action`, `date`) VALUES
(106, NULL, 'Admin deleted user account with ID: 106', '2025-05-22 23:35:01'),
(107, NULL, 'Admin logged in successfully', '2025-05-22 23:36:05'),
(108, NULL, 'Admin Added User account Successfully', '2025-05-22 23:36:34'),
(109, NULL, 'Admin Updated account Successfully', '2025-05-22 23:37:24'),
(110, NULL, 'Admin logged in successfully', '2025-05-22 23:47:22'),
(111, NULL, 'Admin Added pet with ID: ', '2025-05-22 23:47:43'),
(112, NULL, 'Admin Updated a pet with ID: javax.swing.JTextField[,570,260,160x30,disabled,layout=javax.swing.plaf.basic.BasicTextUI$UpdateHandler,alignmentX=0.0,alignmentY=0.0,border=javax.swing.plaf.synth.SynthBorder@329e481f,flags=288,maximumSize=,minimumSize=,preferredSize=,caretColor=,disabledTextColor=DerivedColor(color=142,143,145 parent=nimbusDisabledText offsets=0.0,0.0,0.0,0 pColor=142,143,145,editable=true,margin=javax.swing.plaf.InsetsUIResource[top=0,left=0,bottom=0,right=0],selectedTextColor=DerivedColor(color=255,255,255 parent=nimbusSelectedText offsets=0.0,0.0,0.0,0 pColor=255,255,255,selectionColor=DerivedColor(color=57,105,138 parent=nimbusSelectionBackground offsets=0.0,0.0,0.0,0 pColor=57,105,138,columns=0,columnWidth=0,command=,horizontalAlignment=LEADING]', '2025-05-22 23:50:17'),
(113, NULL, ' User logged in successfully', '2025-05-22 23:53:26'),
(114, NULL, 'User changed their passwordmarks', '2025-05-22 23:54:52'),
(115, NULL, ' User logged in successfully', '2025-05-22 23:55:00'),
(116, NULL, 'Admin logged in successfully', '2025-05-23 00:38:28'),
(117, NULL, 'Adoption request ID 8 declined by Admin.', '2025-05-23 00:38:53'),
(118, NULL, 'Admin logged in successfully', '2025-05-23 01:03:11'),
(119, NULL, ' User logged in successfully', '2025-05-23 01:03:59'),
(120, NULL, ' User logged in successfully', '2025-05-23 01:06:37');

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
(1005, 'Labrador Retriever', '15000', 'Out of Stocks', ''),
(1006, 'Poodle', '5000', 'Available 	', ''),
(1007, 'Beagle', '5000', 'Available 	', ''),
(1010, 'Austillian Dog', '24,000', 'Available 	', '');

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
-- Indexes for table `logs`
--
ALTER TABLE `logs`
  ADD PRIMARY KEY (`id`),
  ADD KEY `function_logs_ibfk_1` (`a_id`);

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
  MODIFY `a_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=110;

--
-- AUTO_INCREMENT for table `adoption`
--
ALTER TABLE `adoption`
  MODIFY `adoption_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `logs`
--
ALTER TABLE `logs`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=121;

--
-- AUTO_INCREMENT for table `pet`
--
ALTER TABLE `pet`
  MODIFY `p_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1011;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `adoption`
--
ALTER TABLE `adoption`
  ADD CONSTRAINT `aid` FOREIGN KEY (`a_id`) REFERENCES `accounts` (`a_id`),
  ADD CONSTRAINT `pid` FOREIGN KEY (`p_id`) REFERENCES `pet` (`p_id`);

--
-- Constraints for table `logs`
--
ALTER TABLE `logs`
  ADD CONSTRAINT `function_logs_ibfk_1` FOREIGN KEY (`a_id`) REFERENCES `accounts` (`a_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
