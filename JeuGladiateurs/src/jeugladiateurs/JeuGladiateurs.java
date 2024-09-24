package jeugladiateurs;

import personnages.Mirmillon;
import personnages.Retiaire;
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
    Mirmillon Bob = new Mirmillon("Bob le malchant", 15, 15, 70, 15);
    Retiaire Igor = new Retiaire("Igor l'empaleur", 25, 5, 100, 30);
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Affichage pré-combat">
    // TODO : Afficher les infos de chaque personnage
    
    // TODO : Afficher le message du début du combat
    affichage.afficherDebutCombat();
   Bob.afficherInfosPersonnage();
   Igor.afficherInfosPersonnage();
    // </editor-fold>
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de combat">
    // TODO : La boucle contenant les étapes du combat
      do
        {            
          tour.afficheTour();
          for (int i = 0; i < 101; i++) 
           {
                if (Bob.getInitiative() == i)
                {
                    Bob.frapperPersonnage(Igor);
                    System.out.println();
                }
                if (Igor.getInitiative()== i) 
                {
                    Igor.frapperPersonnage(Bob);
                }
           }
           affichage.afficherSeparateurInfosPerso();       
           Bob.afficherInfosPersonnage();
           Igor.afficherInfosPersonnage();
           Bob.setNewInitiativeRandom();
           Igor.setNewInitiativeRandom();
           tour.augmenteTour();
           affichage.afficherSeparateurDeTour();
        }while (Bob.getPointsDeVie() != 0 && Igor.getPointsDeVie() != 0);
       affichage.afficheVictoire(Bob, Igor);
    // TODO : Après la boucle, afficher le résultat du combat
    // </editor-fold>
    }

}
