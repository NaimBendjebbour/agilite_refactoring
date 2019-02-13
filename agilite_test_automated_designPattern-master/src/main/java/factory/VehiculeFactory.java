package factory;

import entity.*;

public class VehiculeFactory {

    public static final int VOITURE_ELECTRIQUE = 1;
    public static final int VOITURE_DIESEL = 2;
    public static final int VOITURE_ESSENCE = 3;
    public static final int MOTO_ESSENCE =4;
    public static final int MOTO_ELECTRIQUE=5;

    public VehiculeContext getVehicule(int typeVehicule)
    {
        VehiculeContext toreturn =null;

        switch (typeVehicule)
        {
            case VOITURE_ELECTRIQUE :
                toreturn = new VoitureElectrique(randomNiveauEssence(),Marque.randomMarque().name());
                break;
            case VOITURE_DIESEL :
                toreturn = new VoitureDiesel(randomNiveauEssence(),Marque.randomMarque().name());
                break;
            case VOITURE_ESSENCE :
                toreturn = new VoitureEssence(randomNiveauEssence(),Marque.randomMarque().name());
                break;
            case MOTO_ESSENCE :
                toreturn = new MotoEssence(randomNiveauEssence(),Marque.randomMarque().name());
                break;
            case MOTO_ELECTRIQUE :
                toreturn = new MotoElectrique(randomNiveauEssence(),Marque.randomMarque().name());
        }

        return toreturn;
    }

    public int randomNiveauEssence()
    {
        return (int)( 1 + (Math.random() * Constantes.FULL_PLEIN));
    }
}
