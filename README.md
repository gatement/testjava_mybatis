# testjava_mybatis
mybatis demo

## Run
* mvn exec:java

## Database
* create database mybatis_test;
* create table blog(id int not null auto_increment primary key, name varchar(64) not null);
* insert into blog(name) values("Johnson Lau");
* insert into blog(name) values("Johnson Liu");
* insert into blog(name) values("Gatement");

## Reference
* http://www.mybatis.org/mybatis-3/zh/getting-started.html