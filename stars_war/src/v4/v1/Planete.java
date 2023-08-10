package v4.v1;

import java.util.List;

public class Planete {

    private String nom;
    private static int nbPlanetesDecouvertes = 0;
    private String matiere;   // Gazeuse | Tellurique
    private long diametre;
    private Atmosphere atmosphere;
    private Vaisseau vaisseau;
    boolean isAccost;
    private int totalVisiteurs = 0;




    public Planete(String nom){
        super();
        this.nom = nom;
        totalVisiteurs = 0;
    }

    public Planete(String nom, String matiere, long diametre){
        this.nom = nom;
        this.matiere = matiere;
        this.diametre = diametre;

    }

    public Planete(String nom, List<Float> paramAtmosphere){
        this.nom = nom;
        this.atmosphere = new Atmosphere(paramAtmosphere);
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




}
