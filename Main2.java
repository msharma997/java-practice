// Parent class
class Bank {
    void interestRate() {
        System.out.println("Bank interest rate");
    }
}

// SBI class
class SBI extends Bank {
    @Override
    void interestRate() {
        System.out.println("SBI Interest Rate: 6%");
    }
}

// HDFC class
class HDFC extends Bank {
    @Override
    void interestRate() {
        System.out.println("HDFC Interest Rate: 10%");
    }
}

// ICICI class
class ICICI extends Bank {
    @Override
    void interestRate() {
        System.out.println("ICICI Interest Rate: 12%");
    }
}

// Main class
public class Main2 {
    public static void main(String[] args) {

        // Parent reference holding child objects
        Bank b;

        b = new SBI();
        b.interestRate();

        b = new HDFC();
        b.interestRate();

        b = new ICICI();
        b.interestRate();
    }
}
