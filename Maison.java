public class Maison extends BienImmobilier {
    private boolean piscine; 
    private double surfaceTerrain;


    public Maison(String rue, String ville, String codePostal, Vendeur vendeur, double surfaceTerrain) {
        super(rue, ville, codePostal, vendeur);
        this.piscine = false; 
        this.surfaceTerrain = surfaceTerrain; 
    }

    public Maison(String rue, String ville, String codePostal, Vendeur vendeur, double surfaceTerrain, boolean piscine) {
        super(rue, ville, codePostal, vendeur);
        this.piscine = piscine;
        this.surfaceTerrain = surfaceTerrain;
    }

    @Override
    public String toString() {
        String resultat = "";
        resultat = "Maison individuelle ";
        resultat += "avec son terrain de " + surfaceTerrain + " m²";
        if (piscine) {
            resultat += " et sa piscine";
        }
        resultat += ". " + super.toString();
        return resultat;
    }

    public double getSurfaceTerrain() {
        return surfaceTerrain;
    }
}
