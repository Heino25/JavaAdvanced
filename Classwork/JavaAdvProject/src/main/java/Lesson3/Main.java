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
public class Main {
    public static void main(String[] args) {
        
        Students st1 = new GroupC("Heino", "du Plessis", 26, "heinoduplessis@gmail.com", true);
        Students st2 = new GroupC("Lesedi", "Sekakatlela", 20, "Lesdi@gmail.com", true);
        Students st3 = new GroupC("Elgin", "Something", 19, "Elgin@gmail.com", false);
        Students st4 = new GroupC("Fabio", "Patela", 22, "Fabio@gmail.com", true);
        
        
        if (st3 instanceof GroupC){
            ((GroupC)st3).setAttendence(true);
        }
        
        Students[] theStudents = {st1,st2,st3,st4};
        for (Students st : theStudents){
        st.display();

        
        }
    }
}
