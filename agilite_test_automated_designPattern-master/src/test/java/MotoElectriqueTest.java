import entity.MotoElectrique;
import entity.MotoEssence;
import org.junit.Assert;
import org.junit.Test;

public class MotoElectriqueTest {


    @Test
    public void getterSetterNiveauEssence() {
        final int niveauEssence = 40;
        final MotoElectrique motoElectrique = new MotoElectrique(25, "Honda");
        motoElectrique.setNiveauEssence(40);
        Assert.assertEquals(motoElectrique.getNiveauEssence(), niveauEssence);
    }

    @Test
    public void getterSetterTypeMotorisation() {
        final String motorisation = "Electrique";
        final MotoElectrique motoElectrique = new MotoElectrique(25, "Honda");
        motoElectrique.setType_motorisation("Electrique");
        Assert.assertEquals(motoElectrique.getType_motorisation(), motorisation);
    }

    @Test
    public void getterSetterMarque() {
        final String marque = "Honda";
        final MotoElectrique motoElectrique = new MotoElectrique(25, "Honda");
        motoElectrique.setMarque("Honda");
        Assert.assertEquals(motoElectrique.getMarque(), marque);
    }

    @Test
    public void getterSetterVitesse() {
        final int vitesse = 25;
        final MotoElectrique motoElectrique = new MotoElectrique(25, "Honda");
        motoElectrique.setVitesse(25);
        Assert.assertEquals(motoElectrique.getVitesse(), vitesse);
    }

    @Test
    public void getterSetterPrix() {
        final double prix = 1.5;
        final MotoElectrique motoElectrique = new MotoElectrique(25, "Ducati");
        motoElectrique.getPrixStationnement();
    }

}
