/**
    设置分组信息
 */

USE DBHW;

SELECT *,
       CASE
           WHEN Fname = '番茄' THEN '时令果蔬'
           WHEN Fname = '茄子' THEN '非时令果蔬'
           ELSE '未知'
           END 果蔬分类
FROM Food;
