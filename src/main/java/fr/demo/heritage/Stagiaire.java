package fr.demo.heritage;

import java.time.LocalDate;
import java.time.Period;

public class Stagiaire extends Personne {
    private LocalDate debutStage;
    private LocalDate finStage;

    public Stagiaire(
            String nom,
            String prenom,
            LocalDate dateNaissance,
            LocalDate dateDebutStage,
            LocalDate dateFinStage) {
        super(nom, prenom, dateNaissance);
        this.debutStage = dateDebutStage;
        this.finStage = dateFinStage;
    }

    public LocalDate getDebutStage() {
        return debutStage;
    }

    public void setDebutStage(LocalDate debutStage) {
        this.debutStage = debutStage;
    }

    public LocalDate getFinStage() {
        return finStage;
    }

    public void setFinStage(LocalDate finStage) {
        this.finStage = finStage;
    }

    public static void travailler() {
        System.out.println("Je travaille ! (sur l'imprimante et la machine à café)");
    }

    public void licencier(LocalDate dateDeFin) {
        this.finStage = dateDeFin;
        System.out.println(this.nom + this.prenom + " est viré.");
    }

    @Override
    public String toString() {
        String phrase1 = "Le stagiaire s'appelle " + this.nom + ' ' + this.prenom;
        String phrase2 = ".\nSon stage démarre le " + this.debutStage + " et prends fin le " + this.finStage + ".";
        return phrase1 + phrase2;
    }

    public int getDureeStage() {
        return Period.between(this.debutStage, this.finStage).getDays();
    }

    @Override
    public void danser(String danse) {
        System.out.println("Je danse une danse " + danse);
    }
}
