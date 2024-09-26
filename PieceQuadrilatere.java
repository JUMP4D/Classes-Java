public class PieceQuadrilatere extends piece {
    private double longueur; // Longueur de la pièce
    private double largeur;  // Largeur de la pièce

    // Constructeur
    public PieceQuadrilatere(TypePiece typePiece, String niveau, double longueur, double largeur) {
        super(typePiece, niveau);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    // Implémentation de la méthode surface
    @Override
    public double surface() {
        return longueur * largeur; // Surface = longueur * largeur
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
