package org.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        AbstractApplicationContext con = new ClassPathXmlApplicationContext("Student.xml");

        Student newStudent = (Student) con.getBean("student");
        Phone newPhone = (Phone) con.getBean("phone");
        Address newAddress = (Address) con.getBean("address");

        System.out.println("\n" + newStudent + "\n" + newPhone + "\n" + newAddress + "\n");
        con.close();
    }
}