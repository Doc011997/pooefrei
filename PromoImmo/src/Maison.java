public class Maison extends Batiment {

    private int nbreDePiece;
    private int SurfaceDeJardin;


    public Maison(String adresse, int surface, String proprio, int nbreDePiece, int surfaceDeJardin) {
        super(adresse, surface);
        this.nbreDePiece = nbreDePiece;
        this.SurfaceDeJardin = surfaceDeJardin;
    }
}
