drop database if exists colegio2;
create database colegio2;
use colegio2;
create table cursos(
	codigo int auto_increment primary key,
    codigoTitulo int not null,
    profesor varchar(25) not null,
    dia enum('lunes','martes','miercoles','jueves','viernes'),
    turno enum('mañana','tarde','noche')
);
create table alumnos(
    codigo int auto_increment primary key,
    nombre varchar(25) not null,
    apellido varchar(25) not null,
    edad int,
    codigoCurso int not null
);
alter table alumnos
	add constraint fk_alumnosIdCursos
	foreign key(codigoCurso)
    references cursos(codigo)
    on delete cascade;
    
create table titulocurso(
	codigo int auto_increment primary key,
	titulo varchar(25),
    duracion int,
    requerimientos varchar(255)
);

alter table cursos
	add constraint fk_tituloscurso
    foreign key(codigoTitulo)
    references TituloCurso(codigo)
    on delete cascade;

select * from cursos;
