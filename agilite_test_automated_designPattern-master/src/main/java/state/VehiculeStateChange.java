package state;

import contrat.Vehicule;

public interface VehiculeStateChange {

    public void setState(VehiculeState vh);
    public VehiculeState getState();
    public void setVitesse(int vitesse);
    public int getVitesse();
    public VehiculeState getMoteurCouper();
    public VehiculeState getMoteurAllumer();
}
