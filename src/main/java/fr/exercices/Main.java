package fr.exercices;
import java.lang.Math;

public class Main {
    public static void main (String[] args) {

        System.out.println("=== EXERCICE 1 ===");
        System.out.println("La moyenne de ces 3 notes est de : " + Exo1.calculateAverageOfNumbers(new int[]{10, 10, 10}));
        System.out.println("La moyenne de ces 3 notes est de : " + Exo1.calculateAverageOfNumbers(new int[]{5, 10, 15}));

        System.out.println("=== EXERCICE 2 ===");
        System.out.println("Le prix TTC est de : " + Math.round(Exo2.calculateTtcPrice(100)) + "€");
        System.out.println("Le prix TTC est de : " + Math.round(Exo2.calculateTtcPrice(50)) + "€");

        System.out.println("=== EXERCICE 3 ===");
        System.out.println(Exo3.isPalyndrome(121));
        System.out.println(Exo3.isPalyndrome(123));

        System.out.println("=== EXERCICE 4 ===");
        System.out.println(Exo4.checkIfDoublon(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(Exo4.checkIfDoublon(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 1}));

        System.out.println("=== EXERCICE 5 ===");
        System.out.println(Exo5.convertRomanNumIntoArabicNum("X"));
        System.out.println(Exo5.convertRomanNumIntoArabicNum("LVIII"));
        System.out.println(Exo5.convertRomanNumIntoArabicNum("MCMXCII"));
    }
}
