Sujet de test:
	* implémenter une méthode qui permet d'avoir une sous liste des entiers à partir d'une liste de base.
	exemple : 
		partition([1,2,3,4,5], 2) retourne: [ [1,2], [3,4], [5] ]
		partition([1,2,3,4,5], 3) retourne: [ [1,2,3], [4,5] ]
		partition([1,2,3,4,5], 1) retourne: [ [1], [2], [3], [4], [5] ]

Instructions pour executer l'application:
	1- cloner l'application depuis mon repo github fourni dans votre machine:
		git clone git@github.com:brabii/positive-thinking-test.git
	2- avoir maven 3 et java 1.8 installée est un prérequis au build de l'application.
	3- ouvrez votre ide eclipse : File -> import -> maven projects spécifier la location de projet que vous avez cloner
	4- une fois importé, clique droite au projet : run as maven clean puis run as maven build vous auriez une nouvelle fénetre qui s'ouvre 
		dans le champ de texte Goals saisir package.
	5- l'application se build et les tests unitaires s'executent.
	6- pour voir l'implémentation de la méthode métier "partition" aller au fichier Partion.java 
	7- pour void l'ensemble des tests unitaires aller au fichier PartitionTest.java.
	
