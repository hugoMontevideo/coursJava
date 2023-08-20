public class Voiture extends VehiculeAMoteur implements Videangable{
    private int nbPortes;
    private String couleur;
    private String modele;
    public TypeBoiteVitesse boiteVitesse;
    boolean boite;
    private int vitesse = 0;
    int nbPlaces;


//    static boolean auto = true;
//    static boolean  manuel =false;



    public Voiture(){
        this.nbPlaces = 5;
    }
    public Voiture(Moteur moteur){
//        super(new Moteur()); // les deux sont valables
        super(moteur);  // les deux sont valables
    }

    public Voiture(int nbPlaces){  // constructeu pour nb Places
        this.nbPlaces = nbPlaces;
    }

    public Voiture(Moteur mot, String modele ){
        this(mot);  // ça rappelle le constructeur par defaut
        this.modele = modele;
    }

    public Voiture (String couleur, boolean boite){

    }

    public void transporter(Passager passager, String villeDeDepart, String villeArrivee, String... villesEtapes){

        System.out.println(passager.prenom + " voyage avec moi de "+villeDeDepart+" jusqu'à "+ villesEtapes[3]+" pour "+" mon trajet " + villeArrivee);
        System.out.println("Nous passerons par : ");
        for(int i=0; i<villesEtapes.length; i++ ){
            System.out.println(villesEtapes[i]);
        }
    }

//    methode pour les tableaux
//    public void transporter(Passager passager, String villeDeDepart, String villeArrivee, String villesEtapes){
//        System.out.println(passager.prenom + "voyage avec moi de "+villeDeDepart+" jusqu'à "+ villesEtapes[0]+" pour "+" mon trajet " + villeArrivee);
//    }

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
