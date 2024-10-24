/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_contar;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class EVA2_13_CONTAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String cadena;
      int acum=0;
    Scanner cap= new Scanner(System.in);
   System.out.println("INGRESA UNA CADENA DE TEXTO");
   cadena= cap.nextLine();
   for(int i=0; i< cadena.length();i++){
       if(cadena.charAt(i)=='a'|| cadena.charAt(i)=='e'|| cadena.charAt(i)=='i' || cadena.charAt(i)=='o'|| cadena.charAt(i)=='u'){
        
          acum++;   
   
           
         
       }
       
   }     System.out.println(acum);
    
    }
    
}
