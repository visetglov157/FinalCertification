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
````
