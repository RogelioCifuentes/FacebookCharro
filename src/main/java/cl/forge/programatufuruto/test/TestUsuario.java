package cl.forge.programatufuruto.test;

import cl.forge.programatufuruto.dao.UsuarioDAO;
import cl.forge.programatufuruto.mapping.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;


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

        UsuarioDAO dao = new UsuarioDAO();

        dao.imprimirUsuarios();
        dao.buscarUsuarioPorID("R2D4");


        manager.close();
    }






}
