/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.util.List;

/**
 *
 * @author trainer
 */
public interface ClientDAO {
    void store(Client c);
    void delete(Integer id);
    Client findById(Integer id);
    List<Client> findAll();
}
