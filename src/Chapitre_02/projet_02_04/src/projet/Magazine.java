/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
class Papier {
    
}

@Entity
@PrimaryKeyJoinColumn(name="MAGAZINEID")
class Magazine extends Papier {
    
}
