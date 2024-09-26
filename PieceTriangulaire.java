public class PieceTriangulaire extends piece {
    private double base; // Base du triangle
    private double hauteur; // Hauteur du triangle

    // Constructeur
    public PieceTriangulaire(TypePiece typePiece, String niveau, double base, double hauteur) {
        super(typePiece, niveau);
        this.base = base;
        this.hauteur = hauteur;
    }

    // Implémentation de la méthode surface
    @Override
    public double surface() {
        return (base * hauteur) / 2; // Surface = (base * hauteur) / 2
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
