package v1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//      Planete mercure = new Planete();
//      mercure.setNom("Mercure");
//
//        Planete venus = new Planete();
//        venus.setNom("Venus");

        Planete jupiter = new Planete("Jupiter", "Gazeuse", 142984L);

        System.out.printf("%s est une planète %s avec un diamètre de %d kilomètres.\n", jupiter.getNom(), jupiter.getMatiere(), jupiter.getDiametre());

        Planete neptune = new Planete("Neptune");

        Planete mars = new Planete("Mars");

        neptune.revolution();
        mars.rotation();

    }

}