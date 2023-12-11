package fr.exercices;
import java.lang.Math;

public class Main {
    public static void main (String[] args) {
        int[] notes = {10, 10, 10};

        System.out.println("La moyenne de ces 3 notes est de : " + Exo1.calculateAverageOfNumbers(notes));

        float price = 100;
        float price2 = 50;
        System.out.println("Le prix TTC est de : " + Math.round(Exo2.calculateTtcPrice(price)) + "€");
        System.out.println("Le prix TTC est de : " + Math.round(Exo2.calculateTtcPrice(price2)) + "€");
    }
}
