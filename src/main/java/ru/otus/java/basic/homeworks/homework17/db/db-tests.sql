create sequence tests_id_seq start 1;
create sequence questions_id_seq start 1;
create sequence answers_id_seq start 1;

create table tests_tab (
	id integer default nextval('tests_id_seq') primary key,
	code varchar(20) not null,
	name varchar(30),
	description varchar(200),
	created_at timestamp default current_timestamp,
	constraint test_code unique (code)
);

create table questions_tab (
	id integer default nextval('questions_id_seq') primary key,
	test_id integer not null,
	code varchar(20) not null,
	"text" varchar(200) not null,
	created_at timestamp default current_timestamp,
	foreign key (test_id) references tests_tab (id),
	constraint question_code unique (code)
);

create table answers_tab (
	id integer default nextval('answers_id_seq') primary key,
	question_id integer not null,
	"text" varchar(200) not null,
	correct_fl char(1) check (correct_fl in ('Y','N')),
	created_at timestamp default current_timestamp,
	foreign key (question_id) references questions_tab (id)
);

----------------------------------

insert into tests_tab (code, name, description)
values ('t_code_1', 'Тест №1', 'Первый тест');

insert into questions_tab (test_id ,code, "text")
values (1,'q_code_1','Какой вопрос №1?'),(1,'q_code_2','Какой вопрос №2?');

insert into answers_tab (question_id,"text",correct_fl)
values (1,'Yes', 'N'), (1,'No','Y'),(2,'Yes', 'Y'), (2,'No','N');

----------------------------------

select tt.code as Test_Code,
	   tt."name" as Test_Name,
	   qt."text" as Question_Text,
	   at2."text" as Answer_Text
from tests_tab tt
	join questions_tab qt on qt.test_id = tt.id
	join answers_tab at2 on at2.question_id = qt.id
where tt.code = 't_code_1'
and at2.correct_fl = 'Y';
