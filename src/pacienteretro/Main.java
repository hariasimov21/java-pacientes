
package pacienteretro;

import java.util.List;
import okhttp3.ResponseBody;

/**
 *
 * @author jaimediaz
 */
public class Main {

    
    public static void main(String[] args) throws Exception {
        
        pacienteRetrofit pac = new pacienteRetrofit();
        System.out.println("Obtener pacientes");
        
        List<Paciente> pacientes = pac.obtenerTodosLosPacientes();
        System.out.println(pacientes);
        
        System.out.println("Obtener 1 paciente");
        Paciente ps = pac.obtenerPaciente(11);
        System.out.println(ps);
        
        try{
        Paciente createPaciente = new Paciente();
        createPaciente.setRut(11);
        createPaciente.setNombre("Dross");
        createPaciente.setDireccion("Americo vespucio norte 520");
        createPaciente.setIsapre("Colmena");
        System.out.println("Obtener  paciente creado");
        Paciente crearPaciente = pac.crearPaciente(createPaciente);
        System.out.println(crearPaciente);
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        
       
        System.out.println("Eliminar paciente"); 
       ResponseBody rb = pac.borrarPaciente(11);
       System.out.println(rb);
        
       
    }
    
    
    
    
}
