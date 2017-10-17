
/**
 * Created by Houda' on 17/10/2017.
 */

import java.util.*;
import java.io.*;
public class VectorHelper {
    //int Tab [];
    //int taille;
    int [] Sommer (int [] Tab, int taille1,int Tab2 [], int taille2) throws InegaliteException
    {
        int i;
        int Result [];
        if (taille2 != taille1) throw new InegaliteException ();
        Result = new int [taille];
        for (i=0; i< taille; i++)
        {
            Result [i]= Tab[i]+ Tab2[i];
        }
        return Result;
    }

    void trier (int [] tab; int taille)
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
}