import java.util.Scanner;;
public class Demo2 {
    public static void main(String[] args) {
        int choice=0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("-----------------Available choices-----------------\n1. Developer\n2. Clerk\n3. Exit");
            System.out.println("---------------------------------------------------");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            System.out.println("---------------------------------------------------");
            if (choice==1){
                Dev d = new Dev();
                d.display();
                System.out.println("---------------------------------------------------");
            }
            else if (choice==2){
                Clerk c = new Clerk();
                c.display();
                System.out.println("---------------------------------------------------");
            }
            else if (choice==3){
                System.out.println("---------------------------------------------------");
                System.out.println("Thank you!");
                System.exit(0);
                System.out.println("---------------------------------------------------");
            }
            else{
                System.out.println("---------------------------------------------------");
                System.out.println("Invalid Choice!!");
                System.out.println("---------------------------------------------------");
            }
            
        }while(choice!=3);
    }
}

class Dev{
    int id;
    String name;
    String designation="Developer";
    int age;
    float salary=1200000;
    Dev()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your First Name:");
        name= sc.next();

        System.out.println("Enter your ID:");
        id=sc.nextInt();

        System.out.println("Enter your Age:");
        age=sc.nextInt();

           
    }
    void display()
    {   
        System.out.println("---------------------------------------------------");
        System.out.println("*****************Developer Details*****************");
        System.out.println("ID:\t\t"+id);
        System.out.println("Name:\t\t"+name);
        System.out.println("Salary:\t\t"+salary);
        System.out.println("Age:\t\t"+age);
        System.out.println("Designation:\t"+designation);
    }
}
class Clerk{
    int id;
    String name;
    String designation="Clerk";
    int age;
    float salary=600000;
    Clerk()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Name:");
        name= sc.next();

        System.out.println("Enter your ID:");
        id=sc.nextInt();

        System.out.println("Enter your Age:");
        age=sc.nextInt();

    }
    void display()
    {   
        System.out.println("---------------------------------------------------");
        System.out.println("*****************Clerk Details*****************");
        System.out.println("ID:\t\t"+id);
        System.out.println("Name:\t\t"+name);
        System.out.println("Salary:\t\t"+salary);
        System.out.println("Age:\t\t"+age);
        System.out.println("Designation:\t"+designation);
    }
}