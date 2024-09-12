/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculadoraMasaCorporal.Crud;

import CalculadoraMasaCorporal.Crud.ImcCrud;
import CalculadoraMasaCorporal.Crud.UsuarioCrud;
import CalculadoraMasaCorporal.Entidades.Usuario;

import java.util.Scanner;
public class Menu {
    private UsuarioCrud usuarioCrud;
    private ImcCrud imcCrud;
    private Scanner scanner;

    public Menu() {
        this.usuarioCrud = new UsuarioCrud();
        this.imcCrud = new ImcCrud();
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        Usuario usuario = null;
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar o Calcular un nuevo IMC");
            System.out.println("2. Ver lista de IMC calculados");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    if (usuario == null) {
                        usuario = usuarioCrud.crearUsuario();
                    }
                    imcCrud.crearImc(usuario);
                    break;

                case 2:
                    if (usuario == null) {
                        System.out.println("Primero debe agregar un usuario y calcular un IMC.");
                    } else {
                        imcCrud.listarHistorialImc(usuario);
                    }
                    break;

                case 3:
                    salir = true;
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }
    }

    public void cerrar() {
        scanner.close();
        usuarioCrud.cerrarScanner();
        imcCrud.cerrarScanner();
    }

}
