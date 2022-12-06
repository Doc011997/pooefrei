
public class InstrumentACorde extends Instrument {

    private int longueur;
    private int largeur;

    public InstrumentACorde(String nom, int prixAchat, int prixVente, int longueur, int largeur) {
        super(nom, prixAchat, prixVente);
        this.longueur = longueur;
        this.largeur = largeur;

    }

    public int getLongueur() {
        return longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }
}



