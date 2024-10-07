/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_factorial;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class EVA2_4_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nu;
        Scanner cap = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        nu=cap.nextInt();
        int acum = 1;
        for( int i=nu; i>=1; i--){
            acum= acum*i;
        }
         System.out.println("el factorial es = "+ acum);
    }
  
}
