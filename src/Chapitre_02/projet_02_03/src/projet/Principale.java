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
            
            
            Adresse adresse = new Adresse("38 rue Général De Gaulle","28190","Saint-Georges-sur-Eure");          
            Client c = new Client("Rasori",adresse);
            Facture facture = new Facture(c,31425.92);
         
            session.save(adresse);
            session.save(c);
            session.save(facture);
            
            
            Client leClient = (Client)session.load(Client.class, 1);
            
            System.out.println("Client : "+leClient);
            System.out.println("Adresse : "+leClient.getAdresse());
           for(Object f : leClient.getFactures()) {
               System.out.println("Facture : "+f);
           }
        
            
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
