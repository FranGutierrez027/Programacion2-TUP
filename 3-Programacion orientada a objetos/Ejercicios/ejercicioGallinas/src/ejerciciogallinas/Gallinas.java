/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciogallinas;


public class Gallinas {
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    public Gallinas (int idGallina,int edad,int huevosPuestos){
            this.idGallina=idGallina;
            this.edad=edad;
            this.huevosPuestos=huevosPuestos;
            }
    
    public void ponerHuevos(){
        huevosPuestos++;
    }
    public void envejecer(int anio){
        if (anio>0) {
            edad+= anio;
            
        }else{
            System.out.println("DATO INVALIDO");
        }
        
       
    }
    public void mostrarEstado(){
        System.out.println("La gallina "+idGallina+" tiene "+edad+" anios y puso hasta ahora "+huevosPuestos+" huevos.");
    }
           
    
    
}
