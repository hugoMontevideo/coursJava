package v7.v1;

import java.util.List;

public class Planete {

    protected String nom;
    protected static int nbPlanetesDecouvertes;

//    private String matiere;   // Gazeuse | Tellurique
    protected long diametre;
    protected Atmosphere atmosphere;



    public Planete(){
        nbPlanetesDecouvertes++;
    }

    public Planete(String nom){
        this();
        this.nom = nom;
        System.out.printf("Bienvenue sur %s.\nJe suis la planète numéro %d.\n", nom, nbPlanetesDecouvertes );
    }


    public Planete(String nom, List<Float> paramAtmosphere){
        this();
        this.nom = nom;

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
