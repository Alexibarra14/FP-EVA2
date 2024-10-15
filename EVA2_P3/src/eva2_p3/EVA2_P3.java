/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_p3;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class EVA2_P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cade;
        Scanner cap = new Scanner(System.in);
        System.out.println("Ingrese la cadena de texto");
        cade=cap.nextLine();
        for(int i=0;i<cade.length();i++) {
             System.out.println(cade.charAt(i));
              }
        }
    }
    

