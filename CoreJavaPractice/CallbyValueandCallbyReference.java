package CoreJavaPractice;

public class CallbyValueandCallbyReference {
    // initializing global variable for Call by reference method
    int p=50;
    int q=60;
    public static void main(String[] args) {
        CallbyValueandCallbyReference cvcr=new CallbyValueandCallbyReference();
        // Call by Value part
        int i=4;
        System.out.println("Value before increment: "+i);
        // Calling the increment method
        cvcr.increment(i);
        // Value will not be incremented as the function does not hace refernce to the called function to return the value
        System.out.println("Value after increment: "+i);

        // Call by reference part
        // Here we are passing object reference itself it only has acces to global variables
        System.out.println("Before swap Value of p is: "+cvcr.p+ " and Value of q is:"+cvcr.q);
        cvcr.swap(cvcr);
        System.out.println("After swap Value of p is: "+cvcr.p+ " and Value of q is:"+cvcr.q);
    }
    // Function to understand Call by Value
    public int increment(int a){ 
        // Value is passed from call method 
        System.out.println("Value in method before increment: "+a);
        // increment of the passed value is done
        int c=a++;
        System.out.println("Value in method after increment: "+a);
        // returning value is not same as the incremented value as it is passed as copy
        // there no refernce to the called function this is called as "Call by Value method"
        return c;
    }
    // Function to understand Call by Reference method
    // Here we pass refernce of the class to refer to the called function
    // Now cvcr_ref and cvcr will have access to global variable 
    // cvcr_ref will act as pointer as in C++
    public void swap(CallbyValueandCallbyReference cvcr_ref){
        int temp;
        temp=cvcr_ref.p;//temp =50
        cvcr_ref.p=cvcr_ref.q;// p=60
        cvcr_ref.q=temp;// q=50
    }
}
