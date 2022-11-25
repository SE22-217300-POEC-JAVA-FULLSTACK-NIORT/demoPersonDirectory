package com.example.demoPOE20221004.model;


import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="stages")
public class Stage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private int tarif;
    private LocalDate date;

    @ManyToMany
    private List<Person> stagiaires = new ArrayList<>();



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Person> getStagiaires() {
        return stagiaires;
    }

    public void setStagiaires(List<Person> stagiaires) {
        this.stagiaires = stagiaires;
    }

    public void addStagiaire(Person stagiaire){
        stagiaires.add(stagiaire);
    }

    @Override
    public String toString() {
        return "Stage{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", tarif=" + tarif +
                ", date=" + date +
                '}';
    }
}
