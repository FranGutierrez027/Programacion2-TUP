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
public class EstructuraCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2;
        char simbolo;
        
        System.out.print("Ingresa el numero 1: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingresa el numero 2: ");
        num2 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingresa un simbolo: ");
        simbolo = input.nextLine().charAt(0);
        
        switch (simbolo) {
            case '+': 
                System.out.println("Resultado: " + (num1 +  num2));
            case '*': 
                System.out.println("Resultado: " + (num1 *  num2));
            case '-': 
                System.out.println("Resultado: " + (num1 -  num2));
            case '/': 
                System.out.println("Resultado: " + (num1 /  num2));
                
                break;
            default:
                System.out.println("Operacion invalida.");
        }
    }
    
}
