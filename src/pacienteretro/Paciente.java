/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacienteretro;

/**
 *
 * @author jaimediaz
 */
public class Paciente {

    private int rut;
    private String nombre;
    private String direccion;
    private String isapre;

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIsapre() {
        return isapre;
    }

    public void setIsapre(String isapre) {
        this.isapre = isapre;
    }

    @Override
    public String toString() {
        return "Paciente{" + "rut=" + rut + ", nombre=" + nombre + ", direccion=" + direccion + ", isapre=" + isapre + '}';
    }

}
