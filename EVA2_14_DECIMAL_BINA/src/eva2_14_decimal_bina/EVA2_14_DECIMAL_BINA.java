/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_decimal_bina;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class EVA2_14_DECIMAL_BINA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int dec, residuo;
      int bin;
      Scanner cap= new Scanner(System.in);
      System.out.println("Ingresa un numero que quieras convertir a binario");
      dec= cap.nextInt();
      cap.nextLine();
      if(dec==0){
          System.out.println("El numero binario es 0");
       

      }else{while(dec>0){
           dec/=2;
          bin= dec%2;
           
        System.out.print(bin);
      }
          
     

      }
           
           
      }
          
      
    }
    

