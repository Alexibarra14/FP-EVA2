/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_ciclos_arreglos;

/**
 *
 * @author brend
 */
public class EVA2_16_CICLOS_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] datos, x, y, z;// Todos son arreglos
       int val1, val2,arreglo[],val3;// solo arreglo es arreglo
       arreglo= new int[10];
       for(int i=0; i<10; i++){
           arreglo[i]= (int)(Math.random());
       }
       for(int i=0;i<10;i++){
           System.out.println(arreglo[i]);
       }
    }
    
}
