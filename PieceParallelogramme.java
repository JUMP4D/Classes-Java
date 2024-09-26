public class PieceParallelogramme extends piece {
    private double base; // Base du parallélogramme
    private double hauteur; // Hauteur du parallélogramme

    // Constructeur
    public PieceParallelogramme(TypePiece typePiece, String niveau, double base, double hauteur) {
        super(typePiece, niveau);
        this.base = base;
        this.hauteur = hauteur;
    }

    // Implémentation de la méthode surface
    @Override
    public double surface() {
        return base * hauteur; // Surface = base * hauteur
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
