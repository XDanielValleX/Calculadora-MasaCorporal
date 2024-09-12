/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculadoraMasaCorporal.Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private String cedula;
    private String email;
    private String genero;
    private List<Imc> historialImc;

    public Usuario(String nombre, String apellido, String cedula, String email, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.email = email;
        this.genero = genero;
        this.historialImc = new ArrayList<>();
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void agregarImc(Imc imc) {
        this.historialImc.add(imc);
    }

    public List<Imc> getHistorialImc() {
        return historialImc;
    }
}