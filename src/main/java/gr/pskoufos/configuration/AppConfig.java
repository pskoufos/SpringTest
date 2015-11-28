/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.pskoufos.configuration;

import gr.pskoufos.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author administrator
 */
@Configuration
@ComponentScan (basePackages = "gr.pskoufos")
public class AppConfig {
      
       @Bean 
       public Person mPerson (){
           return new Person("Panos Skoufos") ; 
       }
               
              
    }
