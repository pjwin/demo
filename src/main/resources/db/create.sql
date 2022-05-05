create table customer
(
    cust_id   integer generated always as identity
        primary key,
    cust_name varchar(200)
);

alter table customer
    owner to postgres;

create table employee
(
    emp_id     integer      not null
        constraint employee_pk
            primary key,
    first_name varchar(100) not null,
    last_name  varchar(100) not null,
    photo_uri  varchar(255),
    cust_id    integer
        constraint employee_customer_fk
            references customer
);

alter table employee
    owner to postgres;


