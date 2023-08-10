package v4.v1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Planete mars = new Planete("Mars");

        Vaisseau fregate = new Vaisseau("fregate", 9);

        mars.accueillirVaisseau(fregate);

        Vaisseau croiseur = new Vaisseau("CROISEUR", 25);
        mars.accueillirVaisseau(croiseur);









    }

}