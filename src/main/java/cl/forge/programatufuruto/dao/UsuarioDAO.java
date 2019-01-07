package cl.forge.programatufuruto.dao;

import cl.forge.programatufuruto.mapping.Usuario;
import javax.persistence.*;
import java.util.List;

public class UsuarioDAO {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");

    public List obtenerUsuarios()
    {
        EntityManager manager = emf.createEntityManager();
        String hql = "FROM Usuario u";
        Query q = manager.createQuery(hql);

        return q.getResultList();
    }

    public void imprimirUsuarios(){

        EntityManager manager = emf.createEntityManager();
        List<Usuario> usuarios = (List<Usuario>)manager.createQuery("FROM Usuario").getResultList();
        System.out.println("Total de usuarios: "+usuarios.size());
        for(Usuario u : usuarios){
            System.out.println(u.toString());
        }
        manager.close();
    }

    public Usuario buscarUsuarioPorID(String id){
        EntityManager manager = emf.createEntityManager();
        Usuario usuario = manager.find(Usuario.class,id);
        System.out.println(usuario.getNombre());
        manager.close();
        return usuario;

    }
}
