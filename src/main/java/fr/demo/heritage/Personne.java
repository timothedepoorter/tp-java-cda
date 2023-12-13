package fr.demo.heritage;

import java.time.LocalDate;
import java.time.Period;

public abstract class Personne {
    protected String nom;

    protected String prenom;

    protected LocalDate dateNaissance;

    public Personne(String nom, String prenom, LocalDate dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
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

    /**
     * Affiche l'age, calculé à partir de la date de naissance et la date du jour.
     * @return int - age
     */
    public int getAge() {
        return Period.between(dateNaissance, LocalDate.now()).getYears();
    }

    /**
     * Méthode pour danser
     * @param danse String
     */
    public abstract void danser(String danse);
}
