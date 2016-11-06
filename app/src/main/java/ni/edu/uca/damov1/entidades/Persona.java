package ni.edu.uca.damov1.entidades;

import com.orm.SugarRecord;

/**
 * Created by pwk04 on 11-06-16.
 */
public class Persona extends SugarRecord {

    private String nombre;
    private String cedula;
    private String correo;
    private String telefono;


    public Persona(){}

    public Persona(String nombre, String cedula, String correo, String telefono){
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
