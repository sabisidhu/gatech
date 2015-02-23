-- phpMyAdmin SQL Dump
-- version 2.10.2
-- http://www.phpmyadmin.net
-- 
-- Host: localhost
-- Generation Time: Sep 25, 2013 at 08:37 PM
-- Server version: 5.0.45
-- PHP Version: 5.2.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

-- 
-- Database: `hotel`
-- 

-- --------------------------------------------------------

-- 
-- Table structure for table `adult_gate`
-- 

CREATE TABLE `adult_gate` (
  `person` varchar(350) default NULL,
  `adult_with_drink_alcoholic` varchar(20) default NULL,
  `adult_with_drink_non` varchar(20) default NULL,
  `adult_without` varchar(20) default NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table `adult_gate`
-- 

INSERT INTO `adult_gate` VALUES ('Adult', '7000', '5000', '4000');

-- --------------------------------------------------------

-- 
-- Table structure for table `bar_bill`
-- 

CREATE TABLE `bar_bill` (
  `odid` varchar(255) default NULL,
  `category` varchar(255) default NULL,
  `name` varchar(255) default NULL,
  `qty` varchar(255) default NULL,
  `unit` varchar(255) default NULL,
  `amount` varchar(255) default NULL,
  `status` varchar(255) default NULL,
  `date_received` date default NULL,
  `desg` varchar(255) default NULL,
  `user` varchar(255) default NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table `bar_bill`
-- 

INSERT INTO `bar_bill` VALUES ('michael', 'WINE ', 'Red Wine 51t. ', '1', 'Bottle', '15000', 'Paid', '2013-09-25', 'Bar', 'Aidan');
INSERT INTO `bar_bill` VALUES ('01', 'WINE ', 'Red Wine 51t. ', '1', 'Bottle', '15000', 'Paid', '2013-09-22', 'Bar', 'Aidan');
INSERT INTO `bar_bill` VALUES ('01', 'GIN & VODKA ', 'Beefeater Gin ', '4', 'Bottle', '8000', 'Paid', '2013-09-22', 'Bar', 'Aidan');
INSERT INTO `bar_bill` VALUES ('01', 'Fish', 'Roasted Whole Tilapia ', '1', 'Food', '15000', 'Paid', '2013-09-20', 'Kitchen', 'Aidan');
INSERT INTO `bar_bill` VALUES ('me', 'Breakfast', 'Simple Simon', '1', 'Food', '5000', 'Outstanding', '2013-09-20', 'Kitchen', 'Aidan');
INSERT INTO `bar_bill` VALUES ('01', 'WINE ', 'Red Wine 51t. ', '2', 'Bottle', '30000', 'Paid', '2013-09-20', 'Bar', 'Aidan');
INSERT INTO `bar_bill` VALUES ('me', 'Breakfast', 'Simple Simon', '1', 'Food', '5000', 'Paid', '2013-09-20', 'Kitchen', 'Aidan');
INSERT INTO `bar_bill` VALUES ('me', 'GIN & VODKA ', 'Beefeater Gin ', '2', 'Bottle', '4000', 'Paid', '2013-09-20', 'Bar', 'Aidan');
INSERT INTO `bar_bill` VALUES ('me', 'GIN & VODKA ', 'Beefeater Gin ', '2', 'Bottle', '4000', 'Paid', '2013-09-20', 'Bar', 'Aidan');
INSERT INTO `bar_bill` VALUES ('mwita', 'Starters', 'Beef samosas', '5', 'Food', '20000', 'Paid', '2013-09-17', 'Kitchen', 'Aidan');
INSERT INTO `bar_bill` VALUES ('mwita', 'Salads', 'Creamy potato and egg salad ', '1', 'Food', '4000', 'Paid', '2013-09-17', 'Kitchen', 'Aidan');
INSERT INTO `bar_bill` VALUES ('mwita', 'WINE ', 'Red Wine 51t. ', '2', 'Bottle', '30000', 'Paid', '2013-09-17', 'Bar', 'Aidan');
INSERT INTO `bar_bill` VALUES ('dnn', 'GIN & VODKA ', 'Beefeater Gin ', '2', 'Bottle', '4000', 'Paid', '2013-09-20', 'Bar', 'Aidan');
INSERT INTO `bar_bill` VALUES ('aidan', 'Pizza', 'Vegetarian Pizza', '1', 'Food', '10000', 'Paid', '2013-09-15', 'Kitchen', 'Aidan');
INSERT INTO `bar_bill` VALUES ('aidan', 'Pizza', 'Cheese Pizza', '1', 'Food', '5000', 'Paid', '2013-09-15', 'Kitchen', 'Aidan');
INSERT INTO `bar_bill` VALUES ('aidan', 'WINE ', 'Red Wine 51t. ', '1', 'Bottle', '15000', 'Paid', '2013-09-15', 'Bar', 'Aidan');
INSERT INTO `bar_bill` VALUES ('danny', 'GIN & VODKA ', 'Beefeater Gin ', '2', 'Bottle', '4000', 'Paid', '2013-09-20', 'Bar', 'Aidan');
INSERT INTO `bar_bill` VALUES ('aidan', 'GIN & VODKA ', 'Beefeater Gin ', '8', 'Bottle', '16000', 'Paid', '2013-08-25', 'Bar', 'Aidan');
INSERT INTO `bar_bill` VALUES ('aidan', 'Pizza', 'Hawaiian Pizza', '3', 'Food', '24000', 'Paid', '2013-09-07', 'Kitchen', 'Aidan');
INSERT INTO `bar_bill` VALUES ('her', 'Breakfast', 'Standard breakfast', '1', 'Food', '6000', 'Paid', '2013-07-30', 'Kitchen', 'Aidan');

-- --------------------------------------------------------

-- 
-- Table structure for table `bar_cat`
-- 

CREATE TABLE `bar_cat` (
  `cid` varchar(20) default NULL,
  `category` varchar(255) default NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table `bar_cat`
-- 

INSERT INTO `bar_cat` VALUES ('GGV05', 'GIN & VODKA ');
INSERT INTO `bar_cat` VALUES ('SWT07', 'SWEETS ');
INSERT INTO `bar_cat` VALUES ('CG06', 'CIGARETTES ');
INSERT INTO `bar_cat` VALUES ('WN05', 'WINE ');
INSERT INTO `bar_cat` VALUES ('WHISK06', 'WHISKEY ');
INSERT INTO `bar_cat` VALUES ('SFT07', 'SOFT DRINKS ');
INSERT INTO `bar_cat` VALUES ('BEER01', 'BEERS ');
INSERT INTO `bar_cat` VALUES ('LQQ01', 'LIQUERS ');

-- --------------------------------------------------------

-- 
-- Table structure for table `bar_room_bill`
-- 

CREATE TABLE `bar_room_bill` (
  `Room_no` varchar(255) default NULL,
  `category` varchar(255) default NULL,
  `name` varchar(255) default NULL,
  `qty` varchar(255) default NULL,
  `unit` varchar(255) default NULL,
  `desg` varchar(255) default NULL,
  `status` varchar(255) default NULL,
  `user` varchar(255) default NULL,
  `date_added` date default NULL,
  `amount` varchar(255) default NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table `bar_room_bill`
-- 


-- --------------------------------------------------------

-- 
-- Table structure for table `bar_stock`
-- 

CREATE TABLE `bar_stock` (
  `sid` varchar(30) NOT NULL,
  `sname` varchar(255) default NULL,
  `scategory` varchar(255) default NULL,
  `squantity` varchar(30) default NULL,
  `sunit` varchar(30) default NULL,
  `s_price` varchar(30) default NULL,
  `date_received` date default NULL,
  PRIMARY KEY  (`sid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table `bar_stock`
-- 

INSERT INTO `bar_stock` VALUES ('WN01', 'Red Wine 51t. ', 'WINE ', '96', 'Bottle', '15000', '2013-07-15');
INSERT INTO `bar_stock` VALUES ('GGV03', 'Beefeater Gin ', 'GIN & VODKA ', '86', 'Bottle', '2000', '2013-07-15');

-- --------------------------------------------------------

-- 
-- Table structure for table `bar_stock_arch`
-- 

CREATE TABLE `bar_stock_arch` (
  `sid` varchar(30) NOT NULL,
  `sname` varchar(255) default NULL,
  `scategory` varchar(255) default NULL,
  `squantity` varchar(30) default NULL,
  `sunit` varchar(30) default NULL,
  `s_price` varchar(30) default NULL,
  `date_received` date default NULL,
  PRIMARY KEY  (`sid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table `bar_stock_arch`
-- 

INSERT INTO `bar_stock_arch` VALUES ('WHISK17', 'Clan McGregor ', 'WHISKEY ', '5', 'Btl', '0', '2013-04-09');
INSERT INTO `bar_stock_arch` VALUES ('OTHR11', 'Sherry cream ', 'Other ', '6', 'Btl', '0', '2013-04-09');
INSERT INTO `bar_stock_arch` VALUES ('WHISK13', 'Southern Comfort ', 'WHISKEY ', '3', '', '0', '2013-04-09');
INSERT INTO `bar_stock_arch` VALUES ('WHISK16', 'Jim Bean ', 'WHISKEY ', '2', '', '0', '2013-04-09');
INSERT INTO `bar_stock_arch` VALUES ('BRAND03', 'Klipdrift ', 'BRANDY ', '2', 'Btl', '0', '2013-04-09');
INSERT INTO `bar_stock_arch` VALUES ('SFT15', 'Guiness Malt cans ', 'SOFT DRINKS ', '5', '', '2000', '2013-04-09');
INSERT INTO `bar_stock_arch` VALUES ('GGV01', 'Absolute Vodka ', 'GIN & VODKA ', '3', 'Btl', '2500', '2013-04-09');
INSERT INTO `bar_stock_arch` VALUES ('GGV05', 'Consulate Gin ', 'GIN & VODKA ', '3', 'Btl', '2000', '2013-04-09');
INSERT INTO `bar_stock_arch` VALUES ('GGV09', 'Smirnoff Vodka ', 'GIN & VODKA ', '4', 'Btl', '7000', '2013-04-09');
INSERT INTO `bar_stock_arch` VALUES ('SWT07', 'Biltong ', 'SWEETS ', '8', '', '6000', '2013-04-09');
INSERT INTO `bar_stock_arch` VALUES ('CG06', 'Dunhill Light ', 'CIGARETTES ', '3', '', '0', '2013-04-09');
INSERT INTO `bar_stock_arch` VALUES ('WN05', 'Champaigne ', 'WINE ', '3', 'Btl', '9000', '2013-04-09');
INSERT INTO `bar_stock_arch` VALUES ('WN03', 'White Wine 51t ', 'WINE ', '4', 'Glass', '1000', '2013-04-09');
INSERT INTO `bar_stock_arch` VALUES ('WHISK06', 'Glenfiddich ', 'WHISKEY ', '4', 'Shot', '2000', '2013-04-09');
INSERT INTO `bar_stock_arch` VALUES ('SFT07', 'Coke Light can ', 'SOFT DRINKS ', '6', 'Can', '2500', '2013-04-09');
INSERT INTO `bar_stock_arch` VALUES ('SWT01', 'Bounty chocolate ', 'SWEETS ', '8', 'Pkt', '1500', '2013-04-12');
INSERT INTO `bar_stock_arch` VALUES ('BEER01', 'Balimi ', 'BEERS ', '10', 'Bottle', '2000', '2013-04-16');
INSERT INTO `bar_stock_arch` VALUES ('BEER06', 'Heineken ', 'BEERS ', '10', 'Can', '2500', '2013-04-16');
INSERT INTO `bar_stock_arch` VALUES ('WHISK04', 'Famous Grouse ', 'WHISKEY ', '10', 'Shot', '10000', '2013-04-17');
INSERT INTO `bar_stock_arch` VALUES ('SFT05', 'Coke can ', 'SOFT DRINKS ', '10', 'Can', '1000', '2013-04-17');
INSERT INTO `bar_stock_arch` VALUES ('WN04', 'White Wine BtI. ', 'WINE ', '9', 'Shot', '10', '2013-04-17');
INSERT INTO `bar_stock_arch` VALUES ('WN02', 'RRed Wine BtI. ', 'WINE ', '10', 'Glass', '0', '2013-04-17');
INSERT INTO `bar_stock_arch` VALUES ('LQQ01', 'Afri Koko ', 'LIQUERS ', '10', 'Bottle', '2000', '2013-04-17');
INSERT INTO `bar_stock_arch` VALUES ('LQQ02', 'Amarula ', 'LIQUERS ', '10', 'Bottle', '3000', '2013-04-17');
INSERT INTO `bar_stock_arch` VALUES ('WHISK07', 'Grants ', 'WHISKEY ', '7', 'Shot', '5000', '2013-04-18');
INSERT INTO `bar_stock_arch` VALUES ('CG01', 'Benson & Hedges Filter ', 'CIGARETTES ', '3', 'Pkt', '2500', '2013-04-23');
INSERT INTO `bar_stock_arch` VALUES ('WN01', 'Red Wine 51t. ', 'WINE ', '10', 'Bottle', '15000', '2013-07-15');
INSERT INTO `bar_stock_arch` VALUES ('BEER05', 'Guinness Malt ', 'BEERS ', '2', 'Bottle', '2500', '2013-07-15');
INSERT INTO `bar_stock_arch` VALUES ('GGV03', 'Beefeater Gin ', 'GIN & VODKA ', '10', 'Bottle', '0', '2013-07-15');

-- --------------------------------------------------------

-- 
-- Table structure for table `billing_tbl`
-- 

CREATE TABLE `billing_tbl` (
  `Name` varchar(255) NOT NULL,
  `LastName` varchar(255) default NULL,
  `Room_Bill` varchar(50) default NULL,
  `advance` varchar(255) default NULL,
  `Food_Bill` varchar(50) default NULL,
  `bar_bill` varchar(255) default NULL,
  `Other_Bill` varchar(50) default NULL,
  `Total_Bill` varchar(255) default NULL,
  `Paid` int(100) NOT NULL,
  `change` int(100) NOT NULL,
  `check_in_date` date NOT NULL,
  `check_out_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table `billing_tbl`
-- 

INSERT INTO `billing_tbl` VALUES ('', 'Nyamhanga', '50000', '0', '30000', '2000', '40000', '50000', 0, 0, '0000-00-00', '0000-00-00');
INSERT INTO `billing_tbl` VALUES ('Aidan', 'Nyamhanga', '400000', '5000000', '35000', NULL, '5000', '420000', 0, 4580000, '2013-06-23', '2013-07-01');
INSERT INTO `billing_tbl` VALUES ('Aidan', 'Nyamhanga', '700000', '5000000', '35000', NULL, '5000', '720000', 0, 4280000, '2013-06-23', '2013-07-07');
INSERT INTO `billing_tbl` VALUES ('Aidan', 'Nyamhanga', '700000', '5000000', '35000', NULL, '5000', '720000', 0, 4280000, '2013-06-23', '2013-07-07');
INSERT INTO `billing_tbl` VALUES ('Aidan', 'Nyamhanga', '700000', '5000000', NULL, NULL, NULL, '700000', 0, 4300000, '2013-06-23', '2013-07-07');
INSERT INTO `billing_tbl` VALUES ('Aidan', 'Nyamhanga', '700000', '5000000', NULL, NULL, NULL, '700000', 0, 4300000, '2013-06-23', '2013-07-07');
INSERT INTO `billing_tbl` VALUES ('Mwita', 'Nyamhanga', '650000', '50000', NULL, NULL, NULL, '650000', 700000, 100000, '2013-06-24', '2013-07-07');
INSERT INTO `billing_tbl` VALUES ('Edna', 'Nyamhanga', '600000', '90000', NULL, NULL, NULL, '600000', 700000, 190000, '2013-06-25', '2013-07-07');
INSERT INTO `billing_tbl` VALUES ('asa', 'hghfh', '2880000', '998', NULL, NULL, NULL, '2880000', 3000000, 120998, '2013-06-06', '2013-07-08');
INSERT INTO `billing_tbl` VALUES ('Edna', 'Nyanokwe', '1050000', '90000', NULL, NULL, NULL, '1050000', 1000000, 40000, '2013-06-23', '2013-07-08');
INSERT INTO `billing_tbl` VALUES ('Sophia', 'Scooby', '600000', '500000', NULL, NULL, NULL, '600000', 120000, 20000, '2013-06-26', '2013-07-08');
INSERT INTO `billing_tbl` VALUES ('Peter', 'John', '810000', '300000', '24000', NULL, NULL, '834000', 600000, 66000, '2013-06-29', '2013-07-08');
INSERT INTO `billing_tbl` VALUES ('Aidan', 'Nyamhanga', '50000', '60000', NULL, NULL, NULL, '50000', 0, 10000, '2013-07-08', '2013-07-09');
INSERT INTO `billing_tbl` VALUES ('Aidan', 'Wambura', '2750000', '90000', NULL, NULL, NULL, '2750000', 2700000, 40000, '2013-07-31', '2013-09-24');
INSERT INTO `billing_tbl` VALUES ('jhjbjh', 'hjbjbj', '3150000', '90000', NULL, NULL, NULL, '3156000', 4000000, 934000, '2013-07-31', '2013-10-02');
INSERT INTO `billing_tbl` VALUES ('Paschal', 'Sana', '2150000', '90000', NULL, NULL, NULL, '2156000', 3000000, 934000, '2013-07-30', '2013-09-11');
INSERT INTO `billing_tbl` VALUES ('Aidan', 'Nyamhanga', '2100000', '98778', NULL, NULL, NULL, '2100000', 2200000, 198778, '2013-07-31', '2013-09-11');
INSERT INTO `billing_tbl` VALUES ('Aidan', 'Nyamhanga', '50000', '1026000', '40000', NULL, NULL, '90000', 0, 936000, '2013-07-13', '2013-07-14');
INSERT INTO `billing_tbl` VALUES ('Aidan', 'Nyamhanga', '300000', '100000', NULL, NULL, NULL, '306000', 300000, 94000, '2013-07-14', '2013-07-20');
INSERT INTO `billing_tbl` VALUES ('Aidan', 'Nyamhanga', '200000', '100000', NULL, NULL, NULL, '206000', 107000, 1000, '2013-07-15', '2013-07-19');
INSERT INTO `billing_tbl` VALUES ('Aidan', 'Nyamhanga', '100000', '90000', NULL, NULL, NULL, '106000', 17000, 1000, '2013-07-18', '2013-07-20');
INSERT INTO `billing_tbl` VALUES ('Aidan', 'Nyamhanga', '500000', '94000', '10000', '57500', NULL, '570500', 480000, 3500, '2013-07-21', '2013-07-31');
INSERT INTO `billing_tbl` VALUES ('Aidan', 'Nyamhanga', '500000', '94000', NULL, NULL, NULL, '0', 480000, 0, '2013-07-21', '2013-07-31');
INSERT INTO `billing_tbl` VALUES ('Aidan', 'Nyamhanga', '500000', '94000', NULL, NULL, NULL, '0', 480000, 0, '2013-07-21', '2013-07-31');
INSERT INTO `billing_tbl` VALUES ('Aidan', 'Wambura', '350000', '0', NULL, NULL, NULL, '350000', 4000000, 3650000, '2013-09-07', '2013-09-14');
INSERT INTO `billing_tbl` VALUES ('Edna', 'Nyamhanga', '2200000', '3000', NULL, NULL, NULL, '2200000', 4000000, 1803000, '2013-08-01', '2013-09-14');
INSERT INTO `billing_tbl` VALUES ('Aidan', 'Nyamhanga', '600000', '200000', NULL, '2000', NULL, '602000', 402000, 0, '2013-09-14', '2013-09-26');
INSERT INTO `billing_tbl` VALUES ('Aidan', 'Nyamhanga', '50000', '100000', NULL, NULL, NULL, '50000', 70000, 50000, '2013-09-24', '2013-09-25');
INSERT INTO `billing_tbl` VALUES ('Aidan', 'Nyamhanga', '50000', '70000', NULL, NULL, NULL, '50000', 0, 20000, '2013-09-24', '2013-09-25');
INSERT INTO `billing_tbl` VALUES ('Aidan', 'Nyamhanga', '50000', '0', NULL, NULL, NULL, '56000', 60000, 4000, '2013-09-24', '2013-09-25');

-- --------------------------------------------------------

-- 
-- Table structure for table `category`
-- 

CREATE TABLE `category` (
  `cid` varchar(20) NOT NULL,
  `cat_name` varchar(30) default NULL,
  PRIMARY KEY  (`cid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table `category`
-- 

INSERT INTO `category` VALUES ('SWT01', 'SWEETS ');
INSERT INTO `category` VALUES ('CG01', 'CIGARETTES ');
INSERT INTO `category` VALUES ('SFT01', 'SOFT DRINKS ');
INSERT INTO `category` VALUES ('BBR01', 'BEERS ');
INSERT INTO `category` VALUES ('GV01', 'GIN & VODKA ');
INSERT INTO `category` VALUES ('LQ01', 'LIQUERS ');
INSERT INTO `category` VALUES ('WN01', 'WINE ');
INSERT INTO `category` VALUES ('OTHR01', 'Other ');
INSERT INTO `category` VALUES ('BND01', 'BRANDY ');
INSERT INTO `category` VALUES ('WSK01', 'WHISKEY ');
INSERT INTO `category` VALUES ('RM01', 'RUM ');
INSERT INTO `category` VALUES ('FF01', 'FRIDGE /FREEZER');
INSERT INTO `category` VALUES ('FV01', 'FRUIT & VEG ');
INSERT INTO `category` VALUES ('DG01', 'DRY GOODS');

-- --------------------------------------------------------

-- 
-- Table structure for table `child_gate`
-- 

CREATE TABLE `child_gate` (
  `person` varchar(30) default NULL,
  `child_with_drink` varchar(20) default NULL,
  `child_without` varchar(20) default NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table `child_gate`
-- 

INSERT INTO `child_gate` VALUES ('child', '3000', '2000');

-- --------------------------------------------------------

-- 
-- Table structure for table `client_debt`
-- 

CREATE TABLE `client_debt` (
  `rum_no` varchar(255) NOT NULL,
  `desg` varchar(255) default NULL,
  `cus_name` varchar(255) default NULL,
  `initial_amt` varchar(100) NOT NULL,
  `total_bill` int(100) default NULL,
  `amt_paid` int(100) default NULL,
  `debt` int(100) default NULL,
  `uname` varchar(255) default NULL,
  `dbt_date` date default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `client_debt`
-- 

INSERT INTO `client_debt` VALUES ('TableNo:01', 'received', 'Aidan', '0', 5000, 1000, 4000, 'wambura', '2013-08-09');
INSERT INTO `client_debt` VALUES ('OrderId:aidan', 'Bar', 'Danny', '0', 15000, 12000, 3000, 'wambura', '2013-08-09');
INSERT INTO `client_debt` VALUES ('OrderId:her', 'Bar', 'Me', '0', 10000, 9000, 1000, 'wambura', '2013-08-09');
INSERT INTO `client_debt` VALUES ('OrderId:aidan', 'Bar', 'Aidan', '0', 8000, 3000, 5000, 'wambura', '2013-08-09');
INSERT INTO `client_debt` VALUES ('OrderId:iu', 'Bar', 'wewee', '0', 20000, 19000, 1000, 'wambura', '2013-09-17');

-- --------------------------------------------------------

-- 
-- Table structure for table `client_debt_payment`
-- 

CREATE TABLE `client_debt_payment` (
  `rum_no` varchar(255) NOT NULL,
  `cus_name` varchar(255) default NULL,
  `itm_cat` varchar(255) default NULL,
  `itm_name` varchar(255) default NULL,
  `qty` int(100) default NULL,
  `total` int(100) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `client_debt_payment`
-- 

INSERT INTO `client_debt_payment` VALUES ('TableNo:01', 'Aidan', 'Beers', 'Tusker', 2, 5000);
INSERT INTO `client_debt_payment` VALUES ('aidan', 'Danny', 'Breakfast', 'Simple Simon', 2, 10000);
INSERT INTO `client_debt_payment` VALUES ('aidan', 'Danny', 'Starters', 'Pork Bites ', 4, 28000);
INSERT INTO `client_debt_payment` VALUES ('aidan', 'Danny', 'Pizza', 'Cheese Pizza', 1, 5000);
INSERT INTO `client_debt_payment` VALUES ('aidan', 'Danny', 'Starters', 'Vegetable spring roll', 1, 3000);
INSERT INTO `client_debt_payment` VALUES ('her', 'Me', 'Pizza', 'Cheese Pizza', 2, 10000);
INSERT INTO `client_debt_payment` VALUES ('aidan', 'Aidan', 'Pizza', 'Hawaiian Pizza', 1, 8000);
INSERT INTO `client_debt_payment` VALUES ('iu', 'wewee', 'WINE ', 'Red Wine 51t. ', 1, 15000);
INSERT INTO `client_debt_payment` VALUES ('iu', 'wewee', 'Pizza', 'Cheese Pizza', 1, 5000);

-- --------------------------------------------------------

-- 
-- Table structure for table `complement`
-- 

CREATE TABLE `complement` (
  `cid` varchar(30) default NULL,
  `comp_desg` varchar(255) default NULL,
  `comp_desc` varchar(255) default NULL,
  `comp_date` date default NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table `complement`
-- 

INSERT INTO `complement` VALUES ('12', 'Bar', '2Beers', '2013-04-23');

-- --------------------------------------------------------

-- 
-- Table structure for table `customerinfo_tbl`
-- 

CREATE TABLE `customerinfo_tbl` (
  `Name` varchar(50) default NULL,
  `LastName` varchar(50) default NULL,
  `Gender` varchar(50) default NULL,
  `Address` varchar(50) default NULL,
  `Cell#` varchar(50) default NULL,
  `Room_Type` varchar(50) default NULL,
  `Room_num` varchar(255) default NULL,
  `checkindate` date default NULL,
  `check_out` date NOT NULL,
  `email` varchar(200) NOT NULL,
  `age` varchar(10) NOT NULL,
  `occupation` varchar(200) NOT NULL,
  `Initial` int(200) NOT NULL,
  `Nation` varchar(255) NOT NULL,
  `Pass` varchar(255) NOT NULL,
  KEY `Name` (`Name`),
  KEY `Room_num` (`Room_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table `customerinfo_tbl`
-- 

INSERT INTO `customerinfo_tbl` VALUES ('Aidan', 'Nyamhanga', 'Male', 'P.o.Box 311 Geita', '0758982137', 'Single', '01', '2013-09-24', '2013-09-25', 'aidan@gmail.com', '25', 'Business', 0, 'Benin', 'none');

-- --------------------------------------------------------

-- 
-- Table structure for table `damaged_stock`
-- 

CREATE TABLE `damaged_stock` (
  `sid` varchar(30) NOT NULL,
  `sname` varchar(255) default NULL,
  `scategory` varchar(255) default NULL,
  `squantity` varchar(30) default NULL,
  `date_added` date default NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table `damaged_stock`
-- 

INSERT INTO `damaged_stock` VALUES ('OTHR09', 'Pernod ', 'Other ', '1', '2013-04-09');
INSERT INTO `damaged_stock` VALUES ('WHISK05', 'Glendower ', 'WHISKEY ', '1', '2013-04-23');

-- --------------------------------------------------------

-- 
-- Table structure for table `food_cat`
-- 

CREATE TABLE `food_cat` (
  `cid` varchar(20) NOT NULL,
  `category` varchar(250) default NULL,
  PRIMARY KEY  (`cid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table `food_cat`
-- 

INSERT INTO `food_cat` VALUES ('OE01', 'Optional / Extras');
INSERT INTO `food_cat` VALUES ('BR01', 'Breakfast');
INSERT INTO `food_cat` VALUES ('PZ01', 'Pizza');
INSERT INTO `food_cat` VALUES ('STR01', 'Starters');
INSERT INTO `food_cat` VALUES ('SPT01', 'Sharing Platters');
INSERT INTO `food_cat` VALUES ('SDS01', 'Salads');
INSERT INTO `food_cat` VALUES ('FSH01', 'Fish');
INSERT INTO `food_cat` VALUES ('TS01', 'Toasted Sandwiches');
INSERT INTO `food_cat` VALUES ('BG01', 'Burgers');
INSERT INTO `food_cat` VALUES ('BF01', 'Beef');
INSERT INTO `food_cat` VALUES ('PK01', 'Pork');
INSERT INTO `food_cat` VALUES ('CK01', 'Chicken');
INSERT INTO `food_cat` VALUES ('VG01', 'Vegetarian');
INSERT INTO `food_cat` VALUES ('PST01', 'Pasta');
INSERT INTO `food_cat` VALUES ('DST01', 'Desserts');
INSERT INTO `food_cat` VALUES ('TG01', 'Tunza Grill – Do It Yourself');
INSERT INTO `food_cat` VALUES ('MS01', 'Meat Selection ( price per 100g)');
INSERT INTO `food_cat` VALUES ('AC01', 'Accompaniments');
INSERT INTO `food_cat` VALUES ('SC01', 'Sauces');
INSERT INTO `food_cat` VALUES ('BGE', 'Burger Extras');

-- --------------------------------------------------------

-- 
-- Table structure for table `gate_arch`
-- 

CREATE TABLE `gate_arch` (
  `no_adults` varchar(255) default NULL,
  `adults_with_alc` varchar(255) default NULL,
  `adult_with_non` varchar(255) default NULL,
  `no_children` varchar(255) default NULL,
  `no_children_with` varchar(255) default NULL,
  `amount` varchar(255) default NULL,
  `date_received` date default NULL,
  `paid` varchar(255) default NULL,
  `change_r` varchar(255) default NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table `gate_arch`
-- 

INSERT INTO `gate_arch` VALUES ('0', '1', '1', '0', '1', '15000', '2013-04-23', '15000', '0');
INSERT INTO `gate_arch` VALUES ('0', '1', '1', '1', '0', '14000', '2013-04-23', '150000', '136000');

-- --------------------------------------------------------

-- 
-- Table structure for table `gls`
-- 

CREATE TABLE `gls` (
  `Name` varchar(255) default NULL,
  `descrpt` varchar(50) default NULL,
  `cnt` varchar(20) default NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table `gls`
-- 

INSERT INTO `gls` VALUES ('White Wine 51t ', 'Glass', '6');
INSERT INTO `gls` VALUES ('Glenfiddich ', 'Shot', '6');
INSERT INTO `gls` VALUES ('Famous Grouse ', 'Shot', '6');
INSERT INTO `gls` VALUES ('White Wine BtI. ', 'Shot', '6');
INSERT INTO `gls` VALUES ('RRed Wine BtI. ', 'Glass', '6');
INSERT INTO `gls` VALUES ('Grants ', 'Shot', '6');

-- --------------------------------------------------------

-- 
-- Table structure for table `house_stock`
-- 

CREATE TABLE `house_stock` (
  `sid` varchar(30) NOT NULL,
  `sname` varchar(30) default NULL,
  `scategory` varchar(30) default NULL,
  `squantity` varchar(30) default NULL,
  `sunit` varchar(30) default NULL,
  `s_price` varchar(30) default NULL,
  `date_received` datetime default NULL,
  PRIMARY KEY  (`sid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table `house_stock`
-- 

INSERT INTO `house_stock` VALUES ('OTHR01', 'Campari ', 'Other ', '7', '', '0', '2013-04-23 16:27:48');

-- --------------------------------------------------------

-- 
-- Table structure for table `house_stock_arch`
-- 

CREATE TABLE `house_stock_arch` (
  `sid` varchar(30) NOT NULL,
  `sname` varchar(30) default NULL,
  `scategory` varchar(30) default NULL,
  `squantity` varchar(30) default NULL,
  `sunit` varchar(30) default NULL,
  `s_price` varchar(30) default NULL,
  `date_received` date default NULL,
  PRIMARY KEY  (`sid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table `house_stock_arch`
-- 

INSERT INTO `house_stock_arch` VALUES ('OTHR01', 'Campari ', 'Other ', '7', '', '0', '2013-04-23');

-- --------------------------------------------------------

-- 
-- Table structure for table `key_deposit`
-- 

CREATE TABLE `key_deposit` (
  `id` int(100) NOT NULL,
  `amount` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `key_deposit`
-- 

INSERT INTO `key_deposit` VALUES (1, 6000);

-- --------------------------------------------------------

-- 
-- Table structure for table `kitchen_stock`
-- 

CREATE TABLE `kitchen_stock` (
  `sid` varchar(30) NOT NULL,
  `sname` varchar(30) default NULL,
  `scategory` varchar(30) default NULL,
  `squantity` varchar(30) default NULL,
  `sunit` varchar(30) default NULL,
  `s_price` varchar(30) default NULL,
  `date_received` datetime default NULL,
  PRIMARY KEY  (`sid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table `kitchen_stock`
-- 

INSERT INTO `kitchen_stock` VALUES ('D08', 'Beef Cubes ', 'DRY GOODS', '0', '', '0', '2013-04-11 16:00:17');

-- --------------------------------------------------------

-- 
-- Table structure for table `kitchen_stock_arch`
-- 

CREATE TABLE `kitchen_stock_arch` (
  `sid` varchar(30) NOT NULL,
  `sname` varchar(30) default NULL,
  `scategory` varchar(30) default NULL,
  `squantity` varchar(30) default NULL,
  `sunit` varchar(30) default NULL,
  `s_price` varchar(30) default NULL,
  `date_received` date default NULL,
  PRIMARY KEY  (`sid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table `kitchen_stock_arch`
-- 

INSERT INTO `kitchen_stock_arch` VALUES ('D08', 'Beef Cubes ', 'DRY GOODS', '0', '', '0', '2013-04-11');

-- --------------------------------------------------------

-- 
-- Table structure for table `mymenu`
-- 

CREATE TABLE `mymenu` (
  `mid` varchar(20) NOT NULL,
  `name` varchar(255) default NULL,
  `category` varchar(255) default NULL,
  `description` varchar(500) default NULL,
  `price` varchar(20) default NULL,
  PRIMARY KEY  (`mid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table `mymenu`
-- 

INSERT INTO `mymenu` VALUES ('B01', 'Simple Simon', 'Breakfast', 'Eggs on toast served with fried tomato', '5000');
INSERT INTO `mymenu` VALUES ('B02', 'Standard breakfast', 'Breakfast', 'Eggs with bacon and toast served with fried tomato\n\n', '6000');
INSERT INTO `mymenu` VALUES ('B03', 'Sunrise', 'Breakfast', 'Eggs, bacon and baked beans with toast served with fried tomato\n\n', '7000');
INSERT INTO `mymenu` VALUES ('B04', 'Full English', 'Breakfast', 'Eggs, beef sausage, bacon, baked beans and toast served with fried tomato\n\n\n', '8000');
INSERT INTO `mymenu` VALUES ('B05', 'Tunza Special', 'Breakfast', 'Eggs, bacon, 2 beef sausages, fried mushrooms and toast served with fried tomato', '4000');
INSERT INTO `mymenu` VALUES ('B06', 'Jack’s Special', 'Breakfast', 'Cheese omlette with chapatti', '9000');
INSERT INTO `mymenu` VALUES ('B07', 'Breakfast Sandwich', 'Breakfast', 'Toasted egg, bacon and cheese sandwich', '5500');
INSERT INTO `mymenu` VALUES ('B08', 'Omlettes', 'Breakfast', 'Cheese omlette', '5000');
INSERT INTO `mymenu` VALUES ('B09', 'Omlette', 'Breakfast', 'Spanish omlette', '5000');
INSERT INTO `mymenu` VALUES ('OP01', 'Cheese', 'Optional / Extras', 'Cheese', '2000');
INSERT INTO `mymenu` VALUES ('OP02', 'Egg', 'Optional / Extras', 'Egg', '1000');
INSERT INTO `mymenu` VALUES ('OP03', 'Bacon', 'Optional / Extras', 'Bacon', '3000');
INSERT INTO `mymenu` VALUES ('OP04', 'Beef Sausage', 'Optional / Extras', 'Beef Sausage', '1500');
INSERT INTO `mymenu` VALUES ('OP06', 'Mushrooms', 'Optional / Extras', 'Mushrooms', '2000');
INSERT INTO `mymenu` VALUES ('OP07', 'Toast', 'Optional / Extras', 'Toast', '1000');
INSERT INTO `mymenu` VALUES ('OP08', 'Chips', 'Optional / Extras', 'Chips', '2500');
INSERT INTO `mymenu` VALUES ('OP09', 'Baked Beans', 'Optional / Extras', 'Baked Beans', '1000');
INSERT INTO `mymenu` VALUES ('OP10', 'Chapatti', 'Optional / Extras', 'Chapatti', '1000');
INSERT INTO `mymenu` VALUES ('PZ01', 'Cheese Pizza', 'Pizza', 'Cheese with tomato based pizza', '5000');
INSERT INTO `mymenu` VALUES ('PZ02', 'Hawaiian Pizza', 'Pizza', 'Cheese, Pineapple and bacon', '8000');
INSERT INTO `mymenu` VALUES ('PZ03', 'Vegetarian Pizza', 'Pizza', 'Cheese with mixed vegetable chunks', '10000');
INSERT INTO `mymenu` VALUES ('PZ04', 'Chicken Pizza', 'Pizza', 'Cheese with chicken, union and green pepper', '12000');
INSERT INTO `mymenu` VALUES ('PZ05', 'Beef Pizza', 'Pizza', 'Cheese with beef, onion and green pepper', '12000');
INSERT INTO `mymenu` VALUES ('PZ06', 'Make your own', 'Pizza', 'Choose any topping from our optional/extras list above and add price to this one', '3000');
INSERT INTO `mymenu` VALUES ('ST01', 'Beef samosas', 'Starters', 'Homemade samosas filled with beef, vegetables and spices', '4000');
INSERT INTO `mymenu` VALUES ('ST02', 'Vegetable spring roll', 'Starters', 'Homemade Vegetable spring rolls', '3000');
INSERT INTO `mymenu` VALUES ('ST03', 'Crispy Chicken drumstick ', 'Starters', 'served with garlic mayonnaise sauce', '6000');
INSERT INTO `mymenu` VALUES ('ST04', 'Pork Bites ', 'Starters', 'sautéed with pepper and garlic', '7000');
INSERT INTO `mymenu` VALUES ('ST05', 'Bruchetta', 'Starters', 'open sandwich with tomato, onion and melted cheese', '5500');
INSERT INTO `mymenu` VALUES ('ST06', 'Golden fried fish fingers ', 'Starters', 'served with homemade tartar sauce', '6500');
INSERT INTO `mymenu` VALUES ('ST07', 'Soup of the day ', 'Starters', 'with fresh bread and butter', '5000');
INSERT INTO `mymenu` VALUES ('ST08', 'Chips Mayai ', 'Starters', 'traditional Tanzanian dish.  Chips mixed with eggs', '6000');
INSERT INTO `mymenu` VALUES ('ST09', 'Cheesy Chips ', 'Starters', 'Chips with melted cheese', '6000');
INSERT INTO `mymenu` VALUES ('ST10', 'Chips Masala ', 'Starters', 'Chips with Masala sauce', '5000');
INSERT INTO `mymenu` VALUES ('ST11', 'Vetkoek plain ', 'Starters', 'Vetkoek plain ', '5000');
INSERT INTO `mymenu` VALUES ('ST12', 'Vetkoek and Mince', 'Starters', 'Vetkoek stuffed with seasoned mince meat', '8000');
INSERT INTO `mymenu` VALUES ('SP01', 'Carnivore Platter', 'Sharing Platters', 'Beef Samosas, Chicken Drumsticks and Fish fingers served with homemade sauce and chips', '16000');
INSERT INTO `mymenu` VALUES ('SP02', 'Vegetarian Platter', 'Sharing Platters', 'Vegetable croquette, Spring Rolls and Vegetable Kebabs served with homemade sauce and chips', '14000');
INSERT INTO `mymenu` VALUES ('SP03', 'Tunza Special Platter', 'Sharing Platters', 'Tunza Special Platter\nChicken Drumsticks, Spring Rolls, Fish fingers and Samosas served with homemade sauce and chips\n', '18000');
INSERT INTO `mymenu` VALUES ('SLD01', 'Creamy potato and egg salad ', 'Salads', 'Potato, egg and mayonnaise\n', '4000');
INSERT INTO `mymenu` VALUES ('SLD02', 'Rainbow coleslaw salad ', 'Salads', 'Rainbow coleslaw salad ', '4000');
INSERT INTO `mymenu` VALUES ('SLD03', 'Garden salad ', 'Salads', 'Tomato, onion and cucumber with Tunza salad dressing', '3000');
INSERT INTO `mymenu` VALUES ('SLD04', 'Tunza Special Salad ', 'Salads', 'Potato, green pepper, egg, tomato, union and mayonnaise', '5000');
INSERT INTO `mymenu` VALUES ('SLD05', 'Chicken pasta salad ', 'Salads', 'Chicken, penne pasta, peppers, tomato union and capers tossed lightly in sunflower oil', '10000');
INSERT INTO `mymenu` VALUES ('FSH01', 'Nile Perch Fillet ', 'Fish', 'Fresh Nile perch pan fried or grilled', '9000');
INSERT INTO `mymenu` VALUES ('FSH02', 'Roasted Whole Tilapia ', 'Fish', 'Tilapia made in a special sauce', '15000');
INSERT INTO `mymenu` VALUES ('FSH03', 'Whole Tilapia ', 'Fish', 'Tilapia deep fried or grilled', '15000');
INSERT INTO `mymenu` VALUES ('FSH04', 'Fish Curry ', 'Fish', 'Nile perch pieces cooked in a Masala curry sauce', '12000');
INSERT INTO `mymenu` VALUES ('FSH05', 'Coconut Fish ', 'Fish', 'Nile perch pieces cooked in Zanzibar Spice with coconut sauce', '12000');
INSERT INTO `mymenu` VALUES ('TSND01', 'Beef ', 'Toasted Sandwiches', 'Beef ', '6000');
INSERT INTO `mymenu` VALUES ('TSND02', 'Tomato & Onion ', 'Toasted Sandwiches', 'Tomato & Onion ', '2500');
INSERT INTO `mymenu` VALUES ('TSND03', 'Cheese, Tomato and Onion  ', 'Toasted Sandwiches', 'Cheese, Tomato and Onion ', '3000');
INSERT INTO `mymenu` VALUES ('TSND04', 'Chicken and Mayonnaise', 'Toasted Sandwiches', 'Chicken and Mayonnaise', '7000');
INSERT INTO `mymenu` VALUES ('TSND05', 'Bacon and mushroom', 'Toasted Sandwiches', 'Bacon and mushroom', '7000');
INSERT INTO `mymenu` VALUES ('BGR01', 'Vegetable burger ', 'Burgers', 'Vegetable burger patty with lettuce, tomato and union', '10000');
INSERT INTO `mymenu` VALUES ('BGR02', 'Beef burger ', 'Burgers', 'beef burger patty with lettuce, tomato and onion', '13000');
INSERT INTO `mymenu` VALUES ('BGR03', 'Chicken Hawaiian burger ', 'Burgers', 'chicken with lettuce, tomato, onion and pineapple', '13000');
INSERT INTO `mymenu` VALUES ('BGR04', 'Hot Dog ', 'Burgers', 'Hot dog bun with beef sausage', '4000');
INSERT INTO `mymenu` VALUES ('BGE01', 'Burger Cheese', 'Burger Extras', 'Cheese', '2000');
INSERT INTO `mymenu` VALUES ('BGE02', 'Burger Bacon', 'Burger Extras', 'Burger Bacon', '3000');
INSERT INTO `mymenu` VALUES ('BGE03', 'Burger Egg', 'Burger Extras', 'Burger Egg', '1000');
INSERT INTO `mymenu` VALUES ('BGE04', 'Burger Pineapple', 'Burger Extras', 'Burger Pineapple', '500');
INSERT INTO `mymenu` VALUES ('BGE05', 'Burger Mushrooms', 'Burger Extras', 'Burger Mushrooms', '2000');
INSERT INTO `mymenu` VALUES ('BF01', 'Fillet Steak ', 'Beef', 'Cooked to your liking', '13000');
INSERT INTO `mymenu` VALUES ('BF02', 'Mishkaki ', 'Beef', 'Beef fillet and vegetable skewers grilled over charcoal', '12000');
INSERT INTO `mymenu` VALUES ('BF03', 'Beef Escalope ', 'Beef', 'fillet Steak cooked in seasoned breadcrumbs', '15000');
INSERT INTO `mymenu` VALUES ('BF04', 'Sheppard’s Pie ', 'Beef', 'Traditional English minced beef pie topped with mashed potato and melted cheese', '9000');
INSERT INTO `mymenu` VALUES ('BF05', 'Beef Stew ', 'Beef', 'Beef and vegetables cooked in spicy sauce ', '15000');
INSERT INTO `mymenu` VALUES ('BF06', 'Sauces', 'Beef', 'Pepper, Mushroom, Garlic, Tomato, Pili pili or Coconut', '2000');
INSERT INTO `mymenu` VALUES ('PRK01', 'Pork Chops', 'Pork', 'Pork Chops', '13000');
INSERT INTO `mymenu` VALUES ('PRK02', 'Pork Ribs', 'Pork', 'Pork Ribs', '13000');
INSERT INTO `mymenu` VALUES ('PRK03', 'Roasted Pork', 'Pork', 'Roasted Pork', '13000');
INSERT INTO `mymenu` VALUES ('PRK04', 'Pork Sauces', 'Pork', 'Pepper, Mushroom, Garlic, Tomato, Pili pili or Coconut', '2000');
INSERT INTO `mymenu` VALUES ('CHK01', 'Chicken Thai ', 'Chicken', 'Chicken chunks cooked in a spice Thai sauce', '15000');
INSERT INTO `mymenu` VALUES ('CHK02', 'Chicken Curry ', 'Chicken', 'Boneless chicken pieces cooked in Masala curry', '15000');
INSERT INTO `mymenu` VALUES ('CHK03', 'White wine Chicken ', 'Chicken', 'Chicken breast served in a creamy white wine sauce', '15000');
INSERT INTO `mymenu` VALUES ('CHK04', 'Crispy fried chicken ', 'Chicken', 'juicy chicken pieces fried until crispy', '13000');
INSERT INTO `mymenu` VALUES ('CHK05', 'Chicken Pili pili ', 'Chicken', 'Chicken pieces cooked in pili pili sauce', '15000');
INSERT INTO `mymenu` VALUES ('CHK06', 'Chicken Kiev ', 'Chicken', 'Chicken breast stuffed with spinach and garlic butter', '15000');
INSERT INTO `mymenu` VALUES ('CHK07', 'Chicken Sauces', 'Chicken', 'Pepper, Mushroom, Garlic, Tomato, Pili pili or Coconut', '2000');
INSERT INTO `mymenu` VALUES ('VGTR01', 'Vegetable and egg Masala curry', 'Vegetarian', 'Vegetable and egg Masala curry', '8000');
INSERT INTO `mymenu` VALUES ('VGTR02', 'Thai Vegetables ', 'Vegetarian', 'seasonal vegetables cooked in a spicy Thai sauce', '8000');
INSERT INTO `mymenu` VALUES ('VGTR03', 'Vegetable Kebabs ', 'Vegetarian', 'Battered vegetable skewers flash fried and then grilled over charcoal', '9000');
INSERT INTO `mymenu` VALUES ('VGTR04', 'Vegetarian Sauces', 'Vegetarian', 'Pepper, Mushroom, Garlic, Tomato, Pili pili or Coconut', '2000');
INSERT INTO `mymenu` VALUES ('PST01', 'Bolognaise', 'Pasta', 'Traditional beef mince, tomato and red wine sauce', '15000');
INSERT INTO `mymenu` VALUES ('PST02', 'Carbonara', 'Pasta', 'creamy egg and bacon sauce', '12000');
INSERT INTO `mymenu` VALUES ('PST03', 'Napolitano', 'Pasta', 'seasoned tomato and vegetable sauce', '8000');
INSERT INTO `mymenu` VALUES ('PST04', 'Ochu ala penne ', 'Pasta', 'cheesy oregano white sauce', '12000');
INSERT INTO `mymenu` VALUES ('PST05', 'Beef Lasagne ', 'Pasta', 'layers of minced beef, white sauce and pasta topped with cheese', '16000');
INSERT INTO `mymenu` VALUES ('PST06', 'Vegetable Lasagne ', 'Pasta', 'Layers of seasoned vegetables with with sauce and paste, topped with cheese', '13000');
INSERT INTO `mymenu` VALUES ('DSRTS01', 'Ice Cream ', 'Desserts', '3 scoops of Vanilla Ice Cream with chocolate or strawberry topping', '5000');
INSERT INTO `mymenu` VALUES ('DSRTS02', 'Fruit Salad ', 'Desserts', 'mixed fruit ', '3000');
INSERT INTO `mymenu` VALUES ('DSRTS03', 'Crepes Suzette ', 'Desserts', 'with fruit salad, ice cream, lemon or honey', '4000');
INSERT INTO `mymenu` VALUES ('DSRTS04', 'Fruit salad with ice cream', 'Desserts', 'Fruit salad with ice cream', '5000');
INSERT INTO `mymenu` VALUES ('DSRTS05', 'Pancakes', 'Desserts', '3 Pancakes sprinkled with cinnamon and sugar', '3000');
INSERT INTO `mymenu` VALUES ('TGDY00', 'Info', 'Tunza Grill – Do It Yourself', 'Braai packs available to grill yourself.\nChoose your spot on the beach or in our garden, ask your waiter for a barbeque\nSelect from our meat/fish selection and accompany it with your choice of salads and sauces \n', '0');
INSERT INTO `mymenu` VALUES ('MSE01', 'Fillet Steak', 'Meat Selection ( price per 100g)', 'Fillet Steak', '0');
INSERT INTO `mymenu` VALUES ('MSE02', 'Mishkaki (ea)', 'Meat Selection ( price per 100g)', 'Mishkaki (ea)', '0');
INSERT INTO `mymenu` VALUES ('MSE03', 'Vegetable Kebab (ea)', 'Meat Selection ( price per 100g)', 'Vegetable Kebab (ea)', '0');
INSERT INTO `mymenu` VALUES ('MSE04', 'Pork chops', 'Meat Selection ( price per 100g)', 'Pork chops', '0');
INSERT INTO `mymenu` VALUES ('MSE05', 'Chicken', 'Meat Selection ( price per 100g)', 'Chicken', '0');
INSERT INTO `mymenu` VALUES ('MSE06', 'Whole Tilapia', 'Meat Selection ( price per 100g)', 'Whole Tilapia', '0');
INSERT INTO `mymenu` VALUES ('ACMP01', 'Garden Salad', 'Accompaniments', 'Garden Salad', '3000');
INSERT INTO `mymenu` VALUES ('ACMP02', 'Tunza Special Salad', 'Accompaniments', 'Tunza Special Salad', '3000');
INSERT INTO `mymenu` VALUES ('ACMP03', 'Ugali', 'Accompaniments', 'Ugali', '3000');
INSERT INTO `mymenu` VALUES ('ACMP04', 'South African “pap” ', 'Accompaniments', 'South African “pap” ', '3000');
INSERT INTO `mymenu` VALUES ('ACMP05', 'Vegetable boiled rice', 'Accompaniments', 'Vegetable boiled rice', '3000');
INSERT INTO `mymenu` VALUES ('SCS01', 'Pepper sauce', 'Sauces', 'Pepper sauce', '2000');
INSERT INTO `mymenu` VALUES ('SCS02', 'Sheba sauce ', 'Sauces', 'tomato, onion and green pepper sauce', '2000');

-- --------------------------------------------------------

-- 
-- Table structure for table `received_order`
-- 

CREATE TABLE `received_order` (
  `tbl` varchar(100) NOT NULL,
  `category` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `qty` int(100) NOT NULL,
  `unit` varchar(100) NOT NULL,
  `designation` varchar(100) NOT NULL,
  `total` int(100) NOT NULL,
  `date_received` date NOT NULL,
  `order_status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `received_order`
-- 

INSERT INTO `received_order` VALUES ('02', 'beer', 'tusker', 2, 'bottle', 'bar', 10000, '2013-08-01', 'Paid');

-- --------------------------------------------------------

-- 
-- Table structure for table `reservation_tbl`
-- 

CREATE TABLE `reservation_tbl` (
  `Name` varchar(50) default NULL,
  `LastName` varchar(50) default NULL,
  `Gender` varchar(255) default NULL,
  `Address` varchar(255) default NULL,
  `Res_Date` date default NULL,
  `Room_type` varchar(255) default NULL,
  `Room_num` varchar(50) default NULL,
  `Age` varchar(200) NOT NULL,
  `Occupation` varchar(200) NOT NULL,
  `Email` varchar(200) NOT NULL,
  `nt` varchar(255) NOT NULL,
  `ps` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table `reservation_tbl`
-- 

INSERT INTO `reservation_tbl` VALUES ('Aidan', 'Wambura', 'Male', '311 Geita', '2013-09-26', 'Single', '02', '23', 'Architect', 'aidan@gmail.com', 'Tanzania', 'AB56788');

-- --------------------------------------------------------

-- 
-- Table structure for table `room`
-- 

CREATE TABLE `room` (
  `Room_Num` varchar(255) NOT NULL,
  `Stat` varchar(50) default NULL,
  `type` varchar(50) default NULL,
  PRIMARY KEY  (`Room_Num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table `room`
-- 

INSERT INTO `room` VALUES ('01', 'Occupied', 'Single');
INSERT INTO `room` VALUES ('02', 'Vacant', 'Single');
INSERT INTO `room` VALUES ('03', 'Vacant', 'Single');
INSERT INTO `room` VALUES ('04', 'Vacant', 'Single');
INSERT INTO `room` VALUES ('05', 'Vacant', 'Double');
INSERT INTO `room` VALUES ('06', 'Vacant', 'Double');
INSERT INTO `room` VALUES ('07', 'Vacant', 'Double');
INSERT INTO `room` VALUES ('08', 'Vacant', 'Double');
INSERT INTO `room` VALUES ('09', 'Vacant', 'Camping');
INSERT INTO `room` VALUES ('10', 'Vacant', 'Camping');
INSERT INTO `room` VALUES ('11', 'Vacant', 'Camping');
INSERT INTO `room` VALUES ('12', 'Vacant', 'Camping');

-- --------------------------------------------------------

-- 
-- Table structure for table `room_bar_bill_arch`
-- 

CREATE TABLE `room_bar_bill_arch` (
  `Room_no` varchar(100) NOT NULL,
  `Cus_name` varchar(255) NOT NULL,
  `Category` varchar(255) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `qty` int(100) NOT NULL,
  `unit` varchar(100) NOT NULL,
  `desig` varchar(100) NOT NULL,
  `status` varchar(100) NOT NULL,
  `user` varchar(150) NOT NULL,
  `date_added` date NOT NULL,
  `amount` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `room_bar_bill_arch`
-- 

INSERT INTO `room_bar_bill_arch` VALUES ('02', 'Mwita-Nyamhanga', 'Breakfast', 'Simple Simon', 10, 'food', 'Kitchen', 'Paid', 'mimi', '2013-07-02', 50000);
INSERT INTO `room_bar_bill_arch` VALUES ('02', 'Mwita-Nyamhanga', 'Breakfast', 'Simple Simon', 10, 'food', 'Kitchen', 'Paid', 'mimi', '2013-07-02', 50000);
INSERT INTO `room_bar_bill_arch` VALUES ('02', 'Mwita-Nyamhanga', 'Other Bills', 'Taxi', 0, 'Null', 'Other Bill', 'Paid', 'mimi', '2013-07-02', 50000);
INSERT INTO `room_bar_bill_arch` VALUES ('02', 'Mwita-Nyamhanga', 'WINE ', 'RRed Wine BtI. ', 5, 'Glass', 'Bar', 'Paid', 'mimi', '2013-07-02', 40000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Aidan-Nyamhanga', 'Pizza', 'Chicken Pizza', 7, 'food', 'Kitchen', 'Paid', 'mimi', '2013-07-07', 84000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Aidan-Nyamhanga', 'Salads', 'Creamy potato and egg salad ', 7, 'food', 'Kitchen', 'Paid', 'mimi', '2013-07-07', 28000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Aidan-Nyamhanga', 'Pizza', 'Cheese Pizza', 3, 'food', 'Kitchen', 'Paid', 'mimi', '2013-07-07', 15000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Cheese Pizza-Nyamhanga', 'Pizza', 'Cheese Pizza', 3, 'food', 'Kitchen', 'Paid', 'mimi', '2013-07-07', 15000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Beef samosas-Nyamhanga', 'Starters', 'Beef samosas', 5, 'food', 'Kitchen', 'Outstanding', 'mimi', '2013-07-07', 20000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Cheese Pizza-Nyamhanga', 'Pizza', 'Cheese Pizza', 3, 'food', 'Kitchen', 'Paid', 'mimi', '2013-07-07', 15000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Beef samosas-Nyamhanga', 'Starters', 'Beef samosas', 5, 'food', 'Kitchen', 'Outstanding', 'mimi', '2013-07-07', 20000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Taxi-Nyamhanga', 'Other Bills', 'Taxi', 0, '0', 'Other Bill', 'Paid', 'mimi', '2013-07-07', 5000);
INSERT INTO `room_bar_bill_arch` VALUES ('12', 'Beef samosas-John', 'Starters', 'Beef samosas', 1, 'food', 'Kitchen', 'Outstanding', 'mimi', '2013-07-08', 4000);
INSERT INTO `room_bar_bill_arch` VALUES ('12', 'Simple Simon-John', 'Breakfast', 'Simple Simon', 4, 'food', 'Kitchen', 'Outstanding', 'mimi', '2013-07-08', 20000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Aidan-Nyamhanga', 'Fish', 'Whole Tilapia ', 5, 'food', 'Kitchen', 'Paid', 'mimi', '2013-07-13', 75000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Creamy potato and egg salad -Nyamhanga', 'Salads', 'Creamy potato and egg salad ', 10, 'food', 'Kitchen', 'Outstanding', 'mimi', '2013-07-13', 40000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Aidan-Nyamhanga', 'Chicken', 'White wine Chicken ', 4, 'food', 'Kitchen', 'Paid', 'mimi', '2013-07-14', 60000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Aidan-Nyamhanga', 'Other Bills', 'Room Service', 0, 'Other Bills', 'Other Bills', 'Paid', 'Aidan', '2013-07-21', 2000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Aidan-Nyamhanga', 'Other Bills', 'Room Service', 0, 'Other Bills', 'Other Bills', 'Paid', 'Aidan', '2013-07-21', 2000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Aidan-Nyamhanga', 'Other Bills', 'Room Service', 0, 'Other Bills', 'Other Bills', 'Paid', 'Aidan', '2013-07-21', 2000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Aidan-Nyamhanga', 'Other Bills', 'Room Service', 0, 'Other Bills', 'Other Bills', 'Paid', 'Aidan', '2013-07-21', 2000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Aidan-Nyamhanga', 'Other Bills', 'Room Service', 0, 'Other Bills', 'Other Bills', 'Paid', 'Aidan', '2013-07-21', 2000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Aidan-Nyamhanga', 'Other Bills', 'Room Service', 0, 'Other Bills', 'Other Bills', 'Paid', 'Aidan', '2013-07-21', 2000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Aidan-Nyamhanga', 'Other Bills', 'Room Service', 0, 'Other Bills', 'Other Bills', 'Paid', 'Aidan', '2013-07-21', 2000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Aidan-Nyamhanga', 'Other Bills', 'Room Service', 0, 'Other Bills', 'Other Bills', 'Paid', 'Aidan', '2013-07-21', 2000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Aidan-Nyamhanga', 'Other Bills', 'Room Service', 0, 'Other Bills', 'Other Bills', 'Paid', 'Aidan', '2013-07-21', 2000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Aidan-Nyamhanga', 'Other Bills', 'Room Service', 0, 'Other Bills', 'Other Bills', 'Paid', 'Aidan', '2013-07-21', 2000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Aidan-Nyamhanga', 'Other Bills', 'Room Service', 0, 'Other Bills', 'Other Bills', 'Paid', 'Aidan', '2013-07-21', 2000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Aidan-Nyamhanga', 'WINE ', 'Red Wine 51t. ', 2, 'Bottle', 'Bar', 'Outstanding', 'Aidan Nyamhanga', '2013-07-21', 30000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Aidan-Nyamhanga', 'BEERS ', 'Guinness Malt ', 4, 'Bottle', 'Bar', 'Outstanding', 'Aidan Nyamhanga', '2013-07-21', 10000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Aidan-Nyamhanga', 'BEERS ', 'Guinness Malt ', 2, 'Bottle', 'Bar', 'Outstanding', 'Aidan Nyamhanga', '2013-07-21', 5000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Aidan-Nyamhanga', 'BEERS ', 'Guinness Malt ', 3, 'Bottle', 'Bar', 'Outstanding', 'Aidan Nyamhanga', '2013-07-21', 7500);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Aidan-Nyamhanga', 'BEERS ', 'Guinness Malt ', 2, 'Bottle', 'Bar', 'Outstanding', 'Aidan Nyamhanga', '2013-07-21', 5000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Aidan-Nyamhanga', 'Other Bills', 'Taxi', 0, 'Other Bills', 'Other Bills', 'Outstanding', 'Aidan Nyamhanga', '2013-07-21', 3000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Aidan-Nyamhanga', 'Breakfast', 'Simple Simon', 2, 'Food', 'Kitchen', 'Outstanding', 'Aidan Nyamhanga', '2013-07-21', 10000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Aidan-Nyamhanga', 'Other Bills', 'Massage', 0, 'Other Bills', 'Other Bills', 'Paid', 'Aidan Nyamhanga', '2013-08-09', 2000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Aidan-Nyamhanga', 'Pizza', 'Cheese Pizza', 1, 'Food', 'Kitchen', 'Paid', 'Aidan Nyamhanga', '2013-08-09', 5000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Aidan-Nyamhanga', 'Optional / Extras', 'Egg', 1, 'Food', 'Kitchen', 'Paid', 'Aidan Nyamhanga', '2013-08-17', 1000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Aidan-Nyamhanga', 'GIN & VODKA ', 'Beefeater Gin ', 1, 'Bottle', 'Bar', 'Outstanding', 'Aidan Nyamhanga', '2013-09-07', 2000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Aidan-Nyamhanga', 'Breakfast', 'Simple Simon', 2, 'Food', 'Kitchen', 'Paid', 'Aidan Nyamhanga', '2013-09-24', 10000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Aidan-Nyamhanga', 'Breakfast', 'Simple Simon', 2, 'Food', 'Kitchen', 'Paid', 'Aidan Nyamhanga', '2013-09-24', 10000);
INSERT INTO `room_bar_bill_arch` VALUES ('01', 'Aidan-Nyamhanga', 'Other Bills', 'Laundry', 0, 'Other Bills', 'Other Bills', 'Paid', 'Aidan Nyamhanga', '2013-09-24', 2000);

-- --------------------------------------------------------

-- 
-- Table structure for table `room_price`
-- 

CREATE TABLE `room_price` (
  `type` varchar(255) NOT NULL,
  `price` int(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `room_price`
-- 

INSERT INTO `room_price` VALUES ('single', 50000);
INSERT INTO `room_price` VALUES ('double', 70000);
INSERT INTO `room_price` VALUES ('camping', 90000);

-- --------------------------------------------------------

-- 
-- Table structure for table `stock_input`
-- 

CREATE TABLE `stock_input` (
  `sid` varchar(30) NOT NULL,
  `sname` varchar(255) default NULL,
  `scategory` varchar(255) default NULL,
  `squantity` varchar(30) default NULL,
  `sunit` varchar(20) default NULL,
  `buying_price` varchar(30) default NULL,
  `selling_price` varchar(30) default NULL,
  `other_costs` varchar(30) default NULL,
  `date_added` date default NULL,
  PRIMARY KEY  (`sid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table `stock_input`
-- 

INSERT INTO `stock_input` VALUES ('D01', 'Aromat ', 'DRY GOODS', '10', '', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D02', 'Baked Beans ', 'DRY GOODS', '0', 'Tin', '1000', '2000', '500', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D03', 'Baking Flour ', 'DRY GOODS', '0', 'Kg', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D04', 'Baking Powder ', 'DRY GOODS', '0', 'Pkt', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D05', 'Bamboo ', 'DRY GOODS', '0', 'Pkt', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D06', 'Bay Leaves ', 'DRY GOODS', '0', 'Tin', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D07', 'BBQ Spice ', 'DRY GOODS', '0', 'Btl', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D08', 'Beef Cubes ', 'DRY GOODS', '0', 'Pkt', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D09', 'Beef Masala ', 'DRY GOODS', '0', 'Ea', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D10', 'Bicarbonate of Soda ', 'DRY GOODS', '0', 'Pkt', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D11', 'Black Pepper ', 'DRY GOODS', '0', 'Kg', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D12', 'Cashew nuts ', 'DRY GOODS', '0', 'Kg', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D13', 'Celery ', 'DRY GOODS', '0', 'Ea', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D14', 'Chicken Cubes ', 'DRY GOODS', '0', 'Pkt', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D15', 'Chicken Masala ', 'DRY GOODS', '0', 'Pkt', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D16', 'Chilli sauce ', 'DRY GOODS', '0', 'Box', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D17', 'Chilli tins ', 'DRY GOODS', '0', 'Tin', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D18', 'Chocolate sauce ', 'DRY GOODS', '0', 'Btl', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D19', 'Cinnamon ', 'DRY GOODS', '0', 'Btl', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D20', 'Coconut Milk 250g ', 'DRY GOODS', '0', 'Pkt', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D21', 'Cooking oil ', 'DRY GOODS', '0', 'Lt', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D22', 'Cumin Seeds ', 'DRY GOODS', '0', 'Tin', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D23', 'Curry Powder big ', 'DRY GOODS', '0', 'Pkt', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D24', 'Custard Powder ', 'DRY GOODS', '0', 'Tin', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D25', 'Fish Masala ', 'DRY GOODS', '0', 'Btl', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D26', 'Foil ', 'DRY GOODS', '0', 'Ea', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D27', 'Gas ', 'DRY GOODS', '0', 'cyl', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D28', 'Jam Apricot ', 'DRY GOODS', '0', 'Tin', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D29', 'Jam Mix ', 'DRY GOODS', '0', 'Tin', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D30', 'Jam Other ', 'DRY GOODS', '0', 'Tin', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D31', 'Knives ', 'DRY GOODS', '0', 'Ea', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D32', 'Macaroni ', 'DRY GOODS', '0', 'Pkt', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D33', 'Masala  Spice ', 'DRY GOODS', '0', 'Tin', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D34', 'Mayonnaise ', 'DRY GOODS', '0', 'Btl', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D35', 'Milk boxes ', 'DRY GOODS', '0', 'Box', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D36', 'Mixed Herbs ', 'DRY GOODS', '0', 'Tin', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D37', 'Mixed Spices ', 'DRY GOODS', '0', 'Tin', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('D38', 'Mushrooms ', 'DRY GOODS', '0', 'Tin', '0', '0', '0', '2013-04-05');
INSERT INTO `stock_input` VALUES ('RUM01', 'Bacardi Black ', 'RUM ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('RUM02', 'Bacardi White ', 'RUM ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('RUM03', 'Captain Morgan Dark ', 'RUM ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('RUM04', 'Captain Morgan Spice Gold ', 'RUM ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('RUM05', 'MobyDick ', 'RUM ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('RUM06', 'Archers ', 'RUM ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('RUM07', 'Lime Juice ', 'RUM ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('WHISK01', 'Ballantines ', 'WHISKEY ', '110', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('WHISK02', 'Bells ', 'WHISKEY ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('WHISK03', 'Chivas Regal  ', 'WHISKEY ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('WHISK04', 'Famous Grouse ', 'WHISKEY ', '0', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('WHISK05', 'Glendower ', 'WHISKEY ', '9', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('WHISK06', 'Glenfiddich ', 'WHISKEY ', '6', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('WHISK07', 'Grants ', 'WHISKEY ', '3', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('WHISK08', 'J & B ', 'WHISKEY ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('WHISK09', 'Jack Daniels ', 'WHISKEY ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('WHISK10', 'Jameson ', 'WHISKEY ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('WHISK11', 'Johnnie Walker Black ', 'WHISKEY ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('WHISK12', 'Johnnie Walker Red ', 'WHISKEY ', '2', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('WHISK13', 'Southern Comfort ', 'WHISKEY ', '7', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('WHISK14', 'Teachers ', 'WHISKEY ', '2', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('WHISK15', 'Vat 69  ', 'WHISKEY ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('WHISK16', 'Jim Bean ', 'WHISKEY ', '0', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('WHISK17', 'Clan McGregor ', 'WHISKEY ', '2', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('BRAND01', 'Convoisier ', 'BRANDY ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('BRAND02', 'Henessy Cognac ', 'BRANDY ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('BRAND03', 'Klipdrift ', 'BRANDY ', '1', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('BRAND04', 'Martel Cognac ', 'BRANDY ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('BRAND05', 'Mellowood ', 'BRANDY ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('BRAND06', 'Napolean Brandy ', 'BRANDY ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('BRAND07', 'Viceroy ', 'BRANDY ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('BRAND08', 'Van Der Hum ', 'BRANDY ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('OTHR01', 'Campari ', 'Other ', '3', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('OTHR02', 'Cinzano Bianco ', 'Other ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('OTHR03', 'Cinzano Rosso ', 'Other ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('OTHR04', 'Konyagi small ', 'Other ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('OTHR05', 'Konyagi 500ml ', 'Other ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('OTHR06', 'Konyagi per tot ', 'Other ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('OTHR07', 'Martini Bianco ', 'Other ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('OTHR08', 'Martini Rosso ', 'Other ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('OTHR09', 'Pernod ', 'Other ', '9', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('OTHR10', 'Ricard ', 'Other ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('OTHR11', 'Sherry cream ', 'Other ', '4', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('OTHR12', 'Grappa ', 'Other ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('WN01', 'Red Wine 51t. ', 'WINE ', '0', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('WN02', 'RRed Wine BtI. ', 'WINE ', '0', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('WN03', 'White Wine 51t ', 'WINE ', '6', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('WN04', 'White Wine BtI. ', 'WINE ', '1', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('WN05', 'Champaigne ', 'WINE ', '7', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('LQQ01', 'Afri Koko ', 'LIQUERS ', '0', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('LQQ02', 'Amarula ', 'LIQUERS ', '0', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('LQQ03', 'Baileys ', 'LIQUERS ', '3', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('LQQ04', 'Bertrams ', 'LIQUERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('LQQ05', 'Bols Banana ', 'LIQUERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('LQQ06', 'Bols Cherry ', 'LIQUERS ', '110', '', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('LQQ07', 'Bols Peppermint ', 'LIQUERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('LQQ08', 'Bols Strawberry ', 'LIQUERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('LQQ09', 'Camino Tequila White ', 'LIQUERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('LQQ10', 'Chocolate Temptation ', 'LIQUERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('LQQ11', 'Cointreau ', 'LIQUERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('LQQ12', 'Corolans Irish Cream Sherry ', 'LIQUERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('LQQ13', 'Curacao ', 'LIQUERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('LQQ14', 'Grenadine ', 'LIQUERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('LQQ15', 'Kahlua ', 'LIQUERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('LQQ16', 'Kenya Gold ', 'LIQUERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('LQQ17', 'Malibu ', 'LIQUERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('LQQ18', 'Nordic Ice mint ', 'LIQUERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('LQQ19', 'Sauza Tequilla ', 'LIQUERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('LQQ20', 'Sierra Tequilla ', 'LIQUERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('LQQ21', 'Agavita Tequilla ', 'LIQUERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('LQQ22', 'Tia Maria ', 'LIQUERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('LQQ23', 'Zappa Sambucca ', 'LIQUERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('LQQ24', 'Zappa Black ', 'LIQUERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('LQQ25', 'Zappa Blue ', 'LIQUERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('LQQ27', 'Zappa Red ', 'LIQUERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('LQQ28', 'Zappa White ', 'LIQUERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('LQQ29', 'Zappa Green ', 'LIQUERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('LQQ30', 'Original Tempation ', 'LIQUERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('LQQ31', 'Caramel Temptation ', 'LIQUERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('GGV01', 'Absolute Vodka ', 'GIN & VODKA ', '7', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('GGV02', 'Absolute Vanilla ', 'GIN & VODKA ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('GGV03', 'Beefeater Gin ', 'GIN & VODKA ', '0', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('GGV04', 'Bombay Gin ', 'GIN & VODKA ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('GGV05', 'Consulate Gin ', 'GIN & VODKA ', '7', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('GGV06', ' Pushkins Vodka ', 'GIN & VODKA ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('GGV07', 'Gordons Gin ', 'GIN & VODKA ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('GGV09', 'Smirnoff Vodka ', 'GIN & VODKA ', '6', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('GGV10', 'Harvey`s Cream ', 'GIN & VODKA ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('BEER01', 'Balimi ', 'BEERS ', '0', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('BEER02', 'Castle', 'BEERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('BEER03', 'Castle Can', 'BEERS ', '10', '', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('BEER04', 'Castle Milk Stout ', 'BEERS ', '10', '', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('BEER05', 'Guinness Malt ', 'BEERS ', '8', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('BEER06', 'Heineken ', 'BEERS ', '0', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('BEER07', 'Kilimanjaro ', 'BEERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('BEER08', 'Kilimanjaro cans ', 'BEERS ', '10', '', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('BEER09', 'Millers ', 'BEERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('BEER10', 'Ndovu ', 'BEERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('BEER11', 'Ndovu cans ', 'BEERS ', '10', '', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('BEER12', 'Redds ', 'BEERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('BEER13', 'Redds cans ', 'BEERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('BEER14', 'Safari', 'BEERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('BEER15', 'Savanna Dry ', 'BEERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('BEER16', 'Savanna Light ', 'BEERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('BEER17', 'Serengeti Large ', 'BEERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('BEER18', 'Serengeti Small ', 'BEERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('BEER19', 'Stella Artois Large ', 'BEERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('BEER20', 'Tusker ', 'BEERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('BEER21', 'Windoek Dry ', 'BEERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('BEER22', 'Windoek Light ', 'BEERS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('SFT01', 'Angustura bitters ', 'SOFT DRINKS ', '10', '', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('SFT02', 'Bavaria Apple ', 'SOFT DRINKS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('SFT03', 'Bavaria Other ', 'SOFT DRINKS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('SFT04', 'Bavaria cans  ', 'SOFT DRINKS ', '10', '', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('SFT05', 'Coke can ', 'SOFT DRINKS ', '0', '', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('SFT06', 'Coke ', 'SOFT DRINKS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('SFT07', 'Coke Light can ', 'SOFT DRINKS ', '4', '', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('SFT08', 'Coke Light ', 'SOFT DRINKS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('SFT09', 'Fanta Orange ', 'SOFT DRINKS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('SFT10', 'Pineapple ', 'SOFT DRINKS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('SFT11', 'Fanta Black Current ', 'SOFT DRINKS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('SFT12', 'Passion ', 'SOFT DRINKS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('SFT13', 'Stoney ', 'SOFT DRINKS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('SFT14', 'Sprite ', 'SOFT DRINKS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('SFT15', 'Guiness Malt cans ', 'SOFT DRINKS ', '5', '', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('SFT16', 'Guiness Malt large cans  ', 'SOFT DRINKS ', '10', '', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('SFT17', 'Red Bull Energy Drink ', 'SOFT DRINKS ', '10', '', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('SFT18', 'Burn energy Drink ', 'SOFT DRINKS ', '10', '', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('SFT19', 'Dasani large ', 'SOFT DRINKS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('SFT20', 'Dasani Small ', 'SOFT DRINKS ', '110', '', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('SFT21', 'Water  ', 'SOFT DRINKS ', '10', 'Btl', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('CG01', 'Benson & Hedges Filter ', 'CIGARETTES ', '7', 'Pkt', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('CG02', 'Benson & Hedges Light ', 'CIGARETTES ', '10', 'Pkt', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('CG03', 'Camel Filter ', 'CIGARETTES ', '10', 'Pkt', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('CG04', 'Camel Light ', 'CIGARETTES ', '10', 'Pkt', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('CG05', 'Dunhill Filter ', 'CIGARETTES ', '10', 'Pkt', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('CG06', 'Dunhill Light ', 'CIGARETTES ', '7', 'Pkt', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('CG07', 'Embassy Kings ', 'CIGARETTES ', '10', 'Pkt', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('CG08', 'Embassy Light ', 'CIGARETTES ', '10', 'Pkt', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('CG09', 'Sportsman ', 'CIGARETTES ', '10', 'Pkt', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('CG10', 'Sweet Menthol ', 'CIGARETTES ', '10', 'Pkt', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('CG11', 'Marlboro filter ', 'CIGARETTES ', '10', 'Pkt', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('CG12', 'Marlboro Light ', 'CIGARETTES ', '10', 'Pkt', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('CG13', 'Iceberg ', 'CIGARETTES ', '10', 'Pkt', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('SWT01', 'Bounty chocolate ', 'SWEETS ', '0', '', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('SWT02', 'Kitkat chocolate ', 'SWEETS ', '10', '', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('SWT03', 'Mars chocolate ', 'SWEETS ', '10', '', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('SWT04', 'Snickers chocolate ', 'SWEETS ', '10', '', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('SWT05', 'Twix chocolate ', 'SWEETS ', '10', '', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('SWT06', 'Peanuts ', 'SWEETS ', '10', '', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('SWT07', 'Biltong ', 'SWEETS ', '2', '', '0', '0', '0', '2013-04-09');
INSERT INTO `stock_input` VALUES ('D39', 'Mustard Powder ', 'DRY GOODS', '0', 'Pkt', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D40', 'Mustard Sauce ', 'DRY GOODS', '0', 'Btl', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D41', 'Nesquik ', 'DRY GOODS', '0', 'Btl', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D42', 'Noodles ', 'DRY GOODS', '0', 'Pkt', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D43', 'Oregano ', 'DRY GOODS', '0', 'g', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D44', 'Parsley ', 'DRY GOODS', '0', 'Bns', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D45', 'Penne ', 'DRY GOODS', '0', 'Box', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D46', 'Rice ', 'DRY GOODS', '0', 'Kg', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D47', 'Rosemary ', 'DRY GOODS', '0', 'Tin', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D48', 'Salt (24pc) small ', 'DRY GOODS', '0', 'Pkt', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D49', 'Soup brown onion ', 'DRY GOODS', '0', 'Pkt', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D50', 'Soup w/ onion, veg, mushroom ', 'DRY GOODS', '0', 'Pkt', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D51', 'Soya sauce ', 'DRY GOODS', '0', 'Btl', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D52', 'Spaghetti ', 'DRY GOODS', '0', 'Box', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D53', 'Spanish paprika ', 'DRY GOODS', '0', 'Btl', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D54', 'Sugar brown ', 'DRY GOODS', '0', 'Kg', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D55', 'Sugar white ', 'DRY GOODS', '0', 'Pkt', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D56', 'Sunflower ', 'DRY GOODS', '0', 'Lt', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D57', 'Tabasco sauce ', 'DRY GOODS', '0', 'Btl', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D58', 'Take away box ', 'DRY GOODS', '0', 'Ea', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D59', 'Tea bags ', 'DRY GOODS', '0', 'Pkt', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D60', 'Tea leaves - staff ', 'DRY GOODS', '0', 'Bag', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D61', 'Tea masala ', 'DRY GOODS', '0', 'Btl', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D62', 'Tomato paste ', 'DRY GOODS', '0', 'Bag', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D63', 'Tomato sauce Allgold ', 'DRY GOODS', '0', 'Btl', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D64', 'Towel Kitchen ', 'DRY GOODS', '0', 'Pcptin', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D65', 'Tumeric ', 'DRY GOODS', '0', 'Btl', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D66', 'Ugali ', 'DRY GOODS', '0', 'Kg', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D67', 'Vegetable Stock ', 'DRY GOODS', '0', 'cube', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D68', 'Vinegar ', 'DRY GOODS', '0', 'Btl', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D69', 'White pepper ', 'DRY GOODS', '0', 'Btl', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D70', 'Worcester sauce ', 'DRY GOODS', '0', 'Btl', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D71', 'Wrapping Foil ', 'DRY GOODS', '0', 'Box', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D72', 'Yeast ', 'DRY GOODS', '0', 'Kg', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('D73', 'Zanzibar spice ', 'DRY GOODS', '0', 'Pkt', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FAV01', 'Avocados ', 'FRUIT & VEG ', '0', 'Ea', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FAV02', 'Bananas ', 'FRUIT & VEG ', '0', 'Ea', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FAV03', 'Broccoli ', 'FRUIT & VEG ', '0', 'Kg', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FAV04', 'Cabbage ', 'FRUIT & VEG ', '0', 'Ea', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FAV05', 'Carrots ', 'FRUIT & VEG ', '0', 'Kg', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FAV06', 'Cashew nuts.', 'FRUIT & VEG ', '0', 'Kg', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FAV07', 'Celery.', 'FRUIT & VEG ', '0', 'Ea', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FAV08', 'Chilli Fresh ', 'FRUIT & VEG ', '0', 'Kg', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FAV09', 'Cucumber ', 'FRUIT & VEG ', '0', 'Ea', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FAV10', 'Dania ', 'FRUIT & VEG ', '0', 'Ea', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FAV11', 'Dry Beans ', 'FRUIT & VEG ', '0', 'Kg', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FAV12', 'Eggplant ', 'FRUIT & VEG ', '0', 'Ea', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FAV13', 'Garlic ', 'FRUIT & VEG ', '0', 'Kg', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FAV14', 'Ginger ', 'FRUIT & VEG ', '0', 'Kg', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FAV15', 'Green Beans ', 'FRUIT & VEG ', '0', 'Kg', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FAV16', 'Green Peas ', 'FRUIT & VEG ', '0', 'Kg', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FAV17', 'Green Peppers ', 'FRUIT & VEG ', '0', 'Kg', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FAV18', 'Lemons ', 'FRUIT & VEG ', '0', 'Ea', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FAV19', 'Limes ', 'FRUIT & VEG ', '0', 'Kg', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FAV20', 'Mangos ', 'FRUIT & VEG ', '0', 'Ea', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FAV21', 'Onions ', 'FRUIT & VEG ', '0', 'Kg', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FAV22', 'Parsley .', 'FRUIT & VEG ', '0', 'Bns', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FAV23', 'Passionfruit ', 'FRUIT & VEG ', '0', 'Kg', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FAV24', 'Pineapples ', 'FRUIT & VEG ', '0', 'Ea', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FAV25', 'Potatoes + Staff ', 'FRUIT & VEG ', '0', 'Kg', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FAV26', 'Pumpkin ', 'FRUIT & VEG ', '0', 'Ea', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FAV27', 'Salad ', 'FRUIT & VEG ', '0', 'Pc', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FAV28', 'Sweet Potatos ', 'FRUIT & VEG ', '0', 'Kg', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FAV29', 'Tomatoes + Staff ', 'FRUIT & VEG ', '0', 'Kg', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FAV30', 'Watermelon ', 'FRUIT & VEG ', '0', 'Ea', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FAV31', 'Zucchini ', 'FRUIT & VEG ', '0', 'Ea', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FF01', 'Bacon ', 'FRIDGE /FREEZER', '0', '', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FF02', 'Beef fillet portions ', 'FRIDGE /FREEZER', '0', '', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FF03', 'Beef fillet whole pc ', 'FRIDGE /FREEZER', '0', 'Kg', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FF04', 'Beef Stew portions ', 'FRIDGE /FREEZER', '0', 'Kg', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FF05', 'boerewors ', 'FRIDGE /FREEZER', '0', '', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FF06', 'carrot portions ', 'FRIDGE /FREEZER', '0', '', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FF07', 'Chicken whole ', 'FRIDGE /FREEZER', '0', 'Pc', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FF08', 'Fish Fillet portions ', 'FRIDGE /FREEZER', '0', 'Kg', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FF09', 'mishkaki portions ', 'FRIDGE /FREEZER', '0', '', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FF10', 'mixed Vegetable portion ', 'FRIDGE /FREEZER', '0', '', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FF11', 'pizza bases ', 'FRIDGE /FREEZER', '0', '', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FF12', 'pizza topping  ', 'FRIDGE /FREEZER', '0', '', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FF13', 'Pork bit portions ', 'FRIDGE /FREEZER', '0', 'Kg', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FF14', 'samosa veggie portion ', 'FRIDGE /FREEZER', '0', '', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FF15', 'samosas portions ', 'FRIDGE /FREEZER', '0', '', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FF16', 'sausages ', 'FRIDGE /FREEZER', '0', '', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FF17', 'T-Bone ', 'FRIDGE /FREEZER', '0', 'Kg', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FF18', 'tilapia portions ', 'FRIDGE /FREEZER', '0', '', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FF19', 'Tilapia whole ', 'FRIDGE /FREEZER', '0', 'Kg', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FF20', 'tomato & union portions ', 'FRIDGE /FREEZER', '0', '', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FF21', 'Veggie skewer portions ', 'FRIDGE /FREEZER', '0', '', '0', '0', '0', '2013-04-12');
INSERT INTO `stock_input` VALUES ('FF22', 'veggie springroll portion ', 'FRIDGE /FREEZER', '0', '', '0', '0', '0', '2013-04-12');

-- --------------------------------------------------------

-- 
-- Table structure for table `tblno`
-- 

CREATE TABLE `tblno` (
  `tbno` varchar(250) NOT NULL,
  PRIMARY KEY  (`tbno`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 
-- Dumping data for table `tblno`
-- 

INSERT INTO `tblno` VALUES ('01');
INSERT INTO `tblno` VALUES ('02');
INSERT INTO `tblno` VALUES ('03');
INSERT INTO `tblno` VALUES ('04');
INSERT INTO `tblno` VALUES ('05');
INSERT INTO `tblno` VALUES ('06');
INSERT INTO `tblno` VALUES ('07');
INSERT INTO `tblno` VALUES ('08');
INSERT INTO `tblno` VALUES ('09');
INSERT INTO `tblno` VALUES ('10');
INSERT INTO `tblno` VALUES ('11');

-- --------------------------------------------------------

-- 
-- Table structure for table `users`
-- 

CREATE TABLE `users` (
  `uid` int(20) NOT NULL auto_increment,
  `fullname` varchar(30) default NULL,
  `username` varchar(30) default NULL,
  `password` varchar(30) default NULL,
  `designation` varchar(30) default NULL,
  PRIMARY KEY  (`uid`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=15 ;

-- 
-- Dumping data for table `users`
-- 

INSERT INTO `users` VALUES (4, 'Aidan Nyamhanga', 'aidan', 'aidan', 'Accomodation');
INSERT INTO `users` VALUES (6, 'Joseph Mamiro', 'jose', 'jose', 'Waiter/Waitress');
INSERT INTO `users` VALUES (7, 'Elvis Minja', 'big', 'big', 'Waiter/Waitress');
INSERT INTO `users` VALUES (8, 'Aron Wambura', 'wambura', 'wambura', 'Administrator');
INSERT INTO `users` VALUES (9, 'aas', 'a', 'a', 'Store');
INSERT INTO `users` VALUES (10, 'asa', 'me', 'me', 'Gate');
INSERT INTO `users` VALUES (11, 'Aidan Wambura', 'detective', 'detective', 'Accomodation');
INSERT INTO `users` VALUES (12, 'Aidan Wambura', 'wewe', 'mimi', 'Accomodation');
INSERT INTO `users` VALUES (13, 'sfsd', 'fsdfs', 'fsdfs', 'Bar');
INSERT INTO `users` VALUES (14, 'fgfhgf', 'hgfhgf', 'hfgfhgf', 'Administrator');
