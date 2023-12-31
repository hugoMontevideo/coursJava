package v7.v1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        VaisseauDeGuerre monChasseur = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR, 5);
        VaisseauDeGuerre maFregate = new VaisseauDeGuerre(TypeVaisseau.FREGATE, 7);
        VaisseauDeGuerre monCroiseur = new VaisseauDeGuerre(TypeVaisseau.CROISEUR, 10);
        VaisseauCivil monCargo = new VaisseauCivil(TypeVaisseau.CARGO, 15);
        VaisseauCivil monMonde = new VaisseauCivil(TypeVaisseau.VAISSEAU_MONDE, 55);

        Vaisseau[] monParkVaisseau = { monChasseur, maFregate, monCroiseur, monCargo, monMonde};

        PlaneteTellurique terre = new PlaneteTellurique( "terre", 3);

        terre.maBaie[0] = monCroiseur;
        terre.maBaie[1] = monMonde;
        terre.maBaie[2] = monCargo;

        monChasseur.demandeAccoster(terre);

//        Scanner entree = new Scanner(System.in);
//
//        System.out.print("Choississez votre type de vaisseau : ");
//        int i = 1;
//        for (TypeVaisseau type : TypeVaisseau.values()) {
//            System.out.printf("%d - %s ; ", i, type.nomTypeVaisseau);
//            i++;
//        }
//        int choice = entree.nextInt();
//
//        if (choice <= monParkVaisseau.length){
//            System.out.println("\n Votre choix = " + monParkVaisseau[choice-1].getType());
//        } else {
//            System.out.println("Faites un choix valable ");
//        }

//        System.out.print("Choississez votre planète de destination : ");
//        String planetChoice = entree.next();
//
//
//        if (planetChoice.equalsIgnoreCase("terre") == true
//            || planetChoice.equalsIgnoreCase("mars") == true
//            || planetChoice.equalsIgnoreCase("venus") == true
//            || planetChoice.equalsIgnoreCase("mercure") == true
//        ){
//            System.out.printf("Votre destination : %s \n", planetChoice);
//        } else {
//            System.out.println("Faites un choix valable (Terre-Mars-Mercure-Venus) ");
//        }

//        System.out.print("Combien de chargement desirez vous prendre ? ");
//        int availableLoadingOnDock = 40;
//        int loading = entree.nextInt();
//
//        System.out.printf("Votre chargement : %d T. \nReste à quai %d T", loading, availableLoadingOnDock - loading);
//
//        entree.close();

    }

}