/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.de.programacion.orienta.a.objetos;


public class EjerciciosDeProgramacionOrientaAObjetos {

  
    public static void main(String[] args) {
        Estudiante gutierrez = new Estudiante("Francisco","Gutierrez","A",80);
        
        gutierrez.mostrarInfo();
        
        gutierrez.subirCalificacion(10);
        gutierrez.mostrarInfo();
        
        gutierrez.bajarCalificacion(5);
        gutierrez.mostrarInfo();
      
    }
    
}
