create schema if not exists netology;
create table if not exists persons(
    name varchar(255),
    surname varchar(255),
    age int,
    phone_number int,
    city_of_living varchar(255),
    primary key (name, surname, age)
    );

insert into persons(
    name,
    surname,
    age,
    phone_number,
    city_of_living
) values
('Petr', 'Petrov', 35, 111111, 'Moscow'),
('Ivan', 'Ivanov', 28, 222222, 'Samara'),
('Sergey', 'Sergeev', 24, 333333, 'Saint-Petersburg'),
('Maria', 'Fedorova', 22, 444444, 'Moscow');