/*============================== CREATE DATABASE =======================================*/
/*======================================================================================*/
DROP DATABASE IF EXISTS FinalExam;
CREATE DATABASE FinalExam;
USE FinalExam;
/*============================== CREATE TABLE =======================================*/
/*======================================================================================*/
-- create table 1 id, FullName, Email, Password
DROP TABLE IF EXISTS `User`;
CREATE TABLE `User` (
	ID INT PRIMARY KEY,
    fullName VARCHAR(50),
    email VARCHAR(50),
    `password` VARCHAR(50)
);

DROP TABLE IF EXISTS Manager;
CREATE TABLE Manager (
	ID INT,
    ExpInYear INT,
    FOREIGN KEY (ID) REFERENCES `User`(ID) ON DELETE CASCADE
);

DROP TABLE IF EXISTS Project;
CREATE TABLE Project (
	projectID INT PRIMARY KEY,
    teamSize INT,
    idManager INT,
    FOREIGN KEY (idManager) REFERENCES Manager(ID)
);

DROP TABLE IF EXISTS employee;
CREATE TABLE employee (
	ID INT,
    projectID INT,
    proSkill VARCHAR(50),
    FOREIGN KEY (projectID) REFERENCES Project(projectID) ON DELETE CASCADE,
    FOREIGN KEY (ID) REFERENCES `User`(ID) ON DELETE CASCADE
);

-- INSERT

INSERT INTO `User`()
VALUES  (1,"Nguyen Viet Anh","vietanh@gmail.com","vietanh"),
		(2,"Nguyen Hoang Kien","hoangkien@gmail.com","hoangkien"),
		(3,"Hoang Phi Hong","hoanghong@gmail.com","hoanghong"),
		(4,"Nguyen Thi Ly","nguyenly@gmail.com","nguyenly"),
		(5,"Truong Dinh","truongdinh@gmail.com","truongdinh"),
		(6,"Nguyen viet xuan","vietxuan@gmail.com","vietxuan"),
		(7,"Truong Xuan Truong","xuantruong@gmail.com","xuantruong"),
		(8,"Nguyen Tran Le","tranle@gmail.com","tranle");

INSERT INTO Manager
VALUES	(1, 3),
		(2, 2),
        (3, 4);
        
INSERT INTO Project
VALUES	(9, 2, 1),
		(10, 3, 2),
        (11, 2, 3);

INSERT INTO employee
VALUES	(4,	10, 'dev'),
		(5,	11, 'test'),
		(6,	11, ' java'),
        (7,	9, 'sql'),
        (8,9,'dev');
    
    

