public class Beateau implements Amarable{

    int masse;
    @Override
    public int nbCordes(float ratio, int vent) {
       // 1 corde par tonne
        return (int)(masse * ratio) + (vent/100);

    }
}
