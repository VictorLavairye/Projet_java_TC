package Projet.Personne;

abstract class Personnel extends Personne {

    private String dateEntree;
    protected int tempsDeTravail;

    public Personnel(String nom, String prenom, String dateEntree){
        super(nom, prenom);
        this.dateEntree = dateEntree;
    }

    public Personnel(String nom, String prenom, String numerosecu, String adresse, String dateEntree){
        super(nom, prenom, numerosecu, adresse);
        this.dateEntree = dateEntree;
    }

    abstract int calculSalaire();
}
