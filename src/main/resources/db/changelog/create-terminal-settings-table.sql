--changeset lr_changeset:3
create table terminal_settings (
    id varchar (36) primary key,
    name varchar (64) not null,
    value varchar (256) null
);