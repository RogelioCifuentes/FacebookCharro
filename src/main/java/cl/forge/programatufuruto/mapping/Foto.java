package cl.forge.programatufuruto.mapping;

import javax.persistence.*;

@Entity
@Table(name="foto")
public class Foto {

    @Id
    private int idFoto;
    private String ubicacion;
    private String pieDeFoto;

    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario idUsuario;

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
