package fr.demo.heritage;

import java.time.LocalDate;
import java.time.Period;

public abstract class Collaborateur {
    protected String nom;

    protected String prenom;

    protected LocalDate dateNaissance;
    protected LocalDate debutContrat;

    protected LocalDate finContrat;

    public Collaborateur(
            String nom,
            String prenom,
            LocalDate dateNaissance,
            LocalDate debutContrat,
            LocalDate finContrat
    ) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.debutContrat = debutContrat;
        this.finContrat = finContrat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
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
     * Affiche l'age, calculé à partir de la date de naissance et la date du jour.
     * @return int - age
     */
    public int getAge() {
        return Period.between(dateNaissance, LocalDate.now()).getYears();
    }

    public void direBonjour() {
        System.out.println("Coucou toi <3");
    }

    /**
     * La personne danse ! Youhou !
     * @param danse - Le nom de la danse
     */
    public abstract void danser(String danse);

    /**
     * La personne travaille
     */
    public abstract void travailler();

    /**
     * La personne est licenciée ! oO
     * @param dateDeFin LocalDate - Date de fin du contrat
     */
    public void licencier(LocalDate dateDeFin) {
        this.finContrat = dateDeFin;
        System.out.println(this.nom + this.prenom + "est viré. LOL");
    }

    /**
     * Vérifie si le salarié n'est plus présent dans l'entreprise
     * @return Vrai si le salarié n'est plus dans les effectifs.
     */
    protected boolean estLicencie() {
        return this.finContrat != null && finContrat.isBefore(LocalDate.now());
    }

}