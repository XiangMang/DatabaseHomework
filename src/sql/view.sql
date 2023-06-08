/**
  创建视图的语句
 */

USE DBHW;

# 创建食品与采购人员的视图
CREATE VIEW FoodAll
AS SELECT Food.*,
          Employee.Ename
FROM Food, Employee
WHERE Food.Fid = Employee.Eno;

SELECT * FROM FoodAll;