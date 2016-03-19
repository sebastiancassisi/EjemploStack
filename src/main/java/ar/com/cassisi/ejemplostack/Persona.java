/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.cassisi.ejemplostack;

/**
 *
 * @author cassisi
 */
public class Persona {
    
    private String nombre;
    private long documento;
    private long telefono;

    public Persona(String nombre, long documento, long telefono) {
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", documento=" + documento + ", telefono=" + telefono + "}\n";
    }
}
