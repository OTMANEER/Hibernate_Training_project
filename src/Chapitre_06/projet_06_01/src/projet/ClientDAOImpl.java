/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.util.List;
import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.stereotype.Repository;

/**
 *
 * @author trainer
 */
@Repository
public class ClientDAOImpl  implements ClientDAO{

    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory=sessionFactory;
    }
    
    @Override
    public void store(Client c) {
      Session session = sessionFactory.openSession();
      Transaction tx = session.getTransaction();
           
      try {
          tx.begin();
          session.saveOrUpdate(c);
          tx.commit();
      }
      catch(RuntimeException e) {
          tx.rollback();
          throw e;
      }
      finally {
          session.close();
      }
    }

    @Override
    public void delete(Integer id) {
        Session session = sessionFactory.openSession();
      Transaction tx = session.getTransaction();
           
      try {
          tx.begin();
          Client c = (Client)session.get(Client.class, id);
          session.delete(c);
          tx.commit();
      }
      catch(RuntimeException e) {
          tx.rollback();
          throw e;
      }
      finally {
          session.close();
      }
    }

    @Override
    public Client findById(Integer id) {
      Session session = sessionFactory.openSession();  
      try {      
          return (Client)session.get(Client.class, id);    
      }    
      finally {
          session.close();
      }
    }

    @Override
    public List<Client> findAll() {
        Session session = sessionFactory.openSession();
     
      try {
        
        Query requete = session.createQuery("from Client");
        return requete.list();
      }
      
      finally {
          session.close();
      }
    }
    
}
