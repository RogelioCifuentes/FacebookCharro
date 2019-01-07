package cl.forge.programatufuruto.mapping;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="foto")
public class Foto {

    @Id
    @Column(name="idFoto")
    private int idFoto;

    @Column(name="ubicacion")
    private String ubicacion;

    @Column(name="pie_de_foto")
    private String pieDeFoto;

    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario idUsuario;

    @OneToMany(mappedBy = "idFoto")
    private List<Like> likes;

    @OneToMany(mappedBy = "idFoto")
    private List<Comentario> comentarios;


    public Foto(){

    }

    public Foto(int idFoto, String ubicacion, String pieDeFoto, Usuario idUsuario) {
        this.idFoto = idFoto;
        this.ubicacion = ubicacion;
        this.pieDeFoto = pieDeFoto;
        this.idUsuario = idUsuario;
    }

    public int getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(int idFoto) {
        this.idFoto = idFoto;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getPieDeFoto() {
        return pieDeFoto;
    }

    public void setPieDeFoto(String pieDeFoto) {
        this.pieDeFoto = pieDeFoto;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }


    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }


    @Override
    public String toString() {
        return "Foto{" +
                "idFoto=" + idFoto +
                ", ubicacion='" + ubicacion + '\'' +
                ", pieDeFoto='" + pieDeFoto + '\'' +
                ", idUsuario=" + idUsuario +
                '}';
    }
}
