6. Нарисовать диаграмму, в которой есть класс родительский класс, домашние
   животные и вьючные животные, в составы которых в случае домашних
   животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные
   войдут: Лошади, верблюды и ослы).
![1](https://github.com/visetglov157/FinalCertification/assets/115417107/7d1633ef-7b79-46ea-8c7a-a80d5ca95e7e)
7. В подключенном MySQL репозитории создать базу данных “Друзья
   человека”
````bash
create database human_friends;
````
8. Создать таблицы с иерархией из диаграммы в БД
````bash
create database human_friends;
use human_friends;
create table animals
(
    Id INT auto_increment primary key,
    animal_type varchar(30)
);
insert into animals (animal_type)
values
	('Домашние животные'),
        ('Вьючные животные');
create table pets
(
	Id INT auto_increment primary key,
    animal_kind varchar(30) not null,
    animal_type_id INT default 1,
    foreign key (animal_type_id) references animals (id)
);
insert into pets (animal_kind)
values
        ('Собаки'),
        ('Кошки'),
        ('Хомяки');
CREATE TABLE pack_animals
(
	id INT AUTO_INCREMENT PRIMARY KEY,
	animal_kind VARCHAR(30),
	animal_type_id INT DEFAULT 2,
	FOREIGN KEY (animal_type_id) REFERENCES animals (id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO pack_animals (animal_kind)
VALUES 
	('Лошади'), 
        ('Верблюды'), 
        ('Ослы');  
````
9. Заполнить низкоуровневые таблицы именами(животных), командами которые они выполняют и датами рождения.
````bash
create table dogs
(
	Id INT auto_increment primary key,
    name varchar(30),
    commands varchar(100),
    birthday date,
    animal_kind_id INT default 1,
    foreign key (animal_kind_id) references pets (id) on delete cascade on update cascade
);
INSERT INTO dogs (name, commands, birthday)
VALUES 
	('Старк', 'лежать, сидеть', '2021-05-28'),
	('Бобик', 'дай лапу, фас', '2016-05-08'),
	('Снежок', 'место, голос', '2020-03-25');

create table cats
(       
    Id INT auto_increment primary key,
    name VARCHAR(30), 
    commands VARCHAR(100),
    birthday DATE,
    animal_kind_id INT DEFAULT 2,
    Foreign KEY (animal_kind_id) REFERENCES pets (id) ON DELETE CASCADE ON UPDATE CASCADE
);
INSERT INTO cats (name, commands, birthday)
VALUES 
	('Анфиса', 'лежать', '2022-03-15'),
	('Мурка', 'дай лапу', '2017-03-09'),
	('Кузя', 'ко мне', '2019-02-21');

CREATE TABLE hamsters 
(       
    id INT AUTO_INCREMENT PRIMARY KEY, 
    name VARCHAR(30), 
    commands VARCHAR(100),
    birthday DATE,
    animal_kind_id INT DEFAULT 3,
    Foreign KEY (animal_kind_id) REFERENCES pets (id) ON DELETE CASCADE ON UPDATE CASCADE
);
INSERT INTO hamsters (name, commands, birthday)
VALUES ('Рыжик', 'стоять', '2021-06-11'),
('Умка', 'гулять', '2016-02-19'),
('Черныш', 'кушать', '2019-04-21');

CREATE TABLE horses 
(       
    id INT AUTO_INCREMENT PRIMARY KEY, 
    name VARCHAR(30), 
    commands VARCHAR(100),
    birthday DATE,
    animal_kind_id INT DEFAULT 1,
    Foreign KEY (animal_kind_id) REFERENCES pack_animals (id) ON DELETE CASCADE ON UPDATE CASCADE
);
INSERT INTO horses (name, commands, birthday)
VALUES 
		('Призрак', 'тише, хоп, вперед', '2021-03-12'),
		('Орхидея', 'стой, рысь, шагом', '2016-05-15'),
		('Кондор', 'стой, шагом, хоп', '2018-02-27');

CREATE TABLE camels 
(       
    id INT AUTO_INCREMENT PRIMARY KEY, 
    name VARCHAR(30), 
    commands VARCHAR(100),
    birthday DATE,
    animal_kind_id INT DEFAULT 2,
    Foreign KEY (animal_kind_id) REFERENCES pack_animals (id) ON DELETE CASCADE ON UPDATE CASCADE
);
INSERT INTO camels (name, commands, birthday)
VALUES 
		('Джеси', 'гоп', '2021-02-15'),
		('Лип', 'пошел', '2016-11-05'),
		('Даси', 'стой', '2017-07-21');
````


