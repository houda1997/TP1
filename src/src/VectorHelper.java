
/**
 * Created by Houda' on 17/10/2017.
 */

import java.util.*;
import java.io.*;


public class VectorHelper {

    private int Tab [];
    private int taille;
    private int max,min;

    public VectorHelper(int [] Tab, int taille){
    this.Tab = Tab;
    this.taille = taille;
    }
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
   
   public void FnctApplique (int [] f){
        int i;
        int j=1;
        switch(f[0]){
            case 1: // ax
                for (i=0; i<taille; i++) {
                    Tab [i] = Tab [i]*f[1]; 
                }
                break; 
            case 2: //x^a
                for (i=0; i<taille; i++) {
                    if (f[1] == 0) Tab[i]=1;
                    else if (f[1] > 1) 
                    while(j <= f[1]) {
                    Tab [i] = Tab [i]*Tab[i];
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