package java_prac;

import java.sql.SQLOutput;

public class InstanceOf {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = new Parent();

        if(child instanceof Child){
            System.out.println("Child is instance of Child");
        }

        if(parent instanceof Parent)
        {
            System.out.println("Parent is instance of Parent");
        }

        if(parent instanceof Child)
        {
            System.out.println("Parent is instance of child");
        }

        if(child instanceof Parent)
        {
            System.out.println("Child is instance of Parent");
        }
        if(child instanceof Object)
        {
            System.out.println("Child is instance of Object");
        }

        Parent p = new Child();

        if(p instanceof Child) {
            ((Child) p).Child();

        }
    }

}

class Child extends Parent{
    void Child(){
        System.out.println("This is child class");
    }
}

class Parent {
    void Parent(){
        System.out.println("This is parent class");
    }
}