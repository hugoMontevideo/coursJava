package v7.v1;

public class VaisseauDeGuerre extends Vaisseau {

    public VaisseauDeGuerre(TypeVaisseau type, int nbPassagers){
        super(type,nbPassagers);
    }

//    public void accoster(Planete planete){
//    }
    public void attaque(Vaisseau cible, String arme, int dureeAtaque) {
        System.out.printf("Un vaisseau de type %s attaque un vaisseau de type %s en utilisant l'arme %s pendant %d minutes.\n",this.getType(), cible.getType(), arme, dureeAtaque );

        cible.setResistanceDuBouclier(0);
        cible.setBlindage(cible.getBlindage()/2);
    }

}
