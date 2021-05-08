/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.util.*;

/**
 *
 * @author trainer
 */
class Conteneur {

    private Map<String, InfosInterface> map;
    private Conteneur() {
        map = new HashMap<String,InfosInterface>();
        
        map.put("XML", new InfosXML());
        map.put("HTML",new InfosHTML());
    }
    
    static private Conteneur instance;
    static Conteneur getInstance() {
      if(instance==null)
          instance =new Conteneur();
      return instance;
    }

    public InfosInterface getComponent(String nom) {
       return map.get(nom);
    }
    
    
}
