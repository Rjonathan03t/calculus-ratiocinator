package org.hei.calculus.calcul;

import java.util.ArrayList;
import java.util.List;

public class Conjonctions {
    private List<Affirmations> affirmations;
    private String type;

    public Conjonctions(List<Affirmations> affirmations, String type) {
        this.affirmations = new ArrayList<>(affirmations);
        this.type = type;
    }

    public boolean calculerVerite() {
        switch (type.toLowerCase()) {
            case "et":
                for (Affirmations affirmation : affirmations) {
                    if (!affirmation.estVraie(affirmation)) {
                        return false;
                    }
                }
                return true;
            case "ou":
                for (Affirmations affirmation : affirmations) {
                    if (affirmation.estVraie(affirmation)) {
                        return true;
                    }
                }
                return false;
            case "donc":
                Affirmations p = affirmations.get(0);
                Affirmations q = affirmations.get(1);
                return p.estVraie(p) ||!q.estVraie(q);
            default:
                throw new IllegalArgumentException("Type de conjonction non supporté: " + type);
        }
    }

}

