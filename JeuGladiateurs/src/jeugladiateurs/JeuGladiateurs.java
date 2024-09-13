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
    
    System.out.println(Bob +"/n");
        if (Bob.getPointsDeVie() <= 0 ) 
        {
            System.out.println("Statut: Mort");
        }
        else  
        {
            System.out.println("Statut: Vivant");
        }
    System.out.println(Igor + "/n");
        if (Bob.getPointsDeVie() <= 0 ) 
        {
            System.out.println("Statut: Mort");
        }
        else  
        {
            System.out.println("Statut: Vivant");
        }
    // TODO : Afficher le message du début du combat
    // </editor-fold>
        System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
        System.out.println("<<<<< Que le combat commence ! >>>>>");
        System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de combat">
    // TODO : La boucle contenant les étapes du combat
    // TODO : Après la boucle, afficher le résultat du combat
    // </editor-fold>
    }

}
