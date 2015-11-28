/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.pskoufos.model;

/**
 *
 * @author administrator
 */
public class Person implements InterfacePerson {
    private String ImName ; 
    private Integer IID ; 

    @Override
    public String GetName() {
        return IID + "-" + ImName; 
    }


    public Person(String mName) {
        this.ImName = mName;
    }


    public Person(Integer SocialNumer) {
        this.IID = SocialNumer;
    }

    
    
    
}
