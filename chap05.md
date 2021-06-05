```sql
create database Two20210603 default charset=utf8;
use Two20210603;

create table student(
	`name` varchar(10),
	sex char,
	age int,
	address varchar(100)
);

insert into student values ("孙悟空","男",520,"花果山"),
("猪八戒","男",1000,"高老庄"),("沙悟净","男",800,"流沙河"),("唐玄宗","男",28,"东土大唐"),
("孙行者","男",520,"果花山"),("行孙者","男",100,"❀山果"),("猪悟能","男",950,"天宫");

select * from student;

-- 模糊查询   like
# %匹配多个字符  _匹配一个字符
select * from student where `name` like "孙%";
select * from student where `name` like "孙__";
insert into student values("六耳猕猴",'男',500,'五行山'),("六小龄童",'男',500,'两开花'),
("江流儿",'男',5,'大唐'),("红孩儿",'男',5,'火焰山');

select * from student where `name` like "%者";
select * from student where `name` like "%";    #匹配所有的数据
select * from student where `name` like "_悟%";

select avg(age) from student;   -- 平均数
select count(*) from student;   -- 计数
select max(age) from student;   -- 最大值
select min(age) from student;   -- 最小值
select sum(age) from student;   -- 求和



```

```mysql
-- 分组查询
select avg(Degree) from score group by cno;
-- having 分组之后条件的筛选
select cno,avg(degree) from score group by cno having avg(degree)>80;
```

