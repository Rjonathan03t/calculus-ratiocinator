package org.hei.calculus.calcul;
public class Affirmations {
    private String texte;
    private String type;

    public Affirmations(String texte, String type) {
        this.texte = texte;
        this.type = type;
    }


    public String getType() {
        return type;
    }

    public boolean estVraie(Affirmations affirmation) {
        if(affirmation.getType().toLowerCase().equals("verite")){
            return true;
        }else if(affirmation.getType().toLowerCase().equals("mensonge")){
            return false;
        }
        return false;
    }
}
