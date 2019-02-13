package entity;

public class MotoEssence extends VehiculeContext {

    public MotoEssence(int niveauEssence, String marque) {
        super(niveauEssence, marque);
        super.setType_motorisation("Essence");
    }

    @Override
    public double getPrixStationnement() {
        return Constantes.PRIX_MOTO_ESSENCE;
    }


}
