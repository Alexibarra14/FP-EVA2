/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_while2;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class EVA2_9_WHILE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String usu="";
        int contra=0; 
    
       System.out.println("Programa principal");
        Scanner cap= new Scanner(System.in);
             while(!usu.equals("Admin") || contra!=1234) {
                  System.out.println("Ingrese su usuario");
        usu= cap.nextLine();
         System.out.println("Ingrese su contra");
         contra=cap.nextInt();
         if(contra!=1234 || !usu.equals("admin")){
             System.out.println("intente de nuevo");
             
         }
             }
  
             System.out.println("bienvenido");
         }
             
      }

