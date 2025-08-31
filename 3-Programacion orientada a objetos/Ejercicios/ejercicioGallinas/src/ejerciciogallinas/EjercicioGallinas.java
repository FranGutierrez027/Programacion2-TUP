/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciogallinas;


public class EjercicioGallinas {

  
    public static void main(String[] args) {
        Gallinas g1 = new Gallinas (1,1,0);
        Gallinas g2 = new Gallinas (2,9,10);
        
        g1.ponerHuevos();
        g1.ponerHuevos();
        g1.ponerHuevos();
        g1.ponerHuevos();
        
        g1.envejecer(4);
        g1.envejecer(2);
        
        g1.mostrarEstado();
        
        g2.ponerHuevos();
        g2.ponerHuevos();
        g2.ponerHuevos();
        g2.ponerHuevos();
        g2.ponerHuevos();
        g2.ponerHuevos();
        g2.ponerHuevos();
        g2.ponerHuevos();
        g2.ponerHuevos();
        g2.ponerHuevos();
        g2.ponerHuevos();
        g2.ponerHuevos();
        
        g2.envejecer(10);
        
        g2.mostrarEstado();
        
        g2.envejecer(0);
        
        
        
    }
    
}
