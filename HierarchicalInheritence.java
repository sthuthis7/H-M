import java.util.Scanner;

class Emp {
    int id;
    String name;
    int age;

    Emp() {

        Scanner sc = new Scanner(System.in);

        System.out.println("---------------------------------------------------");
        System.out.println("Enter your First Name:");
        name = sc.next();

        System.out.println("Enter your ID:");
        id = sc.nextInt();

        System.out.println("Enter your Age:");
        age = sc.nextInt();
    }
}

class Dev extends Emp {

    String designation = "Developer";

    float salary = 1200000;

    Dev() {
    }

    void display() {
        System.out.println("---------------------------------------------------");
        System.out.println("*****************Developer Details*****************");
        System.out.println("ID:\t\t" + id);
        System.out.println("Name:\t\t" + name);
        System.out.println("Salary:\t\t" + salary);
        System.out.println("Age:\t\t" + age);
        System.out.println("Designation:\t" + designation);
    }
}

class Clerk extends Emp {
    String designation = "Clerk";
    float salary = 600000;

    Clerk() {

    }

    void display() {
        System.out.println("---------------------------------------------------");
        System.out.println("*******************Clerk Details*******************");
        System.out.println("ID:\t\t" + id);
        System.out.println("Name:\t\t" + name);
        System.out.println("Salary:\t\t" + salary);
        System.out.println("Age:\t\t" + age);
        System.out.println("Designation:\t" + designation);
    }
}

class Manager extends Emp {
    String designation = "Manager";
    float salary = 1800000;

    Manager() {

    }

    void display() {
        System.out.println("---------------------------------------------------");
        System.out.println("******************Manager Details******************");
        System.out.println("ID:\t\t" + id);
        System.out.println("Name:\t\t" + name);
        System.out.println("Salary:\t\t" + salary);
        System.out.println("Age:\t\t" + age);
        System.out.println("Designation:\t" + designation);
    }
}

class Tester extends Emp {
    String designation = "Tester";
    float salary = 700000;

    Tester() {

    }

    void display() {
        System.out.println("---------------------------------------------------");
        System.out.println("*******************Tester Details******************");
        System.out.println("ID:\t\t" + id);
        System.out.println("Name:\t\t" + name);
        System.out.println("Salary:\t\t" + salary);
        System.out.println("Age:\t\t" + age);
        System.out.println("Designation:\t" + designation);
    }
}

public class HierarchicalInheritence {
    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(
                    "-----------------Available choices-----------------\n1. Developer\n2. Clerk\n3. Manager\n4. Tester\n5. Exit");
            System.out.println("---------------------------------------------------");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            if (choice == 1) {
                Dev d = new Dev();
                d.display();
                System.out.println("---------------------------------------------------");
            } else if (choice == 2) {
                Clerk c = new Clerk();
                c.display();
                System.out.println("---------------------------------------------------");
            } else if (choice == 3) {
                Manager m = new Manager();
                m.display();
                System.out.println("---------------------------------------------------");
            } else if (choice == 4) {
                Tester t = new Tester();
                t.display();
                System.out.println("---------------------------------------------------");
            } else if (choice == 5) {
                System.out.println("---------------------------------------------------");
                System.out.println("Thank you!");
                System.out.println("---------------------------------------------------");
                System.exit(0);
            } else {
                System.out.println("---------------------------------------------------");
                System.out.println("Invalid Choice!!");
                System.out.println("---------------------------------------------------");
            }

        } while (choice != 5);
    }
}
