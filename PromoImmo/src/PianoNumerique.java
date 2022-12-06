public class PianoNumerique extends Piano{

private String toucherLourd;
private int qualiteEchan;


    public PianoNumerique(String nom, int prixAchat, int prixVente, int longueur, int largeur, String toucherLourd, int qualiteEchan) {
        super(nom, prixAchat, prixVente, longueur, largeur);
        this.toucherLourd = toucherLourd;
        this.qualiteEchan = qualiteEchan;
    }

    public String getToucherLourd() {
        return toucherLourd;
    }

    public int getQualiteEchan() {
        return qualiteEchan;
    }

    public void setToucherLourd(String toucherLourd) {
        this.toucherLourd = toucherLourd;
    }

    public void setQualiteEchan(int qualiteEchan) {
        this.qualiteEchan = qualiteEchan;
    }
}

