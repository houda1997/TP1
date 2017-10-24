
/**
 * TP IGL APPLICATION 2
 * PAR ABOUCHAMALA HOUDA, DJEDDAL HANANE, GROUPE 1
 */

import java.util.*;
import java.io.*;

/**
 *
 * @author Houda'
 */
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
     *
     * @return
     */
    public int [] getTab () {
        return this.Tab;
    }
    
    /**
     *
     * @param Tab
     */
    public void setTab (int [] Tab) {
        this.Tab=Tab;
    }
    
    /**
     *
     * @return
     */
    public int getTaille () {
        return this.taille;
    }
    
    /**
     *
     * @param taille
     */
    public void setTaille (int taille) {
        this.taille=taille;
    }
    
    /**
     *
     * @return
     */
    public int getMax () {
        return this.max;
    }
    
    /**
     *
     * @return
     */
    public int getMin () {
        return this.min;
    }
    
    
    /**
     * Sommer les éléments de deux tableaux case par case 
     * @param Tab2 : le tableau qu'on va sommmer ses éléments aux éléments de "Tab" 
     * @param taille2 : le nombre d'éléments de "Tab2"
     * @return le tableau tel que chaque case=Tab[i] + Tab2[i] de taille "taille" 
     * @throws InegaliteException si taille != taille2
     * @Exemple d'utilisation : Tab= [1,2,3] + Tab2=[2,4,5] = Sommer= [3,6,8]
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
   * @Exemple d'utilisation : Tab= [100,2,35] --->  trier =[2,35,100]
   */
    public void trier ()
    {
        boolean ord = false;

        while(!ord) {
            ord = true;
            for (int i = 0; i < taille-1 ; i++) {
                if (Tab[i] > Tab[i + 1]) {
                    int a = Tab[i];
                    Tab[i] = Tab[i + 1];
                    Tab[i + 1] = a;
                    ord = false;
                }
            }
        }
    }

    /**
    * Cherche le plus grand et le plus petit éléments d'un tableau
    * @Exemple d'utilisation : Tab= [1,2,3] ----> VectorHelper.max = 3; VectorHelper.min =1
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
   * @Exemple d'utilisation : Tab= [1,2,3] ---> inverser= [3,2,1]
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

   /**
    * Applique une fonction à tout les éléments de "Tab"
    * @param f tableau d'entier dont le 1er élément correspond à une fonction et le 2eme élément est un paramétre de la fonction 
    *f[0] = 1 : a.x
    *f[0] = 2 : x^a
    *f[0] = 3 : x+a
    *f[1] = a
    * @Exemple d'utilisation : Tab= [1,2,3], f(1,3) ----> VectorHelper.Tab =[3,6,9]
    * Tab= [1,2,3], f(2,3) ----> VectorHelper.Tab =[3,8,27]
    * Tab= [1,2,3], f(3,3) ----> VectorHelper.Tab =[4,5,6]
    */       
   public void FnctApplique (int [] f){
        int i;
        int j=1;
        int Val;
        switch(f[0]){
            case 1: // ax
                for (i=0; i<taille; i++) {
                    Tab [i] = Tab [i]*f[1]; 
                }
                break; 
            case 2: //x^a
                for (i=0; i<taille; i++) {
                    j=1;
                    Val = Tab[i];
                    if (f[1] == 0) Tab[i]=1;
                    else if (f[1] != 1) 
                    while(j < f[1]) {
                    Tab [i] = Tab [i]*Val;
                    j++;
                    }
                }
                break;
            case 3: // x+a
                for (i=0; i<taille; i++) {
                    Tab [i] = Tab [i]+f[1]; 
                }
                break; 
                
        }
   }    
}