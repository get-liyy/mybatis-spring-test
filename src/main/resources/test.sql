
DROP TABLE IF EXISTS `_country`;
CREATE TABLE `_country` (
  `_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `_country_name` varchar(255) DEFAULT NULL COMMENT '城市名称',
  `_country_code` varchar(255) DEFAULT NULL COMMENT '城市编码',
  PRIMARY KEY (`_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='国家信息';

INSERT INTO `_country` VALUES (1,'Angola','AO');
INSERT INTO `_country` VALUES (2,'Afghanistan','AF');
INSERT INTO `_country` VALUES (3,'Albania','AL');
INSERT INTO `_country` VALUES (4,'Algeria','DZ');
INSERT INTO `_country` VALUES (5,'Andorra','AD');
INSERT INTO `_country` VALUES (6,'Anguilla','AI');
INSERT INTO `_country` VALUES (7,'Antigua and Barbuda','AG');
INSERT INTO `_country` VALUES (8,'Argentina','AR');
INSERT INTO `_country` VALUES (9,'Armenia','AM');
INSERT INTO `_country` VALUES (10,'Australia','AU');
INSERT INTO `_country` VALUES (11,'Austria','AT');
INSERT INTO `_country` VALUES (12,'Azerbaijan','AZ');
INSERT INTO `_country` VALUES (13,'Bahamas','BS');
INSERT INTO `_country` VALUES (14,'Bahrain','BH');
INSERT INTO `_country` VALUES (15,'Bangladesh','BD');
INSERT INTO `_country` VALUES (16,'Barbados','BB');
INSERT INTO `_country` VALUES (17,'Belarus','BY');
INSERT INTO `_country` VALUES (18,'Belgium','BE');
INSERT INTO `_country` VALUES (19,'Belize','BZ');
INSERT INTO `_country` VALUES (20,'Benin','BJ');
INSERT INTO `_country` VALUES (21,'Bermuda Is.','BM');
INSERT INTO `_country` VALUES (22,'Bolivia','BO');
INSERT INTO `_country` VALUES (23,'Botswana','BW');
INSERT INTO `_country` VALUES (24,'Brazil','BR');
INSERT INTO `_country` VALUES (25,'Brunei','BN');
INSERT INTO `_country` VALUES (26,'Bulgaria','BG');
INSERT INTO `_country` VALUES (27,'Burkina-faso','BF');
INSERT INTO `_country` VALUES (28,'Burma','MM');
INSERT INTO `_country` VALUES (29,'Burundi','BI');
INSERT INTO `_country` VALUES (30,'Cameroon','CM');
INSERT INTO `_country` VALUES (31,'Canada','CA');
INSERT INTO `_country` VALUES (32,'Central African Republic','CF');
INSERT INTO `_country` VALUES (33,'Chad','TD');
INSERT INTO `_country` VALUES (34,'Chile','CL');
INSERT INTO `_country` VALUES (35,'China','CN');
INSERT INTO `_country` VALUES (36,'Colombia','CO');
INSERT INTO `_country` VALUES (37,'Congo','CG');
INSERT INTO `_country` VALUES (38,'Cook Is.','CK');
INSERT INTO `_country` VALUES (39,'Costa Rica','CR');
INSERT INTO `_country` VALUES (40,'Cuba','CU');
INSERT INTO `_country` VALUES (41,'Cyprus','CY');
INSERT INTO `_country` VALUES (42,'Czech Republic','CZ');
INSERT INTO `_country` VALUES (43,'Denmark','DK');
INSERT INTO `_country` VALUES (44,'Djibouti','DJ');
INSERT INTO `_country` VALUES (45,'Dominica Rep.','DO');
INSERT INTO `_country` VALUES (46,'Ecuador','EC');
INSERT INTO `_country` VALUES (47,'Egypt','EG');
INSERT INTO `_country` VALUES (48,'EI Salvador','SV');
INSERT INTO `_country` VALUES (49,'Estonia','EE');
INSERT INTO `_country` VALUES (50,'Ethiopia','ET');
INSERT INTO `_country` VALUES (51,'Fiji','FJ');
INSERT INTO `_country` VALUES (52,'Finland','FI');
INSERT INTO `_country` VALUES (53,'France','FR');
INSERT INTO `_country` VALUES (54,'French Guiana','GF');
INSERT INTO `_country` VALUES (55,'Gabon','GA');
INSERT INTO `_country` VALUES (56,'Gambia','GM');
INSERT INTO `_country` VALUES (57,'Georgia','GE');
INSERT INTO `_country` VALUES (58,'Germany','DE');
INSERT INTO `_country` VALUES (59,'Ghana','GH');
INSERT INTO `_country` VALUES (60,'Gibraltar','GI');
INSERT INTO `_country` VALUES (61,'Greece','GR');
INSERT INTO `_country` VALUES (62,'Grenada','GD');
INSERT INTO `_country` VALUES (63,'Guam','GU');
INSERT INTO `_country` VALUES (64,'Guatemala','GT');
INSERT INTO `_country` VALUES (65,'Guinea','GN');
INSERT INTO `_country` VALUES (66,'Guyana','GY');
INSERT INTO `_country` VALUES (67,'Haiti','HT');
INSERT INTO `_country` VALUES (68,'Honduras','HN');
INSERT INTO `_country` VALUES (69,'Hongkong','HK');
INSERT INTO `_country` VALUES (70,'Hungary','HU');
INSERT INTO `_country` VALUES (71,'Iceland','IS');
INSERT INTO `_country` VALUES (72,'India','IN');
INSERT INTO `_country` VALUES (73,'Indonesia','ID');
INSERT INTO `_country` VALUES (74,'Iran','IR');
INSERT INTO `_country` VALUES (75,'Iraq','IQ');
INSERT INTO `_country` VALUES (76,'Ireland','IE');
INSERT INTO `_country` VALUES (77,'Israel','IL');
INSERT INTO `_country` VALUES (78,'Italy','IT');
INSERT INTO `_country` VALUES (79,'Jamaica','JM');
INSERT INTO `_country` VALUES (80,'Japan','JP');
INSERT INTO `_country` VALUES (81,'Jordan','JO');
INSERT INTO `_country` VALUES (82,'Kampuchea (Cambodia )','KH');
INSERT INTO `_country` VALUES (83,'Kazakstan','KZ');
INSERT INTO `_country` VALUES (84,'Kenya','KE');
INSERT INTO `_country` VALUES (85,'Korea','KR');
INSERT INTO `_country` VALUES (86,'Kuwait','KW');
INSERT INTO `_country` VALUES (87,'Kyrgyzstan','KG');
INSERT INTO `_country` VALUES (88,'Laos','LA');
INSERT INTO `_country` VALUES (89,'Latvia','LV');
INSERT INTO `_country` VALUES (90,'Lebanon','LB');
INSERT INTO `_country` VALUES (91,'Lesotho','LS');
INSERT INTO `_country` VALUES (92,'Liberia','LR');
INSERT INTO `_country` VALUES (93,'Libya','LY');
INSERT INTO `_country` VALUES (94,'Liechtenstein','LI');
INSERT INTO `_country` VALUES (95,'Lithuania','LT');
INSERT INTO `_country` VALUES (96,'Luxembourg','LU');
INSERT INTO `_country` VALUES (97,'Macao','MO');
INSERT INTO `_country` VALUES (98,'Madagascar','MG');
INSERT INTO `_country` VALUES (99,'Malawi','MW');
INSERT INTO `_country` VALUES (100,'Malaysia','MY');
INSERT INTO `_country` VALUES (101,'Maldives','MV');
INSERT INTO `_country` VALUES (102,'Mali','ML');
INSERT INTO `_country` VALUES (103,'Malta','MT');
INSERT INTO `_country` VALUES (104,'Mauritius','MU');
INSERT INTO `_country` VALUES (105,'Mexico','MX');
INSERT INTO `_country` VALUES (106,'Moldova, Republic of','MD');
INSERT INTO `_country` VALUES (107,'Monaco','MC');
INSERT INTO `_country` VALUES (108,'Mongolia','MN');
INSERT INTO `_country` VALUES (109,'Montserrat Is','MS');
INSERT INTO `_country` VALUES (110,'Morocco','MA');
INSERT INTO `_country` VALUES (111,'Mozambique','MZ');
INSERT INTO `_country` VALUES (112,'Namibia','NA');
INSERT INTO `_country` VALUES (113,'Nauru','NR');
INSERT INTO `_country` VALUES (114,'Nepal','NP');
INSERT INTO `_country` VALUES (115,'Netherlands','NL');
INSERT INTO `_country` VALUES (116,'New Zealand','NZ');
INSERT INTO `_country` VALUES (117,'Nicaragua','NI');
INSERT INTO `_country` VALUES (118,'Niger','NE');
INSERT INTO `_country` VALUES (119,'Nigeria','NG');
INSERT INTO `_country` VALUES (120,'North Korea','KP');
INSERT INTO `_country` VALUES (121,'Norway','NO');
INSERT INTO `_country` VALUES (122,'Oman','OM');
INSERT INTO `_country` VALUES (123,'Pakistan','PK');
INSERT INTO `_country` VALUES (124,'Panama','PA');
INSERT INTO `_country` VALUES (125,'Papua New Cuinea','PG');
INSERT INTO `_country` VALUES (126,'Paraguay','PY');
INSERT INTO `_country` VALUES (127,'Peru','PE');
INSERT INTO `_country` VALUES (128,'Philippines','PH');
INSERT INTO `_country` VALUES (129,'Poland','PL');
INSERT INTO `_country` VALUES (130,'French Polynesia','PF');
INSERT INTO `_country` VALUES (131,'Portugal','PT');
INSERT INTO `_country` VALUES (132,'Puerto Rico','PR');
INSERT INTO `_country` VALUES (133,'Qatar','QA');
INSERT INTO `_country` VALUES (134,'Romania','RO');
INSERT INTO `_country` VALUES (135,'Russia','RU');
INSERT INTO `_country` VALUES (136,'Saint Lueia','LC');
INSERT INTO `_country` VALUES (137,'Saint Vincent','VC');
INSERT INTO `_country` VALUES (138,'San Marino','SM');
INSERT INTO `_country` VALUES (139,'Sao Tome and Principe','ST');
INSERT INTO `_country` VALUES (140,'Saudi Arabia','SA');
INSERT INTO `_country` VALUES (141,'Senegal','SN');
INSERT INTO `_country` VALUES (142,'Seychelles','SC');
INSERT INTO `_country` VALUES (143,'Sierra Leone','SL');
INSERT INTO `_country` VALUES (144,'Singapore','SG');
INSERT INTO `_country` VALUES (145,'Slovakia','SK');
INSERT INTO `_country` VALUES (146,'Slovenia','SI');
INSERT INTO `_country` VALUES (147,'Solomon Is','SB');
INSERT INTO `_country` VALUES (148,'Somali','SO');
INSERT INTO `_country` VALUES (149,'South Africa','ZA');
INSERT INTO `_country` VALUES (150,'Spain','ES');
INSERT INTO `_country` VALUES (151,'Sri Lanka','LK');
INSERT INTO `_country` VALUES (152,'St.Lucia','LC');
INSERT INTO `_country` VALUES (153,'St.Vincent','VC');
INSERT INTO `_country` VALUES (154,'Sudan','SD');
INSERT INTO `_country` VALUES (155,'Suriname','SR');
INSERT INTO `_country` VALUES (156,'Swaziland','SZ');
INSERT INTO `_country` VALUES (157,'Sweden','SE');
INSERT INTO `_country` VALUES (158,'Switzerland','CH');
INSERT INTO `_country` VALUES (159,'Syria','SY');
INSERT INTO `_country` VALUES (160,'Taiwan','TW');
INSERT INTO `_country` VALUES (161,'Tajikstan','TJ');
INSERT INTO `_country` VALUES (162,'Tanzania','TZ');
INSERT INTO `_country` VALUES (163,'Thailand','TH');
INSERT INTO `_country` VALUES (164,'Togo','TG');
INSERT INTO `_country` VALUES (165,'Tonga','TO');
INSERT INTO `_country` VALUES (166,'Trinidad and Tobago','TT');
INSERT INTO `_country` VALUES (167,'Tunisia','TN');
INSERT INTO `_country` VALUES (168,'Turkey','TR');
INSERT INTO `_country` VALUES (169,'Turkmenistan','TM');
INSERT INTO `_country` VALUES (170,'Uganda','UG');
INSERT INTO `_country` VALUES (171,'Ukraine','UA');
INSERT INTO `_country` VALUES (172,'United Arab Emirates','AE');
INSERT INTO `_country` VALUES (173,'United Kiongdom','GB');
INSERT INTO `_country` VALUES (174,'United States of America','US');
INSERT INTO `_country` VALUES (175,'Uruguay','UY');
INSERT INTO `_country` VALUES (176,'Uzbekistan','UZ');
INSERT INTO `_country` VALUES (177,'Venezuela','VE');
INSERT INTO `_country` VALUES (178,'Vietnam','VN');
INSERT INTO `_country` VALUES (179,'Yemen','YE');
INSERT INTO `_country` VALUES (180,'Yugoslavia','YU');
INSERT INTO `_country` VALUES (181,'Zimbabwe','ZW');
INSERT INTO `_country` VALUES (182,'Zaire','ZR');
INSERT INTO `_country` VALUES (183,'Zambia','ZM');

DROP TABLE IF EXISTS `user _login_info`;
CREATE TABLE `user _login_info` (
  `_id` int(11) NOT NULL AUTO_INCREMENT,
  `_user_name` varchar(32) NOT NULL DEFAULT '' COMMENT '登录名',
  `_login_date` datetime DEFAULT NULL COMMENT '登录时间',
  `_login_ip` varchar(16) DEFAULT NULL COMMENT '登录IP',
  PRIMARY KEY (`_id`,`_user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户登录日志';

DROP TABLE IF EXISTS `_user_info`;
CREATE TABLE `_user_info` (
  `_id` int(11) NOT NULL AUTO_INCREMENT,
  `_user_name` varchar(32) NOT NULL DEFAULT '' COMMENT '用户名',
  `_pass_word` varchar(32) DEFAULT NULL COMMENT '密码',
  `_user_type` varchar(2) DEFAULT NULL COMMENT '用户类型',
  `_enabled` int(2) DEFAULT NULL COMMENT '是否可用',
  `_realname` varchar(32) DEFAULT NULL COMMENT '真实姓名',
  `_qq` varchar(14) DEFAULT NULL COMMENT 'QQ',
  `_email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `_tel` varchar(255) DEFAULT NULL COMMENT '联系电话',
  PRIMARY KEY (`_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息表';
