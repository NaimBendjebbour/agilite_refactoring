package entity;

/**
 * Décrivez votre classe entity.VoitureElectrique ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class VoitureElectrique extends VehiculeContext
{

    /**
     * Constructeur d'objets de classe entity.VoitureElectrique
     */
    public VoitureElectrique(int niveauEssence, String marque) {
        super(niveauEssence, marque);
        super.setType_motorisation("Electrique");
    }


    @Override
    public double getPrixStationnement() {
        return Constantes.PRIX_VOITURE_ELECTRIQUE;
    }

}
