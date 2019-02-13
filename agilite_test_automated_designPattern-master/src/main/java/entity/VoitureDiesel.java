package entity;

public class VoitureDiesel extends VehiculeContext {

    /**
     * Constructeur d'objets de classe entity.VoitureElectrique
     */
    public VoitureDiesel(int niveauEssence, String marque) {
        super(niveauEssence, marque);
        super.setType_motorisation("Diesel");
    }


    @Override
    public double getPrixStationnement() {
        return Constantes.PRIX_VOITURE_DIESEL;
    }

}
