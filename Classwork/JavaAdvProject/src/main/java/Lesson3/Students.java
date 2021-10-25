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
public class Students {
    
    private String firstName;
    private String lastName;
    private int age;
    private String repostitoryURL;

    public Students(String firstName, String lastName, int age, String repostitoryURL) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.repostitoryURL = repostitoryURL;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRepostitoryURL() {
        return repostitoryURL;
    }

    public void setRepostitoryURL(String repostitoryURL) {
        this.repostitoryURL = repostitoryURL;
    }

    public void display() {
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Age: " + getAge());
        System.out.println("Repository Link: " + getRepostitoryURL());
//        System.out.println("Attendence: " + getAttendence() + "\n");
    }
    
   
        
}
