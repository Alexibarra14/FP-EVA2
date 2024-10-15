/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_p2;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class EVA2_P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1;
        int n2;
        Scanner cap= new Scanner(System.in);
        System.out.println("INGRESE EL NUMERO");
        n1= cap.nextInt();
        int n3=n1;
          System.out.println("INGRESE EL SEGUNDO NUMERO");
          n2= cap.nextInt();
        int n4= n2;
       
        for(int i=n1; i<=n2; i++){ 
           System.out.println(i);
      
        }  
        for(int i=n4;i>=n3;i--){
        System.out.println(i);
        
            }
          }
    
}
