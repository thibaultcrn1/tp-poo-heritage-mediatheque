public class MetteurScene {

    private int identifiant;
    private String nom;
    private String prenom;

    public MetteurScene(int identifiant, String nom, String prenom) {

        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;

    }

    @Override
    public String toString() {
        return "Identifiant: " + this.identifiant + "\nNom: " + this.nom + "\nPrénom: " + this.prenom;
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

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

}
