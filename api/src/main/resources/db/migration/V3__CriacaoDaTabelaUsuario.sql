create table funcionarios (

    id bigint not null auto_increment,
    nome varchar(60) not null,
    email varchar(60) not null,
    cpf varchar(14) not null,
    senha varchar(20) not null,
    admin tinyint default 0,

    primary key(id)
)
