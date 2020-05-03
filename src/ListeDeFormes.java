import java.util.ArrayList;

public class ListeDeFormes {
    private ArrayList<Forme> listeFormes;

    public ListeDeFormes() {
        listeFormes = new ArrayList<Forme>();
    }

    public void ajouterUneForme(char type) {

        if (type == 'C') {
            listeFormes.add(new Cercle());
        } else if (type == 'T') {
            listeFormes.add(new Triangle());
        } else {
            listeFormes.add(new Rectangle());
        }
    }

    public void afficherLesFormes() {
        int nbFormes = listeFormes.size();
        if (nbFormes > 0) {
            for (Forme tmp : listeFormes) tmp.afficher();
        } else {
            System.out.print("Il n'y a pas de forme dans cette liste ");
        }
    }
}
