/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.entidades;

/**
 *
 * @author PABLO
 */
public class Mascota {

    private String nombre;
    private String apodo;
    private String tipo;//loro perro gato...etc
    private String color;
    private int edad;
    private boolean cola;
    private String raza;
    private int energia;

    public Mascota() {
        this.energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo) {
        this.energia = 1000;
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        if (tipo.equals("Perro") || tipo.equals("Gato") || tipo.equals("Conejo") || tipo.equals("Loro") || tipo.equals("Carpincho")) {
            this.tipo = tipo;
        } else {
            System.out.println("Tipo No valido");
        }
    }

    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.energia = 1000;
    }

    public void setNombre(String nombre) {
        if (nombre.length() > 0) {
            this.nombre = nombre;
        } else {
            System.out.println("no ingreso un nombre válido");
        }

    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }
    /**
     * 
     * @param energiaRestar
     * @return 
     */
    public int pasear (int energiaRestar){
        energia -= energiaRestar;
        return energia;
    }
    /**
     * aca poner lo que hace
     * @param energiaRestar
     * @param vueltas
     * @return 
     */
    public int pasear (int energiaRestar, int vueltas){
        for (int i = 0; i < vueltas; i++) {
            energia -= energiaRestar;
        }
        return energia;
    }
    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + '}';
    }



}
