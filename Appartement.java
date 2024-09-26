public class Appartement extends BienImmobilier {
    private String etage;
    private boolean ascenseur;


    public Appartement(String rue, String ville, String codePostal, Vendeur vendeur, String etage) {
        super(rue, ville, codePostal, vendeur);
        this.etage = etage;
        this.ascenseur = false;
    }


    public Appartement(String rue, String ville, String codePostal, Vendeur vendeur, String etage, boolean ascenseur) {
        super(rue, ville, codePostal, vendeur);
        this.etage = etage;
        this.ascenseur = ascenseur; 
    }


    public String typeBien() {
        int nombreDePieces = 0;

        // Compter le nombre de pièces qui sont des pièces habitables
        for (piece piece : getPieces()) {
            if (piece.getTypePiece().isPiece() && piece.getTypePiece().isSurfaceHabitable()) {
                nombreDePieces++;
            }
        }

        // Déterminer le type d'appartement
        if (nombreDePieces > 7) {
            return "T7+";
        }
        return "T" + nombreDePieces; // Retourne T1, T2, etc.
    }

    @Override
    public String toString() {
        String resultat = "Appartement de type " + typeBien();
        if (ascenseur) {
            resultat += " avec ascenseur ";
        }
        resultat += " situé au " + etage + " ";
        resultat += super.toString(); 
        return resultat;
    }
}
