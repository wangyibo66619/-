```mysql
create database school;-- 创建数据库

show databases;-- 显示数据库

use school;-- 使用数据库
-- 创建学生
create table studentInfo (
	id int,
	`name` varchar(10),  -- name是关键字有高亮，使用exc下面的波浪键让它变成正常的
	age int,
	sex char,
	province char primary key  -- 主键
);

show tables;-- 显示表格

desc studentInfo;-- 描述表格具体信息


create table studentInfo1 (
	id int, 
	name varchar(10),
	age int,
	sex char,
	province char(3),
	primary key(id,name) -- 联合主键
);

-- 创建表格
create table book(
	id int auto_increment primary key,  --  自动增长id
	`name` varchar(20),
	author char(4)
);
alter table book rename books ;  -- 修改表结构 改名为books
-- 向表格中插入数据
insert into books(`name`,author) values('钢铁是怎样炼成的','保尔');
insert into books(`name`,author) values('坏蛋是怎样炼成的','宝儿');
insert into books(`name`,author) values('人渣是怎样炼成的','鲍尔');

select * from books;-- 查询表格中的全部数据


create table address1(
	province varchar(10),
	shi varchar(10),
	xian varchar(10),
	cun varchar(10),
	constraint waijian foreign key (province) references studentInfo(province)-- 外键   
	-- studentInfo 主表、父表				address1 	从表、子表
	
);


create table student(
	`name` varchar(10),
	sex char default '男',
	province varchar(10) default '河南',
	age int
	
);
-- 添加数据方法
insert into student(`name`,age) values ("小爱",18);
insert into student(`name`,age) values ("小鸟",18);
-- 查看student表格所有数据
select * from students;
-- 添加数据方法
insert into student(`name` , sex , province , age)values('小祺','女','河南省',18);
-- 添加数据方法
insert into student values ('大鸟','男','河南',18) ;
insert into student values ('大鸟','男','河南',18) ;

alter table student change `name` `name` varchar(10) not null unique;-- 改变现有表格的属性    
-- unique 唯一     not null 不为空
alter table student rename to students;-- 修改表格名字    rename重命名
desc students;

alter table students modify `name` varchar(20); -- 修改表格的字段属性
alter table students change sex xingbie varchar(5) ; -- 改变字段的名称
alter table students add grade varchar(4); -- 修改表格，添加一个字段
alter table students modify age int(11) after grade; -- 修改年龄字段在成绩的后面


```




