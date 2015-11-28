/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.pskoufos.controler;

import gr.pskoufos.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author administrator
 */
@Controller
 class IndexControler {
    
    //autowire the Person Bean from AppConfig.java to the Controler Class
    @Autowired
    Person cPerson ; 
    
    @SuppressWarnings("SameReturnValue")
    @RequestMapping(value = {"/","/2"}, method = RequestMethod.GET)
    @ResponseBody
    public String showIndex (){
        //return "New message panos !!!!....";
        return cPerson.GetName();
    }
    
    
    @RequestMapping(value = "/view", method= RequestMethod.GET)
    @ResponseBody
    public String showView (){
        return "New VIEW 1111111111111" ; 
    }
    
}
 