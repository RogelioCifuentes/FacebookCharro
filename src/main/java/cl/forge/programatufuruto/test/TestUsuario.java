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
    private static EntityManagerFactory sesion;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        /* Creando el gestor de persistencia*/
        sesion = Persistence.createEntityManagerFactory("Persistencia");
        manager = sesion.createEntityManager();


        List<Usuario> usuarios =(List<Usuario>)manager.createQuery("FROM Usuario").getResultList();
        System.out.println("Hay un total de "+usuarios.size()+" usuarios");

    }
    static void creardatos(){



        sesion.getTransaction().begin();

        Usuario usuario1 = new Usuario(1,"correo@gmail.com","Baltazar","magi1");

        sesion.get
    }

    static List<Usuario> imprimirDatos(){

    }

}
