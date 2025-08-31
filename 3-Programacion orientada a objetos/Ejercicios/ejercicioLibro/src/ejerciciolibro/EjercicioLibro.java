/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciolibro;


public class EjercicioLibro {

    
    public static void main(String[] args) {
        Libro libro1 = new Libro ("Sherlock","Arthur Connan Doyle",1820);
        
        System.out.println("Inicial -> Titulo: " + libro1.getTitulo() +
                           ", Autor: " + libro1.getAutor() +
                           ", Anioo: " + libro1.getAnioPublicacion());
        
        libro1.setAnioPublicacion(1995);
        System.out.println("Inicial -> Titulo: " + libro1.getTitulo() +
                           ", Autor: " + libro1.getAutor() +
                           ", Anioo: " + libro1.getAnioPublicacion());
        
        libro1.setAnioPublicacion(950);
        
       
    }
    
}
