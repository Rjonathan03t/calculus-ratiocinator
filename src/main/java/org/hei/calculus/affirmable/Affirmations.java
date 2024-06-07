package org.hei.calculus.affirmable;

public class Affirmations implements Affirmable {
    private String texte;
    private String type;
    private boolean valeur;

    public Affirmations(String texte, String type,boolean valeur) {
        this.texte = texte;
        this.type = type;
        this.valeur = valeur;
    }


    public String getType() {
        return type;
    }

    @Override
    public boolean estVrai() {
        return valeur;
    }
}
