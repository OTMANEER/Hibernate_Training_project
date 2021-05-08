/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author trainer
 */
public class Projet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext contexte = 
                new ClassPathXmlApplicationContext("maconfig.xml");
        GenerateurInfos gen= contexte.getBean(GenerateurInfos.class);
        
        System.out.println(gen.fournirLesDonnees());
    }
    
}
