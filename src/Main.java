import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int menu() {

        Scanner sc = new Scanner(System.in);

        System.out.println("1: Ajouter un cd\n2: Ajouter une vidéo\n3: Ajouter un support\nQue voulez-vous faire ?");
        int choice = sc.nextInt();

        return choice;

    }

    public static void code() {

        ArrayList<Support> support = new ArrayList<Support>();
        ArrayList<MetteurScene> metteurScenes = new ArrayList<MetteurScene>();
        ArrayList<Artiste> artistes = new ArrayList<Artiste>();

        Scanner sc = new Scanner(System.in);
        int numero,
                qttestock,
                nbPiste,
                idArtiste,
                idMetteurScene;

        String titre,
                commentaire;

        double duree;

        int choice = menu();

        Artiste jul = new Artiste(1, "Julien", "Marie", "Rap");
        Artiste sch = new Artiste(2, "Julien", "Schwarzer", "Rap");
        Artiste damso = new Artiste(3, "Kalubi", "Willam", "Rap");
        artistes.add(jul);
        artistes.add(sch);
        artistes.add(damso);

        // N'utiliser qu'une seule variable artiste et metteur en scene

        MetteurScene Squeezie = new MetteurScene(1, "Hauchard", "Lucas");
        MetteurScene theKairi = new MetteurScene(2, "Daouki", "Jaoued");
        MetteurScene Kenny = new MetteurScene(3, "LLL", "Kenny");
        metteurScenes.add(Squeezie);
        metteurScenes.add(theKairi);
        metteurScenes.add(Kenny);

        switch(choice) {
            case 1:

                for(int i=0; i<3; i++) {
                    sc.nextLine();
                    try {

                        System.out.println("Saisissez le numéro du CD");
                        numero = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Saisissez le titre du CD");
                        titre = sc.nextLine();
                        sc.nextLine();
                        for(Artiste artiste: artistes) {
                            System.out.println(artiste.toString() + "\n");
                        }
                        System.out.println("Saisissez l'identifiant de l'artiste");
                        idArtiste = sc.nextInt();
                        System.out.println("Saisissez la durée du CD: ");
                        duree = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Saisissez la quantité de CD: ");
                        qttestock = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Saisissez un commentaire: ");
                        commentaire = sc.nextLine();
                        sc.nextLine();
                        System.out.println("Saisissez le nombre de pistes du CD: ");
                        nbPiste = sc.nextInt();
                        sc.nextLine();

                        for(Artiste artiste: artistes) {
                            if(artiste.getIdentifiant() == idArtiste) {
                                Cd leCd = new Cd(numero, titre, artiste, duree, qttestock, commentaire, nbPiste);
                                support.add(leCd);
                            }
                        }

                    } catch (Exception e) {
                        System.out.println("Erreur, vous n'avez pas saisi le bon type d'argument.");
                    }
                }

                System.out.println("Voici la liste des CD: ");
                for (Support unSupport: support) {
                    System.out.println(unSupport.toString() + "\n");
                }

                break;

            case 2:

                for(int i=0; i<2; i++) {
                    sc.nextLine();
                    try {

                        System.out.println("Saisissez le numéro de la vidéo");
                        numero = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Saisissez le titre de la vidéo");
                        titre = sc.nextLine();
                        sc.nextLine();
                        for(Artiste artiste: artistes) {
                            System.out.println(artiste.toString() + "\n");
                        }
                        System.out.println("Saisissez l'identifiant de l'artiste");
                        idArtiste = sc.nextInt();
                        System.out.println("Saisissez la durée de la vidéo: ");
                        duree = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Saisissez la quantité de vidéo: ");
                        qttestock = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Saisissez un commentaire: ");
                        commentaire = sc.nextLine();
                        sc.nextLine();
                        System.out.println("Saisissez l'identifiant du metteur en scène: ");
                        idMetteurScene = sc.nextInt();
                        sc.nextLine();

                        for(Artiste artiste: artistes) {
                            if(artiste.getIdentifiant() == idArtiste) {
                                for(MetteurScene metteurScene: metteurScenes) {
                                    if(metteurScene.getIdentifiant() == idMetteurScene) {
                                        Video uneVideo = new Video(numero, artiste, titre, duree, qttestock, commentaire, metteurScene);
                                        support.add(uneVideo);
                                    }
                                }
                            }
                        }

                    } catch (Exception e) {
                        System.out.println("Erreur, vous n'avez pas saisi le bon type d'argument.");
                    }
                }

                System.out.println("Voici la liste des VIDEOS: ");
                for (Support unSupport: support) {
                    System.out.println(unSupport.toString() + "\n");
                }

                break;

            default:

                System.out.println("Ce choix n'existe pas !");

                break;
        }

    }

    public static void main(String[] args) {

        code();

    }
}