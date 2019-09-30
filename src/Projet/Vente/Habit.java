package Projet.Vente;

public class Habit extends Article implements IVendrePiece, IPublicite, ISolde {

    private int solde;

    public Habit(String nom, int prix, int quantite){

        super(nom, prix, quantite);

    }

    public int vendrePiece(int quantite){

        if (quantite <= this.quantite) {
            this.quantite -= quantite;
        }

        return quantite*(prix*(100-solde));
    }

    public void remboursePiece(int quantite){

        this.quantite += quantite;

    }

    public void slogan(){

        System.out.println(this.nom + " est super top");

    }

    public void solde(int solde){

        this.solde = solde;

    }

}
