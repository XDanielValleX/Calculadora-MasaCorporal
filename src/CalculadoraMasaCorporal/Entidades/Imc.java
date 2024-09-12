/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculadoraMasaCorporal.Entidades;

import java.time.LocalDate;

/**
 *
 * @author USER
 */
public class Imc {
    private double peso;
    private double altura;
    private LocalDate fecha; // Cambiar de String a LocalDate
    private Usuario usuario;

    public Imc(double peso, double altura, LocalDate fecha, Usuario usuario) { // Cambiar tipo de fecha
        this.peso = peso;
        this.altura = altura;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    // Método para calcular el IMC
    public double calcularImc() {
        return peso / (altura * altura);
    }

    // Getters y setters
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public LocalDate getFecha() { // Modificar para retornar LocalDate
        return fecha;
    }

    public void setFecha(LocalDate fecha) { // Modificar para aceptar LocalDate
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
