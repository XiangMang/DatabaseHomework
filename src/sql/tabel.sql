/**
  存储建表的语句
 */

USE DBHW;

CREATE TABLE Employee (
                          Eno CHAR(10) PRIMARY KEY ,
                          Ename CHAR(16) NOT NULL ,
                          Esex CHAR(1) CHECK ( Esex IN ('男', '女') ) DEFAULT '男' ,
                          Eage INT NOT NULL CHECK ( Eage >= 18 AND Eage <= 60 ) ,
                          Ephone CHAR(20) NOT NULL ,
                          Eaddres CHAR(50) ,
                          Enum CHAR(18)
);

CREATE TABLE Food (
                      Fno CHAR(10) PRIMARY KEY ,
                      Fname CHAR(20) NOT NULL ,
                      Fclass CHAR(20) ,
                      Fprice FLOAT CHECK ( Fprice > 0 ) ,
                      Fid CHAR(10),
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

CREATE TABLE Tables (
                        Tno CHAR(10) PRIMARY KEY ,
                        Tnum INT NOT NULL
);

CREATE TABLE Orders (
                        Ono CHAR(10) PRIMARY KEY ,
                        Ospend INT NOT NULL CHECK ( Ospend > 0 ),
                        Otime DATETIME NOT NULL
);

CREATE TABLE Bill (
                      Bno CHAR(10) PRIMARY KEY ,
                      Bspend INT NOT NULL CHECK ( Bspend >= 0 ),
                      Btime DATETIME NOT NULL ,
                      Bend DATETIME NOT NULL ,
                      Bemployee CHAR(10) NOT NULL ,
                      Bmaker CHAR(10) NOT NULL ,
                      FOREIGN KEY (Bemployee) REFERENCES Employee(Eno) ,
                      FOREIGN KEY (Bmaker) REFERENCES Maker(Mno)
);