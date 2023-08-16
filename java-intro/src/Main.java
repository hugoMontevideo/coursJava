import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static String maString2;

    public static void main(String[] args) {
        //****************************************************
        //     Les variables: les type
        //****************************************************

        // - primitifs : ecrits intégralement en minuscule
        //      -  int pour les entiers :  -2 147 483 648 à  2 147 483 647  limite de ce que l'on peut encoder sur 32 bits
        //      -  long pour 64 bits
        //      -  short pour 16 bits
        //       -  byte => octet  8 bits -128 à 127

        //        float ,  décimal pour 32 bits
        //        double,  décimal pour 64 bits

        //   char pour un caractère

        //   boolean pour booleen

        int monAge;

        monAge = 25;

        monAge += 30;

        long distanceTerreLune = 21474836487L; // L obligatoire pour confirmer que c'est un long et pas un int

        var toto = "toto"; // possible depuis java 10. déclarer n'importe quel variable sans typage en affectant directement une valeur.

        float floatNumber = 1.5F;  // F obligatoire pour confirmer que c'est un float  et non pas un double

        char caractere = 'b'; // un seul caractère, avec du code unicode possible 2 caracteres - simple quote' '
        char caractere2 = '\uf127';
        boolean a; // valeur par défaut  false
        // System.out.println(caractere2);

        int b;  // 0 par defaut
        char c; // '' par defaut

        // type Objet:  commencent par une majuscule

        String monPrenom = "Hugo"; // double quote " "

        //****************************************************
        //     Opérateurs arithmétiques
        //****************************************************

        int result = 5 * 2;
        result = 5 + 2;
        result = 5 % 2;
        result = 5 - 2;
        result = 5 / 2;

        float test = 5F / 2;
        System.out.println(test);

        //****************************************************
        //     Opérateurs relationnels
        //****************************************************

        boolean vraiFaux = 20 == 30;
        System.out.println(vraiFaux);
        vraiFaux = 20 <= 30;
        System.out.println(vraiFaux);
        vraiFaux = 20 >= 30;
        System.out.println(vraiFaux);
        vraiFaux = 20 < 30;
        System.out.println(vraiFaux);
        vraiFaux = 20 != 30;
        System.out.println(vraiFaux);

        char char1 = 'c';
        char char2 = 'y';

        vraiFaux = char1 > char2;
        System.out.println(vraiFaux);

        //****************************************************
        //     Opérateurs logiques
        //****************************************************

        boolean bool1 = true;
        boolean bool2 = false;
        boolean bool3 = true;

        vraiFaux = bool1 & bool2; // et
        vraiFaux = bool1 | bool2; // ou
        vraiFaux = bool1 ^ !bool2; // XOR ou exclusif  -- 2 fois vrai c'est faux
        // pour test l'inverse  ! pour not

        // il existe aussi && et ||  Il est recommandé.
        // en effet boolean var=true||false. Ici la 1ere partie étant true, il n'evalue la seconde partie car automatiquement true
        //  var=false&&true ic l a 1ere partie etant false, il n'évalue pas la seconde car automatiquement false

        //****************************************************
        //     Incrémentation et décrémentation
        //****************************************************

        int valInt = 5;
        valInt += 1;
        int valInt2 = ++valInt;
        System.out.println(valInt2);
        valInt2 = --valInt;
        System.out.println(valInt2);
        valInt2 = valInt++; // l'affectation a lieu avant l'incrementation de valInt
        System.out.println(valInt2);
        valInt2 = valInt--; // l'affectation a lieu avant la decrementation de valInt
        System.out.println(valInt2);

        //****************************************************
        //     Opérateur de concaténation pour les chaines de caractères
        //****************************************************

        String maString = " Mon age est de : ";
        String maString2 = " 55 ans ";
        System.out.println(maString + maString2);

        int age = 37;
        System.out.println(maString + age + " ans");

        System.out.println(maString + age + 1 + " ans"); // la 1ere variable de la concatenation étant de type string tout a ete concaténé => mon age et 371 ans

        System.out.println(maString + (age + 1) + " ans"); // les () permettent de génerer le calcul avant la concatenation => mon age et 38 ans

        //****************************************************
        //     Opérateur de concaténation pour les chaines de caractères
        //****************************************************

        // Il est peu recommandé d'enchainer les concaténations avec + car récré une chaine intermediaire à chaque fois avec gauche et droite au +

        maString2 = " ans";
        double f = 3.5;

        System.out.printf("Je concatène une chaine: %s %d %s et ça n'a rien à voir mais j'affiche %f", maString, age, maString2, f);
        // %s  string ,  %d  int (digit) ,  %f  float  . Il faut passer les variables dans l'ordre d'apparition.
        // %n  retour à la ligne.

        //****************************************************
        //     Bloc d'instruction
        //****************************************************

        // espace global

        {
            // espace local
            int tonAge = 32;
        }
        // System.out.println(tonAge); tonAge n'existe pas à l'extérieur du bloc d'instruction

        //****************************************************
        //     Structures conditionnelles
        //****************************************************

        int tonAge = 32;

        if(tonAge > 30) System.out.println(tonAge);

        // complexité cyclomatique if imbriques. A partir de 5 if on considere que c'est deconseillé
        // A partir de 7 banni.


        //****************************************************
        //     Structures ternaire
        //****************************************************

        int ageDuCapitaine = 49;

        System.out.println( monAge > 30 && ageDuCapitaine < 50 ?"Le capitaine a plus de 50 ans et ou moi ai moins de 30 ans" : "Le capitaine a moins de 50 ans et ou moi ai plus de 30 ans");

        //****************************************************
        //     Structures switch case
        //****************************************************

        int mois1 = 11;
//        switch (mois){
//            case 1 :
//            case 2 :
//            case 3 :
//                System.out.println("Hiver");
//                break;
//            case 4 :
//            case 5 :
//            case 6 :
//                System.out.println("Printemps");
//                break;
//            case 7 :
//            case 8 :
//            case 9 :
//                System.out.println("Eté");
//                break;
//            default:
//                System.out.print("Inexistant");
//        }

        switch (mois1) {
            case 1, 2, 3 -> System.out.println("Hiver");
            case 4, 5, 6 -> System.out.println("Printemps");
            case 7, 8, 9 -> System.out.println("Eté");
            default -> System.out.print("Inexistant");
        }


        //****************************************************
        //     Structures itératives
        //****************************************************
        boolean vrai = true ;
        //for
        for(  ; vrai ; ){
            System.out.println("C'est vrai");
            vrai = false;
        }

        for (int nb = 0; nb<3 ; nb++){
            System.out.println(nb);
        }

        // boucle while, generalement utilisée pour les booleens
        int index = 0;
        boolean jeBoucle = true;

        while (jeBoucle) {
            System.out.println("Un tour de plus");

            //Bloc d'instruction qui finira par faire passer notre booléen à false
            jeBoucle=false;
        }

//        *****************

        boolean jeReBoucle=true;

        //Faire tant que
//

        boolean jeContinu = true;
        int nb=0;

        while(jeContinu){
            System.out.println("tour n° : " + (nb+1));
            nb++;
            if(nb == 5 ){
                continue;
            }
            if(nb>10){
                jeContinu=false;
            }
            System.out.println("je continu");
        }

        //****************************************************
        //     Classe system
        //****************************************************

        // Ne peut être instancié sans constructeur
        // Possède des méthodes et propriétés statiques (d'ou le fait que nos n'ayons pas besoin d'instancier d'objet

        // propriété statique out:

        // Correspond au flux d'écriture standard, par defaut le terminal (sinon dirigé vers un fichier)
        // elle est valorisée au moment du lancement de la machine virtuelle

        // out est une propriété de type PrintStream qui posséde multitudes de méthodes comme print, println, printf.

        // autre flux d'écriture standard: System.in => flux d'entree standard (saisie au clavier)
        //                                 System.err => est retourné quoi qu'il en soit dans le terminal même avec un flux redirigé.
        //                                 System.exit(0) pour mettre fin à la machine virtuelle avec un code erreur
        //                                          0 - tout s'est bien passé.
        //                                          Sinon quitte l'execution avec l'affichage du code erreur.

        // quelques méthodes:
        //     System.currentTimeMillis(); // retourne un long qui represente le nombre de millisendes ecoules depuis le 01 01 70
        //     System.nanoTime(); Permet de calculer des intervales

//        System.exit(1);
//        long start =System.nanoTime();
//        System.out.print("HelloWorld");
//        long end = System.nanoTime();
//        System.out.println(end-start);

        // getProperty()
        // getProperties()
//        System.out.println( System.getProperties() );
//        System.out.println( System.getProperty("user.name") );
//        System.out.println(System.getenv( "path"));


        // class Scanner
        // ecoute les flux entrant comme System.in
        // elle necessite l'import de java.util.Scanner

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Entrez votre prenom");
//        String prenom = scan.nextLine();
//
//        System.out.println("Bonjour " + prenom );

        // nextInt, nextBoolean et pour tout les types
//        int numberScan = scan.nextLine();

        // classe Container ou Wrapper

        Float f1 = 1.5f;
        Double d = 1.5;
        Integer i1 = 10;
        Long l1 = 100L;
       String l2 = "fddfdfdf";

       f1.floatValue(); // renvoie la valeur du type primitif
        Float f2 = Float.parseFloat("1.5"); // converti la chaine en float

        Float f3; // non valorisé == null
        f3 = 1.5f;
        float f33; // == 0.0

        System.out.println(f2 == f3);

//        f2.equals(f3);
        System.out.println(f2.equals(f3));

        String s1 = "t";
        String s2 = "t";
        String s3 = new String("t");
        System.out.println(s1==s3);

        // valueof();
        // typeValue()=> sur objet
        // type.parseType(ce que vous voulez)
        // equals pour comparer des valeurs de type objet
        // Grace au type objet, les variables non valorisées prendront par défaut une valeur nulle


        //****************************************************
        //     Les types ENUMS
        //****************************************************



    }
}


