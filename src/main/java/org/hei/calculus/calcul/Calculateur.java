package org.hei.calculus.calcul;

import java.util.ArrayList;
import java.util.List;

public class Calculateur {
    private List<Conjonctions> conjonctions;

    public Calculateur(List<Conjonctions> conjonctions) {
        this.conjonctions = new ArrayList<>(conjonctions);
    }

    public boolean calculerToutesLesVerites() {
        for (Conjonctions conjonction : conjonctions) {
            if (!conjonction.calculerVerite()) {
                return false;
            }
        }
        return true;
    }
}
