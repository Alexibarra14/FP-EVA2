/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_break_continue2;

/**
 *
 * @author brend
 */
public class EVA2_6_BREAK_CONTINUE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         for(int i = 1; i<=10;i++){
             if((i%2)==0)
                 continue;
             System.out.println(i+"-");
         }
    }
    
}
