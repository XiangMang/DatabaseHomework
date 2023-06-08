USE DBHW;

INSERT INTO Employee
VALUES
    ('E0001', '柯龙贞', '男', 28, '17129213612', '山东省潍坊市潍城区北宫西街1650齐润大厦3号楼1单元405号', '370502199001014813'),
    ('E0002', '魏淑琴', '女', 25, '14704216755', '山东省潍坊市潍城区红山街道人民路92号滨河家园12号楼2单元203号', '37021419900101787X'),
    ('E0003', '庄俊贞', '男', 30, '15927493296', '山东省潍坊市潍城区建设三路45街青山·世纪坊7号楼1单元103号', '370502198701299931'),
    ('E0004', '纪梅兴', '女', 27, '15393624418', '山东省潍坊市潍城区七彩宾馆七彩嘉园10号楼3单元404号', '370502198701295631'),
    ('E0005', '王芳婷', '女', 33, '17659649323', '山东省潍坊市潍城区南龙道与永兴路交口南200米路东金辉优步水岸9号楼2单元301号', '370502198601143913'),
    ('E0006', '江园朗', '男', 26, '13407047023', '山东省潍坊市潍城区王大道391天赐良苑4号楼2单元402号', '370502198601149979');

INSERT INTO Employee
VALUES ('E0007', '翁元承', '男', 33, '15270353802', '山东省潍坊市潍城区金三大道名门贵族14号楼3单元301号', '330203198601144118');

UPDATE Employee
SET Ephone = '17352624627'
WHERE Eno = 'E0007';

DELETE FROM Employee
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
    ('W0001', '果蔬类', 1000),
    ('W0002', '肉类', 1000);

SELECT * FROM Food;

INSERT INTO Food
VALUES
    ('F0001', '番茄', '果蔬类', 2.0, 'E0001'),
    ('F0002', '鸡肉', '肉类', 24.97, 'E0002'),
    ('F0003', '茄子', '果蔬类', 2.5, 'E0001'),
    ('F0004', '花菜', '果蔬类', 4.4 , 'E0001');

SELECT * FROM Tables;

INSERT INTO Tables
VALUES
    ('T0001', 4),
    ('T0002', 4),
    ('T0003', 6),
    ('T0004', 6);

SELECT * FROM Orders;

INSERT INTO Orders
VALUES
    ('O0001', 123, '2023-06-06 12:30:45'),
    ('O0002', 200, '2023-06-07 13:30:45'),
    ('O0003', 300, '2023-06-07 16:30:45');

SELECT * FROM Bill;

INSERT INTO Bill
VALUES
    ('B0001', 100, '2023-06-06 12:30:45', '2023-06-06 13:30:45', 'E0001', 'M0001'),
    ('B0002', 200, '2023-06-07 12:30:45', '2023-06-07 13:30:45', 'E0002', 'M0002'),
    ('B0003', 300, '2023-06-08 12:30:45', '2023-06-08 14:30:45', 'E0003', 'M0003');