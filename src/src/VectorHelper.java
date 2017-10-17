
/**
 * Created by Houda' on 17/10/2017.
 */

import java.util.*;
import java.io.*;
public class VectorHelper {
    private  int Tab [];
    private  int taille;
    
    public VectorHelper(int [] Tab, int taille){
    this.Tab = Tab;
    this.taille = taille;
    }
    int [] Sommer (int Tab2 [], int taille2) throws InegaliteException
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

    void trier (int [] tab, int taille)
    {
        boolean ord = false;

        while(!ord)
        {
            ord = true;
            for(int i=0 ; i <taille ; i++)
            {
                if(tab[i] > tab[i+1])
                {
                    int a=tab[i];
                    tab[i]=tab[i+1];
                    tab[i+1]=a;

                    ord = false;
                }
            }
            taille--;
        }
    }

    int max (int [] tab, int taille)
    {
        int i,m ;
        m=tab[0];
        for (i=0;i<taille;i++)
        {
            if (tab[i]>m)  { m=tab[i];}
        }
        return m;
    }

    int min (int [] tab, int taille )
    {
        int i,m ;
        m=tab[0];
        for (i=0;i<taille;i++)
        {
            if (tab[i]<m)  { m=tab[i];}
        }
        return m;
    }


    int [] inverser (int []tab, int taille )
    {
        int j=taille-1;
        int [] tab2= new int [taille];

        for (int i=0;i<taille;i++) {
            tab2[j] = tab[i];
            j--;
        }
        return tab2;

    }
   
   public void FnctApplique (int [] f, int [] Tab){
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