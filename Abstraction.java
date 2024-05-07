//Abstract will force you to override, no one can surpass by not calling the function.
abstract class Bank{
    abstract void ATM();
    abstract void KYC();
}
class SBI extends Bank{
    void ATM(){
        System.out.println("\tSBI Bank: \tLimit is set to $50000");
    }
    void KYC(){
        System.out.println("\tSBI Bank: \tKYC is required");
    }
}
class Axis extends Bank{
    void ATM(){
        System.out.println("\tAxis Bank: \tLimit is set to $25000");
    }
    void KYC(){
        System.out.println("\tAxis Bank: \tKYC is required");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------");
        SBI s = new SBI();
        s.ATM();
        s.KYC();
        System.out.println("------------------------------------------------------");
        Axis a = new Axis();
        a.ATM();
        a.KYC();
        System.out.println("------------------------------------------------------");
    }
}
