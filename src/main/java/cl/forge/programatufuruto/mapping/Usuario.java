package cl.forge.programatufuruto.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="usuario")
public class Usuario implements Serializable {


    @Id
    @Column (name = "idUsuario")
    private String idUsuario;

    @Column (name="email")
    private String email;

    @Column (name="nombre")
    private String nombre;


    @Column (name="password")
    private String password;



    public Usuario(){

    }

    public Usuario(String email, String nombre, String password) {
        this.idUsuario =
        this.email = email;
        this.nombre = nombre;
        this.password = password;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario='" + idUsuario + '\'' +
                ", email='" + email + '\'' +
                ", nombre='" + nombre + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
