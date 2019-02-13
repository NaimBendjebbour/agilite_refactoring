import entity.VoitureDiesel;
import entity.VoitureElectrique;
import org.junit.Assert;
import org.junit.Test;

public class VoitureElectriqueTest {


    @Test
    public void getterSetterNiveauEssence() {
        final int niveauEssence = 40;
        final VoitureElectrique voitureElectrique = new VoitureElectrique(25, "Toyota");
        voitureElectrique.setNiveauEssence(40);
        Assert.assertEquals(voitureElectrique.getNiveauEssence(), niveauEssence);
    }

    @Test
    public void getterSetterTypeMotorisation() {
        final String motorisation = "Electrique";
        final VoitureElectrique voitureElectrique = new VoitureElectrique(25, "Toyota");
        voitureElectrique.setType_motorisation("Electrique");
        Assert.assertEquals(voitureElectrique.getType_motorisation(), motorisation);
    }

    @Test
    public void getterSetterMarque() {
        final String marque = "Toyota";
        final VoitureElectrique voitureElectrique = new VoitureElectrique(25, "Toyota");
        voitureElectrique.setMarque("Toyota");
        Assert.assertEquals(voitureElectrique.getMarque(), marque);
    }

    @Test
    public void getterSetterVitesse() {
        final int vitesse = 25;
        final VoitureElectrique voitureElectrique = new VoitureElectrique(25, "Toyota");
        voitureElectrique.setVitesse(25);
        Assert.assertEquals(voitureElectrique.getVitesse(), vitesse);
    }

    @Test
    public void getterSetterPrix() {
        final double prix = 1.5;
        final VoitureElectrique voitureElectrique = new VoitureElectrique(25, "Ducati");
        voitureElectrique.getPrixStationnement();
    }

}
