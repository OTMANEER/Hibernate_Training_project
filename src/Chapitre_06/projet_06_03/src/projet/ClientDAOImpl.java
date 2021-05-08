/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.util.List;
import org.hibernate.*;


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
     
          sessionFactory.getCurrentSession().saveOrUpdate(c);
      
    }

    @Override
    public void delete(Integer id) {
    
          Client c = (Client)sessionFactory.getCurrentSession().get(Client.class, id);
          sessionFactory.getCurrentSession().delete(c);
      
    }

    @Override
    public Client findById(Integer id) {
       
          return (Client)sessionFactory.getCurrentSession().get(Client.class, id);    
     
    }

    @Override
    public List<Client> findAll() {
       
        Query requete = sessionFactory.getCurrentSession().createQuery("from Client");
        return requete.list();
     
    }
    
}
