package v6.v1;

public enum TypeVaisseau {
    CHASSEUR("chasseur"),
    FREGATE("fregate"),
    CROISEUR("croiseur"),
    CARGO ("cargo"),
    VAISSEAU_MONDE("vaisseau monde");

    final String nomTypeVaisseau;

    TypeVaisseau(String nomTypeVaisseau){
        this.nomTypeVaisseau = nomTypeVaisseau;
    }

}
