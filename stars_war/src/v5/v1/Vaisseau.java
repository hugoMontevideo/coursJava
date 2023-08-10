package v5.v1;

public class Vaisseau {

    String nom;

    String type; // "CROISEUR" "FREGATE" "CHASSEUR"
    int nbPassagers;

    public Vaisseau(){
    }

    public Vaisseau(String type, int nbPassagers){
        this.type = type;
        this.nbPassagers=nbPassagers;
    }






}
