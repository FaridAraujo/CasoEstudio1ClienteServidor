package supermercadomain;

/**
 *
 * @author Aulas Heredia
 */
abstract class Persona {

    protected String nombre;
    protected String cedula;

    public Persona(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

}
