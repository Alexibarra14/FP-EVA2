/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_mayor;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class EVA2_12_MAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int n;
        int mayor = -9999;
        Scanner cap= new Scanner(System.in);
        do{
            System.out.println("Ingresa un numero positivo");
            n=cap.nextInt();

            if(n>mayor){
                mayor= n;
            }
        }while(n!=-1);
             System.out.println(mayor);
        
       
     
    }
    
}
