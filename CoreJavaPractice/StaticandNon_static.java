package CoreJavaPractice;

public class StaticandNon_static{
    static int age=29; // static variable
    String name="senthil"; // Non-static variable
    public static void main(String[] args) {
        // method to access static method and variable
        // Direct access
        id();
        System.out.println(age);
        
        // Accessing using class name
        StaticandNon_static.id();
        System.out.println(StaticandNon_static.age);

        // method to reference Non-Static method and variable
        StaticandNon_static sn=new StaticandNon_static();
        System.out.println(sn.name);
        sn.salary();

        // Can we refernce Stactic variable and method using class object
        // Yes,but it will generate warning and it is not a good practice
        //sn.id(); // generating warning
        //System.out.println(sn.age); // generating warning
    }
    public static void id(){
        // Static method
        System.out.println("id is 777");
    }
    public void salary(){
        //Non-static method
        System.out.println("salary is 10000");
    }
}