/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author demia
 */
public class Circunferencia {
    Scanner leer = new Scanner(System.in);
    
    private double radio;

    public Circunferencia() {
    }
    
    

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        System.out.println("Ingrese el Radio");
        this.radio = leer.nextDouble();
        
    }
    public double area() {
        double area = Math.PI*Math.pow(radio, 2);
        return area;
        
    }
    
    public double perimetro(){
        double perimetro = Math.PI*2*radio;
        return perimetro;    }
    
}
