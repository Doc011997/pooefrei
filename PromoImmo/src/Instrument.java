public class Instrument {

    private String nom;
    private int prixAchat;
    private int prixVente;

    public Instrument(String nom, int prixAchat, int prixVente) {
        this.nom = nom;
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
    }

    public String getNom() {
        return nom;
    }

    public int getPrixAchat() {
        return prixAchat;
    }

    public int getPrixVente() {
        return prixVente;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrixAchat(int prixAchat) {
        this.prixAchat = prixAchat;
    }

    public void setPrixVente(int prixVente) {
        this.prixVente = prixVente;
    }
}

