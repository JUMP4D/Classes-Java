public class PieceCirculaire extends piece {
    private double rayon; // Rayon du cercle

    // Constructeur
    public PieceCirculaire(TypePiece typePiece, String niveau, double rayon) {
        super(typePiece, niveau);
        this.rayon = rayon;
    }

    // Implémentation de la méthode surface
    @Override
    public double surface() {
        return Math.PI * rayon * rayon; // Surface = π * rayon²
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
