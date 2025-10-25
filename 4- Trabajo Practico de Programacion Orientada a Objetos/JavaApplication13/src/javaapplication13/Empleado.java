/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication13;

/**
 *
 * @author Fran
 */
public class Empleado {
    // -------------------- Constantes --------------------
    private static final double SALARIO_POR_DEFECTO = 50_000.0;

    // -------------------- Atributos (encapsulados) --------------------
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Variable de clase: contador global de empleados
    private static int totalEmpleados = 0;

    // -------------------- Constructores (sobrecarga) --------------------

    /** Constructor completo. Usa this para diferenciar parámetros de atributos. */
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++; // se incrementa en todos los constructores
    }

    /** Constructor parcial: id automático y salario por defecto. */
    public Empleado(String nombre, String puesto) {
        totalEmpleados++;       // primero incremento, así puedo usarlo para ID automático
        this.id = totalEmpleados; // id simple y determinista: correlativo
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = SALARIO_POR_DEFECTO;
    }

    // -------------------- Métodos sobrecargados --------------------

    /** Aumenta el salario por porcentaje (ej.: 10 => +10%). */
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100.0);
    }

    /** Aumenta el salario por un monto fijo. */
    public void actualizarSalario(int montoFijo) {
        this.salario += montoFijo;
    }

    // -------------------- Getters / Setters (encapsulamiento) --------------------
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getPuesto() { return puesto; }
    public double getSalario() { return salario; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    public void setSalario(double salario) { this.salario = salario; }

    // -------------------- Métodos estáticos --------------------
    /** Devuelve el total de empleados creados hasta el momento. */
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // -------------------- Representación legible --------------------
    @Override
    public String toString() {
        return "Empleado ID: " + id +
               ", Nombre: " + nombre +
               ", Puesto: " + puesto +
               ", Salario: $" + String.format("%.2f", salario);
    }
    
}
