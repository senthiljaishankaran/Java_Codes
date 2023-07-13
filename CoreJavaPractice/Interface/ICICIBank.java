package CoreJavaPractice.Interface;

public class ICICIBank implements UKBank,USBank {

// methods for implementing US bank
    @Override
    public void credit_card() {
        System.out.println("from US bank method credit card");
    }

    @Override
    public void Debit_card() {
        System.out.println("from US bank method Debit card");
    }

    @Override
    public void interest_US() {
        System.out.println("from US bank method interest");
    }

// methods for implementing UK bank
    @Override
    public void interest_UK() {
        System.out.println("from UK bank method interest");
    }

    @Override
    public void international_card() {
         System.out.println("from UK bank method international card");
    }

// Own methods of ICICI bank
    public void Education_loan(){
        System.out.println("ICICI edu-loan method");
    }

    public void Home_loan(){
        System.out.println("ICICI home-loan method");
    }
    
}
