<html>
<head>
<title>Gestion des Personnes</title>
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
		<h3>Gestion des Personnes</h3>
		<div id="PersonneTableContainer"></div> 
	
	</div>
	
	<script>
	
	$(document).ready(function() {
	
			$('#PersonneTableContainer').jtable({
				title : 'Liste des Personnes', //titre du tableau
				 paging : true, // Activer la pagination
		         pageSize : 3, //Par defaut: 10 
	   
	        
			actions : {
				listAction : 'listPersonne',   //pour appeler la methode list
				createAction : 'createPersonne', // pour appeler la methode create
				updateAction : 'updatePersonne', // pour appeler la methode update
				deleteAction : 'deletePersonne' // pour appeler la methode delete
			},
			fields : { // la vous pouvez definir les attribut , ils doivent étre les mémes que la classe
				id_personne : {
					title : 'id Personne',
					  key: true,
					
					list : true, // activer l'affichage de l id
					edit : false, // activer la modification de l id
					create : true // affichage de la case id dans l ajout
					
				},
			
				
				nom : {
					title : 'Nom ',
					edit : true
				},
				prenom : {
					title : 'Prénom',
					edit : true
				},
				login : {
					title : 'Login',
					edit : true
				},
				password : {
					title : 'Password',
					edit : true
				},
				raison_social : {
					title : 'Raison social',
					edit : true
				}
							       
			}
	    });
	    //Charger la liste des  Etablissement à partie de serveur
			  $('#PersonneTableContainer').jtable('load');
	});
	
	</script>
	

</body>
</html>
