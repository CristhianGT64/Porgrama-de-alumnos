package hn.unah.lenguajes1900.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.demo.dtos.Alumnos;
import hn.unah.lenguajes1900.demo.dtos.Clases;

@RestController
@RequestMapping("/home")
public class HomeController {

    private List<Alumnos> lAlumnos = new ArrayList<>();
    private List<Clases> lClases = new ArrayList<>();

    @GetMapping("/CrearAlumnos")
    public String CrearAlumnos(@RequestBody Alumnos nvoAlumnoDto){
        lAlumnos.add(nvoAlumnoDto);
        return "Alumno Registrado Correctamente";
    }

    @GetMapping("/CrearClases")
    public String CrearAlumnos(@RequestBody Clases nvoclaseDto){
        lClases.add(nvoclaseDto);
        return "Asignatura Creada Exitosamente";
    }

    @GetMapping("/AgregarClases/{numCuenta}/{codClase}")
    public String AgregarClases(@PathVariable String numCuenta,
        @PathVariable String codClase){
        String mensaje = "";
        // boolean encontrado = false;
        if (lAlumnos.isEmpty()) {
            mensaje = "No existe ningun Alumno Registrado";
        }
        else if(lAlumnos.isEmpty()) {
            mensaje = "No existe ninguna Materia Registrada";
        }else{
            
        }
            for (Alumnos alumno : lAlumnos){
                if (alumno.getNumeroCuenta().equals(numCuenta)){
                    for (Clases clase : lClases){
                        if ( clase.getCodigo().equals(codClase)) {
                                alumno.AgregarClases(clase);
                                mensaje = "Asignatura Registrada exitosamente";
                                break;
                        }
                        else{
                                mensaje = "Asignatura no enco 2ntrada";
                        }
                    }
                    break;
                }
                else{
                    mensaje = "Estudiante no encontrado";
                }
            }



        return mensaje;
    }

    @GetMapping("/VerAlumnos")
    public String MostrarAlumnos(){
        return "\n " +lAlumnos;
    }

    @GetMapping("/VerClases")
    public String MostrarClases(){
        return "\n " +lClases;
    }
}
