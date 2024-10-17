/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_p5;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class EVA2_P5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        String cad="";
        Scanner cap= new Scanner(System.in);
        System.out.println("Ingresa el numero");
        num= cap.nextInt();
        for(int i=1;i<=num;i++){
            cad=cad+"*";
            System.out.println(cad); 
        }

        }
    }
    

