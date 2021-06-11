```mysql
create database two20210611 default charset=utf8;

use two20210611;


create table student (
studentid char(10) primary key,
studentname varchar(10) not null,
gender varchar(2),
age int,
index(studentname) -- 索引
)

show create table student;

insert into student values ('1','丘处机','男',46);
select * from student;

-- 执行计划  explain
explain select * from student where studentname='丘处机';    -- select_type：primary 主查询  union 联合查询  subquery 子查询 simple 普通查询 


-- 组合索引 
create table student2(
studentid char(10) primary key,
studentname varchar(10) not null,
age int,
city varchar(10),
dormitoryNo varchar(5),  -- 宿舍编号
index MultiIndex(city,dormitoryNo) # 组合索引
);

show create table student2;
insert into student2 values ('1','杨过',19,'活死人墓','002');

select * from student2 where studentname='杨过';

explain select * from student2 where city='活死人墓' and dormitoryNo='002';

-- 删除索引
alter table student drop index studentname;
-- 添加索引
create index studentname on student(studentname);

-- 事务 
create table user(
	u_name varchar(20),
	unique(u_name)
)

insert into user values ('小龙女');
select * from user; 

begin;-- 事务的开始
insert into user values ('李莫愁');
commit;-- 事务的结束

begin;
insert into user values ('郭靖');
commit;

begin;
insert into user values('宋江');
rollback;-- 回滚

-- 回滚点
begin;
insert into user values('A');
savepoint first_point; -- 设置命名标记
insert into user values('B');
rollback to savepoint first_point;-- 回滚到制定标记
insert into user values('C');
commit;

select * from user;
```

