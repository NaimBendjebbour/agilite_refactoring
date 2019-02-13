package contrat;

public interface Vehicule {

    public void allumerMoteur();
    public void accelerer();
    public void freiner();
    public void couperMoteur();
    public int getVitesse();
    public boolean moteurEstAllume();

}
