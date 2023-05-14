--changeset lr_changeset:1
create table terminal (
    id varchar (36) primary key,
    name varchar (255) not null,
    description varchar (400) null,
    status varchar (10) not null
);