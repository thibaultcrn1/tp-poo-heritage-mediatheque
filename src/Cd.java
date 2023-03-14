public class Cd extends Support {

    private int nbPistes;

    public Cd(int numero, String titre, Artiste artiste, double duree, int qttestock, String commentaire, int nbPistes) {

        super(numero, titre, artiste, duree, qttestock, commentaire);
        this.nbPistes = nbPistes;

    }

    public String toString() {
        return super.toString() + "\nNombre de pistes: " + this.nbPistes;
    }

    public int getNbPistes() {
        return this.nbPistes;
    }

    public void setNbPistes(int nbPistes) {
        this.nbPistes = nbPistes;
    }

}
