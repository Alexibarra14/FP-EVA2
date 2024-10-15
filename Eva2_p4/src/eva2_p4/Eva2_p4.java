/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_p4;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class Eva2_p4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String cade;
       
        Scanner cap= new Scanner(System.in);
        System.out.println("Ingresa la cadena de texto");
       cade= cap.nextLine();
       for(int i=0; i<cade.length();i++){
          System.out.println(cade.charAt(i));
          char caracter = cade.charAt(i);
          if(caracter == 'a' || caracter == 'e' || caracter== 'i' || caracter == 'o' || caracter == 'u'){
              
              System.out.println(cade);
                  }
                
        
                       
            }
       }
    
     }


