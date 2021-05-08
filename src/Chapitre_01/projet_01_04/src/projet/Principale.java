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
            
            List resultats = session.createQuery("from Client").list();
                        
            tx.commit();
            
            for (Object c : resultats) {
                System.out.println(c);
            }
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
