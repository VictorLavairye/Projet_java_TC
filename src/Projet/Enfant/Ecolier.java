package Projet.Enfant;

public class Ecolier extends Enfant implements Scolaire {

    private static final String [] cursus = {"CP", "CE1", "CE2", "CM1", "CM2"};
    private String annee;

    public Ecolier(String nom, String prenom, char sexe, int deptNaissance, String annee){
        super(nom, prenom, sexe, deptNaissance);
        this.annee = annee;
    }

    public boolean petit(){
        if (annee == "CP"){
            return true;
        }
        return false;
    }

    public boolean moyen(){
        if (annee != "CP" && annee != "CM2"){
            return true;
        }
        return false;
    }

    public boolean grand(){
        if (annee == "CM2"){
            return true;
        }
        return false;
    }

}
