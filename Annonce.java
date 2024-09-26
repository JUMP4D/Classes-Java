public class Annonce{

    private String reference;
    private String date;
    private String titre;
    private double prixM2Habitable;
    private BienImmobilier logement;

    public static final double COEF_NON_HABITABLE = 0.25;

public Annonce(String reference, String date, String titre, double prixM2Habitable, BienImmobilier logement) {
    this.reference = reference;
    this.date = date;
    this.titre = titre;
    this.prixM2Habitable = prixM2Habitable;
    this.logement = logement;
}


@Override
public String toString() {
    return titre + "\nAnnonce " + reference + " du " + date +
    "\n" + logement.toString() + 
    "\n- Prix du m2 habitable : " + prixM2Habitable + "Euros" + 
    "\n- Prix du m2 non habitable : " + prixM2Habitable * COEF_NON_HABITABLE + "Euros" + "\n" + logement.getVendeur().toString(); 

}
}
