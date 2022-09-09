/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author PABLO
 */
public class Persona {
    private String nombre;
    private int edad;
    private String genero;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String genero, float peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingresa nombre");
        nombre = leer.nextLine();
        System.out.println("ingresa edad");
        edad = leer.nextInt();
        
        do {
            System.out.println("ingresa H si sos hombre, M si sos mujer, y O si sos no binarie");
            
            genero = leer.next();
        
            if (!"H".equalsIgnoreCase(genero) && !"M".equalsIgnoreCase(genero) && !"O".equalsIgnoreCase(genero)) {
                System.out.println("No conocemos ese genero");
            }
        } while (!"H".equalsIgnoreCase(genero) && !"M".equalsIgnoreCase(genero) && !"O".equalsIgnoreCase(genero));
        System.out.println("ingresa Peso en kg");
        peso = leer.nextFloat();
        System.out.println("ingresa Altura metros");
        altura = leer.nextFloat();
    }
    public int calcularIMC() {
        double IMC = peso / Math.pow(altura, 2);
        int respuesta = 0;
        if (IMC < 20 && IMC > 0) {
            //System.out.println("La persona esta por debajo de su peso ideal");
            respuesta = -1;
        } else if (IMC >= 20 && IMC <= 25) {
           // System.out.println("la persona esta en su peso ideal :D");
            respuesta = 0;
        } else if (IMC > 25) {
            //System.out.println("estas rellenito");
            respuesta = 1;
        }
        return respuesta;
    }
    public boolean mayorEdad(){
        return edad>=18;        
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    
}
