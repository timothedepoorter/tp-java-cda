package fr.demo.heritage;

import java.time.LocalDate;

public class Salarie extends Collaborateur {
    public static final int HEURE_TRAVAILLEES_MENSUELLES_NORMALES = 151;
    private double tauxHoraireBrut;

    public Salarie (
            String nom,
            String prenom,
            LocalDate dateNaissance,
            double tauxHoraireBrut,
            LocalDate debutContrat
    ) {
        super(
                nom,
                prenom,
                dateNaissance,
                debutContrat,
                null
        );
        this.debutContrat = debutContrat;
        this.tauxHoraireBrut = tauxHoraireBrut;
    }

    public double getTauxHoraireBrut() {
        return this.tauxHoraireBrut;
    }

    public void setTauxHoraireBrut(double nouveauTauxHoraireBrut) throws IllegalArgumentException {
        if (nouveauTauxHoraireBrut < 20) {
            throw new IllegalArgumentException(
                    "Mais enfin Corrinne ?! On paie mieux que ça chez nous !"
            );
        }
        this.tauxHoraireBrut = nouveauTauxHoraireBrut;
    }

    /**
     * Paie le salarié en fonction du temps passé à travailler
     * @param heuresTravaillees double - Nombre d'heures
     * @return double - LA THUNE !
     */
    public double payerSalaireMensuelBrut(double heuresTravaillees) {
        if (heuresTravaillees < 0) {
            throw new IllegalArgumentException("What the fuck CORRINNE ?!");
        }

        if (estLicencie()) {
            throw new IllegalArgumentException("MAIS BORDEL CORRINE !");
        }

        return calculerSalaire(heuresTravaillees);
    }

    /**
     * Calcule le salaire en fonction du temps travaillé
     * Applique un taux spécifique aux heures effectuées au-delà de 151 heures.
     * @param heuresTravaillees double - Nombre d'heures travaillées
     * @return double - LA THUNASSE <3
     */
    private double calculerSalaire(double heuresTravaillees) {
        if (heuresTravaillees > HEURE_TRAVAILLEES_MENSUELLES_NORMALES) {
            double salaire = 0;
            salaire += HEURE_TRAVAILLEES_MENSUELLES_NORMALES * this.tauxHoraireBrut;
            salaire += (heuresTravaillees - HEURE_TRAVAILLEES_MENSUELLES_NORMALES) * this.tauxHoraireBrut * 1.5;

            return salaire;
        } else {
            return heuresTravaillees * this.tauxHoraireBrut;
        }
    }

    public double payerSalaireMensuelBrut() {
        return this.payerSalaireMensuelBrut(HEURE_TRAVAILLEES_MENSUELLES_NORMALES);
    }

    @Override
    public void travailler() {
        System.out.println(this.nom + this.prenom + "travaille dur car il aimerait bien une augmentation !");
    }

    @Override
    public String toString() {
        return "Le salarié s'appelle " + this.nom + ' ' + this.prenom;
    }

    @Override
    public void direBonjour() {
        System.out.println("Hello, je suis un salarié de ouf !");
    }

    /**
     * Le salarié danse
     * @param danse - Le nom de la danse
     */
    @Override
    public void danser(String danse) {
        System.out.println("Je danse la " + danse );
    }
}