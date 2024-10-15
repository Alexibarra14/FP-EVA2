/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_while_do_wile;

/**
 *
 * @author brend
 */
public class EVA2_7_WHILE_DO_wile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // FOR--> LA CANTIDAD DE REPETICIONES
       // WHILE--> CERO O MAS REPETICIONES
       // DO WHILE-->  UNA O MAS REPETICIONES
        int val =1;
       while(val<=10){
//MIENTRAS (ESTO SEA VERDAD)  REPITE ESTAS INSTRUCCIONES}
        System.out.print(val + "-");
         val++;
            }
       //DO WHILE
       val=1;
       do{
           System.out.println(val +"-");
           val++;
       }while(val<=10);
       
       }
    }
    

