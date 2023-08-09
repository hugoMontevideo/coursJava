import java.util.Scanner;

public class Exercice {
    public static void solarSystem ( int year ) {
        int nombrePlanete = 9;
        
        if(year< 1700){
            nombrePlanete = 7;
        } else if (year < 1800) {
            nombrePlanete = 8 ;

        }
        else if( year > 2006 ){
            nombrePlanete = 8;
        }
        System.out.printf("Le nombre de planetes est de %d.\n", nombrePlanete);
    }

    public static void switchPlanet( int nbPlanet ) {

        for (int nb = nbPlanet; nb < 11 ; nb++ ) {

            switch (nb) {
                case 7:
                    System.out.println("On sait qu'au 16ème siècle, seules 7 planètes avaient été découvertes.\n");
                    break;
                case 8:
                    System.out.println("On sait que le nombre de planètes est passé de 7 à 8 au 17ème siècle, mais il a également été réduit de 9 à 8 en 2006.\n");
                    break;
                case 9:
                    System.out.println("On sait que le nombre de planètes est passé de 8 à 9 au 18ème siècle et ce jusqu'en 2006, où ce nombre a été réduit à 8. \n");
                    break;
                default:
                    System.out.printf("Le programme ne peut pas fournir de résultat pour %d. \n", nb);
            }
        }

    }



    public static void main(String[] args) {


        int nombrePlanete = 9;


        Scanner sc = new Scanner(System.in);
        System.out.println("Veuille saisir l'année : ");
        int date1 = sc.nextInt();
        sc.close();

        if (date1 > 1599 && date1 < 2021) {

            solarSystem(date1);
        } else {
            System.out.printf("Le programme n'est pas en mesure de fournir de résultat pour l'année : %d. \n", date1);
        }

//        System.out.printf("En %d : le nombre est de %d.", date1, nombrePlanete);


        int nombre = 7;

        switchPlanet(nombre);


    }
}