package cl.forge.programatufuruto.dao;

import cl.forge.programatufuruto.mapping.Comentario;
import cl.forge.programatufuruto.mapping.Foto;
import cl.forge.programatufuruto.mapping.Like;
import cl.forge.programatufuruto.mapping.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Component
public class FotoDAO {

    //QUE HACER PARA NO TENER QUE REPETIR ESTA LINEA EN CADA DAO
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");



    //Devuelve la foto que tenga el Id ingresado como parametro
    public Foto obtenerFotoPorId(int idFoto)
    {
        EntityManager manager = emf.createEntityManager();
        return manager.find(Foto.class,idFoto);
    }

    //Obtengo las fotos creando una consulta que utilize el idUsuario del objeto Usuario que me ingresan para generar una lista de fotos
    public List<Foto> obtenerFotosPorIdUsuario(Usuario usuario){

        EntityManager manager = emf.createEntityManager();

        Usuario u = manager.find(Usuario.class,usuario.getIdUsuario());
        System.out.println(u);

       return u.getFotos();
    }

    public List <Comentario> obtenerComentariosPorIdFoto(int id) {
        EntityManager manager = emf.createEntityManager();

        Foto f = manager.find(Foto.class, id);

        return f.getComentarios();
    }


    public List<Like> cantidadLikes(int id){
            EntityManager manager = emf.createEntityManager();

           Foto f = manager.find(Foto.class,id);
           return f.getLikes();

        // System.out.println("Cantidad de likes: "+ f.getLikes().size());


       /* String hql = "SELECT COUNT (*) FROM Foto f WHERE f.idFoto = ?";
        Query q = manager.createQuery(hql);
        q.setParameter(0,id);
        List<Foto> fotos = (List<Foto>)manager.createQuery(hql).getResultList();

        int likess = fotos.size();

        System.out.println(" cantidad de likes: "+likess);
*/
    }
}
