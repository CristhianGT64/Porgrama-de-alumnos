package hn.unah.lenguajes1900.demo.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Clases {
    public String codigo;
    public String descripcion;
    public Integer uv;

    public String toString(){
        return "codigo: " + this.codigo + 
            " Descripcion: " + this.descripcion + 
            " Unidades Valorativas: " + this.uv + "\n";
}
}
