class Demo1
{
    public static void main(String args[])
    {
        System.out.println("Hi welcome to Java class!");
        A a = new A();
    }
}
class A{
    A()
    {
        System.out.println("This is A class");
        B b = new B();
    }
}
class B{
    B()
    {
        System.out.println("This is B class");
    }
}