package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        AbstractApplicationContext con = new AnnotationConfigApplicationContext(Config.class);

        Student newStudent = con.getBean(Student.class);
        Phone newPhone = con.getBean(Phone.class);
        Address newAddress = con.getBean(Address.class);

        System.out.println("\n" + newStudent + "\n" + newPhone + "\n" + newAddress + "\n");
        con.close();
    }
}