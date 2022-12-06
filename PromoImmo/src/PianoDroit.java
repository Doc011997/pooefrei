public class PianoDroit extends Piano{

    private String typeDeCorde;
    private String mode;

    public PianoDroit(String nom, int prixAchat, int prixVente, int longueur, int largeur, String typeDeCorde, String mode) {
        super(nom, prixAchat, prixVente, longueur, largeur);
        this.typeDeCorde = typeDeCorde;
        this.mode = mode;
    }

    public String getTypeDeCorde() {
        return typeDeCorde;
    }

    public String getMode() {
        return mode;
    }

    public void setTypeDeCorde(String typeDeCorde) {
        this.typeDeCorde = typeDeCorde;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
