/*
Navicat MySQL Data Transfer

Source Server         : loocalhost
Source Server Version : 50723
Source Host           : localhost:3306
Source Database       : arch1

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2020-06-15 10:07:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_cart
-- ----------------------------
DROP TABLE IF EXISTS `tbl_cart`;
CREATE TABLE `tbl_cart` (
  `uuid` int(11) NOT NULL AUTO_INCREMENT,
  `customerUuid` int(11) DEFAULT NULL,
  `goodsUuid` int(11) DEFAULT NULL,
  `buyNum` int(11) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_cart
-- ----------------------------
INSERT INTO `tbl_cart` VALUES ('1', '1', '1', '1', '1');
INSERT INTO `tbl_cart` VALUES ('2', '2', '2', '2', '2');
INSERT INTO `tbl_cart` VALUES ('7', '7', '7', '7', '7');

-- ----------------------------
-- Table structure for tbl_customer
-- ----------------------------
DROP TABLE IF EXISTS `tbl_customer`;
CREATE TABLE `tbl_customer` (
  `uuid` int(11) NOT NULL AUTO_INCREMENT,
  `customerId` varchar(20) DEFAULT NULL,
  `pwd` varchar(20) DEFAULT NULL,
  `showName` varchar(100) DEFAULT NULL,
  `trueName` varchar(100) DEFAULT NULL,
  `registerTime` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_customer
-- ----------------------------
INSERT INTO `tbl_customer` VALUES ('1', '0.8963185405326461', '0.8963185405326461', '0.8963185405326461', '0.8963185405326461', '2020-02-13 12:00:00');
INSERT INTO `tbl_customer` VALUES ('2', '0.6288691885208287', '0.6288691885208287', '0.6288691885208287', '0.6288691885208287', '2020-02-13 12:00:00');
INSERT INTO `tbl_customer` VALUES ('3', '0.8202077088956289', '0.8202077088956289', '0.8202077088956289', '0.8202077088956289', '2020-02-13 12:00:00');
INSERT INTO `tbl_customer` VALUES ('4', '0.3275018958579081', '0.3275018958579081', '0.3275018958579081', '0.3275018958579081', '2020-02-13 12:00:00');
INSERT INTO `tbl_customer` VALUES ('6', '0.5672362645134728', '0.5672362645134728', '0.5672362645134728', '0.5672362645134728', '2020-02-13 12:00:00');
INSERT INTO `tbl_customer` VALUES ('7', '1', '1', '1', '1', null);
INSERT INTO `tbl_customer` VALUES ('8', 'cccc', 'ccc', 'ccc', 'ccc', '2020-02-18 06:57:01');
INSERT INTO `tbl_customer` VALUES ('9', '0.07256974653996062', '0.07256974653996062', '0.07256974653996062', '0.07256974653996062', '2020-02-13 12:00:00');
INSERT INTO `tbl_customer` VALUES ('10', '0.13053641589686815', '0.13053641589686815', '0.13053641589686815', '0.13053641589686815', '2020-02-13 12:00:00');
INSERT INTO `tbl_customer` VALUES ('11', '0.16183002680607694', '0.16183002680607694', '0.16183002680607694', '0.16183002680607694', '2020-02-13 12:00:00');
INSERT INTO `tbl_customer` VALUES ('12', '0.09632781553813274', '0.09632781553813274', '0.09632781553813274', '0.09632781553813274', '2020-02-13 12:00:00');

-- ----------------------------
-- Table structure for tbl_file
-- ----------------------------
DROP TABLE IF EXISTS `tbl_file`;
CREATE TABLE `tbl_file` (
  `uuid` int(11) NOT NULL AUTO_INCREMENT,
  `fileName` varchar(1000) DEFAULT NULL,
  `remotePaths` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_file
-- ----------------------------

-- ----------------------------
-- Table structure for tbl_goods
-- ----------------------------
DROP TABLE IF EXISTS `tbl_goods`;
CREATE TABLE `tbl_goods` (
  `uuid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL,
  `imgPath` varchar(500) DEFAULT NULL,
  `description` varchar(2000) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_goods
-- ----------------------------
INSERT INTO `tbl_goods` VALUES ('1', '0.9092394215643053', '0.9092394215643053', '0.9092394215643053');
INSERT INTO `tbl_goods` VALUES ('2', '0.42404447521389776', '0.42404447521389776', '0.42404447521389776');

-- ----------------------------
-- Table structure for tbl_order
-- ----------------------------
DROP TABLE IF EXISTS `tbl_order`;
CREATE TABLE `tbl_order` (
  `uuid` int(11) NOT NULL AUTO_INCREMENT,
  `customerUuid` int(11) DEFAULT NULL,
  `orderTime` varchar(100) DEFAULT NULL,
  `totalMoney` float DEFAULT NULL,
  `saveMoney` float DEFAULT NULL,
  `state` smallint(6) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_order
-- ----------------------------

-- ----------------------------
-- Table structure for tbl_orderdetail
-- ----------------------------
DROP TABLE IF EXISTS `tbl_orderdetail`;
CREATE TABLE `tbl_orderdetail` (
  `uuid` int(11) NOT NULL AUTO_INCREMENT,
  `orderUuid` int(11) DEFAULT NULL,
  `goodsUuid` int(11) DEFAULT NULL,
  `orderNum` int(11) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `money` float DEFAULT NULL,
  `saveMoney` float DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_orderdetail
-- ----------------------------

-- ----------------------------
-- Table structure for tbl_store
-- ----------------------------
DROP TABLE IF EXISTS `tbl_store`;
CREATE TABLE `tbl_store` (
  `uuid` int(11) NOT NULL AUTO_INCREMENT,
  `goodsUuid` int(11) DEFAULT NULL,
  `storeNum` int(11) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_store
-- ----------------------------

-- ----------------------------
-- Table structure for test
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test
-- ----------------------------
