package fr.demo.heritage;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Salarie michel = new Salarie(
                "Quezak",
                "Michel",
                LocalDate.of(1980, 12, 31),
                30,
                LocalDate.now()
        );

        Stagiaire baltazar = new Stagiaire(
                "Badoit",
                "Baltazar",
                LocalDate.of(2000, 11, 8),
                LocalDate.now(),
                LocalDate.of(2024, 5, 9)
        );

        System.out.println(michel);
        System.out.println(baltazar);
    }
}
