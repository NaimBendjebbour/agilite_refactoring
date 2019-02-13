@featureTest
@voiture
Feature: US002 - En tant que conducteur je veux garer mon vehicule dans le parking

    @Scenario
	Scenario: Retourne une chaîne de caractère qui contient un conseil pour le client



      Given on verifie que le parking est vide
      When on ajoute une voiture au parking
      Then on verifie qu'il y a bien une voiture presnte dans le parking