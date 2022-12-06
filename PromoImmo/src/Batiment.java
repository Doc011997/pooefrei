public class Batiment {


    public final double TAUXA = 5.6;
    public final double TAUXB = 1.5;

    private String adresse;
    private int surface;
    private Client proprio;
    private Client locataire;





    public Batiment(
            String adresse,
            int surface

    ) {
        this.adresse = adresse;
        this.surface = surface;


    }


    public String getAdresse() {
        return adresse;
    }

    public int getSurface() {
        return surface;
    }



    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }


}
