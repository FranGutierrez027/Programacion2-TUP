/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosTrabajoPractico;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class ejerciosEstructurasCondicionales {

   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int nota;
        
        do {            
            System.out.print("Ingrese una nota :");
            nota = Integer.parseInt(input.nextLine());
            if (nota < 0 || nota > 10) {
                System.out.println("ERROR. Porfavor ingrese una nota valida: ");
               
            } else{System.out.print("Nota guardada correctamente");}
        } while (nota < 0 || nota > 10);
        
       
    }
}
