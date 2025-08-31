/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicionaveespacial;

/**
 *
 * @author Fran
 */
public class EjercicioNaveEspacial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nave nave1 = new Nave ("Argentum",50);
        
        nave1.mostrarEstado();
        
        nave1.avanzar(60);
        
        nave1.recargarCombustible(45);
        nave1.mostrarEstado();
        
        nave1.avanzar(90);
        nave1.mostrarEstado();
        
        nave1.despegar();
        
        nave1.avanzar(50);
        nave1.recargarCombustible(150);
    }
    
}
