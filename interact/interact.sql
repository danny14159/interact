/*
Navicat MySQL Data Transfer

Source Server         : 115.28.158.206
Source Server Version : 50548
Source Host           : 115.28.158.206:3306
Source Database       : interact

Target Server Type    : MYSQL
Target Server Version : 50548
File Encoding         : 65001

Date: 2016-06-18 22:01:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_chat_record
-- ----------------------------
DROP TABLE IF EXISTS `tb_chat_record`;
CREATE TABLE `tb_chat_record` (
  `id` int(11) NOT NULL,
  `content` varchar(255) DEFAULT NULL,
  `user_from` varchar(255) DEFAULT NULL,
  `user_to` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_chat_record
-- ----------------------------

-- ----------------------------
-- Table structure for tb_friendship
-- ----------------------------
DROP TABLE IF EXISTS `tb_friendship`;
CREATE TABLE `tb_friendship` (
  `user1` varchar(255) NOT NULL,
  `user2` varchar(255) NOT NULL,
  PRIMARY KEY (`user2`,`user1`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_friendship
-- ----------------------------

-- ----------------------------
-- Table structure for tb_group
-- ----------------------------
DROP TABLE IF EXISTS `tb_group`;
CREATE TABLE `tb_group` (
  `id` int(11) NOT NULL,
  `name` varchar(25) DEFAULT NULL COMMENT '组名',
  `face` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_group
-- ----------------------------
INSERT INTO `tb_group` VALUES ('1', '企业好友', '/layim/images/1.png');

-- ----------------------------
-- Table structure for tb_groupship
-- ----------------------------
DROP TABLE IF EXISTS `tb_groupship`;
CREATE TABLE `tb_groupship` (
  `group_id` int(11) NOT NULL,
  `username` varchar(11) NOT NULL,
  PRIMARY KEY (`username`,`group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_groupship
-- ----------------------------

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `name` varchar(11) NOT NULL COMMENT '用户名',
  `password` varchar(25) DEFAULT NULL COMMENT '密码',
  `avatar` varchar(25) DEFAULT NULL COMMENT '头像',
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('123', 'aaa', 'http://tp3.sinaimg.cn/385');
INSERT INTO `tb_user` VALUES ('312', '123', 'http://tp1.sinaimg.cn/157');
INSERT INTO `tb_user` VALUES ('789', '012', 'http://tp3.sinaimg.cn/385');
INSERT INTO `tb_user` VALUES ('7890', '012', 'http://tp1.sinaimg.cn/182');
INSERT INTO `tb_user` VALUES ('danny', '123', 'http://tp1.sinaimg.cn/157');
INSERT INTO `tb_user` VALUES ('Miss fan', '123', 'http://tp1.sinaimg.cn/157');
INSERT INTO `tb_user` VALUES ('root', '123', 'http://tp1.sinaimg.cn/182');
INSERT INTO `tb_user` VALUES ('you know', '123', 'http://tp1.sinaimg.cn/157');
INSERT INTO `tb_user` VALUES ('zhangyuhao', '123', 'http://tp3.sinaimg.cn/385');
INSERT INTO `tb_user` VALUES ('侯勇军', '111', 'http://tp3.sinaimg.cn/385');
INSERT INTO `tb_user` VALUES ('娄宽', '123', 'http://tp3.sinaimg.cn/385');
INSERT INTO `tb_user` VALUES ('孙磊', '111', 'http://tp1.sinaimg.cn/182');
INSERT INTO `tb_user` VALUES ('猴哥', '111', 'http://tp1.sinaimg.cn/182');
INSERT INTO `tb_user` VALUES ('王勃博0', '111', 'http://tp1.sinaimg.cn/157');
INSERT INTO `tb_user` VALUES ('王康', '123', 'http://tp1.sinaimg.cn/182');
INSERT INTO `tb_user` VALUES ('眼晕', '147', 'http://tp3.sinaimg.cn/385');
INSERT INTO `tb_user` VALUES ('罗路辉', '111', 'http://tp1.sinaimg.cn/157');
INSERT INTO `tb_user` VALUES ('闫老西', '111', 'http://tp3.sinaimg.cn/385');
