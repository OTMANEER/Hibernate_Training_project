/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.util.List;
import org.hibernate.*;

/**
 *
 * @author trainer
 */
public class Principale {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
                       
            //1 objet créé en mémoire mais non enregistré
            
            Client c = new Client("Rasori");
            session.save(c);
            
            //2 objet persistant en base
            
            c=(Client)session.load(Client.class, 1);
            
            c=(Client)session.get(Client.class, 1);
            
            //3 objet détaché
             session.update(c);
             session.merge(c);
            
            //4 utiliser saveOrUpdate
            session.saveOrUpdate(c);
             
            tx.commit();
         
        }
        catch(Exception ex) {
            tx.rollback();
            throw ex;
        }
        finally {
            session.close();
        }
         
    }
}
