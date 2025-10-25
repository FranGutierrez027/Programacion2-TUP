
package javaapplication13;

public class JavaApplication13 {

   
    public static void main(String[] args) {
        // 1) Constructor completo
        Empleado e1 = new Empleado(1001, "Ana Gómez", "Desarrolladora", 85_000);

        // 2) Constructor parcial (id auto + salario por defecto)
        Empleado e2 = new Empleado("Luis Pérez", "Tester");
        Empleado e3 = new Empleado("María Jofré", "Analista QA");

        // Aumentos usando métodos sobrecargados
        e1.actualizarSalario(10);     // +10%
        e2.actualizarSalario(5_000);  // +$5.000

        // Impresiones
        System.out.println(e1.toString());
        System.out.println(e2); // toString() se invoca implícitamente
        System.out.println(e3);

        // Total de empleados (método estático)
        System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados());
        
    }
    
}
