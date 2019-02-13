import entity.VehiculeContext;
import factory.VehiculeFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class    Application {

    Scanner scan = new Scanner(System.in);

    public void afficheMenuPrincipale(){
        String menu = "1 - Garer VehiculeContext\n"+
                      "2 - Payer\n " +
                      "3 - Mettre le plein\n"+
                      "4 - Quitter parking \n" ;
    }

    public static void main (String[] args){

        VehiculeFactory fabrique = new VehiculeFactory();
        List<VehiculeContext> vehiculeContexts = new ArrayList<VehiculeContext>();

        vehiculeContexts.add(fabrique.getVehicule(VehiculeFactory.MOTO_ELECTRIQUE));
        vehiculeContexts.add(fabrique.getVehicule(VehiculeFactory.MOTO_ESSENCE));
        vehiculeContexts.add(fabrique.getVehicule(VehiculeFactory.VOITURE_ESSENCE));
        vehiculeContexts.add(fabrique.getVehicule(VehiculeFactory.VOITURE_DIESEL));
        vehiculeContexts.add(fabrique.getVehicule(VehiculeFactory.VOITURE_ELECTRIQUE));

        for(VehiculeContext v : vehiculeContexts)
        {
            System.out.println(v.toString());
        }


    }
}
