package org.example.javaee.class03.aop;
import org.springframework.stereotype.Component;
import org.example.javaee.class03.jdbc.shjdbc;

@Component
public class addHomeworkImpl  implements addHomework {
    @Override
    public void addhomework(String id,String name){
        shjdbc.addStudent(id,name);
    }
}
