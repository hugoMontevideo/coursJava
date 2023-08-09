public class Voiture extends VehiculeAMoteur implements Videangable{
    private int nbPortes;
    private String couleur;
    private String modele;
    private boolean boite;
    private int vitesse = 0;

    public Voiture(){
        System.out.println("ici on construit une voiture sans moteur");
    }
    public Voiture(Moteur moteur){
//        super(new Moteur()); // les deux sont valables
        super(moteur);  // les deux sont valables
    }

    public Voiture(Moteur mot, String modele ){
        this(mot);  // ça rappelle le constructeur par defaut
        this.modele = modele;
    }

    public Voiture (String couleur, boolean boite){

    }

    public void claxonner (){
        System.out.println("tut tut !");
    }

    void accelerer(){
        System.out.println("Mon vehicule accelere");
    }

    void accelerer( int acceleration){
        vitesse += acceleration;
        System.out.println("Mon vehicule accélère de " + acceleration + " km/h et se roule à present à " + vitesse + " km/h");
    }

    @Override
    public void vidanger() {
        System.out.println("Deviser le bouchon sous la culasse");
    }

    public void setNbPortes(int nbPortes) {
        this.nbPortes = nbPortes;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setBoite(boolean boite) {
        this.boite = boite;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }


    public int getNbPortes() {
        return nbPortes;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getModele() {
        return modele;
    }

    public boolean isBoite() {
        return boite;
    }

    public int getVitesse() {
        return vitesse;
    }




}
