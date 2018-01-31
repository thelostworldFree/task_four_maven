package com.fuwei.mapper;
 
import java.util.List;

import com.fuwei.pojo.Student;

public interface StudentMapper {
 
      
    public int add(Student student);

      
    public void delete(int id);  
       
      
    public Student get(int id);
     
      
    public int update(Student student);
       
      
    public List<Student> list();

    public int count(int state);
    

    
    
    
}