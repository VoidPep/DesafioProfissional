create table funcionarios (

    id bigint not null auto_increment,
    nome varchar(60) not null,
    email varchar(60) not null,
    cpf varchar(14) not null,
    pis varchar(13) not null,
    logradouro varchar(40) not null,
    bairro varchar(40) not null,
    cep varchar(40) not null,
    numero varchar(40) not null,
    complemento varchar(40) not null,
    cidade varchar(40) not null,
    uf varchar(40) not null,
    horarioDeEntrada time not null,
    horarioDeSaida time not null,
    salario decimal not null,

    primary key(id)
)
