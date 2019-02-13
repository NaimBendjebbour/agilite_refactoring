import entity.MotoElectrique;
import entity.VoitureDiesel;
import org.junit.Assert;
import org.junit.Test;

public class VoitureDieselTest {


    @Test
    public void getterSetterNiveauEssence() {
        final int niveauEssence = 40;
        final VoitureDiesel voitureDiesel = new VoitureDiesel(25, "Mercedes");
        voitureDiesel.setNiveauEssence(40);
        Assert.assertEquals(voitureDiesel.getNiveauEssence(), niveauEssence);
    }

    @Test
    public void getterSetterTypeMotorisation() {
        final String motorisation = "Diesel";
        final VoitureDiesel voitureDiesel = new VoitureDiesel(25, "Mercedes");
        voitureDiesel.setType_motorisation("Diesel");
        Assert.assertEquals(voitureDiesel.getType_motorisation(), motorisation);
    }

    @Test
    public void getterSetterMarque() {
        final String marque = "Mercedes";
        final VoitureDiesel voitureDiesel = new VoitureDiesel(25, "Mercedes");
        voitureDiesel.setMarque("Mercedes");
        Assert.assertEquals(voitureDiesel.getMarque(), marque);
    }

    @Test
    public void getterSetterVitesse() {
        final int vitesse = 25;
        final VoitureDiesel voitureDiesel = new VoitureDiesel(25, "Mercedes");
        voitureDiesel.setVitesse(25);
        Assert.assertEquals(voitureDiesel.getVitesse(), vitesse);
    }

    @Test
    public void getterSetterPrix() {
        final double prix = 1.5;
        final VoitureDiesel voitureDiesel = new VoitureDiesel(25, "Ducati");
        voitureDiesel.getPrixStationnement();
    }

}
