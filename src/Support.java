public class Support {

    private int numero;
    private String titre;
    private Artiste lArtiste;
    private double duree;
    private int qttestock;
    private String commentaire;

    public Support(int numero, String titre, Artiste artiste, double duree, int qttestock, String commentaire) {

        this.numero = numero;
        this.titre = titre;
        this.lArtiste = artiste;
        this.duree = duree;
        this.qttestock = qttestock;
        this.commentaire = commentaire;

    }

    public String toString() {
        return "Support de numéro: " + this.numero + "\nTitre: " + this.titre + "\nArtiste: " + this.lArtiste.toString() + "\nDurée: " + this.duree + "\nQuantité en stock: " + this.qttestock + "\nCommentaire: " + this.commentaire;
    }

    public int getNumero() {
        return this.numero;
    }
    public String getTitre() {
        return this.titre;
    }
    public double getDuree() {
        return this.duree;
    }
    public int getQttestock() {
        return this.qttestock;
    }
    public String getCommentaire() {
        return this.commentaire;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public void setDuree(double duree) {
        this.duree = duree;
    }
    public void setQttestock(int qttestock) {
        this.qttestock = qttestock;
    }
    public void setCommentaire(String commantaire) {
        this.commentaire = commentaire;
    }
}
