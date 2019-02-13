//package definition;
//
//import entity.Parking;
//import entity.Voiture;
//import org.junit.Assert;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//import org.springframework.test.context.ContextConfiguration;
//
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//@ContextConfiguration
//@Scope("cucumber-glue")
//@Component("src/test/definition")
//public class VoitureInvocationStepDefinition {
//
//
//    private Voiture voiture;
//    private Parking parking;
//    private int niveauEssence;
//    private String res;
//
//
//
//        @Given("^le client consulte son niveau dessence$")
//	    public void le_client_consulte_son_niveau_dessence() throws Throwable {
//
//	       this.niveauEssence = voiture.getNiveauEssence();
//            //throw new PendingException();
//    }
//
//	    @When("^le client passe à la pompe$")
//	    public void le_client_passe_à_la_pompe() throws Throwable {
//
//            voiture.faireLePlein();
//            //throw new PendingException();
//	}
//
//	    @Then("^le client a fait le plein$")
//	    public void le_client_a_fait_le_plein() throws Throwable {
//            {
//                Assert.assertTrue(voiture.getNiveauEssence() > this.niveauEssence);
//            }
//            // throw new PendingException();
//        }
//
//
//    @Given("^le client demande un conseil$")
//    public void le_client_demande_un_conseil() throws Throwable {
//
//            this.niveauEssence = voiture.getNiveauEssence();
//        //throw new PendingException();
//    }
//
//    @When("^le systeme conseil le client$")
//    public void le_systeme_conseil_le_client() throws Throwable {
//        res = this.voiture.autonomie();
//        //throw new PendingException();
//    }
//
//    @Then("^le client est conseille$")
//    public void le_client_est_conseille() throws Throwable {
//        {
//            if (niveauEssence <= 5)
//                Assert.assertTrue(res == "allez vite faire le plein");
//            else
//                Assert.assertTrue(res == "vous pouvez encore rouler");
//        }
//        // throw new PendingException();
//    }
//
//
//    @Given("^on verifie que le parking est bien vide$")
//    public void on_verifie_que_le_parking_est_bien_vide() throws Throwable {
//
//      parking.list.size();
//        //throw new PendingException();
//    }
//
//    @When("^on ajoute une voiture au parking$")
//    public void on_ajoute_une_voiture_au_parking() throws Throwable {
//        parking.AjouteVoitureAuParking(new Voiture());
//        //throw new PendingException();
//    }
//
//    @Then("^on verifie qu'il y a bien une voiture presnte dans le parking$")
//    public void on_verifie_qu_il_y_a_bien_une_voiture_presnte_dans_le_parking() throws Throwable {
//        {
//            Assert.assertTrue( parking.list.size() > 0);
//        }
//        // throw new PendingException();
//    }
//	}
//
