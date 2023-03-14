public class Cd extends Support {

    private int nbPistes;

    public Cd(int numero, String titre, double duree, int qttestock, String commentaire, int nbPistes) {

        super(numero, titre, duree, qttestock, commentaire);
        this.nbPistes = nbPistes;

    }

    public int getNbPistes() {
        return this.nbPistes;
    }

    public void setNbPistes(int nbPistes) {
        this.nbPistes = nbPistes;
    }
    
}
