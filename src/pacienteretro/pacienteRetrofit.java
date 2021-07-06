/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacienteretro;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Path;

/**
 *
 * @author jaimediaz
 */
public class pacienteRetrofit {
   
    private String AMBIENTE = "desa";
       
     private String API_URI = AMBIENTE == "desa" ? 
             "https://projectjava1.herokuapp.com/api/pacientes/" : 
             "http://localhost:4000/api/pacientes/";
     
       private  Retrofit RETROFIT = new Retrofit.Builder().baseUrl(API_URI)
                .addConverterFactory(GsonConverterFactory.create()).build();
    private miAPIservice SERVICE = RETROFIT.create(miAPIservice.class);

    public pacienteRetrofit() {
    }
    
     
        public List<Paciente> obtenerTodosLosPacientes() throws Exception{
             Call <List<Paciente>> Pacientes = SERVICE.obtenerTodosLosPacientes();
             return Pacientes.execute().body();
        }
        
        public Paciente obtenerPaciente(int rut) throws Exception{
            Call <Paciente> Paciente = SERVICE.obtenerPaciente(rut);
            return Paciente.execute().body();
        }
        
        public Paciente crearPaciente(Paciente p) throws Exception{
            Call <Paciente> Paciente = SERVICE.crearPaciente(p);
            return Paciente.execute().body();
        }
        
        public Paciente actualizarPaciente(Paciente p, int rut) throws Exception{
            Call <Paciente> Paciente = SERVICE.actualizarPaciente(rut, p);
            return Paciente.execute().body();
        }
        
        public ResponseBody borrarPaciente( int rut) throws Exception{
            Call <ResponseBody> Paciente = SERVICE.borrarPaciente(rut);
            return Paciente.execute().body();
        }
              
        
}
