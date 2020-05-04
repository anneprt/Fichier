import java.io.IOException;
import java.util.Scanner;

public class GestionFichier {

    public static void main(String[] args) throws IOException {

        Scanner lectureClavier = new Scanner(System.in);
        Fichier f = new Fichier();
        System.out.println("Entrer le nom du fichier:");
        String nomFichier = lectureClavier.next();
        f.ouvrir(nomFichier, "Ecriture");
        for (int i = 0; i < 5; i++) {
            f.ecrire(i);
            f.fermer();
            f.ouvrir(nomFichier, "Lecture");
            String chaine = "";
            do {
                chaine = f.lire();
                if (chaine != null) {
                    System.out.println(chaine);
                }

            } while (chaine != null);
            f.fermer();

        }

    }
}
