/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bellahuang
 */
public class StudentTest {
    
    public StudentTest() {
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
     * Test of the no-arg Student constructor, of class Student.
     */
    @Test
    public void testNoArgumentStudentConstructor(){
        Student instance = new Student();
        boolean expResult = true;
        boolean result = instance.getName()=="" && instance.getId()=="" && instance.getGender()=="" && instance.getGrade()==0;
        assertEquals(expResult, result);
    }
    
    /**
     * Test of the full Student constructor, of class Student.
     */
    @Test
    public void testFullStudentConstructor(){
        Student instance = new Student("Bob","c123456","male",89.5);
        boolean expResult = true;
        boolean result = instance.getName()=="Bob" && instance.getId()=="c123456" && instance.getGender()=="male" && instance.getGrade()==89.5;
        assertEquals(expResult, result);
    }
    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = new Student("Bob","c123456","male",89.5);
        String expResult = "Bob";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Bob";
        Student instance = new Student();
        instance.setName(name);
    }

    /**
     * Test of getId method, of class Student.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Student instance = new Student("Bob","c123456","male",89.5);
        String expResult = "c123456";
        String result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Student.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "c123456";
        Student instance = new Student();
        instance.setId(id);
    }

    /**
     * Test of getGender method, of class Student.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        Student instance = new Student("Bob","c123456","male",89.5);
        String expResult = "male";
        String result = instance.getGender();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGender method, of class Student.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        String gender = "male";
        Student instance = new Student();
        instance.setGender(gender);
    }

    /**
     * Test of getGrade method, of class Student.
     */
    @Test
    public void testGetGrade() {
        System.out.println("getGrade");
        Student instance = new Student("Bob","c123456","male",89.5);
        double expResult = 89.5;
        double result = instance.getGrade();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of setGrade method, of class Student.
     */
    @Test
    public void testSetGrade() {
        System.out.println("setGrade");
        double grade = 89.5;
        Student instance = new Student();
        instance.setGrade(grade);
    }

    /**
     * Test of equals method receives a non-Student object, of class Student.
     */
    @Test
    public void testEqualsMethodReceivesNonStudentObjectShouldReturnFalse() {
        System.out.println("a non-Student object");
        Object obj = null;
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method receives a Student object with the same name and id, of class Student.
     */
    @Test
    public void testStudentObjectWithSameNameAndIdShouldReturnTrue() {
        System.out.println("a Student object with the same name and id as the instance");
        
        Student instance1 = new Student("Bob","c123456","male",89.5);
        Student instance2 = new Student("Bob","c123456","male",90);
        boolean expResult = true;
        boolean result = instance1.equals(instance2);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method receives a Student object with the same name but a different id than the instance, of class Student.
     */
    @Test
    public void testStudentObjectWithSameNameButDifferentIdShouldReturnFalse() {
        System.out.println("a Student object with the same name but a different id than the instance");
        
        Student instance1 = new Student("Bob","c123456","male",89.5);
        Student instance2 = new Student("Bob","c12345","male",90);
        boolean expResult = false;
        boolean result = instance1.equals(instance2);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method receives a Student object with the same id but a different name than the instance, of class Student.
     */
    @Test
    public void testStudentObjectWithSameIdButDifferentNameShouldReturnFalse() {
        System.out.println("a Student object with the same id but a different name than the instance");
        
        Student instance1 = new Student("Bob","c123456","male",89.5);
        Student instance2 = new Student("Tom","c123456","male",90);
        boolean expResult = false;
        boolean result = instance1.equals(instance2);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method receives a Student object with both a different name and a different name than the instance, of class Student.
     */
    @Test
    public void testStudentObjectWithDifferentNameAndDifferentIdShouldReturnFalse() {
        System.out.println("a Student object with both a different name and a different id than the instance");
        
        Student instance1 = new Student("Bob","c123456","male",89.5);
        Student instance2 = new Student("Tom","c456789","male",90);
        boolean expResult = false;
        boolean result = instance1.equals(instance2);
        assertEquals(expResult, result);
     }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Student instance = new Student("Bill Smith", "c0123456","male",89.3);
        String expResult = "{\"Name\":\"Bill Smith\",\"Id\":\"c0123456\",\"Gender\":\"male\",\"Grade\":89.3}";
        String result = instance.toString();
        assertEquals(expResult, result);
     }
}
