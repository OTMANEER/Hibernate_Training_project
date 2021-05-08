/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

/**
 *
 * @author trainer
 */
public class GenerateurInfos {
    
    private InfosInterface generateur 
            =(InfosInterface)Conteneur.instance.getComponent("infos");
    
       
    public String fournirLesDonnees() {
        return generateur.genererInfos();
    }
}
