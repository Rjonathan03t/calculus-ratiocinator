package org.hei.calculus;

import org.hei.calculus.calcul.Affirmations;
import org.hei.calculus.calcul.Calculateur;
import org.hei.calculus.calcul.Conjonctions;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        Affirmations a1 = new Affirmations("Lou est beau", "verite");
        Affirmations a2 = new Affirmations("Lou est pauvre", "mensonge");

        Conjonctions c1 = new Conjonctions(List.of(a1, a2), "et");
        Conjonctions c2 = new Conjonctions(List.of(a1, a2), "ou");

        Calculateur calculateur = new Calculateur(List.of(c1, c2));
        System.out.println(calculateur.calculerToutesLesVérités());
    }
}