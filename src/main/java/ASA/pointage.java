package ASA;

public class pointage extends Travailleur{

    private PointageDistinct typeTravail;
    private byte quota;
    private char description;
    private int non_absense;
    private int absense_exclue;

    public pointage(int id, String nom, String prenom, String email, String numero, TravailleurDistinct distinction, PointageDistinct typeTravail, byte quota) {
        super(id, nom, prenom, email, numero, distinction);
        this.typeTravail = typeTravail;
        this.quota = quota;
        this.absense_exclue = absense_exclue;
        this.non_absense = non_absense;
    }

    public PointageDistinct getTypeTravail() {
        return typeTravail;
    }

    public byte getQuota() {
        return quota;
    }

    public char getDescription() {
        return description;
    }

    public int getNon_absense() {
        return non_absense;
    }

    public int getAbsense_exclue() {
        return absense_exclue;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public boolean GestionQota(){
        if ( quota == 1.0){
            return true;

        }

        return false;
    }
    @Override
    public int NbrJourPreste(){
        var jour_preste = 0;

        jour_preste = non_absense + absense_exclue;
        return jour_preste;


    }




}
