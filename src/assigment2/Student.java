/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment2;

import java.util.Objects;

/**
 *
 * @author c0690651
 */
public class Student {
    
    private String name;
    private String id;
    private String gender;
    private double grade;
    
    public Student(){
        name = "";
        id = "";
        gender = "";
        grade = 0;
        
    }

    public Student(String name, String id, String gender, double grade) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public double getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    
    @Override
     public boolean equals(Object obj){
        
        if(obj == null){
            return false;
        }
        
        if(getClass() != obj.getClass()){
            return false;
        }
        
        final Student other = (Student) obj;
        
        if(!Objects.equals(this.name, other.name)){
            return false;
        }
        
        if(!Objects.equals(this.id, other.id)){
            return false;
        }        
             
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + Objects.hashCode(this.id);
        return hash;
    }
     
    @Override
      public String toString(){
          
        return ("{\"Name\":\""+name+"\",\"Id\":\""+id+"\",\"Gender\":\""+gender+"\",\"Grade\":"+grade+"}");
         
      }  
}
