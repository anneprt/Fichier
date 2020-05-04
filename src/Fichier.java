import java.io.*;

public class Fichier {
    private BufferedWriter fW;
    private BufferedReader fR;
    private char mode;

    public void ouvrir(String nomDuFichier, String s) throws IOException {
        mode = (s.toUpperCase()).charAt(0);
        if (mode == 'R' || mode == 'L') {
            fR = new BufferedReader(new FileReader(new File(nomDuFichier)));
        } else {
            if (mode == 'W' || mode == 'E') {
                fW = new BufferedWriter(new FileWriter(new File(nomDuFichier)));
            }
        }
    }

    public void ecrire(int tmp) throws IOException {
        String chaine = "";
        chaine = String.valueOf(tmp);
        if (chaine != null) {
            fW.write(chaine, 0, chaine.length());
            fW.newLine();
        }
    }

    public String Lire() throws IOException {
        String chaine = fR.readLine();
        return chaine;
    }

    public void fermer() throws IOException {
        if (mode == 'R' || mode == 'L') {
            fR.close();
        } else {
            if (mode == 'W' || mode == 'E') {
                fW.close();
            }
        }
    }

}


