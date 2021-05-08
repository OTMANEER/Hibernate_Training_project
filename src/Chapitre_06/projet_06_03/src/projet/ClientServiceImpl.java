/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author trainer
 */
@Service
public class ClientServiceImpl implements ClientService {
    
    
    private ClientDAO dao;
    
    public void setClientDAO(ClientDAO dao) {
        this.dao=dao;
    }
    
    @Transactional
    @Override
    public void store(Client c) {
     
          dao.store(c);
      
    }
    @Transactional
    @Override
    public void delete(Integer id) {
    
         dao.delete(id);
      
    }
    
    @Transactional(readOnly=true)
    @Override
    public Client findById(Integer id) {
       
          return dao.findById(id);
     
    }

    
    @Transactional(readOnly=true)
    @Override
    public List<Client> findAll() {
       
        return dao.findAll();
     
    }
}
