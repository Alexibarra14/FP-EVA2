/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_potencia;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class EVA2_3_POTENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int b1;
      int e2;
      Scanner cap = new Scanner(System.in);
      System.out.println("INTRODUCE LA BASE");
      b1= cap.nextInt();
      System.out.println("INTRODUCE El EXPONENTE");
      e2= cap.nextInt();
      int acum = 1;
         for(int i=1; i <= e2; i++) {
            acum= acum* b1;
          }
          System.out.println("pitencia es = "+ acum);













    }
    
}
