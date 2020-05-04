public class Cercle extends Forme {
    private int rayon;

    public Cercle(int nx, int ny, int nr, int nc) {
        super(nx, ny, nc);
        rayon = verifier(nr, 0, HAUTEUR_ECRAN);
    }

    public Cercle() {
        rayon = verifier("Rayon : ", 0, HAUTEUR_ECRAN);
    }

    public void afficher() {
        super.afficher();
        System.out.println("Rayon : " + rayon);
    }

    public String getInfos() {
        String tmp = super.getInfos();
        return "C;" + tmp + ";" + rayon + ";";
    }
}
