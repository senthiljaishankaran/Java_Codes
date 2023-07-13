package CoreJavaPractice.Interface;

public class Test {
    public static void main(String[] args) {
        // Compile-time Polymorphism
        // Using Static Polymorphism we can access all the implemented method and child class method too
        
        ICICIBank icb=new ICICIBank();
        icb.Debit_card();
        icb.credit_card();
        icb.interest_US();
        icb.interest_UK();
        icb.international_card();
        icb.Education_loan();
        icb.Home_loan();
        // Static variable initialized in interface can be accesed by implemented class variable
        // But it will generate a warning since variable initialised in interface is static, it is good practice to access it with interface name
        //System.out.println(icb.min_balance_US);
        //System.out.println(icb.min_balance_UK);
        System.out.println(USBank.min_balance_US);
        System.out.println(UKBank.min_balance_UK);

        // Run-time polymorphism 
        // Using Dynamic polymorphism we can only access the interface methods and methods of implemented class will not be availble 

        USBank usb=new ICICIBank();
        // We can access static variable
        System.out.println(USBank.min_balance_US);
        System.out.println(UKBank.min_balance_UK);
        // can only access methods in USBank interface
        usb.Debit_card();
        usb.credit_card();
        usb.interest_US();
        // below will generate error as it cannot access the following methods which is ICICI bank methods
        //usb.Education_loan();
        //usb.Home_loan();
        // similar condition for UKBank object refernce also
    }
}
