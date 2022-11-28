package com.example.demoPOE20221004.model;

import javax.persistence.*;

@Entity
public class Chien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String couleur;
    private int age;

    @ManyToOne
    private Person proprietaire;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Person proprietaire) {
        this.proprietaire = proprietaire;
    }
}
