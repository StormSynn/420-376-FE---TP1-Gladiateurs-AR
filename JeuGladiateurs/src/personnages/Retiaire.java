/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

/**
 *
 * @author 202330038
 */
public class Retiaire extends Personnage 
{

    public Retiaire(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
    }

    public Retiaire() {
    }
    boolean filet = true;
    
     @Override
     public void frapperPersonnage(Personnage personnageCible)
    {
        
        int chanceToucherAdversaire;
        if (filet == true) 
        {
            System.out.println(nom + " lance son filet");
            chanceToucherAdversaire = (int)(Math.random() *10);
            if (chanceToucherAdversaire == 6) 
            {
               System.out.println(this.nom +"Son filet attrape " + personnageCible + "l'empale sauvagement avec sa lance");
               personnageCible.pointsDeVie = 0;
            }
            else
            {
                filet = false;
                System.out.println("Igor l'empaleur n'a pas son filet");
                super.frapperPersonnage(personnageCible);
            }
        }
        else
        {
            System.out.println("Igor l'empaleur ramasse son filet et en profite pour attaquer");
            filet = true;
            super.frapperPersonnage(personnageCible);
        }
    }
}
