/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculadoraMasaCorporal.Crud;

import CalculadoraMasaCorporal.Entidades.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsuarioCrud {
    private List<Usuario> usuarios;
    private Scanner scanner;

    public UsuarioCrud() {
        this.usuarios = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public Usuario crearUsuario() {
        String[] datosUsuario = new String[5];

        System.out.println("Ingrese el nombre del usuario:");
        datosUsuario[0] = scanner.nextLine();

        System.out.println("Ingrese el apellido del usuario:");
        datosUsuario[1] = scanner.nextLine();

        System.out.println("Ingrese la cédula del usuario:");
        datosUsuario[2] = scanner.nextLine();

        System.out.println("Ingrese el email del usuario:");
        datosUsuario[3] = scanner.nextLine();

        System.out.println("Ingrese el género del usuario:");
        datosUsuario[4] = scanner.nextLine();

        // Crear el usuario usando los datos del array
        Usuario usuario = new Usuario(datosUsuario[0], datosUsuario[1], datosUsuario[2], datosUsuario[3], datosUsuario[4]);
        usuarios.add(usuario);
        return usuario;
    }

    public void listarUsuarios() {
        System.out.println("Lista de usuarios:");
        for (Usuario usuario : usuarios) {
            System.out.println("[" + usuario.getNombre() + ", " + usuario.getApellido() + ", " +
                               usuario.getCedula() + ", " + usuario.getEmail() + ", " + usuario.getGenero() + "]");
        }
    }

    public void cerrarScanner() {
        scanner.close();
    }
}