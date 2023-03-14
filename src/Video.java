public class Video extends Support {

    private MetteurScene metteurScene;
    public Video(int numero, Artiste artiste, String titre, double duree, int qttestock, String commentaire, MetteurScene metteurScene) {

        super(numero, titre, artiste, duree, qttestock, commentaire);
        this.metteurScene = metteurScene;

    }

    public String toString() {
        return super.toString() + "\nMetteur en scène: " + this.metteurScene.toString();
    }

    public MetteurScene getMetteurScene() {
        return this.metteurScene;
    }

    public void setMetteurScene(MetteurScene metteurScene) {
        this.metteurScene = metteurScene;
    }
}
