//Method Overriding: 
class Bank {
    public int roi() {
        return 10;
    }
}

class SBI extends Bank {

}

class HDFC extends Bank {
    public int roi() {
        return 12;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        SBI s = new SBI();
        int s_roi = s.roi();
        System.out.println("--------------------------------");
        System.out.println("SBI Rate of interest: \t" + s_roi + "%");

        HDFC h = new HDFC();
        int h_roi = h.roi();
        System.out.println("--------------------------------");
        System.out.println("HDFC Rate of interest: \t" + h_roi + "%");
        System.out.println("--------------------------------");
    }
}
