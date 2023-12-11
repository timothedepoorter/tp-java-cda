package fr.exercices;

public class Exo1 {
    /**
     * @param numbers array of int
     * @return true if numbers between 0 and 20, false instead
     */
    public static boolean verifyIfNumbersBetween0and20(int[] numbers) {
        for (int number : numbers) {
            if (number < 0 || number > 20) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param numbers array of int
     * @return the average of the array
     */
    public static int calculateAverageOfNumbers(int[] numbers) {
        if (!verifyIfNumbersBetween0and20(numbers)) {
            return 0;
        }
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total / numbers.length;
    }
}
