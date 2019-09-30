package Projet.Personne;

import java.util.ArrayList;

public class Enseignant extends Personnel {

    private int prime = 500;
    private int service;
    private int heures; // heures effectuées
    private int heuresSupplementaires;
    private int salaire;
    private static int taux = 60; //taux heures sup
    private String echelon;
    private ArrayList<Integer> mission = new ArrayList<Integer>();

    public Enseignant(String nom, String prenom, String numerosecu, String adresse, String dateEntree, String echelon, int tempsDeTravail) {
        super(nom, prenom, numerosecu, adresse, dateEntree);
        this.echelon = echelon;
        this.tempsDeTravail = tempsDeTravail;
        this.calculStatut(this.echelon);
    }

    private void calculStatut(String echelon){
        if (echelon == "MDC"){
            this.service = 192;
            this.salaire = 30;
        }
        if (echelon == "PRAG"){
            this.service = 384;
            this.salaire = 400000;
        }
        if (echelon == "PROF"){
            this.service = 96;
            this.salaire = 5000;
        }
        this.heures = (this.service*this.tempsDeTravail)/100;
    }

    public void ajouterMission(int mission){
        this.mission.add(mission);
        this.service -= this.mission.get(this.mission.size()-1);
        setHeures(this.heures);
    }

    public void setHeures(int heures) {
        if (heures > this.service){
            this.heures = this.service;
            this.heuresSupplementaires = heures%this.service;
            this.tempsDeTravail = 100;
        }
        else{
            this.heures = heures;
            float temp =  (float) this.heures/this.service;
            this.tempsDeTravail = (int)temp;
        }
    }

    public void mission() {
        int heuresMission = 0;
        for (int i : mission){heuresMission += i;}
        System.out.println("L'enseignant a effectué " + mission.size() + " missions pour un nombre d'heure total de missions de " + heuresMission +"." );
        String listeMission = "[";
        int i = 0;
        for (i=0;i<mission.size()-1;i++){listeMission = listeMission + mission.get(i) + ",";}
        listeMission += mission.get(mission.size()-1) + "]";
        System.out.println("La liste des missions effectuées est la suivante:" + listeMission);
    }

    public int calculSalaire(){
        int result = 0;
        if (this.tempsDeTravail == 100){
            result += salaire + prime + heuresSupplementaires*taux;
        }
        else{
            result = (tempsDeTravail*salaire)/100;
        }
        return result;
    }
}
