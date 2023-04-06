/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2guia7;

import Entidad.Circunferencia;

/**
 *
 * @author demia
 */
public class Ej2Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia op1 = new Circunferencia();
        
        op1.crearCircunferencia();
        System.out.println("El area es: "+op1.area());
        System.out.println("El perimetro es: "+op1.perimetro());
        System.out.println("Bien, hiciste el ejercicio");
    }
    
}
