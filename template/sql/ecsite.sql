set names utf8;
set foreign_key_checks=0;
drop database if exists ecsite;

create database if not exsts ecsite;
use ecsite;

drop table if exists login_user_transaction;

create table login_user_transaction()id int not null primary key auto_increment,
login_id varchar(16)unique,
login_pass varchar(16),
user_name Varchar(50),
insert_datetime,
updated_date datetime
);

drop table if exists item_info_tranaction;

create table user_buy_item_transaction(
id int not null primary key auto_increment,
total_price_id int,
total_price int,
total_count int,
user_master\id varchar(16),
pay varchar(30),
insert_data datetime,
delete_date datetime
);

INSERT INTO item_info_transaction(item_name,item_price,item_stock)VALUES("ノートBook",100,50);

INSERT INTO login=user=transaction(login_id,login_pass,user_name)VALUES("internous","internous01","test");