package fr.exercices;
import java.lang.Math;

public class Main {
    public static void main (String[] args) {
        int[] notes = {10, 10, 10};

        System.out.println("La moyenne de ces 3 notes est de : " + Exo1.calculateAverageOfNumbers(notes));

        System.out.println("Le prix TTC est de : " + Math.round(Exo2.calculateTtcPrice(100)) + "€");
        System.out.println("Le prix TTC est de : " + Math.round(Exo2.calculateTtcPrice(50)) + "€");

        System.out.println(Exo3.isPalyndrome(121));
        System.out.println(Exo3.isPalyndrome(123));

        System.out.println(Exo4.checkIfDoublon(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(Exo4.checkIfDoublon(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 1}));
    }
}
