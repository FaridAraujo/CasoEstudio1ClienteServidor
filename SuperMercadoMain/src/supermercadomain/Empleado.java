package supermercadomain;

/**
 *
 * @author Aulas Heredia
 */
class Empleado extends Persona {

    private String puesto;
    private Double salario;

    public Empleado(String nombre, String cedula, String puesto, Double salario) {
        super(nombre, cedula);
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public Double getSalario() {
        return salario;

    }

    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre + ", Cedula: " + cedula + ", puesto: " + puesto + ", Salario: " + salario);

    }
}
