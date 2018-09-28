-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Sep 28, 2018 at 03:33 PM
-- Server version: 5.7.21
-- PHP Version: 7.0.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_pdam`
--

-- --------------------------------------------------------

--
-- Table structure for table `t_bidang`
--

DROP TABLE IF EXISTS `t_bidang`;
CREATE TABLE IF NOT EXISTS `t_bidang` (
  `id_bidang` varchar(8) NOT NULL,
  `nm_bidang` varchar(20) NOT NULL,
  PRIMARY KEY (`id_bidang`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `t_karyawan`
--

DROP TABLE IF EXISTS `t_karyawan`;
CREATE TABLE IF NOT EXISTS `t_karyawan` (
  `id_karyawan` varchar(8) NOT NULL,
  `nm_karyawan` varchar(20) NOT NULL,
  `id_bidang` varchar(8) NOT NULL,
  `jabatan` varchar(25) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `hak_akses` varchar(15) NOT NULL,
  `status` varchar(15) NOT NULL,
  PRIMARY KEY (`id_karyawan`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_karyawan`
--

INSERT INTO `t_karyawan` (`id_karyawan`, `nm_karyawan`, `id_bidang`, `jabatan`, `username`, `password`, `hak_akses`, `status`) VALUES
('P0001', 'Hilaludin Hasan', 'B0001', 'ADMIN', 'hilal', '123456', 'Administrator', 'Karyawan');

-- --------------------------------------------------------

--
-- Table structure for table `t_surat_keluar`
--

DROP TABLE IF EXISTS `t_surat_keluar`;
CREATE TABLE IF NOT EXISTS `t_surat_keluar` (
  `no_surat_keluar` varchar(25) NOT NULL,
  `tgl_surat_keluar` date NOT NULL,
  `perihal` varchar(30) NOT NULL,
  `isi_ringkas` varchar(80) NOT NULL,
  `kepada` varchar(20) NOT NULL,
  `id_karyawan` varchar(8) NOT NULL,
  `nm_karyawan` varchar(20) NOT NULL,
  `lampiran` varchar(15) NOT NULL,
  `file_surat` longblob NOT NULL,
  PRIMARY KEY (`no_surat_keluar`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `t_surat_masuk`
--

DROP TABLE IF EXISTS `t_surat_masuk`;
CREATE TABLE IF NOT EXISTS `t_surat_masuk` (
  `no_surat_masuk` varchar(25) NOT NULL,
  `tgl_surat_masuk` date NOT NULL,
  `perihal` varchar(30) NOT NULL,
  `isi_ringkas` varchar(70) NOT NULL,
  `dari` varchar(20) NOT NULL,
  `lampiran` varchar(20) NOT NULL,
  `id_karyawan` varchar(8) NOT NULL,
  `nm_karyawan` varchar(20) NOT NULL,
  `tgl_diteruskan` date NOT NULL,
  `id_bidang` varchar(8) NOT NULL,
  `nm_bidang` varchar(20) NOT NULL,
  `nm_penerima` varchar(20) NOT NULL,
  `catatan` varchar(50) NOT NULL,
  `intruksi_disposisi` varchar(60) NOT NULL,
  `file_surat` longblob NOT NULL,
  `status` varchar(8) NOT NULL,
  PRIMARY KEY (`no_surat_masuk`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
