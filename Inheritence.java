//Single Level Inheritence:
class Parent{
    int money=200000;
    String car="BMW";
    private String newCar="BENZ";
    int site=5;

    void use(){
        System.out.println("--------Parent Data---------");
        System.out.println("Money:\t\t$"+money);
        System.out.println("Car:\t\t"+car);
        System.out.println("Site:\t\t"+site);
        System.out.println("New Car:\t"+newCar);
    }
}

class Child extends Parent{
    int money=10000;
    void use(){
        System.out.println("---------Child Data---------");
        System.out.println("Money:\t\t$"+money);
        System.out.println("Parent Money:\t$"+super.money);
        System.out.println("Parent Car:\t"+car);
        System.out.println("Parent Site:\t"+site);
        //System.out.println("Parent New Car:\t"+newCar); --> error since the newCar is made private
    }
}

public class Inheritence {
    public static void main(String args[]){
        System.out.println("********Inheritence*********");
        Parent p=new Parent();
        p.use();
        Child c = new Child();
        c.use();
    }
}
