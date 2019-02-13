import entity.Parking;
import entity.VehiculeContext;
import factory.VehiculeFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Classe-test VoitureTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document Š 2002 Robert A. Ballance intitulé
 * "JUnit: Unit Testing Framework".
 *
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le męme paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque méthode Test à exécuter.  Il peut y avoir
 * plus d'une méthode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les engagements, et suivi d'un appel à tearDown(), qui les
 * détruit.
 */
public class VoitureTest {
    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).
    private Parking parking1;

    /**
     * Constructeur de la classe-test VoitureTest
     */
    public VoitureTest() {
    }

    /**
     * Met en place les engagements.
     * <p>
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
        parking1 = new Parking();
        parking1.passerALaPompe();
    }

    /**
     * Supprime les engagements
     * <p>
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }

    @Test
    public void faireLePleinTest() {
        VehiculeFactory fabrique = new VehiculeFactory();
        VehiculeContext voitureElectrique1 = fabrique.getVehicule(VehiculeFactory.VOITURE_ELECTRIQUE);
        voitureElectrique1.faireLePlein();
        assertEquals(40, voitureElectrique1.getNiveauEssence());
    }



    @Test
    public void getterSetterTypeEssenceTest() {
        VehiculeFactory fabrique = new VehiculeFactory();
        final String typeEssence = "Diesel";
        final VehiculeContext voitureElectrique = fabrique.getVehicule(VehiculeFactory.VOITURE_DIESEL);
        Assert.assertEquals(voitureElectrique.getType_motorisation(), typeEssence);
    }

    @Test
    public void getterSetterNiveauEssenceTest() {
        VehiculeFactory fabrique = new VehiculeFactory();
        final int niveauEssence = 40;
        final VehiculeContext voitureElectrique = fabrique.getVehicule(VehiculeFactory.VOITURE_ELECTRIQUE);
        voitureElectrique.setNiveauEssence(40);
        Assert.assertEquals(voitureElectrique.getNiveauEssence(), niveauEssence);
    }
}
