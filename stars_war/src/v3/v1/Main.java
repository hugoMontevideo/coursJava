package v3.v1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Float> paramsAtmos = new ArrayList<Float>(7);
        paramsAtmos.add(1.5f);
        paramsAtmos.add(2.5f);
        paramsAtmos.add(3.5f);
        paramsAtmos.add(4.5f);
        paramsAtmos.add(5.5f);
        paramsAtmos.add(6.5f);
        paramsAtmos.add(7.5f);

        Planete uranus = new Planete("Uranus", paramsAtmos);

        System.out.printf("L'atmosphère de %s est de : \n%.2f %% d'argon\n%.2f %% d'hydrogène ", uranus.getNom(), uranus.getAtmosphere().getTauxArgon(),uranus.getAtmosphere().getTauxHydrogene() );


    }

}