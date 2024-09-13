package jeugladiateurs;

import personnages.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;
import java.util.Locale;

public class JeuGladiateurs {

    public static void main(String[] args) {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="expanded" desc="Instanciation des objets">
    CompteurDeTour tour = new CompteurDeTour();
    AffichageEcran affichage = new AffichageEcran();
    Personnage Bob = new Personnage("Bob le malchant", 15, 15, 70, 15);
    Personnage Igor = new Personnage("Igor l'empaleur", 25, 5, 30, 100);
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Affichage pré-combat">
    // TODO : Afficher les infos de chaque personnage
    
    System.out.println(Bob.getNom());
    System.out.println(" Attaque : " + Bob.getValeurMaxAttaque());
    System.out.println(" Defense : " + Bob.getValeurDefense());
    System.out.println(" Points de vie : " + Bob.getPointsDeVie());
    System.out.println(" Initiative : " + Bob.getInitiative());
        if (Bob.getPointsDeVie() <= 0 ) 
        {
            System.out.println("Statut: Mort");
        }
        else  
        {
            System.out.println(" Statut: Vivant \n");
        }
    System.out.println(Igor.getNom());
    System.out.println(" Attaque : " + Igor.getValeurMaxAttaque());
    System.out.println(" Defense : " + Igor.getValeurDefense());
    System.out.println(" Points de vie : " + Igor.getPointsDeVie());
    System.out.println(" Initiative : " + Igor.getInitiative());
        if (Igor.getPointsDeVie() <= 0 ) 
        {
            System.out.println(" Statut: Mort");
        }
        else  
        {
            System.out.println("Statut: Vivant \n");
        }
    // TODO : Afficher le message du début du combat
    affichage.afficherDebutCombat();
    
    // </editor-fold>
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de combat">
    // TODO : La boucle contenant les étapes du combat
    // TODO : Après la boucle, afficher le résultat du combat
    // </editor-fold>
    }

}
