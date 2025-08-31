/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuras;

/**
 *
 * @author Fran
 */
public class arraysJava {

   
    public static void main(String[] args) {
       
        int[] edades = new int[2];
        
        String[] nombres = {"francisco","jazmin"};
        System.out.println(nombres[1]);
        nombres[1] = "venus";
        System.out.println(nombres[1]);
        for (int i = 0; i < nombres.length; i++) {
            String nombre = nombres[i];
            System.out.println(nombre);
            
        }
        
        
         
    }
    
}
