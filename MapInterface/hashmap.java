/*
 * HashMap implements MapInterface and Extends AbstractInterface
 * It can't have duplicate elements
 * It stores values in key and value pair format
 * It can have only one null key but multiple null values
 * It maintains no order
 * HashMap is Non-Synchronised suited for multithreading environment not thread safe
 * Due to multithreading if the a thread modifies the data and the second thread accessing it will
 * get the modifies value but it will expecting the older value
 * This above condition will trigger Concurrent Modification Exception
 * The above condition is also called "fail fast condition"
 */
package MapInterface;

import java.util.HashMap;
import java.util.Map.Entry;

public class hashmap {
    public static void main(String[] args) {
        // Creating class object and object variable for the Mapinterface class with HashMap 
        HashMap <Integer,String> hm=new HashMap<Integer,String>();
        // Storing values in the key specified using put method
        hm.put(1,"Senthil");
        hm.put(2,"Suresh");
        hm.put(3,"Ashok");
        // Retrieving values based on the key specified with get method
        System.out.println("getting specified jkey and value");
        System.out.println(hm.get(1));

        // Using for each loop to iterate through the hashmap
        System.out.println("Iterating throughHashMap using foreach loop");
        for (Entry en : hm.entrySet()) {
            System.out.println(en.getKey()+" "+en.getValue());
        }

        // Removing Data from HashMap
        System.out.println("Before removing data from the HashMap");
        System.out.println(hm);
        System.out.println("Removing data from HashMap");
        hm.remove(3);
        System.out.println(hm);

        // HashMap explanation with datatype as well as Class passing
        // Creating an employee object
        Employee e1=new Employee("Senthil", 29, 1000);
        Employee e2 =new Employee("Suresh", 29, 800000);
        Employee e3=new Employee("Ashok", 30, 10000000);

        // Creating HashMap for new data
        // Adding Employee class into HashMap
        HashMap<Integer,Employee> hm1=new HashMap<Integer,Employee>();
        hm1.put(1,e1);
        hm1.put(2,e2);
        hm1.put(3,e3);

        // for traversing in the second HashMap
        for(Entry<Integer,Employee> en1 : hm1.entrySet()) {
            int key=en1.getKey();
            Employee e=en1.getValue();
            System.out.println(key +" Info ");
            System.out.println(e.name+" "+e.age+" "+e.salary);
        }

    }
}

// Creating a class Employee for HashMap explanation
class Employee{
    String name;
    int age;
    int salary;
    Employee(String name,int age,int salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
}
