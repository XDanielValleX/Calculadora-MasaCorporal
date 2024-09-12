package CalculadoraMasaCorporal.Crud;

import CalculadoraMasaCorporal.Entidades.Imc;
import CalculadoraMasaCorporal.Entidades.Imc;
import CalculadoraMasaCorporal.Entidades.Usuario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ImcCrud {
    private Scanner scanner;

    public ImcCrud() {
        this.scanner = new Scanner(System.in);
    }

    public Imc crearImc(Usuario usuario) {
        String[] datosImc = new String[3];

        System.out.println("Ingrese el peso (en kg):");
        datosImc[0] = scanner.nextLine();

        System.out.println("Ingrese la altura (en metros):");
        datosImc[1] = scanner.nextLine();

        System.out.println("Ingrese la fecha (YYYY-MM-DD):");
        datosImc[2] = scanner.nextLine();

        // Convertir los datos de peso y altura a números
        double peso = Double.parseDouble(datosImc[0]);
        double altura = Double.parseDouble(datosImc[1]);

        // Convertir la fecha a LocalDate
        LocalDate fecha = LocalDate.parse(datosImc[2], DateTimeFormatter.ISO_LOCAL_DATE);

        // Crear el objeto Imc
        Imc imc = new Imc(peso, altura, fecha, usuario);

        // Agregar el IMC al historial del usuario
        usuario.agregarImc(imc);

        System.out.println("IMC registrado con éxito.");
        return imc;
    }

    public void listarHistorialImc(Usuario usuario) {
        System.out.println("Historial de IMC del usuario:");
        if (usuario.getHistorialImc().isEmpty()) {
            System.out.println("No hay IMC registrados.");
        } else {
            for (Imc registroImc : usuario.getHistorialImc()) {
                System.out.println("[" + registroImc.getFecha() + ", " + registroImc.getPeso() + ", " 
                                   + registroImc.getAltura() + ", IMC: " + registroImc.calcularImc() + "]");
            }
        }
    }

    public void cerrarScanner() {
        scanner.close();
    }
}