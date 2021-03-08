-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: quanlynhasachnhanam
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `chitietdonhang`
--

DROP TABLE IF EXISTS `chitietdonhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `chitietdonhang` (
  `MaDonHang` int(11) DEFAULT NULL,
  `MaSanPham` int(11) DEFAULT NULL,
  `SoLuong` int(11) DEFAULT NULL,
  KEY `MaDonHang` (`MaDonHang`),
  KEY `chitietdonhang_ibfk_3` (`MaSanPham`),
  CONSTRAINT `chitietdonhang_ibfk_1` FOREIGN KEY (`MaDonHang`) REFERENCES `donhang` (`madonhang`),
  CONSTRAINT `chitietdonhang_ibfk_2` FOREIGN KEY (`MaSanPham`) REFERENCES `sanphamsach` (`maspsach`),
  CONSTRAINT `chitietdonhang_ibfk_3` FOREIGN KEY (`MaSanPham`) REFERENCES `sanphamdungcu` (`maspdungcu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chitietdonhang`
--

LOCK TABLES `chitietdonhang` WRITE;
/*!40000 ALTER TABLE `chitietdonhang` DISABLE KEYS */;
INSERT INTO `chitietdonhang` VALUES (1,1,1),(2,1,3),(1,2,4),(1,2,5),(1,3,7),(1,3,8),(1,4,7);
/*!40000 ALTER TABLE `chitietdonhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dmdochoi`
--

DROP TABLE IF EXISTS `dmdochoi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `dmdochoi` (
  `MaDMDochoi` int(11) NOT NULL,
  `Nhom` varchar(100) DEFAULT NULL,
  `Mota` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`MaDMDochoi`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dmdochoi`
--

LOCK TABLES `dmdochoi` WRITE;
/*!40000 ALTER TABLE `dmdochoi` DISABLE KEYS */;
INSERT INTO `dmdochoi` VALUES (1,'Nhóm 0-3 tuổi','Đẹp'),(2,'Nhóm 4-8 tuổi','Đẹp'),(3,'Nhóm trên 8 tuổi','Đẹp');
/*!40000 ALTER TABLE `dmdochoi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dmdungcu`
--

DROP TABLE IF EXISTS `dmdungcu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `dmdungcu` (
  `MaDMDungCu` int(11) NOT NULL,
  `Khoi` varchar(100) DEFAULT NULL,
  `Mota` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`MaDMDungCu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dmdungcu`
--

LOCK TABLES `dmdungcu` WRITE;
/*!40000 ALTER TABLE `dmdungcu` DISABLE KEYS */;
INSERT INTO `dmdungcu` VALUES (1,'Tiểu học',''),(2,'Trung học',''),(3,'Phổ thông','');
/*!40000 ALTER TABLE `dmdungcu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dmsach`
--

DROP TABLE IF EXISTS `dmsach`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `dmsach` (
  `MaDMSach` int(11) NOT NULL,
  `TheLoai` varchar(100) DEFAULT NULL,
  `Mota` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`MaDMSach`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dmsach`
--

LOCK TABLES `dmsach` WRITE;
/*!40000 ALTER TABLE `dmsach` DISABLE KEYS */;
INSERT INTO `dmsach` VALUES (1,'Thiếu Nhi',''),(2,'Khoa Học',''),(3,'Tôn Giáo',''),(4,'Chính Trị',''),(5,'Văn Học','');
/*!40000 ALTER TABLE `dmsach` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donhang`
--

DROP TABLE IF EXISTS `donhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `donhang` (
  `MaDonHang` int(11) NOT NULL,
  `MaKhachHang` int(11) DEFAULT NULL,
  `MaNhanVien` int(11) DEFAULT NULL,
  `NgayMuaHang` date DEFAULT NULL,
  `TongTien` double DEFAULT NULL,
  PRIMARY KEY (`MaDonHang`),
  KEY `MaKhachHang` (`MaKhachHang`),
  KEY `MaNhanVien` (`MaNhanVien`),
  CONSTRAINT `donhang_ibfk_1` FOREIGN KEY (`MaKhachHang`) REFERENCES `khachhang` (`makhachhang`),
  CONSTRAINT `donhang_ibfk_2` FOREIGN KEY (`MaNhanVien`) REFERENCES `nhanvien` (`manhanvien`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donhang`
--

LOCK TABLES `donhang` WRITE;
/*!40000 ALTER TABLE `donhang` DISABLE KEYS */;
INSERT INTO `donhang` VALUES (1,1,1,'1999-04-11',20000),(2,2,1,'2003-11-11',30000),(3,2,1,'2010-11-11',50000),(4,2,1,'2001-12-01',60000),(5,3,2,'2009-01-01',70000),(6,3,2,'2020-01-01',8000);
/*!40000 ALTER TABLE `donhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `khachhang`
--

DROP TABLE IF EXISTS `khachhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `khachhang` (
  `MaKhachHang` int(11) NOT NULL,
  `TenKhachHang` varchar(50) DEFAULT NULL,
  `NgaySinh` date DEFAULT NULL,
  `SoDienThoai` varchar(10) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `MaLoai` int(11) DEFAULT NULL,
  PRIMARY KEY (`MaKhachHang`),
  KEY `MaLoai` (`MaLoai`),
  CONSTRAINT `khachhang_ibfk_1` FOREIGN KEY (`MaLoai`) REFERENCES `loaikhachhang` (`maloai`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khachhang`
--

LOCK TABLES `khachhang` WRITE;
/*!40000 ALTER TABLE `khachhang` DISABLE KEYS */;
INSERT INTO `khachhang` VALUES (1,'Nguyễn Văn x','2002-01-02','0363688925','thangqn@gmail.com',2),(2,'Nguyễn văn A','2004-11-02','0363685525','anhyhoang@gmail.com',3),(3,'Trần Anh Độ','2001-12-10','0363812001','trananhhoang@gmail.com',1),(4,'Đào Bá Hưng ','2002-01-02','036389440','badao002@gmail.com',2),(5,'Nguyễn Bảo Khang','2002-01-10','03669220','khangbao@gmail.com',2),(6,'Phạm Hoàng Hiền My','2004-10-11','036445289','Mypham@gmail.com',1),(7,'Nguyễn Trang Trọng','2002-12-11','0363698123','ttnguyenxx26@gmail.com',3),(8,'Đào Nghĩa Trang','2002-01-02','0364586358','daonghiatrang@gmail.com',1),(9,'Trần Hy Vọng Mong Manh','2003-01-02','0363689990','tranmongmanh@gmail.com',1),(10,'Cầu Thị Ước Mơ','2003-11-02','0355988244','uocmocau@gmail.com',1);
/*!40000 ALTER TABLE `khachhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loaikhachhang`
--

DROP TABLE IF EXISTS `loaikhachhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `loaikhachhang` (
  `MaLoai` int(11) NOT NULL,
  `TenLoai` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`MaLoai`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loaikhachhang`
--

LOCK TABLES `loaikhachhang` WRITE;
/*!40000 ALTER TABLE `loaikhachhang` DISABLE KEYS */;
INSERT INTO `loaikhachhang` VALUES (1,'Thường'),(2,'VIP1'),(3,'VIP2');
/*!40000 ALTER TABLE `loaikhachhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhanvien`
--

DROP TABLE IF EXISTS `nhanvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `nhanvien` (
  `MaNhanVien` int(11) NOT NULL,
  `TenNhanVien` varchar(100) DEFAULT NULL,
  `NgaySinh` date DEFAULT NULL,
  `ViTri` varchar(50) DEFAULT NULL,
  `SoDienThoai` varchar(10) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Diachi` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`MaNhanVien`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhanvien`
--

LOCK TABLES `nhanvien` WRITE;
/*!40000 ALTER TABLE `nhanvien` DISABLE KEYS */;
INSERT INTO `nhanvien` VALUES (1,'Hà Long Hải ','1999-01-28','Nhân Viên','0123456789','halonghaiqa62@gmail.com','Quảng Nam'),(2,'Trần Hoàng Anh','1999-11-26','Phó giám đốc','0123456789','abc@gmail.com','Quảng Trị'),(3,'Phan Thị Diệu Hiền','1999-12-21','Thư kí','0913002441','xyz@gmail.com','Gia Lai'),(4,'Hà Văn Thuận','1999-03-08','Nhân Viên','0123456789','abcxyz@gmail.com','Quảng Trị'),(5,'Nguyễn Viết Trọng','1999-05-07','Giám đốc','0123456789','aannn@gmail.com','Quảng Nam'),(6,'Hoàng Tuấn Mạnh','1999-08-07','Nhân Viên','0123456789','ananana@gmail.com','Quảng Nam'),(7,'Ngô Minh Cường','1999-08-09','Nhân Viên','0123456789','ununun@gmail.com','Quảng Nam'),(8,'Trần Văn D','1999-03-07','Nhân Viên','0123456789','tranvana@gmail.com','Quảng Bình'),(9,'Nguyễn Văn C','1999-03-07','Nhân Viên','0123456789','nguyenavnc@gmail.com','Quảng Nam'),(10,'Nguyễn Văn B','1999-08-22','Nhân Viên','0123456789','hahha@gmail.com','Quảng Nam');
/*!40000 ALTER TABLE `nhanvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sanphamdochoi`
--

DROP TABLE IF EXISTS `sanphamdochoi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `sanphamdochoi` (
  `MaSPDoChoi` int(11) NOT NULL,
  `TenSPDoChoi` varchar(50) DEFAULT NULL,
  `SoLuong` int(11) DEFAULT NULL,
  `DonGia` double DEFAULT NULL,
  `DonVi` varchar(50) DEFAULT NULL,
  `MaDMDoChoi` int(11) DEFAULT NULL,
  `XuatXu` varchar(100) DEFAULT NULL,
  `ThuongHieu` varchar(100) DEFAULT NULL,
  `NhaCungCap` varchar(50) DEFAULT NULL,
  `HuongDan` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`MaSPDoChoi`),
  KEY `MaDMDoChoi` (`MaDMDoChoi`),
  CONSTRAINT `sanphamdochoi_ibfk_1` FOREIGN KEY (`MaDMDoChoi`) REFERENCES `dmdochoi` (`madmdochoi`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sanphamdochoi`
--

LOCK TABLES `sanphamdochoi` WRITE;
/*!40000 ALTER TABLE `sanphamdochoi` DISABLE KEYS */;
INSERT INTO `sanphamdochoi` VALUES (1,'Bộ xếp hình',100,1000,'đ',1,'Quảng Châu','Trung Quốc','Nhà tui','HHH'),(2,'Bộ chơi cát',10,10000,'đ',2,'Quảng Chân','TQ','Nhà tui','Đọc hướng dẫn'),(3,'Siêu Nhân đỏ',2,20000,'đ',3,'QC','VN','Nhà tui','Đọc hướng dẫn'),(4,'Siêu Nhân Bạc',3,20000,'đ',2,'QC','VN','Nhà tui','Đọc hướng dẫn'),(5,'Siêu Nhân Trắng',44,10000,'đ',2,'QC','VN','Nhà tui','Đọc hướng dẫn'),(6,'Siêu Nhân Đen',55,22222,'đ',3,'QC','VN','Nhà tui','Đọc hướng dẫn'),(7,'Siêu Nhân Hồng',6,22233,'đ',2,'QC','VN','Nhà tui','Đọc hướng dẫn'),(8,'Siêu Nhân Vàng',66,333222,'đ',1,'QC','VN','Nhà tui','Đọc hướng dẫn'),(9,'Siêu Nhân Đen Hồng',77,33322,'đ',2,'QC','VN','Nhà tui','Đọc hướng dẫn'),(10,'Siêu Nhân Hồng Trắng',88,22212,'đ',2,'QC','VN','Nhà tui','Đọc hướng dẫn');
/*!40000 ALTER TABLE `sanphamdochoi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sanphamdungcu`
--

DROP TABLE IF EXISTS `sanphamdungcu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `sanphamdungcu` (
  `MaSPDungCu` int(11) NOT NULL,
  `TenSPDungCu` varchar(50) DEFAULT NULL,
  `SoLuong` int(11) DEFAULT NULL,
  `DonGia` double DEFAULT NULL,
  `DonVi` varchar(50) DEFAULT NULL,
  `MaDMDungCu` int(11) DEFAULT NULL,
  `XuatXu` varchar(100) DEFAULT NULL,
  `ThuongHieu` varchar(100) DEFAULT NULL,
  `NhaCungCap` varchar(50) DEFAULT NULL,
  `MauSac` varchar(10) DEFAULT NULL,
  `KichThuoc` float DEFAULT NULL,
  `ChatLieu` varchar(200) DEFAULT NULL,
  `HuongDan` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`MaSPDungCu`),
  KEY `MaDMDungCu` (`MaDMDungCu`),
  CONSTRAINT `sanphamdungcu_ibfk_1` FOREIGN KEY (`MaDMDungCu`) REFERENCES `dmdungcu` (`madmdungcu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sanphamdungcu`
--

LOCK TABLES `sanphamdungcu` WRITE;
/*!40000 ALTER TABLE `sanphamdungcu` DISABLE KEYS */;
INSERT INTO `sanphamdungcu` VALUES (1,'Bút chì',10,10,'đ',1,'Đà Nẵng','Trung Quốc','NHà Tui','Đen',10,'nhựa','Đọc kĩ hướng dẫn trước khi sử dụng'),(2,'Bút bi',10,10,'đ',1,'Đà Nẵng','Trung Quốc','NHà Tui','đỏ',10,'nhựa','Đọc kĩ hướng dẫn trước khi sử dụng'),(3,'Bút mực',10,10,'đ',1,'Đà Nẵng','Trung Quốc','NHà Tui','trắng',10,'nhựa','Đọc kĩ hướng dẫn trước khi sử dụng'),(4,'Bút lông',10,10,'đ',1,'Đà Nẵng','Trung Quốc','NHà Tui','Vàng',10,'nhựa','Đọc kĩ hướng dẫn trước khi sử dụng'),(5,'Thước',10,10,'đ',1,'Đà Nẵng','Trung Quốc','NHà Tui','Đen',10,'nhựa','Đọc kĩ hướng dẫn trước khi sử dụng'),(6,'Bảng đen ',10,10,'đ',1,'Đà Nẵng','Trung Quốc','NHà Tui','Đen',10,'nhựa','Đọc kĩ hướng dẫn trước khi sử dụng'),(7,'Phấn',10,10,'đ',1,'Đà Nẵng','Trung Quốc','NHà Tui','Đen',10,'nhựa','Đọc kĩ hướng dẫn trước khi sử dụng'),(8,'Tẩy',10,10,'đ',1,'Đà Nẵng','Trung Quốc','NHà Tui','Đen',10,'nhựa','Đọc kĩ hướng dẫn trước khi sử dụng'),(9,'Tẩy bự',10,10,'đ',1,'Đà Nẵng','Trung Quốc','NHà Tui','Đen',10,'nhựa','Đọc kĩ hướng dẫn trước khi sử dụng'),(10,'Khăn bảng',10,10,'đ',1,'Đà Nẵng','Trung Quốc','NHà Tui','Đen',10,'nhựa','Đọc kĩ hướng dẫn trước khi sử dụng');
/*!40000 ALTER TABLE `sanphamdungcu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sanphamsach`
--

DROP TABLE IF EXISTS `sanphamsach`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `sanphamsach` (
  `MaSPSach` int(11) NOT NULL,
  `TenSPSach` varchar(50) DEFAULT NULL,
  `SoLuong` int(11) DEFAULT NULL,
  `DonGia` double DEFAULT NULL,
  `DonVi` varchar(50) DEFAULT NULL,
  `MaDMSach` int(11) DEFAULT NULL,
  `NhaXuatBan` varchar(100) DEFAULT NULL,
  `NamXuatBan` varchar(4) DEFAULT NULL,
  `TacGia` varchar(50) DEFAULT NULL,
  `NgayXuatBan` date DEFAULT NULL,
  `LanTaiBan` int(11) DEFAULT NULL,
  PRIMARY KEY (`MaSPSach`),
  KEY `MaDMSach` (`MaDMSach`),
  CONSTRAINT `sanphamsach_ibfk_1` FOREIGN KEY (`MaDMSach`) REFERENCES `dmsach` (`madmsach`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sanphamsach`
--

LOCK TABLES `sanphamsach` WRITE;
/*!40000 ALTER TABLE `sanphamsach` DISABLE KEYS */;
INSERT INTO `sanphamsach` VALUES (1,'ANIMORPHS - NGƯỜI HÓA',100,54400,'quyển',5,'Hội nhà văn','2019','K.A Applegate','2019-11-27',1),(2,'BÍ ẨN VỀ CON CHÓ LÚC NỬA ĐÊM',100,60000,'quyển',2,'Văn Học','2019','Mark Haddon','2019-11-07',1),(3,'TÔI LÀ AI VÀ NẾU VẬY THÌ BAO NHIÊU',50,116000,'quyển',3,'Thế giới','2018','Mary Roach','2018-10-27',2),(4,'TOÁN HỌC, MỘT THIÊN TIỂU THUYẾT',20,88000,'quyển',2,'Thế giới','2019','Mickaël Launay','2019-05-16',2),(5,'HỌC KIỂU MỸ TẠI NHÀ',100,94400,'quyển',1,'Thế giới','2019','Hong Dinh','2019-04-10',1),(6,'21 BÀI HỌC CHO THẾ KỶ 21',188,167200,'quyển',4,'Thế giới','2018','Yuval Noah Harari','2019-02-10',1),(7,'HOA VẪN NỞ MỖI NGÀY',55,187000,'quyển',1,'Hà Nội','2020','Valérie Perrin','2020-11-03',1),(8,'CHÚC MẸ NGỦ NGON',66,116000,'quyển',1,'Hà Nội','2020','Thomas Cathcart - Daniel Klein','2020-09-21',1),(9,'NÓI LUÔN CHO NÓ VUÔNG',63,72000,'quyển',1,'Thế giới','2018','Steve Harvey','2018-09-30',1),(10,'TRIẾT HỌC NGHỆ THUẬT CỦA HEIDEGGER',30,128000,'quyển',5,'Thế Giới','2020','Julian Young','2020-03-01',1);
/*!40000 ALTER TABLE `sanphamsach` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-09  0:20:33
