package cl.forge.programatufuruto.dao;

import cl.forge.programatufuruto.mapping.Foto;
import cl.forge.programatufuruto.mapping.Usuario;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class FotoDAO {

    //QUE HACER PARA NO TENER QUE REPETIR ESTA LINEA EN CADA DAO
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");

    @Autowired
    private EntityManager manager;


    public Foto obtenerFotoPorId(int idFoto)
    {
        return manager.find(Foto.class,idFoto);
    }

    /*public List<Foto> obtenerFotosPorIdUsuario(Usuario usuario){
        String hql = "FROM Foto f WHERE usuario.= ?";
        Query q = manager.createQuery(hql);
        q.setParameter(0,usuario);


        return manager.find(Foto.class,);
    }*/
}
