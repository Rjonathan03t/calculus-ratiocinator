package org.hei.calculus;

import org.hei.calculus.affirmable.Affirmations;
import org.hei.calculus.affirmable.Mensonge;
import org.hei.calculus.affirmable.Verite;
import org.hei.calculus.calcul.Calculateur;
import org.hei.calculus.calcul.Conjonctions;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        Verite v1 = new Verite("Lou est beau");
        Verite v2 = new Verite("Lou est pauvre");

        Conjonctions c1 = new Conjonctions(List.of(v1, v2), "et");

        List<Conjonctions> conjonctions = List.of(c1);
        Calculateur calculateur = new Calculateur(conjonctions);

        boolean resultat = calculateur.calculerToutesLesVerites();
        System.out.println(resultat);

    }
}