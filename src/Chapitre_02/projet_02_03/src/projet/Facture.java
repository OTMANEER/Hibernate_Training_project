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
@Table(name="FACTURE")
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private int id;
    
    @Column(name="TOTALTTC")
    private double totalTTC;
    
    @ManyToOne @JoinColumn(name="CLIENTID")
    private Client client;
    
    public Facture() {}
    
    public Facture (Client c, double mt) {
        this.client=c;
        c.addFacture(this);
        this.totalTTC = mt;
    }
    
    @Override
    public String toString() {
        return "Id : "+id+ " total : "+totalTTC+ "  pour : "+((client!= null) ? client.getNom() : "");
    }
}