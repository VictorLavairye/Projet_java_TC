package Projet.Enfant;

public class Collegien extends Enfant implements Scolaire {

    private static final String [] cursus = {"6eme", "5eme", "4eme", "3eme"};
    private String annee;
    private boolean examen;

    public Collegien(String nom, String prenom, char sexe, int deptNaissance, String annee){
        super(nom, prenom, sexe, deptNaissance);
        this.annee = annee;
        if (this.grand()){
            this.examen = true;
        }
    }

    public boolean petit(){
        if (annee == "6eme"){
            return true;
        }
        return false;
    }

    public boolean moyen(){
        if (annee != "6eme" && annee != "4eme"){
            return true;
        }
        return false;
    }

    public boolean grand(){
        if (annee == "3eme"){
            return true;
        }
        return false;
    }


}
