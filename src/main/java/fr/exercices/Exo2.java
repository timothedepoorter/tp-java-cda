package fr.exercices;

public class Exo2 {
    public static final float TVA = 20;

    /**
     * Verify if a number is > 0
     * @param number float
     * @throws IllegalArgumentException exception
     */
    private static void verifyIfNumberIsPositive(float number) throws IllegalArgumentException {
        if (number <= 0) {
            throw new IllegalArgumentException("Le nombre doit être positif");
        }
    }

    /**
     * Calculate the TTC price
     * @param number - float
     * @return float
     */
    public static float calculateTtcPrice(float number) {
        verifyIfNumberIsPositive(number);

        return number*(1+(TVA/100));
    }
}
