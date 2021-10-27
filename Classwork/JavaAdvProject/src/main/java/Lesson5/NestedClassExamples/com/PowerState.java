/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson5.NestedClassExamples.com;

/**
 *
 * @author Heino
 */
public enum PowerState {
    ON("The power usage is high"),
    OFF("The power is Off"),
    SUSPEND("The power usage is low");
    
    private String description;
    
    private PowerState(String d){
        description = d;
        
    }

    public String getDescription() {
        return description;
    }
    
    
}
