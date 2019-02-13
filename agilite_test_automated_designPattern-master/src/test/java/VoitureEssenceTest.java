import entity.VoitureElectrique;
import entity.VoitureEssence;
import org.junit.Assert;
import org.junit.Test;

public class VoitureEssenceTest {


    @Test
    public void getterSetterNiveauEssence() {
        final int niveauEssence = 40;
        final VoitureEssence voitureEssence = new VoitureEssence(25, "Fiat");
        voitureEssence.setNiveauEssence(40);
        Assert.assertEquals(voitureEssence.getNiveauEssence(), niveauEssence);
    }

    @Test
    public void getterSetterTypeMotorisation() {
        final String motorisation = "Essence";
        final VoitureEssence voitureEssence = new VoitureEssence(25, "Fiat");
        voitureEssence.setType_motorisation("Essence");
        Assert.assertEquals(voitureEssence.getType_motorisation(), motorisation);
    }

    @Test
    public void getterSetterMarque() {
        final String marque = "Fiat";
        final VoitureEssence voitureEssence = new VoitureEssence(25, "Fiat");
        voitureEssence.setMarque("Fiat");
        Assert.assertEquals(voitureEssence.getMarque(), marque);
    }

    @Test
    public void getterSetterVitesse() {
        final int vitesse = 25;
        final VoitureEssence voitureEssence = new VoitureEssence(25, "Fiat");
        voitureEssence.setVitesse(25);
        Assert.assertEquals(voitureEssence.getVitesse(), vitesse);
    }

    @Test
    public void getterSetterPrix() {
        final double prix = 1.5;
        final VoitureEssence voitureEssence = new VoitureEssence(25, "Ducati");
        voitureEssence.getPrixStationnement();
    }

}
