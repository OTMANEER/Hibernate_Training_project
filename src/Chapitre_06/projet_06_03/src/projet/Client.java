/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.util.*;
import javax.persistence.*;

/**
 *
 * @author trainer
 */
@Entity
@Table(name="CLIENT")
public class Client {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column( name="ID")
    private int id;
    
    @Column(name="NOM")
    private String nom;
       
         
    public Client (){};
    
    public Client(String nom) { 
        this.nom=nom;
    }
    
    @Override
    public String toString(){ return "Id : "+id+" nom : "+nom;}

  
    String getNom() {
        return nom;
    }

  
  

   
    
    

    
}
