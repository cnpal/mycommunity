create table user
(
    id int auto_increment,
    account_id varchar(100),
    name varchar(50),
    token varchar(36),
    gmt_create bigint,
    gmt_modified bigint,
    bio varchar(256),
    constraint user_pk
        primary key (id)
);
create table question
(
    id int auto_increment,
    title varchar(50),
    description text,
    gmt_create bigint,
    gmt_modified bigint,
    creator int,
    comment_count int,
    view_count int,
    like_count int,
    tags varchar(256),
    constraint question_pk
        primary key (id)
);
create table question
(
    id int auto_increment,
    title varchar(50),
    description text,
    gmt_create bigint,
    gmt_modified bigint,
    creator int,
    comment_count int,
    view_count int,
    like_count int,
    tags varchar(256),
    constraint question_pk
        primary key (id)
);
