import java.util.ArrayList;
import java.util.Iterator;

public class ArList {
    public static void main(String[] args) {
        // Below the array is static array as the size of the array is defined
        int arr[] =new int[3];
        arr[0] =5;
        arr[1] =7;
        arr[2] =3;
        //arr[3]=6;
        // above as i have added 3 index which is define it will throw arrayoutofbound Exception 
        // method 1 to print the arrays
        System.out.println("Method 1 to print all the arrays");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // method 2 to print all the arrays is for loop
        System.out.println("Method 2 to print arrays using for loop");
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);

        // Below method is the collection method for Arrays called ArrayList
        // Array implements List interface and List interface in-turn implements Collection interface
        // Collection interface again implements iterable
        // Warning will be generated due to non-generic usage of ArrrayList
        // Syntax
        // non-generic interface - which means the all datatypes are allowed in the list
        System.out.println("Printing non-generic arraylist");
        ArrayList al =new ArrayList();
        al.add(100);
        al.add(200);
        System.out.println(al.size());
        System.out.println(al.get(0));
        System.out.println(al.get(1));

        // Generic interface - Which allows only defined datatype
        // Here we can use only integer type data to be added 
        System.out.println("Printing generic arraylist");
        ArrayList<Integer>arl=new ArrayList<Integer>();
        arl.add(300);
        arl.add(200);
        System.out.println(al.size());
        System.out.println(arl.get(0));
        System.out.println(arl.get(1));
        
        // Printing methods

        // Using for loop for non-generic
        System.out.println("Output from for loop for non-generic");
        for(int g=0;g<al.size();g++)
        System.out.println(al.get(g));

        // Using Iterator for non-generic
        System.out.println("Output from Iterator for non-generic");
        Iterator itr1=al.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

        // Using for each loop for non-generic
        // System.out.println("Output from for each for generic");
        // for(Integer it:al){
        // }
        //Above will generate error because non-generic arraylist doesn't support datatype
        // But it will work with generic ArrayList

        // Using for loop for generic
        System.out.println("Output from for loop for generic");
        for(int i=0;i<arl.size();i++){
            System.out.println(arl.get(i));
        }

        //Iterator for generic method
        System.out.println("Output from Iterator for generic");
        Iterator itr =arl.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("output from for each for generic");
        for(Integer it:arl){
            System.out.println(it);
        }

    // Using Class as a data type
    // Creating a class instance to access the data
    Employee e1=new Employee("Senthil", 29, 10000);
    Employee e2=new Employee("Suresh", 29, 800000000);
    Employee e3=new Employee("Ismail", 29, 40);
    // creating ArrayList with class as datatype
    ArrayList<Employee> emp=new ArrayList<Employee>();
    emp.add(e1);
    emp.add(e2);
    emp.add(e3);
    Iterator itr2=emp.iterator();
    while(itr2.hasNext()){
        Employee emp2=(Employee)itr2.next();
        System.out.println(emp2.Employee_name+" "+emp2.age +" "+emp2.salary);
    }

    // addall() method
    // List 1 for adding
    ArrayList<String> ada=new ArrayList<String>();
    ada.add("Java");
    ada.add("C++");
    ada.add("C");
    // List 2 for adding
    ArrayList<String> ada2=new ArrayList<String>();
    ada2.add("Javascript");
    ada2.add("python");

    // Using add.all() method
    System.out.println("Adding all the items in ada & ada2");
    ada.addAll(ada2);
    for(int i=0;i<ada.size();i++)
    System.out.println(ada.get(i));
    
    // Using removeAll() method
    System.out.println("Removing all items in ada");
    ada.removeAll(ada2);
    for(int j=0;j<ada.size();j++)
    System.out.println(ada.get(j));

     // List 3 for Retaining
    ArrayList<String> ada3=new ArrayList<String>();
    ada3.add("Java");
    ada3.add("C++");
    ada3.add("C");
    // List 2 for Retaining
    ArrayList<String> ada4=new ArrayList<String>();
    ada4.add("Java");
    ada4.add("python");

    //Using retainAll() method
    System.out.println("Retaining all items in ada");
    ada3.retainAll(ada4);
    for(int k=0;k<ada3.size();k++)
    System.out.println(ada3.get(k));

    }
    // ArrayList Properties
    // 1. Can contain duplicate values/elements
    // 2. Maintians insertion order
    // 3. Not Synchronized
    // 4. Best for Random access to all elements
    // 5. Stores values on basis of Index
    // 6. ArrayList slower than LinkedList in manipulation since lot of shifting need to be
    // done if any insertion or deletion is done in the array
    // 7. ArrayList is better for storing and accessing
    // 8. Requires less memory compared to LinkedList
}
class Employee{
    String Employee_name;
    int age;
    int salary;

    Employee(String Employee_name, int age, int salary){
        this.Employee_name=Employee_name;
        this.age=age;
        this.salary=salary;
    }
}
