/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercadomain;

import javax.swing.JOptionPane;
import java.io.*;

/**
 *
 * @author Farid
 */
public class MenuInformacion {

    private static final String ARCHIVO_EMPLEADOS = "empleados.txt";

    // Esta es la parte que no pude realizar en el examen profesor, no tengo claro si este método es el correcto pero es el que logré investigar
    // Esta clase es creada para no tener que realizar el menú y el export a txt en cualquiera de las otras, de esta forma será más ordenado/menos disperso
    public void menu() {
        boolean salir = false;

        while (!salir) {
            String opcionStr = JOptionPane.showInputDialog(
                    "Seleccione una opción:\n1) Agregar Empleado\n2) Mostrar Empleados\n3) Salir");
            int opcion = Integer.parseInt(opcionStr);

            switch (opcion) {
                case 1:
                    agregarEmpleado();
                    break;
                case 2:
                    mostrarEmpleados();
                    break;
                case 3:
                    salir = true;
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, intente de nuevo.");

            }

        }
    }

    // Este metodo es para la opción 1 (Agregar Empleado)
    public static void agregarEmpleado() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        String cedula = JOptionPane.showInputDialog("Ingrese la cedula del empleado:");
        String puesto = JOptionPane.showInputDialog("Ingrese el puesto del empleado:");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado:"));

        Empleado empleado = new Empleado(nombre, cedula, puesto, salario);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_EMPLEADOS, true))) {
            writer.write(empleado.getNombre() + "," + empleado.getCedula() + "," + empleado.getPuesto() + "," + empleado.getSalario());
            writer.newLine();
            JOptionPane.showMessageDialog(null, "Empleado agregado correctamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo: " + e.getMessage());
        }
    }

    // Este metodo es para la opción 2 (Mostrar Empleado)
    public static void agregarEmpleado(Empleado empleado) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_EMPLEADOS, true))) {

            writer.write(empleado.getNombre() + "," + empleado.getCedula() + "," + empleado.getPuesto() + "," + empleado.getSalario());
            writer.newLine();
            System.out.println("Empleado agregado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public static void mostrarEmpleados() {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_EMPLEADOS))) {
            String linea;
            System.out.println("Lista de empleados:");

            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                Empleado empleado = new Empleado(datos[0], datos[1], datos[2], Double.parseDouble(datos[3]));
                empleado.mostrarInformacion();
            }
            // Excepción 
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
    /**
    // La idea de este método era que sea capaz de borrar el archivo, para que no se guarden datos que ya no existen
    * , pero me continúa dando el problema de que cada vez que se le da a la opción de salir se agrega nuevamente el dato que está quemado en el main, no pude arreglarlo
    public static void main(String[] args) {
    try (PrintWriter writer = new PrintWriter("empleados.txt")) {
        writer.close();
    } catch (IOException e) {
        System.out.println("Error al limpiar el archivo: " + e.getMessage());
    }

    // Llama el menú
    MenuInformacion menuInformacion = new MenuInformacion();
    menuInformacion.menu();
} */
}
