public class PieceTrapezoidale extends piece {
    private double base1; // Première base du trapèze
    private double base2; // Deuxième base du trapèze
    private double hauteur; // Hauteur du trapèze

    // Constructeur
    public PieceTrapezoidale(TypePiece typePiece, String niveau, double base1, double base2, double hauteur) {
        super(typePiece, niveau);
        this.base1 = base1;
        this.base2 = base2;
        this.hauteur = hauteur;
    }

    // Implémentation de la méthode surface
    @Override
    public double surface() {
        return ((base1 + base2) * hauteur) / 2; // Surface = ((base1 + base2) * hauteur) / 2
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
