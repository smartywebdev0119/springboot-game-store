
    create table product (
       id bigint generated by default as identity,
        image varchar(255),
        price double not null,
        product_name varchar(255),
        primary key (id)
    );