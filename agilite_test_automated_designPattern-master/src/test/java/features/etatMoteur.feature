@featureTest
@voiture
Feature: US003 - En tant que conducteur je veux allumer le moteur

    @Scenario
	Scenario: La voiture est éteinte, je démarre la voiture, le moteur est mis en marche

	Given le moteur est eteint
    When je demarre la voiture
    Then Le moteur est allume

  @Scenario
  Scenario: La voiture est allumé, j'eteins la voiture, le moteur est mis en marche
    Given le moteur est allumé
    When j eteins la voiture
    Then Le moteur est eteins