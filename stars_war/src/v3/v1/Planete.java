package v3.v1;

import java.util.List;

public class Planete {

    private String nom;
    private String matiere;   // Gazeuse | Tellurique
    private long diametre;
    private Atmosphere atmosphere;

    public Atmosphere getAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(Atmosphere atmosphere) {
        this.atmosphere = atmosphere;
    }


    public int getTotalVisiteurs() {
        return totalVisiteurs;
    }

    public void setTotalVisiteurs(int totalVisiteurs) {
        this.totalVisiteurs = totalVisiteurs;
    }

    private int totalVisiteurs = 0;


    public Planete(){
        this.nom = "Terre";
    }

    public Planete(String nom){
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

     void accueillirVaisseau(int totalVisiteurs){
        this.totalVisiteurs += totalVisiteurs;
    }

    public void accueillirVaisseau(String vaisseau){
        if( vaisseau.equals("CHASSEUR") ){
            this.totalVisiteurs += 3;
        } else if ( vaisseau.equals("FREGATE") ) {
            this.totalVisiteurs += 12;
        } else if ( vaisseau.equals("CROISEUR") ) {
            this.totalVisiteurs += 50;
        }
    }

    public void revolution(){
        System.out.printf("Je suis la planète %s et je tourne autour de mon étoile.\n", nom );
    }

    public void rotation(){
        System.out.printf("Je suis la planète %s et je tourne sur moi-même.\n", nom );
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMatiere(String nom) {
        this.nom = nom;
    }
    public void setDiametre(long diametre) {
        this.diametre = diametre;
    }
    public String getNom() {
        return nom;
    }

    public String getMatiere() {
        return matiere;
    }

    public long getDiametre() {
        return diametre;
    }

}
