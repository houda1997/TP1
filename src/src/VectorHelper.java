
/**
 * Created by Houda' on 17/10/2017.
 */
public class VectorHelper {
    int Tab [];
    int taille;
    int [] Sommer (int Tab2 [], int taille) throws InegaliteException 
    {
        int i;
        int Result [];
        if (taille != this.taille) throw new InegaliteException (); 
        Result = new int [taille];
        for (i=0; i< taille; i++)
        {
            Result [i]= Tab[i]+ Tab2[i];
        }
        return Result; 
    }


}
