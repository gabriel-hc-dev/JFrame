create table Login(
codigo int primary key not null,
usuario varchar(255) not null,
senha varchar(50) not null);

create table Servicos(
codigoServico int primary key not null,
descricaoServico varchar(255) not null,
valorServico real not null);
