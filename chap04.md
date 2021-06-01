```mysql
   -- 创建数据库
create database if not exists schoolone default charset=utf8; 
-- 使用数据库
use schoolone;
-- 创建表格
create table if not exists studentInfo (
	id int primary key auto_increment,
	`name` varchar(20),
	sex char,
	age int,
	address varchar(100)
);
-- 查看数据表
show tables;

insert into studentInfo (`name`,sex,age,address) values('贾宝玉','男',18,'北平'),
('贾政','男',40,'浙江'),
('晴雯','女',20,'四川'),
('袭人','女',29,'贵州'),
('薛宝钗','女',19,'北平'),
('林黛玉','女',17,'浙江');
-- 查看数据  通配符 * 表示所有
select * from studentInfo
-- 手动写出字段 全量查询
select id,`name`,sex,age,address from studentInfo;
-- 只查询指定的数据列
select id,`name`,sex from studentInfo;
-- 条件查询
select * from studentInfo where sex ='女';
-- 根据查询结果排序
select * from studentInfo order by age asc;-- 年龄升序   asc 升序  desc 降序  order by 以...排序
select * from studentInfo order by age asc , id asc; -- 先按照年龄升序排序，再按照id升序排序
-- 现实查询结果的条数
select * from studentInfo limit 3;
select * from studentInfo limit 5,3;-- 显示查询结果中从5开始的往后3条数据
-- 复合
select * from studentInfo where sex = '女' order by age desc limit 3;

-- 别名 AS  as也可以省略
select id as 编号,`name` as 姓名,sex as 性别,age as 年龄,address as 地址 from studentInfo;
select id 编号,`name` 姓名,sex 性别,age 年龄,address 地址 from studentInfo;
-- 单条件查询
select * from studentInfo where age<20;
select * from studentInfo where age is not null;
-- 多条件查询
select * from studentInfo where age!=20;-- 不等于
select * from studentInfo where age<>20;-- 不等于
select * from studentInfo where not (age=20);-- 不等于
-- 与 and
select * from studentInfo where age>20 && sex='女';
select * from studentInfo where age>20 and sex='女';
-- 或 or
select * from studentInfo where age>20 || sex='女';
select * from studentInfo where age>20 or sex='女';
-- 去重，根据条件去除重复的数据
select distinct`name`,sex,age,address from studentInfo;
```

