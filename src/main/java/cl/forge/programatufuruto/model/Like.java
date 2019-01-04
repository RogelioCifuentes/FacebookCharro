package cl.forge.programatufuruto.model;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Like {

    @Id
    private int idLike;
    private String idUsuario;
    private int idFoto;




}