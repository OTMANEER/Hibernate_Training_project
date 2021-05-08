/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import com.sun.istack.internal.NotNull;
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
        
    @OneToOne
    private Adresse adresse;
    
    @OneToMany(mappedBy="client")
    private Set<Facture> factures = new HashSet<Facture>();
       
    public Client (){};
    
    public Client(String nom,Adresse adresse) { 
        this.nom=nom;
        this.adresse=adresse;
    }
    
    @Override
    public String toString(){ return "Id : "+id+" nom : "+nom;}

    Adresse getAdresse() {
            return adresse;
    }

    String getNom() {
        return nom;
    }

    void addFacture(Facture facture) {
        factures.add(facture);
    }

    Iterable<Facture> getFactures() {
        return factures;
    }

   
    
    

    
}
