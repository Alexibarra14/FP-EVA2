/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_menu;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class EVA2_19_MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String menu[];
        int precios[];
        Scanner cap= new Scanner(System.in);
        int cant;
       System.out.println("CAuantos productos va a tener el menu:");
       cant = cap.nextInt();
       cap.nextLine();
       menu= new String[cant];
       precios= new int[cant];
       for(int i=0;i<menu.length;i++){
           System.out.println("nombre del producto");
           menu[i]= cap.nextLine();
           System.out.println("precio:");
           precios[i]=cap.nextInt();
           cap.nextLine();
           
       }for(int i=0; i<menu.length;i++){
              System.out.println(i+ "-"+ menu[i]+"$" + precios[i]);
           
       }
        
    }
    
}
