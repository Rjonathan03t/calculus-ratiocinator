package org.hei.calculus.calcul;

import java.util.ArrayList;
import java.util.List;

public class Calculateur {
    private List<Conjonctions> conjonctions;

    public Calculateur(List<Conjonctions> conjonctions) {
        this.conjonctions = new ArrayList<>(conjonctions);
    }

    public void ajouterConjonction(Conjonctions conjonction) {
        this.conjonctions.add(conjonction);
    }

    public boolean calculerToutesLesVérités() {
        for (Conjonctions conjonction : conjonctions) {
            if (!conjonction.calculerVerite()) {
                return false;
            }
        }
        return true;
    }
}
