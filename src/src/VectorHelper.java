
/**
 * TP IGL APPLICATION 2
 * PAR ABOUCHAMALA HOUDA, DJEDDAL HANANE, GROUPE 1
 */

import java.util.*;
import java.io.*;


public class VectorHelper {

    private int Tab [];
    private int taille;
    private int max,min;

    /**
     * Constructeur de la classe VectorHelper
     * @param Tab : un tableau d'entier pour initialiser l'attribut TAB
     * @param taille : le nombre d'éléments de "Tab"
     */
    public VectorHelper(int [] Tab, int taille){
    this.Tab = Tab;
    this.taille = taille;
    }
    
    /**
     * Sommer les éléments de deux tableaux case par case 
     * @param Tab2 : le tableau qu'on va sommmer ses éléments aux éléments de "Tab" 
     * @param taille2 : le nombre d'éléments de "Tab2"
     * @return le tableau tel que chaque case=Tab[i] + Tab2[i] de taille "taille" 
     * @throws InegaliteException si taille != taille2
     */
    public int [] Sommer (int Tab2 [], int taille2) throws InegaliteException

    {
        int i;

        int Result [];
        if (taille2 != taille) throw new InegaliteException ();
        Result = new int [taille];
        for (i=0; i< taille; i++)
        {
            Result [i]= Tab[i]+ Tab2[i];
        }
        return Result;
    }


   /**
   * Trier un tableau avec la méthode "Tri Bulles"
   */
    public void trier ()
    {
        boolean ord = false;

        while(!ord) {
            ord = true;
            for (int i = 0; i < taille; i++) {
                if (Tab[i] > Tab[i + 1]) {
                    int a = Tab[i];
                    Tab[i] = Tab[i + 1];
                    Tab[i + 1] = a;
                    ord = false;
                }
            }
            taille--;
        }
    }

    /**
    * Cherche le plus grand et le plus petit éléments d'un tableau
    */
   public void maxmin ()
    {
        int i,max,min;
        max=Tab[0];
        min=Tab[0];
        for (i=0;i<taille;i++)
        {
            if (Tab[i]>max)  { max=Tab[i];}
             if (Tab[i]<min)  { min=Tab[i];}
        }
        this.max=max;
        this.min=min;
    }

   /**
   * Inverser un tableau 
   * @return l'invesre du tableau "Tab"
   */
    public int [] inverser ()
    {
        int j=taille-1;
        int [] tab2= new int [taille];

        for (int i=0;i<taille;i++) {
            tab2[j] = Tab[i];
            j--;
        }
        return tab2;

    }
  
   public void FnctApplique (int [] choix){
        int i;
        class Fonction {
             public int funct (int x, int p) { return x;}
        }
        Fonction f;
        switch (choix[0]) {
                case 1: // ax
                    f= new Fonction(){
                        public int funct (int x, int p) {return p*x;}
                    };
                    for (i=0; i<taille; i++)
                        Tab[i]=f.funct(Tab[i], choix[1]);
                    break;
         }
       
   }    
}