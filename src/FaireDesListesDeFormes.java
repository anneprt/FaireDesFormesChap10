import java.util.Scanner;

public class FaireDesListesDeFormes {
    public static void main(String[] args) {
        Scanner lectureClavier = new Scanner(System.in);
        ListeDeFormes LdF = new ListeDeFormes();
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
                default:
                    System.out.println("Cette option n'existe pas");
            }

        } while (choix != 5);
    }
}
