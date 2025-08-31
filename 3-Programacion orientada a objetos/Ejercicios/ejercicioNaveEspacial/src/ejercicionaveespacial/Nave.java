/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicionaveespacial;


public class Nave {
    private String nombre;
    private int combustible;
    private final int maxCombustible = 100;
    
    public Nave (String nombre, int combustible){
        this.nombre=nombre;
        this.combustible=combustible;
        
    }
    
    public void despegar(){
        if (combustible > 0){
            System.out.println("Tenemos combustible comenzar despegue");
        }else{
            System.out.println("No tenemos suficiente combustible recargar");
        }
    }
    
    public void avanzar(int distancia){
        if (distancia <= combustible) {
            combustible -= distancia;
            System.out.println("La nave avanzo "+distancia+" unidades.");
            
        } else {
            System.out.println("No tenemos suficiente combustible para avanzar esa distancia");
        }
        
    
        
    }
    
    public void recargarCombustible(int cantidad){
        if ((cantidad + combustible) <= maxCombustible ) {
            combustible += cantidad;     
        }else{
            System.out.println("Exediste la cantida de combustible");
        }
        
        
    }
    
    public void mostrarEstado(){
        System.out.println("La nave "+nombre+" tiene "+combustible+" para viajar.");
    }
    
    
    
}
