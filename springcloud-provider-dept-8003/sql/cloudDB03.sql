/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : localhost
 Source Database       : clouddb03

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : utf-8

 Date: 01/20/2019 22:11:10 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `dept`
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `dept_no` bigint(20) NOT NULL AUTO_INCREMENT,
  `d_name` varchar(60) DEFAULT NULL,
  `db_source` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`dept_no`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `dept`
-- ----------------------------
BEGIN;
INSERT INTO `dept` VALUES ('1', '技术部', 'clouddb03'), ('2', '营销部', 'clouddb03'), ('3', '人事部', 'clouddb03'), ('4', '市场部', 'clouddb03'), ('5', '财务部', 'clouddb03'), ('6', 'demoData', 'clouddb03');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
