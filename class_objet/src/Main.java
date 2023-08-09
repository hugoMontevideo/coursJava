// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // instancier un objet alloue un espace à la mémoire/
        // l'affection reference elle, l'emplacement de l'objet instancié
        // on parle de pointeur de l'objet

        Voiture voiture = new Voiture("lol", false);
        voiture.setNbPortes(5);
        voiture.setCouleur("rouge");
        voiture.setModele("205");

        voiture.claxonner();

        // transtypage
        VehiculeAMoteur maVoiture = new Voiture();// seule les proprietes de vehicuel A Moteur son t accessibles

        Voiture maVoiturePourRobotPeinture = (Voiture)maVoiture;
        maVoiturePourRobotPeinture.setCouleur("rouge");

        maVoiturePourRobotPeinture.accelerer(100);

        Port vieuxPort = new Port(100);
        Beateau yacht = new Beateau();
        yacht.masse = 50;
        vieuxPort.accueillirEngin(yacht);
        vieuxPort.accueillirEngin(yacht);


        // Ici l'interface Amarrable permet simplement de mettre en lumière le fait que la seule chose qui interesse notre port est que l'engin soit amarrable ensi que le fait de savoir de combien de cordes et d'emplacements il aura besoin

        // Sans cette interface chaque engin aurait du implémenter la méthode AcceuillirEngin
        // Une interface peut hériter elle même d'un nombre illimité d'interfaces.

        // Une interface peut être déclarée sans contenu et se nomme une intreface drapeau. Elle a pour but de signaler une fonction de la classe qui l'implémente ou bien de l'interface qui en hérite ( voir Devissable ou Revissable dans videangeable

        // une interface peut contenir des proprietes mais leur valeur devra ettre affectee à la déclaration

    }
}