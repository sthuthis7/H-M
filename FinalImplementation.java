final class A{
    int site=5;
    float money=30000f;
    String car="BMW";
    final int speed=200;
    final void gear(){
        System.out.println("5");
    }
}
// class B extends A{ -----> Cannot inherit from a Final class!!!
//     void gear(){
//         System.out.println("5");
//     }
// }
public class FinalImplementation {
    public static void main(String[] args) {
        A a =new A();
        a.gear();
        // B b=new B();
        // System.out.println((b.speed)); Cannot print since class cannot inherit the final class
        //b.speed =2000 cannot update since its a final.
        // b.gear();
    }
}
