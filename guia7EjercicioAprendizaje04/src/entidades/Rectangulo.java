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
public class Rectangulo {
    private int altura;
    private int base;

    
    
    public Rectangulo() {
    }

    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
    public void datos() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la altura del rectangulo");
        altura = leer.nextInt();
        System.out.println("Ingrese la base del rectangulo");
        base = leer.nextInt();

    }

    public int superficie() {
        return base * altura;
    }

    public int perimetro() {
        return (base + altura) * 2;
    }

    public void forma() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || j == 0 || j == base-1 || i == altura-1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }

    }


}
