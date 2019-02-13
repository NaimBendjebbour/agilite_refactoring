import entity.MotoEssence;
import org.junit.Assert;
import org.junit.Test;

public class MotoEssenceTest {


    @Test
    public void getterSetterNiveauEssence() {
        final int niveauEssence = 40;
        final MotoEssence motoEssence = new MotoEssence(25, "Ducati");
        motoEssence.setNiveauEssence(40);
        Assert.assertEquals(motoEssence.getNiveauEssence(), niveauEssence);
    }

    @Test
    public void getterSetterTypeMotorisation() {
        final String motorisation = "Essence";
        final MotoEssence motoEssence = new MotoEssence(25, "Ducati");
        motoEssence.setType_motorisation("Essence");
        Assert.assertEquals(motoEssence.getType_motorisation(), motorisation);
    }

    @Test
    public void getterSetterMarque() {
        final String marque = "Ducati";
        final MotoEssence motoEssence = new MotoEssence(25, "Ducati");
        motoEssence.setMarque("Ducati");
        Assert.assertEquals(motoEssence.getMarque(), marque);
    }

    @Test
    public void getterSetterVitesse() {
        final int vitesse = 25;
        final MotoEssence motoEssence = new MotoEssence(25, "Ducati");
        motoEssence.setVitesse(25);
        Assert.assertEquals(motoEssence.getVitesse(), vitesse);
    }

    @Test
    public void getterSetterPrix() {
        final double prix = 1.5;
        final MotoEssence motoEssence = new MotoEssence(25, "Ducati");
        motoEssence.getPrixStationnement();
    }

}
