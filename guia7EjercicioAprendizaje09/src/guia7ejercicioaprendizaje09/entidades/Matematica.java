/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicioaprendizaje09.entidades;

/**
 *
 * @author PABLO
 */
public class Matematica {
    private double numero1;
    private double numero2;

    public Matematica() {
    }

    public Matematica(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public void devolverMayor(){
        
        if (numero1>=numero2){
            System.out.println("el mayor de los dos es: "+numero1);
        }else{
            System.out.println("el mayor de los dos es: "+numero2);
        }
    }
    public void calcularPotencia(){
        if (numero1>=numero2){
            System.out.println((int)numero1+" elevado a la "+(int)numero2+" potencia es "+(int) Math.pow((int)numero1,(int)numero1));
        }else{
            System.out.println((int)numero2+" elevado a la "+(int)numero1+" potencia es "+(int) Math.pow((int)numero2,(int)numero1));
        }
    }
    public void calcularRaiz(){
        //Math.pow(miNumero, (double) 1 / 3)
        if (numero1>=numero2){
            System.out.println(" la raiz cuadrada de "+Math.abs(numero1)+" es: "+ Math.sqrt(numero1));
            System.out.println(" otra forma usando Math.pow... da: "+ Math.pow((int)numero1,(double) 1/2));
        }else{
            System.out.println(" la raiz cuadrada de "+Math.abs(numero2)+" es: "+ Math.sqrt(numero2));
            System.out.println(" otra forma usando Math.pow... da: "+ Math.pow((int)numero2,(double) 1/2));
        }
    }
    
    
}
