package cl.forge.programatufuruto.mapping;

import javax.persistence.*;

@Entity
@Table(name="like")
public class Like {


    @Id
    private int idLike;

    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario idUsuario;

    @ManyToOne
    @JoinColumn(name="idFoto")
    private Foto idFoto;

    public Like(){

    }

    public Like(int idLike, Usuario idUsuario, Foto idFoto) {
        this.idLike = idLike;
        this.idUsuario = idUsuario;
        this.idFoto = idFoto;
    }

    public int getIdLike() {
        return idLike;
    }

    public void setIdLike(int idLike) {
        this.idLike = idLike;
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
        return "Like{" +
                "idLike=" + idLike +
                ", idUsuario=" + idUsuario +
                ", idFoto=" + idFoto +
                '}';
    }
}