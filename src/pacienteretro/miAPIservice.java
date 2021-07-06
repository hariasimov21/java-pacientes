/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacienteretro;

import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 *
 * @author jaimediaz
 */
public interface miAPIservice {

    @GET("/api/pacientes")
    Call<List<Paciente>> obtenerTodosLosPacientes();

    @GET("/api/pacientes/{rut}")
    Call<Paciente> obtenerPaciente(@Path("rut") int rut);

    @POST("/api/pacientes")
    Call<Paciente> crearPaciente(@Body Paciente paciente);

    @PUT("/api/pacientes/{rut}")
    Call<Paciente> actualizarPaciente(@Path("rut") int rut, @Body Paciente p);

    @DELETE("/api/pacientes/{rut}")
    Call<ResponseBody> borrarPaciente(@Path("rut") int rut);
}
