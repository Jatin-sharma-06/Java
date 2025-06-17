package Java.ObjectOrientedProgramming;

import org.w3c.dom.ls.LSOutput;

class Person{
    private String name = "Madhav";    // private string -> Restricted Access.
    private int age = 34;   // private integer -> Restricted Access



    public String getName(String name){    // get method -> This is used for access (read and print) the private data(like: name, age, etc.)
        System.out.println(age);    // print the private data age;
        return name;                // return name
    }

    public String setName(String newName, int newAge) {     // set method -> Set method is used to set the values for private variables.
                                                            //            -> It is used to store the data (variable's value)
        System.out.println(name);

        String myName = "rajan";
        this.name = myName;

        System.out.println(age);
        System.out.println(name);

        this.name = newName;    // assign value using the this pointer
        this.age = newAge;

        System.out.println(name);

        System.out.println(age);
        return name;
    }

}

public class Encapsulation_GetAndSet {
    public static void main(String[] args) {
        Person obj = new Person();

        String fname = obj.getName("raj");
        System.out.println(fname);

        String newfName = obj.setName("Pankaj", 39);
        System.out.println(newfName);



        System.out.println(newfName);

    }
}