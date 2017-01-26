/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.simple.JSONObject;
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
        List<Student> expResult = Collections.EMPTY_LIST;
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
        List<Student> expResult = instanceC.students;
        List<Student> result = instanceC.getAll();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getAll method, of class Course.
     */
    @Test
    public void testRemoveMethodWithStudentAsParameter() {
        System.out.println("Calling method with Student as Parameter and removing it");
        Student instanceS = new Student("test", "testid", "testgender", 9999);
        Student instanceS2 = new Student("test2", "testid2", "testgender2", 99999);
        List<Student> instance = new ArrayList<>();
        instance.add(instanceS);
        instance.add(instanceS2);
        Course instanceC = new Course(instance);
        instanceC.remove(instanceS2);
        List<Student> expResult = instance;
        List<Student> result = instanceC.getAll();
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of getAll method, of class Course.
     */
    @Test
    public void testRemoveMethodWithStudentAsParameterAndId() {
        System.out.println("Calling method with Student as Parameter and removing it");
        Student instanceS = new Student("test", "testid", "testgender", 9999);
        Student instanceS2 = new Student("test2", "testid2", "testgender2", 99999);
        List<Student> instance = new ArrayList<>();
        instance.add(instanceS);
        instance.add(instanceS2);
        Course instanceC = new Course(instance);
        instanceC.remove("testid");
        List<Student> expResult = instance;
        List<Student> result = instanceC.getAll();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getAll method, of class Course.
     */
    @Test
    public void testRemoveMethodWithStudentAsParameterAndPosition() {
        System.out.println("Calling method with Posistion as Prameter");
        Student instanceS = new Student("test", "testid", "testgender", 9999);
        Student instanceS2 = new Student("test2", "testid2", "testgender2", 99999);
        List<Student> instance = new ArrayList<>();
        instance.add(instanceS);
        instance.add(instanceS2);
        Course instanceC = new Course(instance);
        instanceC.remove(1);
        List<Student> expResult = instance;
        List<Student> result = instanceC.getAll();
        assertEquals(expResult, result);
    }
    
     /**
     * Test of getAll method, of class Course.
     */
    @Test
    public void testInstertMethodwithStudent() {
        System.out.println("Calling method with Posistion as Prameter");
        Student instanceS = new Student("test", "testid", "testgender", 9999);
        Student instanceS2 = new Student("test2", "testid2", "testgender2", 99999);
        List<Student> instance = new ArrayList<>();
        instance.add(instanceS);
        instance.add(instanceS2);
        Course instanceC = new Course(instance);
        instanceC.insert(instanceS, 0);
        List<Student> expResult = instance;
        List<Student> result = instanceC.getAll();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getAll method, of class Course.
     */
    @Test
    public void testGetMethodwithvalidStudent() {
        System.out.println("Calling Get with valid Student Return Student");
        String id = "testid";
        Student instanceS = new Student("test", "testid", "testgender", 9999);
        Student instanceS2 = new Student("test2", "testid2", "testgender2", 99999);
        List<Student> instance = new ArrayList<>();
        instance.add(instanceS);
        instance.add(instanceS2);
        Course instanceC = new Course(instance);
        Student expResult = instanceS;
        Student result = instanceC.get(id);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getAll method, of class Course.
     */
    @Test
    public void testGetMethodwithinvalidStudentExpectedNull() {
        System.out.println("Calling Get with invalid Student Return Null");
        String id = "7879765486";
        Student instanceS = new Student("test", "testid", "testgender", 9999);
        List<Student> instance = new ArrayList<>();
        instance.add(instanceS);
        Course instanceC = new Course(instance);
        Student expResult = null;
        Student result = instanceC.get(id);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getAll method, of class Course.
     */
    @Test
    public void testGetMethodwithPositionExpectedStudent2222() {
        System.out.println("Calling Get with POsition  Return Valid Student");
        int Position = 0;
        Student instanceS = new Student("test", "testid", "testgender", 9999);
        List<Student> instance = new ArrayList<>();
        instance.add(instanceS);
        Course instanceC = new Course(instance);
        Student expResult = instanceS;
        Student result = instanceC.get(Position);
        assertEquals(expResult, result);
    }
    
     /**
     * Test of getAll method, of class Course.
     */
    @Test
    public void testGetMethodwithPositionExpectedStudent() {
        System.out.println("Calling Get with POsition  Return Valid Student");
        int Position = 0;
        Student instanceS = new Student("test", "testid", "testgender", 9999);
        List<Student> instance = new ArrayList<>();
        instance.add(instanceS);
        Course instanceC = new Course(instance);
        Student expResult = instanceS;
        Student result = instanceC.get(Position);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getAll method, of class Course.
     */
    @Test
    public void testGetMethodwithPositiongreaterthansizeExpectedNull() {
        System.out.println("Calling Get with position greater than size Expect Null");
        int Position = 4;
        Student instanceS = new Student("test", "testid", "testgender", 9999);
        List<Student> instance = new ArrayList<>();
        instance.add(instanceS);
        Course instanceC = new Course(instance);
        Student expResult = null;
        Student result = instanceC.get(Position);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getAll method, of class Course.
     */
    @Test
    public void testGetMethodwithPositionlessthansizeExpectedNull() {
        System.out.println("Calling Get with position greater than size Expect Null");
        int Position = -1;
        Student instanceS = new Student("test", "testid", "testgender", 9999);
        List<Student> instance = new ArrayList<>();
        instance.add(instanceS);
        Course instanceC = new Course(instance);
        Student expResult = null;
        Student result = instanceC.get(Position);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getAll method, of class Course.
     */
    @Test
    public void testEqualsMethodreturnTrue() {
        System.out.println("Calling equals method with a Curse Object should Return Ture");
        Student instanceS = new Student("test", "testid", "testgender", 9999);
        List<Student> instance = new ArrayList<>();
        instance.add(instanceS);
        Course instanceC = new Course(instance);
        Course test = new Course(instance);
        Boolean expResult = true;
        Boolean result = instanceC.equals(test);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getAll method, of class Course.
     */
    @Test
    public void testEqualsMethodreturnFalse() {
        System.out.println("Calling equals method with a Non-Curse Object should Return False");
        Student instanceS = new Student("test", "testid", "testgender", 9999);
        List<Student> instance = new ArrayList<>();
        instance.add(instanceS);
        Course instanceC = new Course(instance);
        Object test = new Student();
        Boolean expResult = false;
        Boolean result = instanceC.equals(test);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getAll method, of class Course.
     */
    @Test
    public void testEqualsMethodreturnFalseDiffList() {
        System.out.println("Calling equals method with a Curse Object with different lists should Return False");
        Student instanceS = new Student("test", "testid", "testgender", 9999);
        Student instanceS2 = new Student("test4", "testsame", "male", 679999);
        List<Student> instance = new ArrayList<>();
        List<Student> instance2 = new ArrayList<>();
        Course instanceC = new Course(instance);
        Course test = new Course(instance2);
        Boolean expResult = false;
        Boolean result = instanceC.equals(test);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testToString() {
        try {
            Student instance = new Student("Bill Smith", "c0123456", "male", 89.3);
            JSONObject expResult = (JSONObject) new JSONParser().parse("{\"name\":\"Bill Smith\",\"id\":\"c0123456\"},\"gender\":\"male\",\"grade\":\"89.3}");
            JSONObject result = (JSONObject) new JSONParser().parse(instance.toString());
            assertEquals(expResult, result);
        } catch (ParseException ex) {
            fail("One of the JSON Objects is invalid JSON. Go to jsonlint.com to find out why.");
        }
    
    
    
    
    
    

    
}
