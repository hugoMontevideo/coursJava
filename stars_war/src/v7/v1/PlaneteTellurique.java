package v7.v1;

public class PlaneteTellurique extends Planete implements Habitable {

    private int totalVisiteurs = 0;
    protected Vaisseau vaisseau;
    protected boolean isAccost;

    PlaneteTellurique(String nom){
        super(nom);
    }
     public void accueillirVaisseau( Vaisseau vaisseau ){
        if( this.vaisseau == null ){
            totalVisiteurs += vaisseau.getNbPassagers() ;
            vaisseau.setNbPassagers(0);
            this.vaisseau = vaisseau;
            System.out.printf("Aucun vaisseau ne s'en va.\n" );
        }else{
            totalVisiteurs += vaisseau.getNbPassagers() ;
            System.out.printf("Un vaisseau de type %s d'humains ayant sejourné sur %s est actuellement en partance.\n", this.vaisseau.getType(), nom );
            this.vaisseau = vaisseau;
        }
        System.out.printf("Le nombre de visiteurs sur %s est égal à %d.\n", nom, totalVisiteurs );
    }
    public void setVaisseau(Vaisseau vaisseau) {
        this.vaisseau = vaisseau;
    }
}

