public class Artiste {

    private int identifiant;
    private String nom;
    private String prenom;
    private String genre;

    public Artiste(int identifiant, String nom, String prenom, String genre) {

        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;

    }

    public int getIdentifiant() {
        return this.identifiant;
    }
    public String getNom() {
        return this.nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    public String getGenre() {
        return this.genre;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
}
