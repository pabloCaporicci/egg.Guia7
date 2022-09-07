package entidades;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PABLO
 */
public class Operacion {
    private double numero1;
    private double numero2;

    public Operacion() {
    }

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }
    
    public void crearOperacion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese primer número:... ");
        this.numero1 = leer.nextDouble();
        System.out.println("ingrese segundo número:... ");
        this.numero2 = leer.nextDouble();
    }
    
    public double sumar(){
       double  sumados = numero1 + numero2;
       return sumados;    
    }
    public double restar(){
       double  restados = numero1 - numero2;
       return restados;
    }
    public double multiplicar(){
       double multiplicados = numero1 * numero2;
       return multiplicados;
    }
    public double dividir(){
       double divididos;
       if (numero1==0 || numero2 == 0) {
             divididos = 0;    
        }else {
          divididos = numero1 / numero2;
        }
       return divididos;
    }
    
}
