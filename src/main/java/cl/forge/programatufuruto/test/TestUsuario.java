package cl.forge.programatufuruto.test;

import cl.forge.programatufuruto.dao.FotoDAO;
import cl.forge.programatufuruto.dao.UsuarioDAO;
import cl.forge.programatufuruto.mapping.Comentario;
import cl.forge.programatufuruto.mapping.Foto;
import cl.forge.programatufuruto.mapping.Like;
import cl.forge.programatufuruto.mapping.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class TestUsuario {

    private static EntityManagerFactory sesion = Persistence.createEntityManagerFactory("Persistencia");;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        /* Creando el gestor de persistencia*/
        EntityManager manager = sesion.createEntityManager();

/*
        CREACION E INGRESO A DB

        Usuario usuario1 = new Usuario("R2D2","correo@gmail.com","Baltazar","magi1");
        Usuario usuario2 = new Usuario("R2D3","gmail@correo.co","Melchor","magi2");
        Usuario usuario3 = new Usuario("R2D4","cl@correo.gmail","Gaspar","magi3");

        manager.getTransaction().begin();
        manager.persist(usuario1);
        manager.persist(usuario2);
        manager.persist(usuario3);
        manager.getTransaction().commit();
*/
        Usuario usuario1 = new Usuario("R2D2","correo@gmail.com","Baltazar","magi1");
        Usuario usuario2 = new Usuario("R2D3","gmail@correo.co","Melchor","magi2");
        Usuario usuario3 = new Usuario("R2D4","cl@correo.gmail","Gaspar","magi3");


        UsuarioDAO dao = new UsuarioDAO();
        FotoDAO dao2 = new FotoDAO();

        List<Like> likes = dao2.cantidadLikes(10);
        for(Like l : likes){
            System.out.println(l.toString());
        }
/*
        dao.imprimirUsuarios();
        dao.buscarUsuarioPorID("R2D2");


        List<Foto> fotos = dao2.obtenerFotosPorIdUsuario(usuario2);
        for(Foto f : fotos){
            System.out.println(f.toString());
        }

        List<Comentario> comentarios = dao2.obtenerComentariosPorIdFoto(10);
        for(Comentario c : comentarios){
            System.out.println(c.toString());
        }
        /*
        List<Foto> fotos = dao2.obtenerFotosPorIdUsuario(usuario1);
        for(Foto f : fotos){
            System.out.println(f.toString());
        }
       // dao2.mostrarComentarios(10);
        manager.close();
    */
    }






}
