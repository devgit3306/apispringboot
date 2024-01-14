package  com.example.demo.models

import jdk.internal.vm.annotation.Stable;:
import javax.persistence.Table;
import javax.persistence.Entity;


@Entity
@Table(name = "usuario")
public class UsuarioModel {

    private Long id;
    private String nombre;
    private String email;
    private Integer prioridad;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }
}











