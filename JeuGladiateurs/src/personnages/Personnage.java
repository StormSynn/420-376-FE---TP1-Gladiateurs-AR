package personnages;

public class Personnage {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Attributs">
    // TODO : Mettre vos attributs ici
    // </editor-fold>
    
    String nom;
    int pointsDeVie;
    int valeurMaxAttaque;
    int valeurDefense;
    int initiative;
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) 
    {
        // TODO : Constructeur AVEC paramètres
        this.nom = nom;
        this.valeurMaxAttaque = attaqueMax;
        this.valeurDefense = defense;
        this.pointsDeVie = pvs;
        this.initiative = ini;
    }

    public Personnage() {
        // TODO : Constructeur SANS paramètres qui initialise à ZÉRO ou à ""
        this.nom = "";
        this.valeurMaxAttaque = 0;
        this.valeurDefense = 0;
        this.pointsDeVie = 0;
        this.initiative = 0;
    }
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    // TODO : Les getters
    // TODO : Les setters
    // </editor-fold>

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public int getValeurMaxAttaque() {
        return valeurMaxAttaque;
    }

    public void setValeurMaxAttaque(int valeurMaxAttaque) {
        this.valeurMaxAttaque = valeurMaxAttaque;
    }

    public int getValeurDefense() {
        return valeurDefense;
    }

    public void setValeurDefense(int valeurDefense) {
        this.valeurDefense = valeurDefense;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }
    

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void afficherInfosPersonnage() 
    {
        // TODO : Afficher les infos du personnage, tel que montré dans l'énoncé
        System.out.println();
        System.out.println("Nom : " + nom);
        System.out.println("Attaque : " + valeurMaxAttaque);
        System.out.println("Defense : " + valeurDefense);
        System.out.println("Points de vie : " + pointsDeVie);
        System.out.println("Initiavite: " + initiative);
        if (pointsDeVie <= 0) 
        {
            System.out.println("statut = mort");
        }
        else 
        {
            System.out.println("statut = Vivant"); 
        }
    }

    private int attaqueCalcul() 
    {
        // TODO : Retourner la valeur de l'attaque du personnage.
        // Cette valeur est trouvée aléatoirement et doit se situer entre ZÉRO et valeurMaxAttaque.
        int randomNbr = (int)(Math.random()* valeurMaxAttaque);
        
        return randomNbr;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        // TODO : Récupérer la valeur d'attaque pour ce tour, calculer les dégats,
        //modifier les points de vie du personnage cible, afficher les détails
        // sur l'attaque, tel que montré dans l'énoncé.
    }

    public void setNewInitiativeRandom() {
        // TODO : Modifier de façon aléatoire la valeur INI du personnage.
    }
    // </editor-fold>
}
