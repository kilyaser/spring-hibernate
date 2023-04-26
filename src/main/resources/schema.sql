drop table if exists users cascade;
create table users (id bigserial primary key, name varchar(255));
insert into users (name) values ('John'), ('Bob');

drop table if exists bank_cards cascade;
create table bank_cards (id bigserial primary key , card_number varchar(255), user_id bigint references users(id));
insert into bank_cards (card_number, user_id) values ('11111111111111', 1), ('2222222222222', 1), ('3333333333', 2);


