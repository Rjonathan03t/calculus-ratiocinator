package org.hei.calculus.calcul;
public class Affirmations {
    private String texte;
    private String type;
    private Boolean estVraie;

    public Affirmations(String texte, String type) {
        this.texte = texte;
        this.type = type;
    }

    public String getTexte() {
        return texte;
    }

    public String getType() {
        return type;
    }

    public Boolean getEstVraie() {
        return estVraie;
    }

    public void setEstVraie(Boolean estVraie) {
        this.estVraie = estVraie;
    }

    public boolean isVraie() {
        return estVraie!= null? estVraie : false;
    }
}
