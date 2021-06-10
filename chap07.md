```mysql
create database two20210610 default charset=utf8;

use two20210610;
CREATE TABLE `studentinfo` (
  `StudentID` char(10) DEFAULT NULL,
  `StudentName` varchar(20) DEFAULT NULL,
  `Gender` varchar(2) DEFAULT NULL,
  `Birthday` date DEFAULT NULL,
  `ClassID` int(4) DEFAULT NULL,
  `BeginYear` year(4) DEFAULT NULL,
  `Phone` varchar(11) DEFAULT NULL,
  `Province` varchar(20) DEFAULT NULL,
  `City` varchar(20) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table teacher (
    id int,
    teachername VARCHAR(10),
    hiredate DATE,
    gender char

);

create table classinfo (
    id int,   # 班级编号
    classname varchar(10),
    gradeid int,   # 年级编号
    beginyear varchar(10)  # 开始年份

);

create table subject (
    id int ,
    subjectname varchar(10),
    teacherid int 
    
);

create table exam (
    id int,
    exam int,
    subjectid int,
    studentid int,
    remark varchar(10) # 备注
);

create table grade(
    id int ,
    gradename varchar(10),
    major varchar(20)
);

INSERT INTO `two20210610`.`classinfo`(`id`, `classname`, `gradeid`, `beginyear`) VALUES (2001, '20级1班', 20, '2020');
INSERT INTO `two20210610`.`classinfo`(`id`, `classname`, `gradeid`, `beginyear`) VALUES (2002, '20级2班', 20, '2020');

INSERT INTO `two20210610`.`exam`(`id`, `exam`, `subjectid`, `studentid`, `remark`) VALUES (1, 98, 101, 1, '无');
INSERT INTO `two20210610`.`exam`(`id`, `exam`, `subjectid`, `studentid`, `remark`) VALUES (2, 89, 102, 1, NULL);
INSERT INTO `two20210610`.`exam`(`id`, `exam`, `subjectid`, `studentid`, `remark`) VALUES (3, 79, 103, 1, '');
INSERT INTO `two20210610`.`exam`(`id`, `exam`, `subjectid`, `studentid`, `remark`) VALUES (4, 96, 104, 1, NULL);
INSERT INTO `two20210610`.`exam`(`id`, `exam`, `subjectid`, `studentid`, `remark`) VALUES (5, 85, 101, 2, NULL);
INSERT INTO `two20210610`.`exam`(`id`, `exam`, `subjectid`, `studentid`, `remark`) VALUES (6, 89, 102, 2, NULL);
INSERT INTO `two20210610`.`exam`(`id`, `exam`, `subjectid`, `studentid`, `remark`) VALUES (7, 79, 103, 2, NULL);
INSERT INTO `two20210610`.`exam`(`id`, `exam`, `subjectid`, `studentid`, `remark`) VALUES (8, 83, 104, 2, NULL);


INSERT INTO `two20210610`.`grade`(`id`, `gradename`, `major`) VALUES (20, '20级', '软件技术');


INSERT INTO `two20210610`.`studentinfo`(`StudentID`, `StudentName`, `Gender`, `Birthday`, `ClassID`, `BeginYear`, `Phone`, `Province`, `City`, `Email`) VALUES ('1', '张无忌', '男', '2021-06-10', 2001, 2020, '13012340001', '河南', '许昌', 'zwj@qq.com');
INSERT INTO `two20210610`.`studentinfo`(`StudentID`, `StudentName`, `Gender`, `Birthday`, `ClassID`, `BeginYear`, `Phone`, `Province`, `City`, `Email`) VALUES ('2', '张铁牛', '男', '2021-06-16', 2001, 2020, '13012340002', '河南', '许昌', 'ztn@qq.com');
INSERT INTO `two20210610`.`studentinfo`(`StudentID`, `StudentName`, `Gender`, `Birthday`, `ClassID`, `BeginYear`, `Phone`, `Province`, `City`, `Email`) VALUES ('3', '林平之', '男', '2021-06-15', 2001, 2020, '13012340003', '河南', '安阳', 'lpz@qq.com');
INSERT INTO `two20210610`.`studentinfo`(`StudentID`, `StudentName`, `Gender`, `Birthday`, `ClassID`, `BeginYear`, `Phone`, `Province`, `City`, `Email`) VALUES ('4', '令狐冲', '男', '2021-06-08', 2002, 2019, '13012340004', '河南', '濮阳', 'lhc@qq.com');
INSERT INTO `two20210610`.`studentinfo`(`StudentID`, `StudentName`, `Gender`, `Birthday`, `ClassID`, `BeginYear`, `Phone`, `Province`, `City`, `Email`) VALUES ('5', '岳灵珊', '女', '2021-06-02', 2002, 2019, '13012340005', '河南', '南阳', 'yls@qq.com');


INSERT INTO `two20210610`.`subject`(`id`, `subjectname`, `teacherid`) VALUES (101, 'mysql', 201);
INSERT INTO `two20210610`.`subject`(`id`, `subjectname`, `teacherid`) VALUES (102, 'java基础', 201);
INSERT INTO `two20210610`.`subject`(`id`, `subjectname`, `teacherid`) VALUES (103, '面向对象', 202);
INSERT INTO `two20210610`.`subject`(`id`, `subjectname`, `teacherid`) VALUES (104, '网页设计', 202);



INSERT INTO `two20210610`.`teacher`(`id`, `teachername`, `hiredate`, `gender`) VALUES (201, 'hys', '2021-06-04', '男');
INSERT INTO `two20210610`.`teacher`(`id`, `teachername`, `hiredate`, `gender`) VALUES (202, 'dj', '2021-06-01', '女');


-- 子查询  用子查询实现，查询出学生“林平之”的同班同学  
# 1 找到林平之 的班级
# 2 查同班同学

#  找到林平之 的班级
select classid from studentinfo where studentname='林平之';
# 根据班级查询同班同学信息
select * from studentinfo where classid='2001';
# 合并
select * from studentinfo where classid=(select classid from studentinfo where studentname='林平之');

# 查询《mysql》考试成绩刚好等于90分的学生名单
-- 1 需要查询学生名单 在studentinfo
-- 2 科目是mysql 在subject表中 id
-- 3 成绩为98 在exam表中 subjectid  studentid
-- 方法一
select studentname from studentinfo S inner join exam e on S.StudentID=e.studentid inner join `subject` on e.subjectid=`subject`.id where `subject`.subjectname='mysql' and e.exam=98;
-- 方法二
select studentname '学生姓名' from studentinfo s where 
s.StudentID=(select id from exam where 
exam=98 and subjectid=(select id from subject where subjectname='mysql') )

-- 更新令狐冲的网页设计成绩+5分

-- 找到......成绩
update exam set exam = exam + 5 where subjectid = ?
-- 找到mysql课程的id
select id from subject where subjectname='网页设计'
-- 根据名字找id
select id from teacher where teachername='dj'

-- 融合
update exam set exam = exam + 5 where subjectid = (select id from subject where subjectname = '网页设计' and subject.teacherid = (select id from teacher where teachername='dj'
))

-- 删除张无忌的所有考试成绩
-- 1 找到张无忌地学生id
select studentid from studentinfo where studentname='张无忌'
-- 2 根据id在exam表中删除成绩
delete from exam where studentid=?
-- 合并 
delete from exam where studentid=(select studentid from studentinfo where StudentName='张无忌');

-- 插入的子查询  把查询的结果作为内容  插入到新的数据
insert into studentinfo (select * from studentinfo where studentid=5);


# 查询《mysql》考试成绩刚好等于90分的学生名单
-- 1 需要查询学生名单 在studentinfo
-- 2 科目是mysql 在subject表中 id
-- 3 成绩为98 在exam表中 subjectid  studentid
-- 方法一
select studentname from studentinfo S inner join exam e on S.StudentID=e.studentid inner join `subject` on e.subjectid=`subject`.id where `subject`.subjectname='mysql' and e.exam=85;
-- 方法二
select studentname '学生姓名' from studentinfo s where 
s.StudentID in (select id from exam where 
exam=85 and subjectid in (select id from subject where subjectname='mysql') )

-- 查询成绩中科目编号为102的考试成绩中是否存在不及格的学生,如果存在不及格的学生就将参加科目编号102考试的学生编号和成绩全部显示出来
-- 是否存在不及格的学生
select studentid from exam where exam<80
-- 参加科目102编号考试的学生
where subjectid=102
-- 学生编号和成绩全部查询显示出来
select studentid,exam from exam
-- 融合
select studentid,exam from exam where subjectid=102 and exists (select studentid from exam where exam<80)



-- 查询成绩比科目编号为101的这门课程的所有成绩都小的学生信息
-- 查询...学生考试信息
select * from exam where ?
-- 成绩比科目编号为101的这门课程的所有成绩都小
all(select exam from exam where subjectid=101)
-- 合并
select * from exam where exam < all(select exam from exam where subjectid=101);


-- 查询成绩比科目编号为101的任意一个成绩都小的学生信息
-- 查询...学生考试信息
select * from exam where ?
-- 成绩比科目编号为101的这门课程的所有成绩都小
all(select exam from exam where subjectid=101)
-- 合并
select * from exam where exam < any(select exam from exam where subjectid=101);

select * from exam where exam < some(select exam from exam where subjectid=101);


```

