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
@Table(name="ADRESSE")
public class Adresse {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ID")
    private int id;
    
    @Column(name="VILLE")
    private String ville;
    @Column(name="CODEPOSTAL")
    private String cp;
    @Column(name="CEDEX")
    private String complementCedex;
    @Column(name="LIGNE1")
    private String ligne1;
    @Column(name="LIGNE2")
    private String ligne2;
    @Column(name="LIGNE3")
    private String ligne3;
    
    
    public Adresse() {}
    
    public Adresse(String ligne1, String cp, String ville) {
        this.ligne1 = ligne1;
        this.cp=cp;
        this.ville=ville;
    }
    public Adresse(String ligne1,String ligne2,String ligne3, String cp, String ville, String complementCedex) {
        this.ligne1 = ligne1;
        this.ligne2 = ligne2;
        this.ligne3 = ligne3;
        this.cp=cp;
        this.ville=ville;
        this.complementCedex = complementCedex;
    }
    
     @Override 
    public String toString() {
        return ligne1+(ligne2 != null ? ligne2+"\n":"" )
                +(ligne3 != null ? ligne3+"\n":"" )
                +cp+"\n"
                +ville+"\n"
                +(complementCedex != null ? complementCedex+"\n":"" );
    }
}
