package state;

public interface VehiculeState {

    public void allumerMoteur(VehiculeStateChange vsc) throws UnsupportedOperationException;
    public void accelerer(VehiculeStateChange vsc) throws UnsupportedOperationException;
    public void freiner(VehiculeStateChange vsc) throws UnsupportedOperationException;
    public void couperMoteur(VehiculeStateChange vsc) throws UnsupportedOperationException;

}
