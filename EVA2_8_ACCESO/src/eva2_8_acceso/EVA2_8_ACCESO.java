/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_acceso;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class EVA2_8_ACCESO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PANTALLA DE VALIDACION: USUSARIO Y CONTRASEÑA
        //PROGRAMA PRINCIPAL
        String usu;
        String contra;
          System.out.println("Programa principal");
        Scanner cap= new Scanner(System.in);
        do{
        System.out.println("Ingrese su usuario");
        usu= cap.nextLine();
         System.out.println("Ingrese su contra");
         contra=cap.nextLine();
          }while(!usu.equals("Admin") || !contra.equals("1234"));
       
    }
    
}
