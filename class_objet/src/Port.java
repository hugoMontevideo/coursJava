public class Port {

    int nbPlace;

    Port(int nbPlace){
        this.nbPlace = nbPlace;
    }

    void accueillirEngin(Amarable engin){

        nbPlace -= engin.nbCordes(1.5F, 100);
        if (nbPlace >= 0 ){
            nbPlace-= engin.nbCordes(1.5F,100);
            System.out.println("Super on vous attend avec" + engin.nbCordes(1.5F, 100) + "cordes" );
        }else{
            nbPlace+= engin.nbCordes(1.5F, 100);
            System.out.println("Navre, nous n'avons pas assez de place poiur vous accueillir");
        }
    }


}
