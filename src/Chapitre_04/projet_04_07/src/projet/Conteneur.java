/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.io.FileInputStream;
import java.util.*;
import org.apache.commons.beanutils.PropertyUtils;


/**
 *
 * @author trainer
 */
class Conteneur {

    private Map<String, Object> map;
    public  Conteneur() {
        map = new HashMap<String,Object>();
        instance=this;
       
        //lecture du fichier de configuration
        try {
            Properties prop = new Properties();
            prop.load(new FileInputStream("composants.properties"));
            for(Map.Entry ligne : prop.entrySet()){
                String cle = ligne.getKey().toString();
                String valeur = ligne.getValue().toString();
                String[] tokens = cle.split("\\.");
                
                if(tokens.length==1) {
                    Object composant = Class.forName(valeur).newInstance();
                    map.put(tokens[0], composant);
                }
                              
            }
             for(Map.Entry ligne : prop.entrySet()){
                String cle = ligne.getKey().toString();
                String valeur = ligne.getValue().toString();
                String[] tokens = cle.split("\\.");
                
                if(tokens.length!=1) {
                    Object composant = map.get(tokens[0]);
                    Object reference = map.get(valeur);
                    PropertyUtils.setProperty( composant,tokens[1], reference);
                }
                
                
            }
        }
        catch(Exception x) {
             System.out.println("Problème "+x);
         }
        
    }
    
    static Conteneur instance;
    

    public Object getComponent(String nom) {
       return map.get(nom);
    }
    
    
}
