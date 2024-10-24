/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_restaurante;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class EVA2_18_RESTAURANTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String menu[] ={"DOGOS", "HAMBURGUESA","BONLESS","TACOS","MONTADOS","CAMARONES"};
        int precios[] ={50,80,120,15,70,200};
        int cant, produ;
       Scanner cap= new Scanner(System.in);
        for( int i =0;i<menu.length;i++){
            System.out.println(i+ "-"+ menu[i]+"$" + precios[i]);
        }
      System.out.println("¿CUAL ES TU ORDEN?    (INTROCUCE EL NUMERO DE ORDEN)");
      produ= cap.nextInt();
      System.out.println("¿CUANTAS ORDENES?");
      cant=cap.nextInt();
      System.out.println("EL PRECIO ES DE"+"$"+cant*precios[produ]);
    }
    
}
