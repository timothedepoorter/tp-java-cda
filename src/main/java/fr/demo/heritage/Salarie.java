package fr.demo.heritage;

import java.time.LocalDate;

public class Salarie extends Personne {
    public static final int HEURE_TRAVAILLEES_MENSUELLES_NORMALES = 151;
    private double tauxHoraireBrut;

    private LocalDate debutContrat;

    private LocalDate finContrat;

    public Salarie (
            String nom,
            String prenom,
            LocalDate dateNaissance,
            double tauxHoraireBrut,
            LocalDate debutContrat
    ) {
        super(nom, prenom, dateNaissance);
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

    public LocalDate getDebutContrat() {
        return debutContrat;
    }

    public void setDebutContrat(LocalDate debutContrat) {
        this.debutContrat = debutContrat;
    }

    public LocalDate getFinContrat() throws Exception {
        if (finContrat == null) {
            throw new Exception("Le salarié n'est pas (encore :P) licencié !");
        } else {
            return this.finContrat;
        }
    }

    public void setFinContrat(LocalDate finContrat) {
        this.finContrat = finContrat;
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

    /**
     * Vérifie si le salarié n'est plus présent dans l'entreprise
     * @return Vrai si le salarié n'est plus dans les effectifs.
     */
    private boolean estLicencie() {
        return this.finContrat != null && finContrat.isBefore(LocalDate.now());
    }

    public double payerSalaireMensuelBrut() {
        return this.payerSalaireMensuelBrut(HEURE_TRAVAILLEES_MENSUELLES_NORMALES);
    }

    public void travailler() {
        System.out.println(this.nom + this.prenom + "travaille dur car il aimerait bien une augmentation !");
    }

    public void licencier(LocalDate dateDeFin) {
        this.finContrat = dateDeFin;
        System.out.println(this.nom + this.prenom + "est viré. LOL");
    }

    @Override
    public String toString() {
        return "Le salarié s'appelle " + this.nom + ' ' + this.prenom;
    }
}
