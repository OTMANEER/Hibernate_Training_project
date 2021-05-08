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
        
        InfosInterface ii=new InfosXML();
        map.put("infos", ii);
        GenerateurInfos gi  = new GenerateurInfos();
        gi.setInfosInterface(ii);
        map.put("generateur", gi);
        
    }
    
    static Conteneur instance;
    

    public Object getComponent(String nom) {
       return map.get(nom);
    }
    
    
}
