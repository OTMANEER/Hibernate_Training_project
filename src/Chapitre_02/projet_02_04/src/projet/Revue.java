/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
    name="typeouvrage",
    discriminatorType=DiscriminatorType.STRING
)        
@DiscriminatorValue("ouvrage")
class Ouvrage {
    @Id
    @Column(name="ID")
    private int id;
     
    private String titre;
    
    public Ouvrage() {}
    
    public Ouvrage(String titre) {this.titre=titre;}
}

@DiscriminatorValue("revue")
class Revue extends Ouvrage{
    
    private String frequence;
    
    Revue() {}
    
    Revue(String titre, String frequence) {
        super(titre);
        this.frequence=frequence;
    }
    
}
