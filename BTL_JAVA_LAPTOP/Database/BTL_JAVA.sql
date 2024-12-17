USE master;
GO

IF EXISTS (SELECT name FROM sys.databases WHERE name = 'BTLJAVA')
BEGIN
    ALTER DATABASE BTLJAVA SET SINGLE_USER WITH ROLLBACK IMMEDIATE;
    DROP DATABASE BTLJAVA;
END

CREATE DATABASE BTLJAVA;
GO

USE BTLJAVA
GO

CREATE TABLE ROLES (
  role_id int IDENTITY(1,1) PRIMARY KEY,
  name nvarchar(20) NOT NULL
) 

GO
CREATE TABLE USERS (
  id int IDENTITY(1,1) NOT NULL,
  fullname nvarchar(30) NOT NULL,
  username nvarchar(30) NOT NULL,
  password_u nvarchar(30) NOT NULL,
  role_id int NOT NULL,
  status_u bit,
  PRIMARY KEY (id),
  FOREIGN KEY (role_id) REFERENCES ROLES(role_id)
) 
GO

CREATE TABLE PHONES (
  id int IDENTITY(1,1) PRIMARY KEY,
  name nvarchar(50) NOT NULL,
  manufacturer nvarchar(50) NOT NULL,
  quantity int NOT NULL,
  price int NOT NULL
);
GO

CREATE TABLE ORDERS (
  id int IDENTITY(1,1) PRIMARY KEY,
  order_date date NOT NULL,
  total_price int NOT NULL,
  id_account int NOT NULL,
  FOREIGN KEY (id_account) REFERENCES USERS(id)
);
GO

CREATE TABLE ORDER_DETAILS (
  order_id int NOT NULL,
  phone_id int NOT NULL,
  quantity int NOT NULL,
  PRIMARY KEY (order_id, phone_id),
  FOREIGN KEY (order_id) REFERENCES ORDERS(id),
  FOREIGN KEY (phone_id) REFERENCES PHONES(id)
);
GO

INSERT INTO ROLES ( name) VALUES
(N'Trưởng phòng'),
(N'Nhân viên');
GO

INSERT INTO USERS ( fullname, username, password_u, role_id, status_u ) VALUES
( N'Admin', 'admin', '123', 1, 1),
( N'Nguyễn Trung Quyết', 'quyet3010', '123', 2, 1),
( N'Nguyễn Thị Thủy Ngân', 'ngan123', '123', 2, 1),
( N'Nguyễn Thành Luân', 'luan123', '123', 2, 1),
( N'Nguyễn Tấn Phát', 'phat123', '123', 2, 1),
( N'Hoàng Thi Kim', 'kim123', '123', 2, 0);
GO

INSERT INTO PHONES (name, manufacturer, quantity, price) VALUES 
('Samsung Galaxy A33 5G', 'Samsung', 15, 7990000),
('Iphone 11 Promax', 'Apple', 18, 11900000),
('Oppo Reno 4', 'Oppo', 9, 8850000),
('Vivo J21', 'Vivo', 13, 7490000),
('ROG Phone 5', 'Asus', 20, 23950000),
('Samsung ZFlip 3', 'Samsung', 6, 19000000);
GO

INSERT INTO ORDERS (order_date, total_price, id_account) VALUES 
('2024-11-23', 7500000, 1),  -- Total price corrected to 7500000
('2024-11-24', 8000000, 4),  -- Total price corrected to 8000000
('2024-11-25', 5600000, 3),  -- Total price corrected to 5600000
('2024-10-26', 4750000, 6),  -- Total price corrected to 4750000
('2024-11-27', 7200000, 2),  -- Total price corrected to 7200000
('2024-11-28', 9400000, 5);  -- Total price corrected to 9400000
GO

INSERT INTO ORDER_DETAILS (order_id, phone_id, quantity) VALUES 
(1, 1, 2),  -- Order 1 contains 2 units of Phone 1
(1, 2, 1),  -- Order 1 contains 1 units of Phone 2
(2, 2, 3),  -- Order 2 contains 3 units of Phone 2
(3, 1, 5),  -- Order 3 contains 5 units of Phone 1
(3, 3, 3),  -- Order 3 contains 3 units of Phone 3
(4, 2, 2),  -- Order 4 contains 2 units of Phone 2
(4, 3, 2),  -- Order 4 contains 2 units of Phone 3
(5, 1, 3),  -- Order 5 contains 3 units of Phone 1
(5, 2, 1),  -- Order 5 contains 1 units of Phone 2
(6, 1, 4),  -- Order 6 contains 4 units of Phone 1
(6, 3, 1);  -- Order 6 contains 1 units of Phone 3
GO
SELECT * FROM PHONES;
SELECT * FROM ORDERS;
SELECT * FROM ORDER_DETAILS;
GO

