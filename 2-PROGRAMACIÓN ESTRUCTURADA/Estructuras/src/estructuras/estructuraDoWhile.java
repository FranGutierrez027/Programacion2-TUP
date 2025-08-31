/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuras;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class estructuraDoWhile {

    static final int CORTE = 0;
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num,cont = 0;
        
        do {
            System.out.print("Ingrese un numero(" +CORTE + "PARA CORTAR): ");
            num = Integer.parseInt(input.nextLine());
            cont ++;
              
        } while ( num != CORTE);
    }
    
}
