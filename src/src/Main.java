/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author TOSHIBA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("hi\n");
        int [] T = {1,2,3,4};
        int [] T2 = {1,2,3};
        VectorHelper a = new VectorHelper (T,4);
        try {T= a.Sommer(T2,3);}
        catch (InegaliteException e) { System.out.printf("Erreur\n"); }
        for (int i=0; i<4; i++) System.out.print(T[i] +" \n");
    }
    
}
