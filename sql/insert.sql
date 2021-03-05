INSERT INTO situationMatrimoniale (denomination) VALUES ('célibataire'), ('marié'), ('veuf');
GO;

INSERT INTO utilisateurs (login, password) VALUES
('admin', 'admin'),
('Gesti01', 'azerty'),
('MariaDolores', '123456'),
('ArthurFizpatrick', 'password'),
('EvaFlow', '');
GO;

INSERT INTO administrateur (id_utilisateur) VALUES (1);
GO;

INSERT INTO agent (id_utilisateur, matricule, dateDebutContrat, adresse, nom, prenom, mail, telephone) VALUES (2, 'G1', '2021/01/01', '99999 Ulan Bator', 'Edouard', 'Malord', 'edouard.malord@gestibank.com', '0612345678');
GO;

INSERT INTO client (id_utilisateur, isValid, agent_utilisateur_id, nbEnfant, adresse, nom, prenom, mail, telephone, situation_id) VALUES
(3, 1, 2, 0, '13 rue Rimbault 99999 Ulan Bator', 'Dolores', 'Maria', 'mariad@gmail.com', '0600000000', 1),
(4, 1, 2, 2, '25 avenue Grande Ourse 99999 Ulan Bator', 'Fizpatrick', 'Arthur', 'matzard03@gmail.com', '0687654321', 2),
(5, 0, 2, 0, '1 place de la marche 99999 Ulan Bator', 'Flow', 'Eva', 'eva-flow-01@gmail.com', '0612345678', 1);
GO;
