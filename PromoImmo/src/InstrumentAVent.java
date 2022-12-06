public class InstrumentAVent extends Instrument {

    private String type;


    public InstrumentAVent(String nom, int prixAchat, int prixVente, String type) {
        super(nom, prixAchat, prixVente);
        this.type= type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

