<html>
<head>
<title>Gestion des Etablissments</title>
 <%@ taglib prefix="s" uri="/struts-tags" %>

<!-- jTable metro styles. -->
<link href="../css/metro/blue/jtable.css" rel="stylesheet" type="text/css" />
<link href="../css/jquery-ui-1.10.3.custom.css" rel="stylesheet" type="text/css" />

<!-- jTable script file. -->
<script src="../js/jquery-1.8.2.js" type="text/javascript"></script>
<script src="../js/jquery-ui-1.10.3.custom.js" type="text/javascript"></script>
<script src="../js/jquery.jtable.js" type="text/javascript"></script>
<!-- User defined Jtable js file -->

</head>
<body>

<br><br>
<br>

	<div
		style="width: 80%; margin-right: 10%; margin-left: 10%; text-align: center;">
		<h3>Gestion des Etablissments</h3>
		<div id="EtablissmentTableContainer"></div> 
	
	</div>
	
	<script>
	
	$(document).ready(function() {
	
			$('#EtablissmentTableContainer').jtable({
				title : 'Liste des Etablissments', //titre du tableau
				 paging : true, // Activer la pagination
		         pageSize : 3, //Par defaut: 10 
	   
	        
			actions : {
				listAction : 'listEtablissment',   //pour appeler la methode list
				createAction : 'createEtablissment', // pour appeler la methode create
				updateAction : 'updateEtablissment', // pour appeler la methode update
				deleteAction : 'deleteEtablissment' // pour appeler la methode delete
			},
			fields : { // la vous pouvez definir les attribut , ils doivent étre les mémes que la classe
				id_etablissement : {
					title : 'id Etablissment',
					  key: true,
					
					list : true, // activer l'affichage de l id
					edit : false, // activer la modification de l id
					create : true // affichage de la case id dans l ajout
					
				},
			
				
				nom : {
					title : 'Nom d etablissement',
					edit : true
				},
				tel : {
					title : 'Telephone',
					edit : true
				},
				fax : {
					title : 'FAX',
					edit : true
				},
				adresse : {
					title : 'Adresse',
					edit : true
				},
				raison_social : {
					title : 'Raison social',
					edit : true
				}
							       
			}
	    });
	    //Charger la liste des  Etablissement à partie de serveur
			  $('#EtablissmentTableContainer').jtable('load');
	});
	
	</script>
	

</body>
</html>
