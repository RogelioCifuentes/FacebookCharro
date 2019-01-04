package cl.forge.programatufuruto.model;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

    @Id
    private String idUsuario;
    private String email;
    private String nombre;
    private String password;



}
