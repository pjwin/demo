create table if not exists customer
(
    cust_id   integer generated always as identity
    constraint pk_customer
    primary key,
    cust_name varchar(200) not null,
    addr1     varchar(200),
    city      varchar(200),
    state     varchar(30),
    zip       varchar(10)
    );

alter table customer
    owner to postgres;

create table if not exists employee
(
    emp_id     integer generated always as identity
    constraint pk_employee
    primary key,
    first_name varchar(100) not null,
    last_name  varchar(100) not null,
    photo_uri  varchar(255),
    cust_id    integer
    constraint fk_employee_cust_id
    references customer (cust_id)
    );

alter table employee
    owner to postgres;

create table if not exists item
(
    item_id     integer generated always as identity
    constraint pk_item
    primary key,
    description varchar not null,
    price       money
);

alter table item
    owner to postgres;

create table if not exists "order"
(
    order_id integer generated always as identity
    constraint pk_order
    primary key,
    cust_id  integer not null
    constraint fk_order_cust_id
    references customer
);

alter table "order"
    owner to postgres;

create table if not exists order_item
(
    order_order_id integer generated always as identity
    constraint fk_order_item_order_id
    references "order",
    item_item_id   integer generated always as identity
    constraint fk_order_item_item_id
    references item
);

alter table order_item
    owner to postgres;

