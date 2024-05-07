//Constructor overloading: The constructor overloading can be defined as the concept of having more than one constructor with different parameters so that every constructor can perform a different task.
class C{
    C(){
        System.out.println("C()");
    }
    C(int a){
        System.out.println("C(int a)");
    }
    C(int a, int b){
        System.out.println("C(int a,int b)");
    }
    C(String c, int a){
        System.out.println("C(String c, int a)");
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        C c = new C();
        C c1=new C(100);
        C c2=new C(22,23);
        C c3=new C("Hello",22);
    }
}
