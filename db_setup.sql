-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 02, 2022 at 12:21 PM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.1.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_hrs`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` varchar(36) NOT NULL,
  `id_user` varchar(36) NOT NULL,
  `nama` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `id_user`, `nama`) VALUES
('1c1a2f0a-cad9-4977-9a54-30dc54006c4e', '1c1a2f0a-cad9-4977-9a54-30dc54006c4e', 'Alice'),
('54b79a81-6b92-4bb5-bdc7-b0b9f9897113', '54b79a81-6b92-4bb5-bdc7-b0b9f9897113', 'Anderson'),
('d84bbba6-c945-4c91-b700-9593f5fffac2', 'd84bbba6-c945-4c91-b700-9593f5fffac2', 'Bob');

-- --------------------------------------------------------

--
-- Table structure for table `detil_pemesanan`
--

CREATE TABLE `detil_pemesanan` (
  `id` varchar(36) NOT NULL,
  `id_customer` varchar(36) NOT NULL,
  `id_hotel` varchar(36) NOT NULL,
  `id_kamar` varchar(36) NOT NULL,
  `banyak_kamar` int(11) NOT NULL,
  `banyak_malam` int(11) NOT NULL,
  `harga_total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `detil_pemesanan`
--

INSERT INTO `detil_pemesanan` (`id`, `id_customer`, `id_hotel`, `id_kamar`, `banyak_kamar`, `banyak_malam`, `harga_total`) VALUES
('1ba26750-d12f-493f-895b-25bf352fa815', '1c1a2f0a-cad9-4977-9a54-30dc54006c4e', 'd4bef44a-6297-4632-8f4d-6a893178f0dc', '38431be5-07bc-47c2-8667-b6beef856da9', 1, 3, 600000),
('29876ee3-a077-43fa-89e0-5c89d3e1331f', '1c1a2f0a-cad9-4977-9a54-30dc54006c4e', '402e953d-57fd-42a8-97f9-4e248204c681', 'ceac2c38-d9c0-4aaf-b65c-7288d8e2a9fd', 2, 1, 300000),
('2f6b6fdb-86d6-423e-854a-42705f7d3620', '1c1a2f0a-cad9-4977-9a54-30dc54006c4e', 'd4bef44a-6297-4632-8f4d-6a893178f0dc', 'f94ed5cb-1f52-4d21-9d74-9792d8cdb510', 2, 2, 1000000),
('63017457-b0b1-407d-a8d6-ddf9b9b64816', '54b79a81-6b92-4bb5-bdc7-b0b9f9897113', 'd4bef44a-6297-4632-8f4d-6a893178f0dc', '7ce0d0ca-10e6-45af-8922-835adc7a50ae', 1, 2, 800000),
('7e166a5d-4eb5-471c-8f3f-a4420d54b7e6', '54b79a81-6b92-4bb5-bdc7-b0b9f9897113', 'fd627708-cf58-4081-92c8-d880939843ea', '586e6fa4-aee1-4418-9b98-2cecec261b4a', 1, 1, 150000),
('99451a95-85f2-4d65-9322-35cef5752b96', 'd84bbba6-c945-4c91-b700-9593f5fffac2', '989f1b56-2ed0-4bca-8166-46d540b36d4e', 'fb316a77-3ecc-4972-adbc-c3456a87c60d', 1, 1, 130000),
('c2f7d05f-e3ce-47a2-9a96-09f9b6d7af2e', 'd84bbba6-c945-4c91-b700-9593f5fffac2', 'cc414dda-16b2-4259-9a07-57c5b4a0eb37', '2778400f-0594-4145-ac03-10ec5af123bf', 1, 1, 50000),
('d62efd20-9f6d-44d5-9344-acae74e63927', 'd84bbba6-c945-4c91-b700-9593f5fffac2', '402e953d-57fd-42a8-97f9-4e248204c681', 'ceac2c38-d9c0-4aaf-b65c-7288d8e2a9fd', 1, 1, 150000),
('d8832097-c8e1-4ac7-b9f2-e03b6c65dac1', 'd84bbba6-c945-4c91-b700-9593f5fffac2', 'd4bef44a-6297-4632-8f4d-6a893178f0dc', 'f94ed5cb-1f52-4d21-9d74-9792d8cdb510', 1, 1, 250000);

-- --------------------------------------------------------

--
-- Table structure for table `hotel`
--

CREATE TABLE `hotel` (
  `id` varchar(36) NOT NULL,
  `id_user` varchar(36) NOT NULL,
  `nama_hotel` varchar(30) NOT NULL,
  `deskripsi` varchar(500) NOT NULL,
  `lokasi` varchar(50) NOT NULL,
  `banyak_bintang` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hotel`
--

INSERT INTO `hotel` (`id`, `id_user`, `nama_hotel`, `deskripsi`, `lokasi`, `banyak_bintang`) VALUES
('402e953d-57fd-42a8-97f9-4e248204c681', '402e953d-57fd-42a8-97f9-4e248204c681', 'Amira Hotel', 'Amira Hotel siapa melayani Anda.', 'Bandung', 4),
('989f1b56-2ed0-4bca-8166-46d540b36d4e', '989f1b56-2ed0-4bca-8166-46d540b36d4e', 'Noor Hotel', 'Noor Hotel siap melayani Anda.', 'Medan', 3),
('cc414dda-16b2-4259-9a07-57c5b4a0eb37', 'cc414dda-16b2-4259-9a07-57c5b4a0eb37', 'Hotel Riau', 'Hotel Riau siap melayani Anda.', 'Bandung', 2),
('d4bef44a-6297-4632-8f4d-6a893178f0dc', 'd4bef44a-6297-4632-8f4d-6a893178f0dc', 'Grand Hotel', 'Grand Hotel adalah hotel dengan kualitas layanan terbaik di Jakarta', 'Jakarta', 5),
('fd627708-cf58-4081-92c8-d880939843ea', 'fd627708-cf58-4081-92c8-d880939843ea', 'Hotel Istana', 'Hotel Istana siap melayani Anda.', 'Jakarta', 3);

-- --------------------------------------------------------

--
-- Table structure for table `kamar`
--

CREATE TABLE `kamar` (
  `id` varchar(36) NOT NULL,
  `tipe` varchar(30) NOT NULL,
  `harga_per_malam` int(11) NOT NULL,
  `batas_orang` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `kamar`
--

INSERT INTO `kamar` (`id`, `tipe`, `harga_per_malam`, `batas_orang`) VALUES
('23884d9f-d08f-456c-9c5f-d17ecdba9741', 'Standard', 130000, 2),
('2778400f-0594-4145-ac03-10ec5af123bf', 'Standard', 50000, 2),
('38431be5-07bc-47c2-8667-b6beef856da9', 'Standard', 200000, 2),
('586e6fa4-aee1-4418-9b98-2cecec261b4a', 'Deluxe', 150000, 2),
('76105e63-2e39-4554-b46f-58142236a557', 'Deluxe', 100000, 2),
('7ce0d0ca-10e6-45af-8922-835adc7a50ae', 'Gold', 400000, 3),
('a2d97b4d-ce58-4775-8a62-f1006fb7f3b9', 'Deluxe', 150000, 2),
('ceac2c38-d9c0-4aaf-b65c-7288d8e2a9fd', 'Standard', 150000, 2),
('f94ed5cb-1f52-4d21-9d74-9792d8cdb510', 'Deluxe', 250000, 3),
('fb316a77-3ecc-4972-adbc-c3456a87c60d', 'Standard', 130000, 2),
('ff16732c-0513-4633-92db-56f40dc38ac0', 'Deluxe', 180000, 2);

-- --------------------------------------------------------

--
-- Table structure for table `pilihan_menu`
--

CREATE TABLE `pilihan_menu` (
  `id` varchar(36) NOT NULL,
  `id_hotel` varchar(36) NOT NULL,
  `id_kamar` varchar(36) NOT NULL,
  `banyak_kamar` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pilihan_menu`
--

INSERT INTO `pilihan_menu` (`id`, `id_hotel`, `id_kamar`, `banyak_kamar`) VALUES
('0976ace0-8c38-465e-b5ee-a4deaa783c04', '402e953d-57fd-42a8-97f9-4e248204c681', 'ceac2c38-d9c0-4aaf-b65c-7288d8e2a9fd', 30),
('20f0a271-4f73-4f22-94c0-50a63790492a', 'cc414dda-16b2-4259-9a07-57c5b4a0eb37', '76105e63-2e39-4554-b46f-58142236a557', 5),
('26b45f72-0cd3-484c-996e-237b1e86d461', 'cc414dda-16b2-4259-9a07-57c5b4a0eb37', '2778400f-0594-4145-ac03-10ec5af123bf', 10),
('4b477cdd-b08d-43d8-861f-9286de1ccb68', 'fd627708-cf58-4081-92c8-d880939843ea', '23884d9f-d08f-456c-9c5f-d17ecdba9741', 30),
('677e1817-9024-413d-90dc-02d2365dff76', 'd4bef44a-6297-4632-8f4d-6a893178f0dc', 'f94ed5cb-1f52-4d21-9d74-9792d8cdb510', 40),
('79e791bc-ec4f-4494-a8db-1604294bc245', 'd4bef44a-6297-4632-8f4d-6a893178f0dc', '38431be5-07bc-47c2-8667-b6beef856da9', 50),
('79f71f97-2fa2-4afb-a8a3-19c7e34d59a7', '402e953d-57fd-42a8-97f9-4e248204c681', 'ff16732c-0513-4633-92db-56f40dc38ac0', 20),
('ae4cf612-4c3e-414b-b5b2-f6e83c280644', '989f1b56-2ed0-4bca-8166-46d540b36d4e', 'a2d97b4d-ce58-4775-8a62-f1006fb7f3b9', 20),
('bd7a2a3d-0551-41a0-bf92-2f81aa679a62', 'fd627708-cf58-4081-92c8-d880939843ea', '586e6fa4-aee1-4418-9b98-2cecec261b4a', 20),
('be1d9ca0-1ba5-42ae-a6d6-92621c3cfb21', 'd4bef44a-6297-4632-8f4d-6a893178f0dc', '7ce0d0ca-10e6-45af-8922-835adc7a50ae', 30),
('c29b4d4f-1350-408f-a81b-0d5d4367ac14', '989f1b56-2ed0-4bca-8166-46d540b36d4e', 'fb316a77-3ecc-4972-adbc-c3456a87c60d', 30);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` varchar(36) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `role` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `password`, `role`) VALUES
('1c1a2f0a-cad9-4977-9a54-30dc54006c4e', 'aliceee', 'alice123', 'customer'),
('402e953d-57fd-42a8-97f9-4e248204c681', 'hotel2', 'password123', 'hotel'),
('54b79a81-6b92-4bb5-bdc7-b0b9f9897113', 'sonander', 'and3rs0n', 'customer'),
('989f1b56-2ed0-4bca-8166-46d540b36d4e', 'hotel4', 'password123', 'hotel'),
('cc414dda-16b2-4259-9a07-57c5b4a0eb37', 'hotel3', 'password123', 'hotel'),
('d4bef44a-6297-4632-8f4d-6a893178f0dc', 'hotel1', 'password123', 'hotel'),
('d84bbba6-c945-4c91-b700-9593f5fffac2', 'bobbb', 'bob123', 'customer'),
('fd627708-cf58-4081-92c8-d880939843ea', 'hotel5', 'password123', 'hotel');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`),
  ADD KEY `CUSTOMER_USER_FK` (`id_user`);

--
-- Indexes for table `detil_pemesanan`
--
ALTER TABLE `detil_pemesanan`
  ADD PRIMARY KEY (`id`),
  ADD KEY `DP_CUSTOMER_FK` (`id_customer`),
  ADD KEY `DP_HOTEL_FK` (`id_hotel`),
  ADD KEY `DP_KAMAR_FK` (`id_kamar`);

--
-- Indexes for table `hotel`
--
ALTER TABLE `hotel`
  ADD PRIMARY KEY (`id`),
  ADD KEY `HOTEL_USER_FK` (`id_user`);

--
-- Indexes for table `kamar`
--
ALTER TABLE `kamar`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pilihan_menu`
--
ALTER TABLE `pilihan_menu`
  ADD PRIMARY KEY (`id`),
  ADD KEY `PM_HOTEL_FK` (`id_hotel`),
  ADD KEY `PM_KAMAR_FK` (`id_kamar`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `customer`
--
ALTER TABLE `customer`
  ADD CONSTRAINT `CUSTOMER_USER_FK` FOREIGN KEY (`id_user`) REFERENCES `user` (`id`);

--
-- Constraints for table `detil_pemesanan`
--
ALTER TABLE `detil_pemesanan`
  ADD CONSTRAINT `DP_CUSTOMER_FK` FOREIGN KEY (`id_customer`) REFERENCES `customer` (`id`),
  ADD CONSTRAINT `DP_HOTEL_FK` FOREIGN KEY (`id_hotel`) REFERENCES `hotel` (`id`),
  ADD CONSTRAINT `DP_KAMAR_FK` FOREIGN KEY (`id_kamar`) REFERENCES `kamar` (`id`);

--
-- Constraints for table `hotel`
--
ALTER TABLE `hotel`
  ADD CONSTRAINT `HOTEL_USER_FK` FOREIGN KEY (`id_user`) REFERENCES `user` (`id`);

--
-- Constraints for table `pilihan_menu`
--
ALTER TABLE `pilihan_menu`
  ADD CONSTRAINT `PM_HOTEL_FK` FOREIGN KEY (`id_hotel`) REFERENCES `hotel` (`id`),
  ADD CONSTRAINT `PM_KAMAR_FK` FOREIGN KEY (`id_kamar`) REFERENCES `kamar` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
