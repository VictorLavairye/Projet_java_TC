package Projet.Personne;
import Projet.*;

public class IATOS extends Personnel {

    private int heuresSupplementaires;
    private int taux;
    private static int salaire = 3000;

    public IATOS(String nom, String prenom, String numerosecu, String adresse, String dateEntree, int tempsDeTravail) {
        super(nom, prenom, numerosecu, adresse, dateEntree);
        this.tempsDeTravail = tempsDeTravail;
    }

    public void setTaux(int taux){
        this.taux = taux;
    }

    public void setHeuresSupplementaires(int heuresSupplementaires) {
        this.heuresSupplementaires = heuresSupplementaires;
    }

    public int calculSalaire(){
        int result = 0;
        if (tempsDeTravail==100){
            result = salaire + heuresSupplementaires*taux;
        }
        else{
            result = (salaire*tempsDeTravail)/100;
        }
        return result;

    }
}
