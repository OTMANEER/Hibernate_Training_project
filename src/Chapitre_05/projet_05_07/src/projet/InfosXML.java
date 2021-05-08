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
public class InfosXML implements InfosInterface{

    @Override
    public String genererInfos(String msg) {
        return "<baliseXML>"+msg+"</baliseXML>";
    }
    
}
