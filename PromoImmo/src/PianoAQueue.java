public class PianoAQueue extends Piano{

private String taille;

    public PianoAQueue(String nom, int prixAchat, int prixVente, int longueur, int largeur, String taille) {
        super(nom, prixAchat, prixVente, longueur, largeur);
        this.taille = taille;
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }
}
