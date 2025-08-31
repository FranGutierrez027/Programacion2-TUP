/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuras;


public class funcionesJava {

   
    public static void main(String[] args) {
        
        imprimirSimbol('@',5);
        String s = sucesionDeSimbolos('$', 5);
        System.out.println(s);
    }
    static void imprimirSimbol (char simbolo, int veces){
        for (int i = 0; i < veces; i++) {
            System.out.print(simbolo);
        }
        System.out.println();
    }
    
    static String sucesionDeSimbolos (char simbolo, int veces){
        String sucesion = "";
        for (int i = 0; i < veces; i++) {
            sucesion += simbolo;
        }
        return sucesion;
    }
}
