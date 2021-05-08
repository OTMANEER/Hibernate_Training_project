/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author trainer
 */
@Configuration
@ComponentScan
public class ApplicationConfig {
    
    //équivalent de "infos" -> "projet.InfosXML"
    @Bean
    public InfosInterface infos() {
        return new InfosXML();
    }
}
