public class Triangle extends Forme {
    public final static int TAILLE_ECRAN = 600;
    private int[] xPoints = new int[3];
    private int[] yPoints = new int[3];

    public Triangle(int nxa, int nya, int nxb, int nyb, int nxc, int nyc, int nc) {
        super(nxa, nya, nc);
        xPoints[0] = x;
        yPoints[0] = y;
        xPoints[1] = verifier(nxb, 0, LARGEUR_ECRAN);
        yPoints[1] = verifier(nyb, 0, HAUTEUR_ECRAN);
        xPoints[2] = verifier(nxc, 0, LARGEUR_ECRAN);
        yPoints[2] = verifier(nyc, 0, HAUTEUR_ECRAN);
    }

    public Triangle() {
        xPoints[0] = x;
        xPoints[0] = y;
        for (int i = 1; i < xPoints.length; i++) {
            xPoints[i] = verifier("[" + i + "] en X", 0, LARGEUR_ECRAN);
            yPoints[i] = verifier("[" + i + "] en Y", 0, HAUTEUR_ECRAN);
        }
    }


    public void afficher() {
        super.afficher();
        for (int i = 1; i < 3; i++) {
            System.out.println("Position en " + xPoints[i] + ", " + yPoints[i]);
        }
    }

    public void deplacer(int nx, int ny) {
        super.deplacer(nx, ny);
        xPoints[0] = x;
        yPoints[0] = y;
        for (int i = 1; i < xPoints.length; i++) {
            xPoints[i] = verifier(xPoints[i] + nx, 0, LARGEUR_ECRAN);
            yPoints[i] = verifier(yPoints[i] + ny, 0, HAUTEUR_ECRAN);
        }
    }

    public String getInfos() {
        String tmp = super.getInfos();
        return "T;" + tmp + ";" + xPoints[1] + ";" + yPoints[1] + ";" + xPoints[2] + ";" + yPoints[2];
    }
}

