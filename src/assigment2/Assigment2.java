/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author c0687631
 */
public class Assigment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //TEST
        
        Student nms2 = new Student("test", "testid", "testgender", 9999);
        Student nms3 = new Student("test2", "testid22", "testgender", 9999);
        
       
        
        Course instance = new Course();
        
        instance.add(nms2);
        instance.add(nms3);
        
        
        instance.remove("testid22");
       
        System.out.println(instance.getAll());
        
        
    }
    
}
