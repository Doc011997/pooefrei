public class Hotel extends Batiment {

    private int nbreDeChambre;

    public Hotel(String adresse, int surface, int nbreDeChambre) {
        super(adresse, surface);
        this.nbreDeChambre = nbreDeChambre;

    }

    public int getNbreDeChambre() {
        return nbreDeChambre;
    }

    public void setNbreDeChambre(int nbreDeChambre) {
        this.nbreDeChambre = nbreDeChambre;
    }
}
