/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author trainer
 */

public class GenerateurInfos {
    
    InfosInterface generateur ;
    
    public GenerateurInfos(InfosInterface generateur, int param0) {
        this.generateur = generateur;
    }
    
   /* public void setInfosInterface(InfosInterface generateur){
        this.generateur= generateur;
    }
   */
    
    public String fournirLesDonnees() {
        return generateur.genererInfos();
    }

    
    public void init() {
          System.out.println("Le conteneur a initialisé ...");  
    }
    
 }
