package v5.v1;

import java.util.List;

public class Planete {

    private String nom;
    private static int nbPlanetesDecouvertes;
    private String matiere;   // Gazeuse | Tellurique
    private long diametre;  // kms
    private Atmosphere atmosphere;



    private Vaisseau vaisseau;
    boolean isAccost;


    private int totalVisiteurs = 0;


    public Planete(){
        nbPlanetesDecouvertes++;
    }

    public Planete(String nom){
        this();
        this.nom = nom;
        System.out.printf("Bienvenue sur %s.\nJe suis la planète numéro %d.\n", nom, nbPlanetesDecouvertes );
    }

    public Planete(String nom, String matiere, long diametre){
        this();
        this.nom = nom;
        this.matiere = matiere;
        this.diametre = diametre;

    }

    public Planete(String nom, List<Float> paramAtmosphere){
        this();
        this.nom = nom;

    }

    public void accueillirVaisseau( Vaisseau vaisseau ){
        if( this.vaisseau == null ){
             totalVisiteurs += vaisseau.nbPassagers ;
             vaisseau.nbPassagers = 0;
             this.vaisseau = vaisseau;
             System.out.printf("Aucun vaisseau ne s'en va.\n" );
        }else{
            totalVisiteurs += vaisseau.nbPassagers ;
            System.out.printf("Un vaisseau de type %s d'humains ayant sejourné sur %s est actuellement en partance.\n", this.vaisseau.type, nom );
            this.vaisseau = vaisseau;
        }
        System.out.printf("Le nombre de visiteurs sur %s est égal à %d.\n", nom, totalVisiteurs );
    }

    public void revolution(){
        System.out.printf("Je suis la planète %s et je tourne autour de mon étoile.\n", nom );
    }

    public void rotation(){
        System.out.printf("Je suis la planète %s et je tourne sur moi-même.\n", nom );
    }

    public String getNom() {
        return nom;
    }

    public Atmosphere getAtmosphere() {
        return atmosphere;
    }
    public void setAtmosphere(Atmosphere atmosphere) {
        this.atmosphere = atmosphere;
    }
    public void setVaisseau(Vaisseau vaisseau) {
        this.vaisseau = vaisseau;
    }



}
