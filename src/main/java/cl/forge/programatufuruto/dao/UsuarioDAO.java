package cl.forge.programatufuruto.dao;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class UsuarioDAO {

    @Autowired
    private EntityManager em;

    public List obtenerUsuarios()
    {
        String hql = "FROM Usuario u";
        Query q = em.createQuery(hql);
        return q.getResultList();
    }

    //METODO GUARDAR USUARIO NECESITA MD5 EN LA PASSWORD


}
