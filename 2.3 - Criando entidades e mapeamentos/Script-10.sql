create table TB_EMPRESA (
	ID_EMPRESA SERIAL primary key,
	NOME_EMPRESA VARCHAR(100) not null,
	DESCRICAO_EMPRESA VARCHAR(255) not null
);

create table TB_EMPREGADO (
	ID_EMPREGADO SERIAL primary key,
	NOME_EMPREGADO VARCHAR(100) not null,
	FUNCAO VARCHAR(50) not null,
	ID_EMPRESA integer,
	constraint fk_id_empresa
	foreign key (ID_EMPRESA)
	references TB_EMPRESA(ID_EMPRESA)
);

create table TB_COMPETENCIA (
	ID_COMP SERIAL primary key,
	NOME_COMP VARCHAR(100) not null,
	ID_EMPREGADO integer,
	constraint fk_id_empregado
	foreign key (ID_EMPREGADO)
	references TB_EMPREGADO(ID_EMPREGADO)
);


INSERT INTO TB_EMPRESA (id_empresa, nome_empresa,descricao_empresa) VALUES
	 (999, 'STEELIX','Maior metalurgica do bairro e região');

INSERT INTO TB_EMPREGADO (id_empregado,nome_empregado,funcao,id_empresa) VALUES
	 (997,'Emilio Silva','Desenvolvedor',999),
	 (998,'Denis Santos','Analista de testes',999),
	 (999,'Sammy Soares','Gerente',999);


INSERT INTO TB_COMPETENCIA (id_comp,nome_comp,id_empregado) VALUES
	 (990,'Java',997),
	 (991,'SQL',997),
	 (992,'Automação',998),
	 (993,'Inglês fluente',998),
	 (994,'Resolução de conflitos',999),
	 (995,'Liderança',999);
