package cl.forge.programatufuruto.test;

import cl.forge.programatufuruto.mapping.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import java.util.List;


public class TestUsuario {

    private static EntityManager manager;
    @PersistenceContext(unitName = "Persistencia")
    private static EntityManagerFactory sesion = Persistence.createEntityManagerFactory("Persistencia");;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        /* Creando el gestor de persistencia*/
        manager = sesion.createEntityManager();

        Usuario usuario1 = new Usuario("R2D2","correo@gmail.com","Baltazar","magi1");
        Usuario usuario2 = new Usuario("R2D3","gmail@correo.co","Melchor","magi2");
        Usuario usuario3 = new Usuario("R2D4","cl@correo.gmail","Gaspar","magi3");


        manager.getTransaction().begin();
/*
        manager.persist(usuario1);
        manager.persist(usuario2);
        manager.persist(usuario3);
*/
        manager.getTransaction().commit();

        imprimirUsuarios();
        buscarUsuarioPorID();
        manager.close();
    }


    public static void imprimirUsuarios(){

        List<Usuario> usuarios = (List<Usuario>)manager.createQuery("FROM Usuario").getResultList();
        System.out.println("Total de usuarios: "+usuarios.size());
        for(Usuario u : usuarios){
            System.out.println(u.toString());

        }
        manager.close();
    }

    public static Usuario buscarUsuarioPorID(){

        Usuario usuario = manager.find(Usuario.class,"R2D2");
        System.out.println(usuario.getNombre());
        manager.close();
        return usuario;

    }

}
