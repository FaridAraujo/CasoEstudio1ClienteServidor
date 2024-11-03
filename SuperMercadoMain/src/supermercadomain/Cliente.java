/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercadomain;

/**
 *
 * @author Aulas Heredia
 */
class Cliente extends Persona {

    private String tipoDeMembresia;

    public Cliente(String nombre, String cedula, String tipoDeMembresia) {
        super(nombre, cedula);
        this.tipoDeMembresia = tipoDeMembresia;
    }

    public String getTipoDeMembresia() {
        return tipoDeMembresia;
    }

}
