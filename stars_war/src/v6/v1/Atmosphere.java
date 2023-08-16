package v6.v1;

import java.util.List;

public class Atmosphere {

    // les taux sont en %
    private float tauxHydrogene;
    private float tauxMethane;
    private float tauxAzote;
    private float tauxHelium;
    private float tauxArgon;
    private float tauxDioxydeC;
    private float tauxSodium;

    public Atmosphere(){

    }

    public Atmosphere(List<Float> paramAtmosphere){
        this.tauxHydrogene = paramAtmosphere.get(0);
        this.tauxMethane = paramAtmosphere.get(1);
        this.tauxAzote = paramAtmosphere.get(2);
        this.tauxHelium = paramAtmosphere.get(3);
        this.tauxArgon = paramAtmosphere.get(4);
        this.tauxDioxydeC = paramAtmosphere.get(5);
        this.tauxSodium = paramAtmosphere.get(6);
    }
    public Atmosphere(float tauxHydroguene, float tauxMethane, float tauxAzote, float tauxHelium, float tauxDioxydeC, float tauxSodium, float tauxArgon ){
        this.tauxHydrogene = tauxHydroguene;
        this.tauxMethane = tauxMethane;
        this.tauxAzote = tauxAzote;
        this.tauxHelium = tauxHelium;
        this.tauxArgon = tauxArgon;
        this.tauxDioxydeC = tauxDioxydeC;
        this.tauxSodium = tauxSodium;

    }


    public float getTauxHydrogene() {
        return tauxHydrogene;
    }

    public void setTauxHydrogene(float tauxHydrogene) {
        this.tauxHydrogene = tauxHydrogene;
    }

    public float getTauxMethane() {
        return tauxMethane;
    }

    public void setTauxMethane(float tauxMethane) {
        this.tauxMethane = tauxMethane;
    }

    public float getTauxAzote() {
        return tauxAzote;
    }

    public void setTauxAzote(float tauxAzote) {
        this.tauxAzote = tauxAzote;
    }

    public float getTauxHelium() {
        return tauxHelium;
    }

    public void setTauxHelium(float tauxHelium) {
        this.tauxHelium = tauxHelium;
    }

    public float getTauxArgon() {
        return tauxArgon;
    }

    public void setTauxArgon(float tauxArgon) {
        this.tauxArgon = tauxArgon;
    }

    public float getTauxDioxydeC() {
        return tauxDioxydeC;
    }

    public void setTauxDioxydeC(float tauxDioxydeC) {
        this.tauxDioxydeC = tauxDioxydeC;
    }

    public float getTauxSodium() {
        return tauxSodium;
    }

    public void setTauxSodium(float tauxSodium) {
        this.tauxSodium = tauxSodium;
    }




}
