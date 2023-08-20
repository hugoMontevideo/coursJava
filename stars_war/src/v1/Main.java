package v1;

import java.sql.Array;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static  int add(int[] values){
        int accum = 0;
        for (int val: values) {
            accum += val;
        }
        return  accum;
    }

    public static void main(String[] args) {

        int[] values = new int[3];

        System.out.println("Addition =" + add(values));

        System.out.println(values[0]);
//        System.out.println( add( ));
//        System.out.println(add(11));
//        System.out.println(add(11,11));

//      Planete mercure = new Planete();
//      mercure.setNom("Mercure");
//
//        Planete venus = new Planete();
//        venus.setNom("Venus");

//        Planete jupiter = new Planete("Jupiter", "Gazeuse", 142984L);
//
//        System.out.printf("%s est une planète %s avec un diamètre de %d kilomètres.\n", jupiter.getNom(), jupiter.getMatiere(), jupiter.getDiametre());
//
//        Planete neptune = new Planete("Neptune");
//
//        Planete mars = new Planete("Mars");
//
//        neptune.revolution();
//        mars.rotation();

    }

}