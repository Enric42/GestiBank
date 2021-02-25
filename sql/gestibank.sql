create table utilisateurs(
	id int primary key identity,
	login varchar(255) not null,
	password varchar(255) not null
);

create table situationMatrimoniale(
	id tinyint primary key identity,
	denomination varchar(255) not null
);

create table agent(
	id_utilisateur int primary key,
	matricule varchar(2) not null unique,
	dateDebutContrat datetime not null default GETDATE(),
	adresse varchar(255) not null default 'defaultAdresse',
	nom varchar(255) not null default 'defaultName',
	prenom varchar(255) not null default 'defaultPrenom',
	mail varchar(255) not null default 'maximebras2@gmail.com',
	telephone varchar(10) not null default '0646751497',
	foreign key (id_utilisateur) references utilisateurs(id)
);

create table client(
	id_utilisateur int primary key,
	isValid bit not null default 'false',
	agent_utilisateur_id int not null,
	nbEnfant tinyint not null default 0,
	adresse varchar(255) not null default 'defaultAdresse',
	nom varchar(255) not null default 'defaultName',
	prenom varchar(255) not null default 'defaultPrenom',
	mail varchar(255) not null default 'maximebras2@gmail.com',
	telephone varchar(10) not null default '0646751497',
	situation_id tinyint not null,
	foreign key(agent_utilisateur_id) references agent(id_utilisateur),
	foreign key(situation_id) references situationMatrimoniale(id)
);

create table typeCompte(
	id tinyint primary key identity,
	denomination varchar(255) not null
);
create table compte(
	rib varchar(33) primary key,
	id_type_compte tinyint ,
	id_client int not null,
	facilite_caisse float,
	seuil float,
	is_valid bit not null default 0,
	foreign key (id_type_compte) references typeCompte(id),
	foreign key (id_client) references client(id_utilisateur)
);

create table virement(
	id int primary key identity,
	montant float not null,
	date datetime not null,
	libelle varchar(50) not null,
	id_compte_source varchar(33) not null,
	id_compte_cible varchar(33) not null,
	foreign key (id_compte_source) references compte(rib),
	foreign key (id_compte_cible) references compte(rib)
);

create table depot(
	id int primary key identity,
	montant float not null,
	date datetime not null,
	id_compte_cible varchar(33) not null,
	foreign key (id_compte_cible) references compte(rib)
);

create table retrait(
	id int primary key identity,
	montant float not null,
	date datetime not null,
	id_compte_source varchar(33) not null,
	foreign key (id_compte_source) references compte(rib)
)

create table client_has_beneficiaires(
	compte_rib varchar(33),
	id_utilisateur int,
	libelle varchar(50) not null default 'defaut libelle',
	primary key (compte_rib, id_utilisateur),
	foreign key (compte_rib) references compte(rib),
	foreign key (id_utilisateur) references  client(id_utilisateur)

)
create table administrateur(
	id_utilisateur int primary key,
	foreign key (id_utilisateur) references utilisateurs (id)
)