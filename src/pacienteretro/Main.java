
package pacienteretro;

import java.util.List;
import okhttp3.ResponseBody;

/**
 *
 * @author jaimediaz
 */
public class Main {

    
    public static void main(String[] args) throws Exception {
        
        int rutPaciente = 11;
        System.out.println("---------------------------------");
        pacienteRetrofit pac = new pacienteRetrofit();
        System.out.println("Lista de todos los pacientes en la BD");
        
        List<Paciente> pacientes = pac.obtenerTodosLosPacientes();
        System.out.println(pacientes);
        
        System.out.println("---------------------------------");
        System.out.println("Obtener un paciente con rut " + rutPaciente);
        Paciente ps = pac.obtenerPaciente(rutPaciente);
        System.out.println(ps);
        
        System.out.println("---------------------------------");
        Paciente paciente = new Paciente();
        try{
        
        paciente.setRut(rutPaciente);
        paciente.setNombre("Dross");
        paciente.setDireccion("Americo vespucio norte 520");
        paciente.setIsapre("Colmena");
        System.out.println("Obtener  paciente creado con rut " + rutPaciente);
        Paciente crearPaciente = pac.crearPaciente(paciente);
        System.out.println(crearPaciente);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("---------------------------------");
        System.out.println("Lista de todos los pacientes en la BD");
        pacientes = pac.obtenerTodosLosPacientes();
        System.out.println(pacientes);
        System.out.println("---------------------------------");
        System.out.println("Actualizar paciente con rut " + rutPaciente);
        paciente.setRut(rutPaciente);
        paciente.setNombre("Mario Castañeda");
        paciente.setDireccion("Americo vespucio norte 23");
        paciente.setIsapre("CONSALUD");
        Paciente updatePaciente = pac.actualizarPaciente(paciente, rutPaciente);
        System.out.println(updatePaciente);
        
    System.out.println("---------------------------------");
        System.out.println("Lista de todos los pacientes en la BD");
        pacientes = pac.obtenerTodosLosPacientes();
        System.out.println(pacientes);
        
       System.out.println("---------------------------------");
        System.out.println("Eliminar paciente con rut " + rutPaciente); 
       ResponseBody rb = pac.borrarPaciente(rutPaciente);
        System.out.println("---------------------------------");
       System.out.println("Obtener un paciente con rut " + rutPaciente);
        ps = pac.obtenerPaciente(rutPaciente);
        System.out.println(ps);
        System.out.println("---------------------------------");
        System.out.println("Lista de todos los pacientes en la BD");
        pacientes = pac.obtenerTodosLosPacientes();
        System.out.println(pacientes);
       
    }
    
    
    
    
}
