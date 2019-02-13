package entity;

import contrat.Vehicule;
import state.MoteurAllumer;
import state.MoteurCouper;
import state.VehiculeState;
import state.VehiculeStateChange;

public abstract class VehiculeContext implements VehiculeStateChange, Vehicule {

    private int niveauEssence;
    private int vitesse;
    private String marque;
    private String type_motorisation;

    private static MoteurCouper moteur_couper = new MoteurCouper();
    private static MoteurAllumer moteur_allumer = new MoteurAllumer();

    private VehiculeState state=moteur_couper;

    public VehiculeContext(int niveauEssence, String marque) {
        this.niveauEssence = niveauEssence;
        this.marque = marque;
    }

    public abstract double getPrixStationnement();

    public int getNiveauEssence() {
        return niveauEssence;
    }

    public void setNiveauEssence(int niveauEssence) {
        this.niveauEssence = niveauEssence;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getType_motorisation() {
        return type_motorisation;
    }

    public void setType_motorisation(String type_motorisation) {
        this.type_motorisation = type_motorisation;
    }


    /**
     *    Permet de mettre le plein dans votre véhicule
     */
    public void faireLePlein()
    {
        this.niveauEssence = Constantes.FULL_PLEIN;
    }



    /**
     * Affiche le carburant restant et sa quantité et vous donne un conseil
     */
    public String autonomie()
    {
        String var = "";
        if (this.getNiveauEssence()<= 5)
            var = "allez vite faire le plein";
        else
            var = "vous pouvez encore rouler";

        return var;
    }

    @Override
    public String toString()
    {
        return "[NIVEAU DE CARBURANT] = "+ ((double)this.getNiveauEssence()/(double)Constantes.FULL_PLEIN)*100 + "%\n"
                +"[MOTORISATION] = " +this.getType_motorisation()+ "\n"
                +"[MARQUE] = "+this.getMarque()+ "\n"
                +"[TYPE VEHICULE] = "+ this.getClass().getSimpleName() +"\n"
                +"[TARIF STATIONNEMENT PARKING /15min] = "+this.getPrixStationnement() +"€\n";
    }

    /***
     * Methode pour gerer state
     */
    @Override
    public void allumerMoteur() {
        state.allumerMoteur(this);
    }
    @Override
    public void accelerer() {
        state.accelerer(this);
    }
    @Override
    public void freiner() {
        state.freiner(this);
    }
    @Override
    public void couperMoteur() {
        state.couperMoteur(this);
    }
    @Override
    public void setState(VehiculeState vs) {
        state=vs;
    }
    @Override
    public VehiculeState getState()
    {
        return this.state;
    }

    @Override
    public void setVitesse(int v) {
        vitesse=v;
    }
    @Override
    public int getVitesse() {
        return vitesse;
    }
    @Override
    public boolean moteurEstAllume() {
        return (state instanceof MoteurCouper);
    }

    @Override
    public VehiculeState getMoteurCouper()
    {
        return this.moteur_couper;
    }

    @Override
    public VehiculeState getMoteurAllumer()
    {
        return this.moteur_allumer;
    }

}
