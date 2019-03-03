-- --------------------------------------------------------
-- 호스트:                          127.0.0.1
-- 서버 버전:                        5.5.32 - MySQL Community Server (GPL)
-- 서버 OS:                        Win32
-- HeidiSQL 버전:                  8.0.0.4396
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- vote 의 데이터베이스 구조 덤핑
CREATE DATABASE IF NOT EXISTS `vote` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `vote`;


-- 테이블 vote의 구조를 덤프합니다. vote
CREATE TABLE IF NOT EXISTS `vote` (
  `ip` varchar(200) NOT NULL,
  `team` int(200) NOT NULL,
  `completion` int(200) NOT NULL,
  `ui` int(200) NOT NULL,
  `ux` int(200) NOT NULL,
  `collaboration` int(200) NOT NULL,
  `presentation` int(200) NOT NULL,
  PRIMARY KEY (`ip`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table vote.vote: ~3 rows (대략적)
DELETE FROM `vote`;
/*!40000 ALTER TABLE `vote` DISABLE KEYS */;
INSERT INTO `vote` (`ip`, `team`, `completion`, `ui`, `ux`, `collaboration`, `presentation`) VALUES
	('0:0:0:0:0:0:0:1', 6, 90, 80, 90, 80, 90),
	('52', 1, 50, 50, 50, 50, 50),
	('56', 2, 30, 30, 30, 30, 30);
/*!40000 ALTER TABLE `vote` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
