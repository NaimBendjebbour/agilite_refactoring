package entity;

public class MotoElectrique extends VehiculeContext {


    public MotoElectrique(int niveauEssence, String marque) {
        super(niveauEssence, marque);
        super.setType_motorisation("Electrique");

    }

    @Override
    public double getPrixStationnement() {
        return Constantes.PRIX_MOTO_ELECTRIQUE;
    }

}
