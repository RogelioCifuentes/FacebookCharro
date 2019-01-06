package cl.forge.programatufuruto.mapping;

import org.apache.tomcat.jni.Time;

import javax.persistence.*;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column (name = "idUsuario")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private String idUsuario;

    @Column (name="email")
    private String email;

    @Column (name="nombre")
    private String nombre;

    @Column (name="password")
    private String password;

    @Column (name ="HORA_CONEXION")
    private String horaConexion;

    @OneToMany(mappedBy="idUsuario")
    private List<Foto> fotos;

    @OneToMany(mappedBy = "idUsuario")
    private List<Comentario> comentarios;

    @OneToMany(mappedBy = "idUsuario")
    private List<Like> likes;



    public Usuario(){

    }

    public Usuario(String idUsuario, String email, String nombre, String password ) {

       try {
           this.idUsuario = idUsuario;
           this.email = email;
           this.nombre = nombre;
           this.password = encriptar(password);

           /* SE LE SETEA LA HORA A LA CUAL INGRESA*/
           DateTimeFormatter format = DateTimeFormatter.ofPattern("YYYY-MM-DD HH:MM:ss"); //No guarda el HH:MM:ss
           LocalDateTime horaIngreso = LocalDateTime.now();
           this.horaConexion = horaIngreso.format(format);


       }catch (NoSuchAlgorithmException e){
           e.printStackTrace();
       }

    }

    public String encriptar(String cadena) throws NoSuchAlgorithmException {

        //Encriptacion MD5

        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] hashInBytes = md.digest(cadena.getBytes(StandardCharsets.UTF_8));

        StringBuilder sb = new StringBuilder();
        for (byte b : hashInBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }


    public String getHoraConexion() {
        return horaConexion;
    }

    public void setHoraConexion(String horaConexion) {
        this.horaConexion = horaConexion;
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
    public List<Foto> getFotos() {
        return fotos;
    }

    public void setFotos(List<Foto> fotos) {
        this.fotos = fotos;
    }


    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario='" + idUsuario + '\'' +
                ", email='" + email + '\'' +
                ", nombre='" + nombre + '\'' +
                ", password='" + password + '\'' +
                ", horaConexion='" + horaConexion + '\'' +
                '}';
    }
}
