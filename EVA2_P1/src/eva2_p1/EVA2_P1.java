/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_p1;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class EVA2_P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cad;
        int num;
        Scanner cap = new Scanner(System.in);
        System.out.println("Ingrese la cadena de texto");
        cad= cap.nextLine();
        System.out.println("Ingrese el numero de veses que desea repetir");
        num= cap.nextInt();
        for(int i=1; i<=num; i++){
           System.out.println(""+cad);
      }
    }
    
}
