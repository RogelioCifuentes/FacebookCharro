package cl.forge.programatufuruto;

import cl.forge.programatufuruto.dao.UsuarioDAO;
import cl.forge.programatufuruto.mapping.Usuario;
import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.persistence.EntityManager;

@SpringBootApplication
public class main {

    public static void main(String[] args) {
        SpringApplication.run(main.class, args);
    }

    @Autowired
    private EntityManager manager;

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {

        return args -> {

        };


    }
}
