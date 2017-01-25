/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Heber
 */
public class CourseTest {
    
    public CourseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of getAll method, of class Course.
     */
    @Test
    public void testCallingEmptyCourseConstructorGetAllShouldReturnEmptyList() {
        System.out.println("Calling No Args Constructor should return Empty List");
        Course instance = new Course();
        List<Student> expResult = null;
        List<Student> result = instance.getAll();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getAll method, of class Course.
     */
    @Test
    public void testCallingCourseConstructorGetAllShouldReturnSameList() {
        System.out.println("Calling Constructor with a List as parameter should return the List");
        Student instanceS = new Student("test", "testid", "testgender", 9999);
        Student instanceS2 = new Student("test2", "testid2", "testgender2", 99999);
        List<Student> instance = new ArrayList<>();
        instance.add(instanceS);
        instance.add(instanceS2);
        Course instanceC = new Course(instance);
        List<Student> expResult = instance;
        List<Student> result = instanceC.getAll();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getAll method, of class Course.
     */
    @Test
    public void testCallingEmptyCourseConstructorWithAddMethod() {
        System.out.println("Calling no Args Constructor then with the ADD  method add and dispaly with GetAll the same parameter");
        Student instanceS = new Student("test", "testid", "testgender", 9999);
        Course instanceC = new Course();
        instanceC.add(instanceS);
        List<Student> expResult = instance;
        List<Student> result = instanceC.getAll();
        assertEquals(expResult, result);
    }
    
    

    
}
