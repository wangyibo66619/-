```mysql
create database school;-- �������ݿ�

show databases;-- ��ʾ���ݿ�

use school;-- ʹ�����ݿ�
-- ����ѧ��
create table studentInfo (
	id int,
	`name` varchar(10),  -- name�ǹؼ����и�����ʹ��exc����Ĳ��˼��������������
	age int,
	sex char,
	province char primary key  -- ����
);

show tables;-- ��ʾ���

desc studentInfo;-- ������������Ϣ


create table studentInfo1 (
	id int, 
	name varchar(10),
	age int,
	sex char,
	province char(3),
	primary key(id,name) -- ��������
);

-- �������
create table book(
	id int auto_increment primary key,  --  �Զ�����id
	`name` varchar(20),
	author char(4)
);
alter table book rename books ;  -- �޸ı�ṹ ����Ϊbooks
-- �����в�������
insert into books(`name`,author) values('�������������ɵ�','����');
insert into books(`name`,author) values('�������������ɵ�','����');
insert into books(`name`,author) values('�������������ɵ�','����');

select * from books;-- ��ѯ����е�ȫ������


create table address1(
	province varchar(10),
	shi varchar(10),
	xian varchar(10),
	cun varchar(10),
	constraint waijian foreign key (province) references studentInfo(province)-- ���   
	-- studentInfo ��������				address1 	�ӱ��ӱ�
	
);


create table student(
	`name` varchar(10),
	sex char default '��',
	province varchar(10) default '����',
	age int
	
);
-- ������ݷ���
insert into student(`name`,age) values ("С��",18);
insert into student(`name`,age) values ("С��",18);
-- �鿴student�����������
select * from students;
-- ������ݷ���
insert into student(`name` , sex , province , age)values('С��','Ů','����ʡ',18);
-- ������ݷ���
insert into student values ('����','��','����',18) ;
insert into student values ('����','��','����',18) ;

alter table student change `name` `name` varchar(10) not null unique;-- �ı����б�������    
-- unique Ψһ     not null ��Ϊ��
alter table student rename to students;-- �޸ı������    rename������
desc students;

alter table students modify `name` varchar(20); -- �޸ı����ֶ�����
alter table students change sex xingbie varchar(5) ; -- �ı��ֶε�����
alter table students add grade varchar(4); -- �޸ı�����һ���ֶ�
alter table students modify age int(11) after grade; -- �޸������ֶ��ڳɼ��ĺ���


```




