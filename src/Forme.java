import java.util.Scanner;

public class Forme {
    public final static int LARGEUR_ECRAN = 800;
    public final static int HAUTEUR_ECRAN = 600;
    public final static int COULEUR_MAX = 10;
    protected int x, y, couleur;

    public Forme(int nx, int ny, int nc) {
        x = verifier(nx, 0, LARGEUR_ECRAN);
        y = verifier(ny, 0, HAUTEUR_ECRAN);
        couleur = verifier(nc, 0, COULEUR_MAX);
    }

    public Forme() {
        x = verifier("en X", 0, LARGEUR_ECRAN);
        y = verifier("en Y", 0, HAUTEUR_ECRAN);
        couleur = verifier("couleur", 0, COULEUR_MAX);
        ;
    }

    public void afficher() {
        System.out.println("Couleur : " + couleur);
        System.out.println("Position en " + x + ", " + y);
    }

    protected int verifier(String s, int a, int b) {
        Scanner lectureClavier = new Scanner(System.in);
        int resultat;
        do {
            System.out.print(s + "          :  ");
            resultat = lectureClavier.nextInt();
        } while (resultat < a || resultat > b);
        return resultat;
    }


    protected int verifier(int tmp, int a, int b) {
        if (tmp < a) return a;
        else if (tmp > b) return b;
        else return tmp;
    }


    public void deplacer(int nx, int ny) {
        x = verifier(x + nx, 0, LARGEUR_ECRAN);
        y = verifier(y + ny, 0, HAUTEUR_ECRAN);
    }

    public void colorier(int nc) {
        couleur = verifier(nc, 0, COULEUR_MAX);
    }

    public String getInfos() {
        return couleur + ";" + x + ";" + y;
    }
}
