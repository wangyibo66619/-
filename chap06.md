```mysql
-- 交叉连接
select Student.Sno,sname,class,Degree from student,score;
-- 内连接
select Student.Sno,sname,class,Degree from student,score where student.Sno=score.Sno;

-- 内连接
select Student.Sno,sname,class,Degree from student inner join score where student.sno=score.sno;

-- 左外连接
select student.sno,sname,degree from Student left join score on student.sno=score.sno ;

-- 右外连接
select student.sno,sname,degree from Student right join score on student.sno=score.sno ;

-- 全外连接
select student.*,score.* from student full join score on student.sno=score.sno;
```

