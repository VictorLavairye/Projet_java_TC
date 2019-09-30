package Projet.Enfant;

public class Lyceen extends Enfant implements Scolaire {

    private static final String [] cursus = {"2nd", "1ere", "Terminal"};
    private String annee;
    private boolean examen;

    public Lyceen(String nom, String prenom, char sexe, int deptNaissance, String annee){
        super(nom, prenom, sexe, deptNaissance);
        this.annee = annee;
        if (this.grand()){
            this.examen = true;
        }
    }

    public boolean petit(){
        if (annee == "2nd"){
            return true;
        }
        return false;
    }

    public boolean moyen(){
        if (annee == "1ere"){
            return true;
        }
        return false;
    }

    public boolean grand(){
        if (annee == "Terminal"){
            return true;
        }
        return false;
    }


}
