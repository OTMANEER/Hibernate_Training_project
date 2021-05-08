/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

/**
 *
 * @author trainer
 */
public class Projet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext contexte = 
                new ClassPathXmlApplicationContext("maconfig.xml");
          
        ClientDAO dao = (ClientDAO) contexte.getBean(ClientDAOImpl.class);
        
        Client c= new Client("Rasori");
        dao.store(c);
        
        Client retour = dao.findById(1);
        
        System.out.println("Client retrouvé "+retour);
        
        
        Client c2= new Client("Rasori");
        dao.store(c2);
        
        List<Client> lesClients = dao.findAll();
        for(Client cc : lesClients) {
            System.out.println("Les clients : "+cc);
        }
              
    }
    
}
