/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson3;

/**
 *
 * @author Heino
 */
public class GroupC extends Students {
    
    private boolean attendence;
    
    public GroupC(String firstName, String lastName, int age, String repostitoryURL, boolean attendence){
        super(firstName, lastName, age, repostitoryURL);
        this.attendence = attendence;
}
    
    public GroupC(String firstName, String lastName, int age, String repostitoryURL){
        super(firstName, lastName, age, repostitoryURL);
        
}

   
    public boolean getAttendence() {
        return attendence;
    }

    public void setAttendence(boolean attendence) {
        this.attendence = attendence;
   
    }
    
    public void display(){
        super.display();
        System.out.println("Attendence: " + getAttendence() + "\n");
    }

}
