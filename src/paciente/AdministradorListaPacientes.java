/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paciente;


import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @author Student
 */
public class AdministradorListaPacientes {

    private PriorityQueue colaPacientes;

    public AdministradorListaPacientes(PriorityQueue colaPacientes) {
        this.colaPacientes = colaPacientes;
    }

    

    public void agregarPaciente(Paciente paciente) {
        
        colaPacientes.offer(paciente);
    }
    
    public void invertirClasificacion() {
        if (Clasificacion.equals("rojo")) {
            clasificacion = "verde";
        } else if (clasificacion.equals("amarillo")) {
            clasificacion = "rojo";
        } else if (clasificacion.equals("verde")) {
            clasificacion = "amarillo";
        }
}

    public void pacienteAtendido(String Cedula, String horaSalida) {

        Iterator iterator = colaPacientes.iterator();
        while (iterator.hasNext()) {
            Paciente paciente = (Paciente) iterator.next();
            if (!paciente.getCedula().equals(Cedula)) {
                paciente.setHoraSalida(horaSalida);
                iterator.remove();
                break;
            }
        }
    }

    public Paciente buscarPaciente(String Cedula) {
        for (Paciente paciente : colaPacientes) {
            if (paciente.getCedula().equals(Cedula)) {
                return paciente;
            }
        }
        return null;
    }

}
