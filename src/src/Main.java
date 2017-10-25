/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int j=0;
        Scanner scanf = new Scanner (System.in);
        int taille, taille2;
        int [] T;
         int [] T2;
        
        System.out.print("Donner la taille du tableau : ");
        taille= scanf.nextInt();
       while (taille <= 0) {
           System.out.print("La taille doit etre > 0  : ");
           taille= scanf.nextInt();
       }
       T = new int [taille];
      
       
        
        for (j=0; j<taille; j++) {
            System.out.print("T [ "+j+" ] = ");
            T[j]= scanf.nextInt();
        }
          VectorHelper a = new VectorHelper (T,taille);
          
          
        System.out.print("Sommer  : \n\n");
        System.out.print("Donner la taille du tableau : ");
        taille2= scanf.nextInt();
       while (taille2 <= 0) {
           System.out.print("La taille doit etre > 0 \n");
           taille2= scanf.nextInt();
       }
       T2 = new int [taille2];
       for (j=0; j<taille2; j++) {
            System.out.print("T2 [ "+j+" ] = ");
            T2[j]= scanf.nextInt();
        }
       int [] result;
        try {result= a.Sommer(T2,taille2);
        for (j=0; j<taille; j++) {
            System.out.print("result [ "+j+" ] = " + result [j] + "\n");
        }
        }
        catch (InegaliteException e) { System.out.printf("Erreur\n"); }
        
        
        
        // Trier 
        System.out.print("\n\n TRIER \n");
        a.trier();
        result = a.getTab();
        for (j=0; j<taille; j++) {
            System.out.print("result [ "+j+" ] = " + result [j] + "\n");
        }
        
        
         // MaxMin
        System.out.print("\n\n Max Min \n");
        a.maxmin();
        System.out.print("Max :"+ a.getMax() +" \n Min : "+ a.getMin() +"\n"); 
        
        //Inverser 
        System.out.print("\n\n Inverser \n");
        result = a.inverser();
        for (j=0; j<taille; j++) {
            System.out.print("result [ "+j+" ] = " + result [j] + "\n");
        }
        
        System.out.print("\n\n FONCTION ax \n");
        int [] f = {1,3};
        a.FnctApplique(f);
        result = a.getTab();
        for (j=0; j<taille; j++) {
            System.out.print("result [ "+j+" ] = " + result [j] + "\n");
        }
    }
    
}
