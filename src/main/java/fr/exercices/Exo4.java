package fr.exercices;

import java.util.HashMap;

public class Exo4 {
    /**
     * Verify if an array doesn't contain doublon using an HashMap
     * @param numbers array of int
     * @return boolean
     */
    public static boolean checkIfDoublon(int[] numbers) {
        HashMap<Integer, Integer> NumbersHashMap = new HashMap<>();
        for (int number : numbers) {
            if (NumbersHashMap.containsKey(number)) {
                NumbersHashMap.put(number, 0);
            } else {
                NumbersHashMap.put(number, 1);
            }
        }
        return NumbersHashMap.containsValue(0);
    }
}
