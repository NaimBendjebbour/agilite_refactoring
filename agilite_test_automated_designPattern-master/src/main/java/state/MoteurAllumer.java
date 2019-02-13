package state;

public class MoteurAllumer implements VehiculeState {

    public MoteurAllumer(){}

    public void allumerMoteur(VehiculeStateChange vsc) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Impossible de rallumer le moteur");
    }

    public void accelerer(VehiculeStateChange vsc) throws UnsupportedOperationException {
        if (vsc.getVitesse() == 130)
            throw new UnsupportedOperationException("Impossible d'accelerer plus");
        vsc.setVitesse(vsc.getVitesse() + 5);
    }

    public void freiner(VehiculeStateChange vsc) throws UnsupportedOperationException {
        if (vsc.getVitesse() == 0)
            throw new UnsupportedOperationException("Impossible de freiner plus");
        vsc.setVitesse(vsc.getVitesse() - 5);
    }

    public void couperMoteur(VehiculeStateChange vsc) throws UnsupportedOperationException {
        if (vsc.getVitesse() > 0)
            throw new UnsupportedOperationException("Impossible de couper le moteur");
        vsc.setState(vsc.getMoteurCouper());
    }
}