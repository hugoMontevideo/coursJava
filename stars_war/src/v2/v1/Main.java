package v2.v1;

public class Main {
    public static void main(String[] args) {

        Planete mars = new Planete("Mars","Tellurique", 61654L);

        mars.accueillirVaisseau(8);
        mars.accueillirVaisseau("FREGATE");
        System.out.printf("Le nombre d'humains ayant sejourné sur %s est de %d humanos.", mars.getNom(), mars.getTotalVisiteurs() );


    }

}