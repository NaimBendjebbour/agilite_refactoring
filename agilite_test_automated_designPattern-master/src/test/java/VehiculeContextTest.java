import contrat.Vehicule;
import entity.VehiculeContext;
import entity.VoitureDiesel;
import entity.VoitureElectrique;
import entity.VoitureEssence;
import org.junit.Assert;
import org.junit.Test;
import state.VehiculeState;

public class VehiculeContextTest {

    @Test
    public void getterSetterNiveauEssence() {
        final int niveauEssence = 20;
        final VoitureEssence voitureEssence = new VoitureEssence(1, "Renault");
        voitureEssence.setNiveauEssence(20);
        Assert.assertEquals(voitureEssence.getNiveauEssence(), niveauEssence);
    }


    @Test
    public void getterSetterMarque() {
        final String marque = "Renault";
        final VoitureDiesel voitureDiesel = new VoitureDiesel(1, "Renault");
        voitureDiesel.setMarque("Renault");
        Assert.assertEquals(voitureDiesel.getMarque(), marque);
    }

    @Test
    public void getterSetterTypeMotorisation() {
        final String motorisation = "Electrique";
        final VoitureElectrique voitureElectrique = new VoitureElectrique(1, "Renault");
        voitureElectrique.setType_motorisation("Electrique");
        Assert.assertEquals(voitureElectrique.getType_motorisation(), motorisation);
    }

    @Test
    public void getterSetterVitesse() {
        final int vitesse = 60;
        final VoitureElectrique voitureElectrique = new VoitureElectrique(1, "Renault");
        voitureElectrique.setVitesse(60);
        Assert.assertEquals(voitureElectrique.getVitesse(), vitesse);
    }

}
