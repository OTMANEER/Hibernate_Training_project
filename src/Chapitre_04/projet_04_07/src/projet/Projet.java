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
public class Projet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conteneur monConteneur = new Conteneur();
        GenerateurInfos gen= (GenerateurInfos)monConteneur.getComponent("generateur");
        System.out.println(gen.fournirLesDonnees());
    }
    
}
