/**
    管理用户
 */
USE DBHW;

CREATE USER 张三@'%' IDENTIFIED BY 'zhangsan';
GRANT SELECT, INSERT, UPDATE, DELETE ON Warehouse to 张三;