import java.io.IOException;
import java.util.Scanner;

public class FaireDesListesDeFormes {
    public static void main(String[] args) throws IOException {
        Scanner lectureClavier = new Scanner(System.in);
        ListeDeFormes LdF = new ListeDeFormes();
        Fichier f = new Fichier();
        if (f.ouvrir("Formes.txt", "Lecture")) {
            LdF.lireLesFormes(f);
            f.fermer();
        }
        byte choix = 0;
        do {
            System.out.println("1. Ajouter un cercle");
            System.out.println("2. Ajouter un triangle");
            System.out.println("3. Ajouter un rectangle");
            System.out.println("4. Afficher la liste");
            System.out.println("5. Pour sortir");
            System.out.print("Votre choix : ");
            choix = lectureClavier.nextByte();
            switch (choix) {
// 10.2.e Pour ajouter un cercle
                case 1:
                    LdF.ajouterUneForme('C');
                    break;
// 10.2.e Pour ajouter un triangle
                case 2:
                    LdF.ajouterUneForme('T');
                    break;
// 10.2.e Pour ajouter un rectangle
                case 3:
                    LdF.ajouterUneForme('R');
                    break;
// 10.2.e Afficher la liste des formes
                case 4:
                    LdF.afficherLesFormes();
                    break;
                case 5:
                    f.ouvrir("Formes.txt", "Ecriture");
                    LdF.enregistrerLesFormes(f);
                    f.fermer();
                    System.exit(0);
                default:
                    System.out.println("Cette option n'existe pas");
            }

        } while (choix != 5);
    }
}
