/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_for2;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class Eva2_for2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int acum=0;
      for(int i=1;i<=20;i++){
          Scanner cap= new Scanner(System.in);
          int cal;
          System.out.println("estudiante"+ i);
           System.out.println("ingresa tu calificacion");
           cal=cap.nextInt();
           acum=acum+cal;}
            System.out.println("total" + acum);
            System.out.println("el promedio es--" + (acum/20));
            
      
    }
    
}
