/**
  存储建表的语句
 */
CREATE SCHEMA DBHW;

USE DBHW;

DROP SCHEMA DBHW;

CREATE TABLE Employee (
    Eno CHAR(10) PRIMARY KEY ,
    Ename CHAR(16) NOT NULL ,
    Esex CHAR(1) CHECK ( Esex IN ('男', '女') ) DEFAULT '男' ,
    Eage INT NOT NULL CHECK ( Eage >= 18 AND Eage <= 60 ) ,
    Eid CHAR(18) NOT NULL
);

SELECT * FROM Employee;

CREATE TABLE Food (
    Fno CHAR(10) PRIMARY KEY ,
    Fname CHAR(20) NOT NULL ,
    Fclass CHAR(20) NOT NULL ,
    Fplace CHAR(10) ,
    Fid CHAR(10),
    FOREIGN KEY (Fplace) REFERENCES Warehouse(Wno),
    FOREIGN KEY (Fid) REFERENCES Employee(Eno)
);

CREATE TABLE Maker (
    Mno CHAR(10) PRIMARY KEY ,
    Mname CHAR(20) NOT NULL ,
    Mplace CHAR(50) ,
    Mphone CHAR(20) NOT NULL ,
    Memail CHAR(30) NOT NULL
);

CREATE TABLE Warehouse (
    Wno CHAR(10) PRIMARY KEY ,
    Wclass CHAR(10) NOT NULL ,
    Wnum INT CHECK ( Wnum >= 0 )
);

CREATE TABLE Orders (
    Ono CHAR(10) PRIMARY KEY ,
    Ospend INT NOT NULL CHECK ( Ospend > 0 ),
    Otime DATETIME NOT NULL,
    Oclass CHAR(10) NOT NULL ,
    Oid CHAR(10) NOT NULL ,
    Ospace CHAR(10) NOT NULL ,
    FOREIGN KEY (Oid) REFERENCES Employee(Eno),
    FOREIGN KEY (Ospace) REFERENCES Warehouse(Wno)
);

CREATE TABLE Bill (
    Bno CHAR(10) PRIMARY KEY ,
    Bspend INT NOT NULL CHECK ( Bspend >= 0 ),
    Btime DATETIME NOT NULL ,
    Bclass CHAR(10) NOT NULL ,
    Bemployee CHAR(10) NOT NULL ,
    Bmaker CHAR(10) NOT NULL ,
    FOREIGN KEY (Bemployee) REFERENCES Employee(Eno) ,
    FOREIGN KEY (Bmaker) REFERENCES Maker(Mno)
);