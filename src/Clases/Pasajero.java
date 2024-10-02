

package Clases;

import java.util.Objects;

public class Pasajero {
    private String apellido;
    private String nombre;
    private int documento;
    private int telefono;
    private String eMail;

    public Pasajero(String apellido, String nombre, int documento, int telefono, String eMail) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.eMail = eMail;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String get_eMail() {
        return eMail;
    }

    public void set_eMail(String eMail) {
        this.eMail = eMail;
    }




    @Override
    public String toString() {
        return "Pasajero{" +
                "apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", documento=" + documento +
                ", telefono=" + telefono +
                ", eMail='" + eMail + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null) {
            return false;
        }

        if (getClass() != o.getClass()) {
            return false;
        }

        Pasajero pasajero = (Pasajero) o;
        return this.documento == pasajero.documento && this.telefono == pasajero.telefono && Objects.equals(this.apellido, pasajero.apellido) && Objects.equals(this.nombre, pasajero.nombre) && Objects.equals(this.eMail, pasajero.eMail);
    }

}
