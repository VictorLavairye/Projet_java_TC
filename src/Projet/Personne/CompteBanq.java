package Projet.Personne;

import Projet.Personne.Personne;

public class CompteBanq {

    private String num;
    private Personne client;
    private float solde;
    private float decouvertAutorise;
    private String code1;
    private String code2;

    public CompteBanq(String num, Personne client, String code1, String code2){

        this.num = num;
        this.client = client;
        this.code1 = code1;
        this.code2 = code2;

        this.solde = 0;
        this.decouvertAutorise = 0;
    }

    public String getNum() {
        return num;
    }

    public Personne getClient() {
        return client;
    }

    public float getSolde() {
        return solde;
    }

    public float getDecouvertAutorise() {
        return decouvertAutorise;
    }

    public void setSolde(float solde, String code) {
        if(this.code1 == code) {
            this.solde = solde;
        }
    }

    public void setDecouvertAutorise(float decouvertAutorise, String code) {
        if(this.code2 == code) {
            this.decouvertAutorise = decouvertAutorise;
        }
    }

    public void versement(float montant, String code){
        if (this.code1 == code && montant >= 0){
            this.solde += montant;
            System.out.println("Nouveau solde: " + this.solde);
        }
        else {
            System.out.println("Solde inchangé");
        }
    }

    public void retrait(float montant, String code){
        if (this.code1 == code && montant >= 0){
            if (montant <= this.solde + this.decouvertAutorise){
                this.solde -= montant;
                System.out.println("Opération effectué. Nouveau solde: " + this.solde);
            }
            else{
                System.out.println("Votre solde et votre niveau de découvert autorisé ne vous permet pas d'effectuer cette opération");
            }
        }
        else{
            System.out.println("Impossible d'effectuer l'opération");
        }
    }

    @Override
    public String toString() {
        return "Client:"+ this.client.getNom() + ',' + this.client.getPrenom()
                + ". Solde:" + this.getSolde() + "Decouvert autorisé:" + this.getDecouvertAutorise();
    }
}
