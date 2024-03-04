package hn.unah.lenguajes1900.demo.dtos;

import java.util.ArrayList;
import java.util.List;
// import javax.print.event.PrintJobAdapter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Alumnos {
    private String numeroCuenta;
    private String nombre; 
    private String apellido;
    private String correo;
    private List<Clases> lClases = new ArrayList<>();

    public String toString(){
            return "Cuenta: " + this.numeroCuenta + 
                "Nombre: " + this.nombre + 
                "Apellido" + this.apellido + 
                "Correo: " + this.correo +
                " Clases: " + this.getLClases() + "\n";
    }

    public void AgregarClases(Clases clase){
        lClases.add(clase);
    }
}
