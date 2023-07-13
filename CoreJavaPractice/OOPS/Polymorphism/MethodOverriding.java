package CoreJavaPractice.OOPS.Polymorphism;
// Example of Run-time polymorphism with multi-elevel inheritance

class Animal{
    public void eat(){
        System.out.println("eating");
    } 
}
class Dog extends Animal{
    public void eat(){
        System.out.println("eating dog food");
    }
}
class Babydog extends Dog{
    public void eat(){
        System.out.println("Drinking milk");
    }
} 

public class MethodOverriding {
    public static void main(String[] args) {
        Animal dog=new Dog();
        Animal baby_dog = new Babydog();
        baby_dog.eat();
        dog.eat();
    }
}
