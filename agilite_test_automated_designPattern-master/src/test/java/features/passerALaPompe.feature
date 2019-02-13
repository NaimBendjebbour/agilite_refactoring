@featureTest
@voiture
Feature: US001 - Ajouter de l'essence dans une voiture

    @Scenario
	Scenario: Passer à la pompe faire le plein



	Given le client consulte son niveau dessence
    When le client passe à la pompe
    Then le client a fait le plein