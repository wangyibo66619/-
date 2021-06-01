```mysql
create database xuexiao;

use xuexiao;

create table studentInfo(
	`name` varchar(10),
	sex char,
	age int,
	address varchar(20)
);

show tables;
-- 插入操作
-- 值需要按照字段的顺序插入，如果插入的值和创建表顺序相同，则字段可以省略
insert into studentInfo(`name`,sex,age,address) values ('大鸟','男',18,'河南省');
insert into studentInfo(sex,age,`name`,address) values ('男',18,'小鸟','河南省');
insert into studentInfo values('小小鸟','男',15,'河南省');

-- 修改已创建的表字段默认值
alter table studentInfo change sex sex char default '男';

insert into studentInfo(`name`,sex,age,address) values ('宋江','',32,'山东');
insert into studentInfo(sex,age,`name`,address) values ('女',18,'小花','河南省');
insert into studentInfo values('武松','男',25,'山东省');-- 有默认值 如果省略字段，则值需要写全

select * from studentInfo;


create table studentInfo2(
	id int auto_increment primary key,
	`name` varchar(10),
	sex char,
	age int,
	address varchar(20)
);

show tables;


insert into studentInfo2(id,`name`,sex,age,address) values (1,'宋江','男',32,'山东');
insert into studentInfo2(`name`,sex,age,address) values ('武松','男',25,'山东');
insert into studentInfo2(id,`name`,sex,age,address) values (3,'燕青','男',24,'山东');
insert into studentInfo2(`name`,sex,age,address) values ('鲁智深','男',25,'山东'),
('杨志','男',23,'山东'),
('林冲','男',28,'山东'),
('石秀','男',23,'山东'),
('卢俊义','男',35,'山东');

select * from studentInfo2;


insert into studentInfo2 values (9,'李逵','男',25,'山东'),
(10,'时迁','男',23,'山东'),
(11,'吴用','男',28,'山东'),
(12,'花荣','男',23,'山东'),
(13,'潘金莲','女',18,'山东');


-- 修改  update...set...where条件
update studentInfo2 set name = '西门庆' where name = '潘金莲';-- 修改指定的数据
update studentInfo2 set name = '西门庆' ;-- 没有写条件，修改全部的数据

-- 删除 delete from table_name where...    有日志留下，可以恢复
delete from studentInfo2 where name = '西门庆';-- 删除符合条件的数据

delete from studentInfo;-- 删除所有数据

-- 销毁数据   不留下日志，速度快，无法恢复
truncate table studentInfo;

delete from studentInfo2 where name = '吴用';

insert into studentInfo2 values (11,'吴用','男',25,'山东');

update studentInfo2 set age = 28 where name = '吴用'; 


```

