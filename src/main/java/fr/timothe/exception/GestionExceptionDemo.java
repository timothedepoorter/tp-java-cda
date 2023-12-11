package fr.timothe.exception;

public class GestionExceptionDemo {
    public static void main (String[] args) throws MonExceptionPerso{
        int dividende = 10;
        int diviseur = 0;

        try {
            int resultat = dividende/diviseur;
            System.out.println("Le résultat est " + resultat);
        } catch (ArithmeticException e) {
            throw new MonExceptionPerso("Ca marche pas ! " + e.getMessage());
        } finally {
            System.out.println("J'ai fait du code");
        }
    }
}
