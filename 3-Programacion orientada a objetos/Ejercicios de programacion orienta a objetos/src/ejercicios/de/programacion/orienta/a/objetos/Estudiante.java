/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.de.programacion.orienta.a.objetos;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    public Estudiante(String nombre, String apellido, String curso, double calificacion){
        this.nombre=nombre;
        this.apellido=apellido;
        this.curso=curso;
        this.calificacion=calificacion;
    }
    
    public void mostrarInfo(){
        System.out.println("El nombre del estudiante es "+nombre+" "+apellido+" y su calificacion es: "+calificacion);
    }
    public void subirCalificacion(double puntos){
        if (puntos > 0){
            calificacion += puntos;
        }
    }
    public void bajarCalificacion(double puntos){
        if (puntos > 0){
            calificacion -= puntos;
        }
    }
}
