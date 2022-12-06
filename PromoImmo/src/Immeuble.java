public class Immeuble extends Batiment {

  private int nbreAppart;

    public Immeuble(String adresse, int surface, String proprio, int nbreAppart) {
        super(adresse, surface);
        this.nbreAppart = nbreAppart;
    }
}
