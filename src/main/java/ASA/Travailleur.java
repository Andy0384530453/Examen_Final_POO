package ASA;

public abstract class  Travailleur   {
    private int id;
    private  String nom;
    private String prenom;
    private String email;
    private String numero;



    private TravailleurDistinct Distinction;

    public Travailleur(int id, String nom, String prenom, String email, String numero,TravailleurDistinct distinction) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.numero = numero;
        this.Distinction = distinction;
    }





    public static void main(String[] args) {

    }

    public abstract boolean GestionQota();

    public abstract int NbrJourPreste();
}
