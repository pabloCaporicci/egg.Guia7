/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author PABLO
 */
public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }// no lo pide la consigna.. contructor vacio... lo genere igual

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    
    public void crearCircunferencia() {
        System.out.println("Ingresa el radio");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        radio = leer.nextDouble();
    }
    public double area(){
        //double superficieCircunferencia = Math.PI * Math.pow(radio, 2);
        return Math.PI * Math.pow(radio, 2);
    }
    
    public double perimetro(){
        //double perimetroCircunferencia = 2 * Math.PI * radio;
        return 2 * Math.PI * radio;
    }
}
