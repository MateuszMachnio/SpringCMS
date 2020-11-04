CREATE DATABASE spring_homework
    CHARACTER SET utf8mb4
    COLLATE utf8mb4_unicode_ci;

create table authors
(
    id         bigint auto_increment
        primary key,
    first_name varchar(255) null,
    last_name  varchar(255) null
);

create table articles
(
    id         bigint auto_increment
        primary key,
    content    varchar(255) null,
    created_on datetime(6)  null,
    title      varchar(200) not null,
    updated_on datetime(6)  null,
    author_id  bigint       null,
    constraint FKglvhv5e43dmjhmiovwhcax7aq
        foreign key (author_id) references authors (id)
);

create table categories
(
    id          bigint auto_increment
        primary key,
    description varchar(255) null,
    name        varchar(100) not null,
    article_id  bigint       null,
    constraint FKfwrr572t0yh9tliyk1068kfxc
        foreign key (article_id) references articles (id)
);