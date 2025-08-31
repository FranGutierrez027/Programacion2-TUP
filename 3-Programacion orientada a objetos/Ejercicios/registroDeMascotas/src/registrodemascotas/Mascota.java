/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrodemascotas;


public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    
    public Mascota (String nombre,String especie,int edad){
        this.nombre=nombre;
        this.especie=especie;
        this.edad=edad;    
    }
    
    public void mostrarInfo(){
        System.out.println("Tu mascota se llama "+nombre+" es de la especie "+especie+" y su edad es "+edad);
    }
    
    public void cumplirAnios(){
        edad ++ ;
        
    }
    
    
}
