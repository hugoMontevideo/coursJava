package v6.v1;

public class Vaisseau {

    private String nom;
    private TypeVaisseau type;

    private int nbPassagers;



    private int blindage;  // nombre sans unité

    public void setResistanceDuBouclier(int resistanceDuBouclier) {
        this.resistanceDuBouclier = resistanceDuBouclier;
    }

    private int resistanceDuBouclier; // en minutes

    public Vaisseau(){
    }
    public Vaisseau(TypeVaisseau type){  // constructeur par type de vaisseau
        this.type=type;
    }
    public Vaisseau(TypeVaisseau type, int nbPassagers){
        this.type = type;
        this.nbPassagers=nbPassagers;
    }

    public void activerBouclier(){
        System.out.printf("Activation du bouclier d'un vaisseau de type %s\n",type );
    }

    public void desactiverBouclier(){
        System.out.printf("Désactivation du bouclier d'un vaisseau de type %s\n",type );
    }

    public void accoster(Planete planete){
        if(planete instanceof PlaneteTellurique) {
            ((PlaneteTellurique) planete).accueillirVaisseau(this);
        }else{
            System.out.printf("%s est une planète gazeuse et ne peut pas vous accueillir. Faire machine arrière.", planete.nom);
        }
    }

    public TypeVaisseau getType() {
        return type;
    }
    public int getNbPassagers() {
        return nbPassagers;
    }

    public void setNbPassagers(int nbPassagers) {
        this.nbPassagers = nbPassagers;
    }
    public int getBlindage() {
        return blindage;
    }

    public void setBlindage(int blindage) {
        this.blindage = blindage;
    }



}
