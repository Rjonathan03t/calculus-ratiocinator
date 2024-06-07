package org.hei.calculus.calcul;

import org.hei.calculus.affirmable.Affirmable;
import org.hei.calculus.affirmable.Affirmations;

import java.util.ArrayList;
import java.util.List;

public class Conjonctions {
    private List<Affirmable> affirmations;
    private String type;

    public Conjonctions(List<Affirmable> affirmations, String type) {
        this.affirmations = new ArrayList<>(affirmations);
        this.type = type;
    }

    public boolean calculerVerite() {
        switch (type.toLowerCase()) {
            case "et":
                for (Affirmable affirmation : affirmations) {
                    if (!affirmation.estVrai()) {
                        return false;
                    }
                }
                return true;
            case "ou":
                for (Affirmable affirmation : affirmations) {
                    if (affirmation.estVrai()) {
                        return true;
                    }
                }
                return false;
            case "donc":
                Affirmable p = affirmations.get(0);
                Affirmable q = affirmations.get(1);
                return!(p.estVrai() &&!q.estVrai());
            default:
                throw new IllegalArgumentException("Type de conjonction non supporté: " + type);
        }
    }

}

