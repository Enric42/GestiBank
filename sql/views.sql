CREATE VIEW dbo.V_DEBITS as
SELECT -montant as montant, date, id_compte_source as idCompte, 'retrait' as libelle , 'retrait' as typeOperation FROM dbo.retrait
  UNION
    SELECT -montant as montant, date, id_compte_source as idCompte, libelle, 'virement' as typeOperation FROM dbo.virement;
	go
CREATE VIEW V_CREDITS as
    SELECT montant, date, id_compte_cible as idCompte, 'depot' as libelle, 'depot' as typeOperation FROM dbo.depot
  UNION
    SELECT montant, date, id_compte_cible as idCompte, libelle, 'virement' as typeOperation FROM dbo.virement;
	go
CREATE VIEW V_OPERATIONS as
    SELECT -montant as montant, date, id_compte_source as idCompte, 'retrait' as libelle , 'retrait' as typeOperation FROM dbo.retrait
  UNION
    SELECT -montant as montant, date, id_compte_source as idCompte, libelle, 'virement' as typeOperation FROM dbo.virement    
  UNION
    SELECT montant, date, id_compte_cible as idCompte, 'depot' as libelle, 'depot' as typeOperation FROM dbo.depot
  UNION
    SELECT montant, date, id_compte_cible as idCompte, libelle, 'virement' as typeOperation FROM dbo.virement;
	go
CREATE VIEW V_compte_beneficiaire AS
  SELECT compte_rib, libelle, id_utilisateur, false as proprietaire FROM client_has_beneficiaires
  UNION
  SELECT compte.rib as rib, CONCAT(client.nom, ' ', client.prenom) as libelle, compte.id_client as id_client, true as proprietaire 
    FROM compte compte
    INNER JOIN client client ON client.id_utilisateur = compte.id_client