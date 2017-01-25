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

/**
 *
 * @author Nisarg
 */
public class Course {
    
     public List<Student> students;

    public Course() {
        this.students = new ArrayList<>();
    }

    public Course(List<Student> students) {
        this.students = students;
    }

    public void add(Student student) {
        
        this.students.add(student);
    }

    public void remove(Student student) {
            
        this.students.remove(student);
    }

    public void remove(String id) {
        for (Student student : students) {
            if(student.getId().contains(id))
            {
                this.students.remove(student);
            }
        }
        
    }

    public void remove(int position) {

    }

    public void insert(Student student, int position) {

    }

    public Student get(String id) {
        
        return null;

    }

    public Student get(int position) {
        return null;
    }

    public List<Student> getAll() {
        return this.students;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public String toString() {
        return "";
    }

    public Set<Student> getAllByGender(String gender) {
        return null;
    }

    public Map<String, Set<Student>> getGradeMap() {
        return null;
    }
    
}
