import java.util.ArrayList;

public class Support {

    private int numero;
    private String titre;
    private ArrayList<Artiste> artistes;
    private double duree;
    private int qttestock;
    private String commentaire;

    public Support(int numero, String titre, ArrayList<Artiste> artistes, double duree, int qttestock, String commentaire) {

        this.numero = numero;
        this.titre = titre;
        this.artistes = artistes;
        this.duree = duree;
        this.qttestock = qttestock;
        this.commentaire = commentaire;

    }

    public String toString() {
        return "";
    }

    public int getNumero() {
        return this.numero;
    }
    public String getTitre() {
        return this.titre;
    }
    public ArrayList<Artiste> getArtistes() {
        return this.artistes;
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
    public void setArtistes(ArrayList<Artiste> artistes) {
        this.artistes = artistes;
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
