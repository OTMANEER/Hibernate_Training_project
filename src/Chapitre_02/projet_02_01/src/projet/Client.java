/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import javax.persistence.*;

/**
 *
 * @author trainer
 */
@Entity
@Table(name="CLIENT")
public class Client {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private int id;
    
    @Column(name="NOM", length=100, nullable=false)
    private String nom;
   
    
    public String toString() {
        return id+" : "+nom;
    }
        
    public Client(String nom) { this.nom=nom;}
}
