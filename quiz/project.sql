-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 20, 2020 at 03:37 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`admin_id`, `email`, `password`) VALUES
(1, 'naresh2dev@gmail.com', 'Naresh'),
(2, 'nishanthbhushan05@gmail.com', 'Nishanth');

-- --------------------------------------------------------

--
-- Table structure for table `answer`
--

CREATE TABLE `answer` (
  `qid` text NOT NULL,
  `ansid` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `answer`
--

INSERT INTO `answer` (`qid`, `ansid`) VALUES
('558922117fcef', '5589221195248'),
('55892211e44d5', '55892211f1fa7'),
('558922894c453', '558922895ea0a'),
('558922899ccaa', '55892289aa7cf'),
('558923538f48d', '558923539a46c'),
('55892353f05c4', '55892354051be'),
('558973f4389ac', '558973f462e61'),
('558973f4c46f2', '558973f4d4abe'),
('558973f51600d', '558973f526fc5'),
('558973f55d269', '558973f57af07'),
('558973f5abb1a', '558973f5e764a'),
('5589751a63091', '5589751a81bf4'),
('5589751ad32b8', '5589751adbdbd'),
('5589751b304ef', '5589751b3b04d'),
('5589751b749c9', '5589751b9a98c'),
('5e74b44e52e5b', '5e74b44e99ec8'),
('5e74b44f400dc', '5e74b44f4abc3'),
('5e74c5399a035', '5e74c53a123f9'),
('5e74c53b911f2', '5e74c53bb6b55');

-- --------------------------------------------------------

--
-- Table structure for table `feedback`
--

CREATE TABLE `feedback` (
  `id` text NOT NULL,
  `name` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `subject` varchar(500) NOT NULL,
  `feedback` varchar(500) NOT NULL,
  `date` date NOT NULL,
  `time` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `feedback`
--

INSERT INTO `feedback` (`id`, `name`, `email`, `subject`, `feedback`, `date`, `time`) VALUES
('5e70f638cb292', 'Mohanavel', 'mohan@gmail.com', 'Quiz', 'Good', '2020-03-17', '05:09:28pm'),
('5e70f664e2cc0', 'Nakul R', 'nakul@gmail.com', 'Quiz', 'Very good', '2020-03-17', '05:10:12pm'),
('5e747b0acfcaa', 'Praveen', 'praveen@gmail.com', 'Regarding Quiz', 'Good Design of Website', '2020-03-20', '09:12:59am'),
('5e74c5ea14e33', 'Piyush', 'piyush@gmail.com', 'Regarding Quiz', 'UI Design of Website is excellent and all the functionalities working well.', '2020-03-20', '02:32:26pm');

-- --------------------------------------------------------

--
-- Table structure for table `history`
--

CREATE TABLE `history` (
  `email` varchar(50) NOT NULL,
  `eid` text NOT NULL,
  `score` int(11) NOT NULL,
  `level` int(11) NOT NULL,
  `sahi` int(11) NOT NULL,
  `wrong` int(11) NOT NULL,
  `date` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `history`
--

INSERT INTO `history` (`email`, `eid`, `score`, `level`, `sahi`, `wrong`, `date`) VALUES
('mohan@gmail.com', '558921841f1ec', 4, 2, 2, 0, '2020-03-17 15:55:51'),
('mohan@gmail.com', '5589222f16b93', 4, 2, 2, 0, '2020-03-17 15:56:10'),
('mohan@gmail.com', '558922ec03021', 4, 2, 2, 0, '2020-03-17 15:56:28'),
('praveen@gmail.com', '558921841f1ec', 4, 2, 2, 0, '2020-03-17 15:58:29'),
('praveen@gmail.com', '5589222f16b93', 4, 2, 2, 0, '2020-03-17 15:58:45'),
('praveen@gmail.com', '558922ec03021', 1, 2, 1, 1, '2020-03-17 15:59:02'),
('nakul@gmail.com', '558921841f1ec', 4, 2, 2, 0, '2020-03-17 16:00:21'),
('nakul@gmail.com', '5589222f16b93', 4, 2, 2, 0, '2020-03-17 16:00:44'),
('naresh@gmail.com', '558921841f1ec', 4, 2, 2, 0, '2020-03-20 06:10:14'),
('piyush@gmail.com', '5e74b38c0fa9e', 4, 2, 2, 0, '2020-03-20 13:15:26'),
('piyush@gmail.com', '558921841f1ec', 4, 2, 2, 0, '2020-03-20 13:15:46'),
('piyush@gmail.com', '5589222f16b93', 4, 2, 2, 0, '2020-03-20 13:16:05'),
('naresh@gmail.com', '558922ec03021', 4, 2, 2, 0, '2020-03-20 13:18:29'),
('naresh@gmail.com', '5e74b38c0fa9e', 4, 2, 2, 0, '2020-03-20 13:20:55'),
('naresh@gmail.com', '5589222f16b93', 4, 2, 2, 0, '2020-03-20 13:21:16'),
('nishanth@gmail.com', '5e74b38c0fa9e', 4, 2, 2, 0, '2020-03-20 13:23:35'),
('nishanth@gmail.com', '558922ec03021', 1, 2, 1, 1, '2020-03-20 13:24:02'),
('nishanth@gmail.com', '5589222f16b93', 4, 2, 2, 0, '2020-03-20 13:24:26'),
('nishanth@gmail.com', '558921841f1ec', 4, 2, 2, 0, '2020-03-20 13:24:45'),
('naresh@gmail.com', '5e74c4b206a67', 4, 2, 2, 0, '2020-03-20 13:30:47');

-- --------------------------------------------------------

--
-- Table structure for table `options`
--

CREATE TABLE `options` (
  `qid` varchar(50) NOT NULL,
  `option` varchar(5000) NOT NULL,
  `optionid` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `options`
--

INSERT INTO `options` (`qid`, `option`, `optionid`) VALUES
('558922117fcef', 'echo', '5589221195248'),
('558922117fcef', 'print', '558922119525a'),
('558922117fcef', 'printf', '5589221195265'),
('558922117fcef', 'cout', '5589221195270'),
('55892211e44d5', 'int a', '55892211f1f97'),
('55892211e44d5', '$a', '55892211f1fa7'),
('55892211e44d5', 'long int a', '55892211f1fb4'),
('55892211e44d5', 'int a$', '55892211f1fbd'),
('558922894c453', 'cin>>a;', '558922895ea0a'),
('558922894c453', 'cin<<a;', '558922895ea26'),
('558922894c453', 'cout>>a;', '558922895ea34'),
('558922894c453', 'cout<a;', '558922895ea41'),
('558922899ccaa', 'cout', '55892289aa7cf'),
('558922899ccaa', 'cin', '55892289aa7df'),
('558922899ccaa', 'print', '55892289aa7eb'),
('558922899ccaa', 'printf', '55892289aa7f5'),
('558923538f48d', '255.0.0.0', '558923539a46c'),
('558923538f48d', '255.255.255.0', '558923539a480'),
('558923538f48d', '255.255.0.0', '558923539a48b'),
('558923538f48d', 'none of these', '558923539a495'),
('55892353f05c4', '192.168.1.100', '5589235405192'),
('55892353f05c4', '172.168.16.2', '55892354051a3'),
('55892353f05c4', '10.0.0.0.1', '55892354051b4'),
('55892353f05c4', '11.11.11.11', '55892354051be'),
('558973f4389ac', 'containing root file-system required during bootup', '558973f462e44'),
('558973f4389ac', ' Contains only scripts to be executed during bootup', '558973f462e56'),
('558973f4389ac', ' Contains root-file system and drivers required to be preloaded during bootup', '558973f462e61'),
('558973f4389ac', 'None of the above', '558973f462e6b'),
('558973f4c46f2', 'Kernel', '558973f4d4abe'),
('558973f4c46f2', 'Shell', '558973f4d4acf'),
('558973f4c46f2', 'Commands', '558973f4d4ad9'),
('558973f4c46f2', 'Script', '558973f4d4ae3'),
('558973f51600d', 'Boot Loading', '558973f526f9d'),
('558973f51600d', ' Boot Record', '558973f526fb9'),
('558973f51600d', ' Boot Strapping', '558973f526fc5'),
('558973f51600d', ' Booting', '558973f526fce'),
('558973f55d269', ' Quick boot', '558973f57aef1'),
('558973f55d269', 'Cold boot', '558973f57af07'),
('558973f55d269', ' Hot boot', '558973f57af17'),
('558973f55d269', ' Fast boot', '558973f57af27'),
('558973f5abb1a', 'bash', '558973f5e7623'),
('558973f5abb1a', ' Csh', '558973f5e7636'),
('558973f5abb1a', ' ksh', '558973f5e7640'),
('558973f5abb1a', ' sh', '558973f5e764a'),
('5589751a63091', 'q', '5589751a81bd6'),
('5589751a63091', 'wq', '5589751a81be8'),
('5589751a63091', ' both (a) and (b)', '5589751a81bf4'),
('5589751a63091', ' none of the mentioned', '5589751a81bfd'),
('5589751ad32b8', ' moves screen down one page', '5589751adbdbd'),
('5589751ad32b8', 'moves screen up one page', '5589751adbdce'),
('5589751ad32b8', 'moves screen up one line', '5589751adbdd8'),
('5589751ad32b8', ' moves screen down one line', '5589751adbde2'),
('5589751b304ef', ' yy', '5589751b3b04d'),
('5589751b304ef', 'yw', '5589751b3b05e'),
('5589751b304ef', 'yc', '5589751b3b069'),
('5589751b304ef', ' none of the mentioned', '5589751b3b073'),
('5589751b749c9', 'X', '5589751b9a98c'),
('5589751b749c9', 'x', '5589751b9a9a5'),
('5589751b749c9', 'D', '5589751b9a9b7'),
('5589751b749c9', 'd', '5589751b9a9c9'),
('5589751bd02ec', 'autoindentation is not possible in vi editor', '5589751bdadaa'),
('5e74b44e52e5b', '* (Asterisk)', '5e74b44e99ebc'),
('5e74b44e52e5b', '- (Hyphen)', '5e74b44e99ec5'),
('5e74b44e52e5b', '| (Pipeline)', '5e74b44e99ec6'),
('5e74b44e52e5b', '_ (Underscore)', '5e74b44e99ec8'),
('5e74b44f400dc', 'float', '5e74b44f4abbe'),
('5e74b44f400dc', 'double', '5e74b44f4abc3'),
('5e74b44f400dc', 'int', '5e74b44f4abc4'),
('5e74b44f400dc', 'long double', '5e74b44f4abc5'),
('5e74c5399a035', 'method', '5e74c53a123f5'),
('5e74c5399a035', 'native', '5e74c53a123f9'),
('5e74c5399a035', 'subclasses', '5e74c53a123fa'),
('5e74c5399a035', 'reference', '5e74c53a123fb'),
('5e74c53b911f2', 'interface', '5e74c53bb6b55'),
('5e74c53b911f2', 'string', '5e74c53bb6b63'),
('5e74c53b911f2', 'Float', '5e74c53bb6b68'),
('5e74c53b911f2', 'unsigned', '5e74c53bb6b6d');

-- --------------------------------------------------------

--
-- Table structure for table `questions`
--

CREATE TABLE `questions` (
  `eid` text NOT NULL,
  `qid` text NOT NULL,
  `qns` text NOT NULL,
  `choice` int(10) NOT NULL,
  `sn` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `questions`
--

INSERT INTO `questions` (`eid`, `qid`, `qns`, `choice`, `sn`) VALUES
('558921841f1ec', '558922117fcef', 'what is command for print in php??', 4, 1),
('558921841f1ec', '55892211e44d5', 'which is a variable of php??', 4, 2),
('5589222f16b93', '558922894c453', 'what is correct statement in c++??', 4, 1),
('5589222f16b93', '558922899ccaa', 'which command is use for print the output in c++?', 4, 2),
('558922ec03021', '558923538f48d', 'what is correct mask for A class IP???', 4, 1),
('558922ec03021', '55892353f05c4', 'which is not a private IP??', 4, 2),
('55897338a6659', '558973f4389ac', 'On Linux, initrd is a file', 4, 1),
('55897338a6659', '558973f4c46f2', 'Which is loaded into memory when system is booted?', 4, 2),
('55897338a6659', '558973f51600d', ' The process of starting up a computer is known as', 4, 3),
('55897338a6659', '558973f55d269', ' Bootstrapping is also known as', 4, 4),
('55897338a6659', '558973f5abb1a', 'The shell used for Single user mode shell is:', 4, 5),
('5589741f9ed52', '5589751a63091', ' Which command is used to close the vi editor?', 4, 1),
('5589741f9ed52', '5589751ad32b8', ' In vi editor, the key combination CTRL+f', 4, 2),
('5589741f9ed52', '5589751b304ef', ' Which vi editor command copies the current line of the file?', 4, 3),
('5589741f9ed52', '5589751b749c9', ' Which command is used to delete the character before the cursor location in vi editor?', 4, 4),
('5589741f9ed52', '5589751bd02ec', ' Which one of the following statement is true?', 4, 5),
('5e74b38c0fa9e', '5e74b44e52e5b', 'Which of the following special symbol allowed in a variable name ?', 4, 1),
('5e74b38c0fa9e', '5e74b44f400dc', '	\r\nBy default a real number is treated as a ?', 4, 2),
('5e74c4b206a67', '5e74c5399a035', 'Which is a reserved word in Java Programming Language?', 4, 1),
('5e74c4b206a67', '5e74c53b911f2', 'Which is a valid keyword in Java?', 4, 2);

-- --------------------------------------------------------

--
-- Table structure for table `quiz`
--

CREATE TABLE `quiz` (
  `eid` text NOT NULL,
  `title` varchar(100) NOT NULL,
  `sahi` int(11) NOT NULL,
  `wrong` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  `time` bigint(20) NOT NULL,
  `intro` text NOT NULL,
  `tag` varchar(100) NOT NULL,
  `date` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `quiz`
--

INSERT INTO `quiz` (`eid`, `title`, `sahi`, `wrong`, `total`, `time`, `intro`, `tag`, `date`) VALUES
('558921841f1ec', 'Php Coding', 2, 1, 2, 5, '', 'PHP', '2015-06-23 09:06:12'),
('5589222f16b93', 'C++ Coding', 2, 1, 2, 5, '', 'c++', '2015-06-23 09:09:03'),
('558922ec03021', 'Networking', 2, 1, 2, 5, '', 'networking', '2015-06-23 09:12:12'),
('55897338a6659', 'Linux:startup', 2, 1, 5, 10, '', 'linux', '2015-06-23 14:54:48'),
('5589741f9ed52', 'Linux :vi Editor', 2, 1, 5, 10, '', 'linux', '2015-06-23 14:58:39'),
('5e74b38c0fa9e', 'C Programming', 2, 1, 2, 5, '', 'c', '2020-03-20 12:14:04'),
('5e74c4b206a67', 'Java Programming', 2, 1, 2, 5, '', 'java', '2020-03-20 13:27:14');

-- --------------------------------------------------------

--
-- Table structure for table `rank`
--

CREATE TABLE `rank` (
  `email` varchar(50) NOT NULL,
  `score` int(11) NOT NULL,
  `time` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `rank`
--

INSERT INTO `rank` (`email`, `score`, `time`) VALUES
('naresh@gmail.com', 20, '2020-03-20 13:30:47'),
('mohan@gmail.com', 12, '2020-03-17 15:56:28'),
('praveen@gmail.com', 9, '2020-03-17 15:59:02'),
('nakul@gmail.com', 8, '2020-03-17 16:00:44'),
('piyush@gmail.com', 12, '2020-03-20 13:16:05'),
('nishanth@gmail.com', 13, '2020-03-20 13:24:45');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `name` varchar(50) NOT NULL,
  `gender` varchar(5) NOT NULL,
  `college` varchar(100) NOT NULL,
  `email` varchar(50) NOT NULL,
  `mob` bigint(20) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`name`, `gender`, `college`, `email`, `mob`, `password`) VALUES
('Mohanavel', 'M', 'Panimalar Engineering College', 'mohan@gmail.com', 7896542130, 'e9206237def4b4ef46fd933ed0f5a08f'),
('Nakul R', 'M', 'Panimalar Engineering College', 'nakul@gmail.com', 8056951154, 'd72829da10121ba261b616b986c13af1'),
('Naresh D', 'M', 'Panimalar Engineering College', 'naresh@gmail.com', 7010746740, '7cb4ffbb2635356600af00166decc350'),
('Nishanth', 'M', 'Panimalar Engineering College', 'nishanth@gmail.com', 7894561230, '59a7dd20361895273c97cffa9d91438e'),
('Piyush', 'M', 'Panimalar Engineering College', 'piyush@gmail.com', 9561238790, '86f500cd7b7d38e5d4ae6cde3920f589'),
('Praveen', 'M', 'Panimalar Engineering College', 'praveen@gmail.com', 9654123870, '45becd6c5dd83e2179cd81df8640cd5a');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`admin_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `admin_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
