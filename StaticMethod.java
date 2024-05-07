class A{
    static int x = 100;
    static void display(){
        System.out.println("Hi display!!");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        System.out.println(A.x);
        A.display();
    }
}
