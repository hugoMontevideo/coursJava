package v1;

public class Planete {

    private String nom;
    private String matiere;   // Gazeuse | Tellurique
    private long diametre;


    public Planete(){
        this.nom = "Terre";
    }

    public Planete(String nom){
        this.nom = nom;
    }

    public Planete(String nom, String matiere, long diametre){
        this.nom = nom;
        this.matiere = matiere;
        this.diametre = diametre;

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
