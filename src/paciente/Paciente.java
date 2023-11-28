/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paciente;

import java.util.Date;

/**
 *
 * @author Student
 */
public class Paciente {

    private String cedula;
    private String nombre;
    private Date fecha;
    private String horaLlegada;
    private String horaSalida;
    private String Clasificacion;

    public Paciente(String Clasificacion) {
        this.Clasificacion ="verde";
        this.Clasificacion= "amarillo";
        this.Clasificacion= "rojo";
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String Clasificacion) {
        this.Clasificacion = Clasificacion;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Paciente(String cedula, String nombre, Date fecha, String horaLlegada, String horaSalida) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fecha = fecha;
        this.horaLlegada = horaLlegada;
        this.horaSalida = horaSalida;
    }
    
   
    @Override
    public String toString() {
        return "Paciente{" + "cedula=" + cedula + ", nombre=" + nombre + ", fecha=" + fecha + ", horaLlegada=" + horaLlegada + ", horaSalida=" + horaSalida + '}';
    }
  
}
