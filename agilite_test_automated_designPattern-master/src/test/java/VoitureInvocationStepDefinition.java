
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import entity.Constantes;
import entity.Parking;
import entity.VehiculeContext;
import factory.VehiculeFactory;
import org.junit.Assert;
import state.MoteurAllumer;
import state.MoteurCouper;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;


public class VoitureInvocationStepDefinition {


    private VehiculeFactory factory;
    private VehiculeContext voitureEssence;
    private Parking parking;
    private int niveauEssence;
    private String res;


    @Given("^le client consulte son niveau dessence$")
    public void le_client_consulte_son_niveau_dessence() throws Throwable {
        factory = new VehiculeFactory();
        voitureEssence = this.factory.getVehicule(VehiculeFactory.VOITURE_ESSENCE);
        voitureEssence.getNiveauEssence();

    }

    @When("^le client passe à la pompe$")
    public void le_client_passe_à_la_pompe() throws Throwable {
        voitureEssence.faireLePlein();
    }

    @Then("^le client a fait le plein$")
    public void le_client_a_fait_le_plein() throws Throwable {

        Assert.assertTrue(voitureEssence.getNiveauEssence() == Constantes.FULL_PLEIN);
    }


    @Given("^on verifie que le parking est vide$")
    public void on_verifie_que_le_parking_est_bien_vide() throws Throwable {
        parking = new Parking();
        Assert.assertTrue(parking.getVehicules_garer().isEmpty() == true);
    }

    @When("^on ajoute une voiture au parking$")
    public void on_ajoute_une_voiture_au_parking() throws Throwable {
        parking.addVehicule(voitureEssence);

    }

    @Then("^on verifie qu'il y a bien une voiture presnte dans le parking$")
    public void on_verifie_qu_il_y_a_bien_une_voiture_presnte_dans_le_parking() throws Throwable {
        Assert.assertTrue(parking.getVehicules_garer().size()==1);
    }

    @Given("^le moteur est eteint$")
    public void le_moteur_est_eteint() throws Throwable {
        factory = new VehiculeFactory();
        voitureEssence = this.factory.getVehicule(VehiculeFactory.VOITURE_ESSENCE);
        assertThat(voitureEssence.getState(), instanceOf(MoteurCouper.class));
    }

    @When("^je demarre la voiture$")
    public void je_demarre_la_voiture() throws Throwable {
        voitureEssence.allumerMoteur();
    }

    @Then("^Le moteur est allume$")
    public void Le_moteur_est_allume() throws Throwable {
        assertThat(voitureEssence.getState(), instanceOf(MoteurAllumer.class));
    }

    @Given("^le moteur est allumé$")
    public void le_moteur_est_allumé() throws Throwable {
        factory = new VehiculeFactory();
        voitureEssence = this.factory.getVehicule(VehiculeFactory.VOITURE_ESSENCE);
        voitureEssence.allumerMoteur();
        assertThat(voitureEssence.getState(), instanceOf(MoteurAllumer.class));
    }

    @When("^j eteins la voiture$")
    public void j_eteins_la_voiture() throws Throwable {
        voitureEssence.couperMoteur();

    }

    @Then("^Le moteur est eteins$")
    public void Le_moteur_est_eteins() throws Throwable {
        assertThat(voitureEssence.getState(), instanceOf(MoteurCouper.class));
    }
}

