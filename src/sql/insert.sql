/**
  存储插入的语句
 */

USE DBHW;

SELECT * FROM Employee;

INSERT INTO Employee
VALUES
    ('E0001', '柯龙贞', '男', 28, '370502199001014813'),
    ('E0002', '魏淑琴', '女', 25, '37021419900101787X'),
    ('E0003', '庄俊贞', '男', 30, '370502198701299931'),
    ('E0004', '纪梅兴', '女', 27, '370502198701295631'),
    ('E0005', '王芳婷', '女', 33, '370502198601143913'),
    ('E0006', '江园朗', '男', 26, '370502198601149979');

INSERT INTO Employee
VALUES ('E0007', '翁元承', '男', 33, '330203198601144118');

UPDATE Employee
SET Eid = '330203198601144116'
WHERE Eno = 'E0007';

SELECT * FROM Maker;

INSERT INTO Maker
VALUES
    ('M0001', '恰康食品有限公司', '广西壮族自治区桂林市临桂区鲁兴路14号', '15523717661', 'RVCmHr4s0F@gmail.com'),
    ('M0002', '小林食品有限公司', '黑龙江省黑河市嫩江市庆丰大街179号', '15523717661', 'D4eiO6Ljp1kaPC@gmail.com'),
    ('M0003', '美森食品有限公司', '四川省眉山市洪雅县倚湖苑南侧140号', '13388245977', '9PIzCVodW@gmail.com'),
    ('M0004', '温氏食品有限公司', '广东省珠海市香洲区红山路153号', '13425002956', 'jD1plYHKzBdHklZ18@gmail.com');


SELECT * FROM Warehouse;

INSERT INTO Warehouse
VALUES
    ('W0001', '果蔬类', 0),
    ('W0002', '肉类', 0);

SELECT * FROM Food;

INSERT INTO Food
VALUES
    ('F0001', '番茄', '果蔬类', 'W0001', 'E0001'),
    ('F0002', '鸡肉', '肉类', 'W0002', 'E0002'),
    ('F0003', '茄子', '果蔬类', 'W0001', 'E0001'),
    ('F0004', '花菜', '果蔬类', 'W0001' , 'E0001');

INSERT INTO Food VALUES ('Ftest', '西瓜', '果蔬类', 'W0002', 'E0002');

SELECT * FROM Orders;

INSERT INTO Orders
VALUES
    ('O0001', 123, '2023-06-06 12:30:45', '果蔬类', 'E0001', 'W0001'),
    ('O0003', 300, '2023-06-07 16:30:45', '肉类', 'E0004', 'W0002');

SELECT * FROM Bill;

INSERT INTO Bill
VALUES
    ('B0001', 100, '2023-06-06 12:30:45', '果蔬类', 'E0001', 'M0001'),
    ('B0002', 200, '2023-06-07 12:30:45', '肉类', 'E0002', 'M0002'),
    ('B0003', 300, '2023-06-08 12:30:45', '果蔬类', 'E0003', 'M0001');

INSERT INTO Bill
VALUES  ('B0004', 400, '2023-06-08 12:30:45', '果蔬类', 'E0003', 'M0001');

SELECT * FROM Bill;

UPDATE DBHW.Bill SET DBHW.Bill.Bspend = 500 WHERE Bno = 'B0004';