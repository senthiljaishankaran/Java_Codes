package CoreJavaPractice.OOPS.Polymorphism;
// Example of Compile-time polymorphism
public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading mo=new MethodOverloading();
        mo.sum();
        mo.sum("senthil");
        mo.sum(3);
        mo.sum("kumar", 5);
    }
    public void sum(){
        // method wit no params
        System.out.println("no paramaters...");
    }
    public void sum(String str){
        // method with one params string
        System.out.println("String paramaters...");
        System.out.println(str);
    }
    public void sum(int i){
        // method with one params int
        System.out.println("int paramaters...");
        System.out.println(i);
    }
    public void sum(String s, int k){
        // method with 2 params
        System.out.println("Both paramaters...");
        System.out.println(s+" "+k);
    }
    public static void main(int i) {
        // main method can also be overloaded
        System.out.println("main method 2");
        MethodOverloading mo2=new MethodOverloading();
        mo2.sum();
        // but this main() method will not be called by JVM
        // the main() method with string array will be called by JVM
    }
}
