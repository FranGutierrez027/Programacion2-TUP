/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuras;

/**
 *
 * @author Fran
 */
public class recursividad {

    
    public static void main(String[] args) {
        System.out.println(factorial(5));
        
    }
    static int factorial(int x){
        int f = 1;
        for (int i = 0; i <= x; i++) {
            f*=i;
        }
        return f;
    }
    
    static int factorialRecur(int x){
        if (x==0){
            return 1;
        } else{
            return x * factorialRecur( x - 1)
        }
        
    }
}
