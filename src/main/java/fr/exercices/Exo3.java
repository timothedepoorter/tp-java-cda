package fr.exercices;

public class Exo3 {

    /**
     * Verify if a number is > 0
     * @param number - float
     * @throws IllegalArgumentException exception
     */
    private static void verifyIfNumberIsPositive(int number) throws IllegalArgumentException {
        if (number <= 0) {
            throw new IllegalArgumentException("Le nombre doit être positif");
        }
    }

    /**
     * Verify if number contains more than 1 character
     * @param number - int
     * @throws IllegalArgumentException exception
     */
    private static void verifyNumberMoreThan1Character(int number) throws IllegalArgumentException {
        if (number < 9) {
            throw new IllegalArgumentException("Le nombre doit contenir au moins deux chiffres");
        }
    }

    /**
     * Verify if a number is a palyndrome
     * @param number int
     * @return boolean
     */
    public static boolean isPalyndrome(int number) {
        verifyIfNumberIsPositive(number);
        verifyNumberMoreThan1Character(number);

        int initNumber = number;
        int reversedNumber = 0;
        int numberModuloTen;

        while (number > 0) {
            numberModuloTen = number % 10;
            reversedNumber = (reversedNumber * 10) + numberModuloTen;
            number /= 10;
        }

        return reversedNumber == initNumber;
    }
}
