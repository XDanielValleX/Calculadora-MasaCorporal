
package CalculadoraMasaCorporal;

import CalculadoraMasaCorporal.Entidades.Imc;
import CalculadoraMasaCorporal.Entidades.Usuario;
import CalculadoraMasaCorporal.Crud.UsuarioCrud;
import CalculadoraMasaCorporal.Crud.ImcCrud;
import CalculadoraMasaCorporal.Crud.Menu;
public class Principal {
    public static void main(String[] args) {
        UsuarioCrud crudUsuario = new UsuarioCrud();
        ImcCrud crudImc = new ImcCrud();
        Menu menu = new Menu();  // Crear el objeto menú
        menu.mostrarMenu();      // Mostrar el menú interactivo
        menu.cerrar();  

    }
}
