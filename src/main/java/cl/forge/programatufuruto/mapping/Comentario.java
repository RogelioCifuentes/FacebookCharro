package cl.forge.programatufuruto.mapping;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="comentario")
public class Comentario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private int idComentario;
    private String comentario;
    private Date fecha;

    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario idUsuario;

    @ManyToOne
    @JoinColumn(name="idFoto")
    private Foto idFoto;

    public Comentario(){

    }

    public Comentario(int idComentario, String comentario, Date fecha, Usuario idUsuario, Foto idFoto) {
        this.idComentario = idComentario;
        this.comentario = comentario;
        this.fecha = fecha;
        this.idUsuario = idUsuario;
        this.idFoto = idFoto;
    }

    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Foto getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(Foto idFoto) {
        this.idFoto = idFoto;
    }

    @Override
    public String toString() {
        return "Comentario{" +
                "idComentario=" + idComentario +
                ", comentario='" + comentario + '\'' +
                ", fecha=" + fecha +
                ", idUsuario=" + idUsuario +
                ", idFoto=" + idFoto +
                '}';
    }
}
