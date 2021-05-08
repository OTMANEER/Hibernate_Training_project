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

    private Map<String, Object> map;
    public  Conteneur() {
        map = new HashMap<String,Object>();
        instance=this;
        
        map.put("infos", new InfosXML());
        map.put("generateur", new GenerateurInfos());
    }
    
    static Conteneur instance;
    

    public Object getComponent(String nom) {
       return map.get(nom);
    }
    
    
}
