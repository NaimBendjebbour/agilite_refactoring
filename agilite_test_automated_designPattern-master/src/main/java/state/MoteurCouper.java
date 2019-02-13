package state;

public class MoteurCouper implements VehiculeState {

    public MoteurCouper(){}

    public void allumerMoteur(VehiculeStateChange vsc) throws UnsupportedOperationException {
        vsc.setState(vsc.getMoteurAllumer());
    }

    public void accelerer(VehiculeStateChange vsc) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Impossible d'accélérer le Moteur est coupé");
    }

    public void freiner(VehiculeStateChange vsc) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Impossible de freiner");
    }

    public void couperMoteur(VehiculeStateChange vsc) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Impossible couper le moteur.");
    }
}