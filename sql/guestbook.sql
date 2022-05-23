-- guestbook

desc guestbook;

-- findAll()
select * from guestbook;
select no, name, password, message, date_format(reg_date, '%Y년 %m월 %d일 %h시 %i분 %s초') as '현재시간' from guestbook order by reg_date desc;
-- insert()
insert into guestbook values(null, '이름', '비번', '내용', sysdate());
-- delete()