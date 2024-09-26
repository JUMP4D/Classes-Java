import java.text.DecimalFormat;
import java.util.ArrayList;

public abstract class BienImmobilier {
    private String rue;
    private String ville;
    private String codePostal;
    private Vendeur vendeur;
    private ArrayList<piece> pieces;

    public BienImmobilier(String rue, String ville, String codePostal, Vendeur vendeur) {
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
        this.vendeur = vendeur;
        this.pieces = new ArrayList<piece>();
    }

    public double surfaceHabitable() {
        double surfaceHabitableTotale = 0;
        for (piece piece : pieces) {
            if (piece.getTypePiece().isSurfaceHabitable()) {
                surfaceHabitableTotale += piece.surface();
            }
        }
        return surfaceHabitableTotale;
    }

    // Méthode pour calculer la surface non habitable totale
    public double surfaceNonHabitable() {
        double surfaceNonHabitableTotale = 0;
        for (piece piece : pieces) {
            if (!piece.getTypePiece().isSurfaceHabitable()) {
                surfaceNonHabitableTotale += piece.surface();
            }
        }
        return surfaceNonHabitableTotale;
    }

    public void ajouterPiece(piece piece) {
        pieces.add(piece);
    }

    public Vendeur getVendeur() {
        return vendeur;
    }

    public ArrayList<piece> getPieces() {
        return pieces;
    }

    @Override
    public String toString() {
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        return "\nLocalisation : " + rue + " " + codePostal + " " + ville + 
        "\n \n Description du bien : \n" + pieces.toString() + 
        "\nPour une surface habitable de : " + numberFormat.format(surfaceHabitable())+ " m2 et une surface non habitable de : " + numberFormat.format(surfaceNonHabitable()) + " m2.";
    }

}

