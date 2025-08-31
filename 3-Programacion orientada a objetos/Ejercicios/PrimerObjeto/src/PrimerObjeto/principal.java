/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PrimerObjeto;

import java.util.Scanner;


public class principal {

   
    public static void main(String[] args) {
        CuentaBancaria macro = new CuentaBancaria();
        macro.CBU = "205839423495262";
        macro.alias = "FRANGUTIERREZ95";
        macro.saldo = 957000;
               
        macro.mostrarDatos();
        System.out.println(macro.obtenerSaldo());
        macro.depositar(250000);
        System.out.println(macro.obtenerSaldo());
        
        System.out.println(macro.saldoDisponible(20000000));
        System.out.println(macro.saldoDisponible(20000));
        macro.extraer(250000);
        System.out.println(macro.obtenerSaldo());
    }
    
}
