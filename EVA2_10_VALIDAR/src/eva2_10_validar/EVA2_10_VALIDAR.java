/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_validar;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class EVA2_10_VALIDAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ds;
        Scanner cap = new Scanner(System.in);
         do{
        System.out.println("introduce el dia de la semana");
         ds= cap.nextInt();
         }
         while(ds<1||ds >7 );
        switch (ds) {
            case 1:
                System.out.println("domingo");
                break;// LO TERMINA
            case 2:
                System.out.println("LUNES");
                break;// LO TERMINA
            case 3:
                System.out.println("MARTES");
                break;// LO TERMINA
            case 4:
                System.out.println("MIERCOLES");
                break;// LO TERMINA
            case 5:
                System.out.println("JUEVES");
                break;// LO TERMINA
            case 6:
                System.out.println("VIERNES");
                break;// LO TERMINA
            case 7:
                System.out.println("SABADO");
                break;// LO TERMINA
            default:// se ejecuta cuando el valor no existe
                  //Ultima instruccion
                   System.out.println("numero no valido solo del 1 al 7");
                       
            }
    }
    
}
