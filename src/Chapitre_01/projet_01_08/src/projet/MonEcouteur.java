/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import org.hibernate.HibernateException;
import org.hibernate.event.spi.LoadEvent;
import org.hibernate.event.spi.LoadEventListener;


/**
 *
 * @author trainer
 */
public class MonEcouteur implements LoadEventListener{

    @Override
    public void onLoad(LoadEvent le, LoadType lt) throws HibernateException {
        System.out.println("Chargement écouté : "+le.getEntityId());
    }
    
}
