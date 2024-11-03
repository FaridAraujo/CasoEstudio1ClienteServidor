/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermercadomain;

import javax.swing.JOptionPane;
import java.io.*;

/**
 *
 * @author Aulas Heredia
 */
public class SuperMercadoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Llama el menú
        MenuInformacion menuInformacion = new MenuInformacion();
        menuInformacion.menu();

        // Ejemplo de agregar un empleado al archivo
        Empleado empleado1 = new Empleado("Gabriel Oviedo", "123456789", "Cajero", 450.0);
        MenuInformacion.agregarEmpleado(empleado1);

        // Ejemplo de mostrar los empleados almacenados en el archivo
        MenuInformacion.mostrarEmpleados();

    }
}
