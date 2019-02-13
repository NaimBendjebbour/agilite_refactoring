package entity;

public class VoitureEssence extends VehiculeContext {

    /**
     * Constructeur d'objets de classe entity.VoitureElectrique
     */
    public VoitureEssence(int niveauEssence, String marque) {
        super(niveauEssence, marque);
        super.setType_motorisation("Essence");
    }


    @Override
    public double getPrixStationnement() {
        return Constantes.PRIX_VOITURE_ESSENCE;
    }


}
