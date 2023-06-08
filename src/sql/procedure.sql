/**
  创建存储过程的语句
 */
USE DBHW;

DELIMITER //
CREATE PROCEDURE p1()
BEGIN
    DECLARE NAME CHAR(8);
    IF EXISTS(SELECT * FROM Warehouse WHERE Wnum < 10) THEN
        UPDATE Warehouse SET Wnum = Wnum + 10 WHERE Wnum < 10;
    END IF ;
END //
DELIMITER ;

SELECT * FROM Warehouse;

CALL P1();

DROP PROCEDURE p1;