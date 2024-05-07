import java.util.Scanner;

class Emp {
    int id;
    String name;
    int age;
    float salary;
    String designation;

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

    void display() {
        System.out.println("---------------------------------------------------");
        System.out.println("**********************Details**********************");
        System.out.println("ID:\t\t" + id);
        System.out.println("Name:\t\t" + name);
        System.out.println("Salary:\t\t" + salary);
        System.out.println("Age:\t\t" + age);
        System.out.println("Designation:\t" + designation);
    }

    void raiseSalary() {
        System.out.println("---------------------------------------------------");
        System.out.println("-------------!Salary has been updated!-------------");
    }
}

class Dev extends Emp {

    Dev() {
        designation = "Developer";
        salary = 1200000;
    }

}

class Clerk extends Emp {

    Clerk() {
        designation = "Clerk";
        salary = 600000;
    }

}

class Manager extends Emp {

    Manager() {
        designation = "Manager";
        salary = 1800000;
    }

}

class Tester extends Emp {

    Tester() {
        designation = "Tester";
        salary = 700000;
    }

}

public class MethodOverridingProject {
    public static void main(String[] args) {
        int choice1, choice2 = 0;
        Scanner sc = new Scanner(System.in);
        Tester t = null;
        Dev d = null;
        Manager m = null;
        Clerk c = null;
        do {
            System.out.println(
                    "-----------------Available choices-----------------\n1. Create\n2. Display\n3. Raise\n4. Exit");
            System.out.println("---------------------------------------------------");
            System.out.print("Enter your choice: ");
            choice2 = sc.nextInt();
            if (choice2 == 1) {
                do {
                    System.out.println(
                            "-----------------Available choices-----------------\n1. Developer\n2. Clerk\n3. Manager\n4. Tester\n5. Exit");
                    System.out.println("---------------------------------------------------");
                    System.out.print("Enter your choice: ");
                    choice1 = sc.nextInt();
                    if (choice1 == 1) {
                        d = new Dev();
                        System.out.println("---------------------------------------------------");
                    } else if (choice1 == 2) {
                        c = new Clerk();
                        System.out.println("---------------------------------------------------");
                    } else if (choice1 == 3) {
                        m = new Manager();
                        System.out.println("---------------------------------------------------");
                    } else if (choice1 == 4) {
                        t = new Tester();
                        System.out.println("---------------------------------------------------");
                    }

                } while (choice1 != 5);
            } else if (choice2 == 2) {
                do {
                    System.out.println(
                            "-----------------Available choices-----------------\n1. Developer\n2. Clerk\n3. Manager\n4. Tester\n5. Exit");
                    System.out.println("---------------------------------------------------");
                    System.out.print("Enter your choice: ");
                    choice1 = sc.nextInt();
                    if (choice1 == 1) {
                        if (d != null) {
                            d.display();
                            System.out.println("---------------------------------------------------");
                        } else {
                            System.out.println("---------------------------------------------------");
                            System.out.println("-------------!Please create the data!--------------");
                            System.out.println("---------------------------------------------------");
                            choice1 = 5;
                        }
                    } else if (choice1 == 2) {
                        if (c != null) {
                            c.display();
                            System.out.println("---------------------------------------------------");
                        } else {
                            System.out.println("---------------------------------------------------");
                            System.out.println("-------------!Please create the data!--------------");
                            System.out.println("---------------------------------------------------");
                            choice1 = 5;
                        }
                    } else if (choice1 == 3) {
                        if (m != null) {
                            m.display();
                            System.out.println("---------------------------------------------------");
                        } else {
                            System.out.println("---------------------------------------------------");
                            System.out.println("-------------!Please create the data!--------------");
                            System.out.println("---------------------------------------------------");
                            choice1 = 5;
                        }
                    } else if (choice1 == 4) {
                        if (t != null) {
                            t.display();
                            System.out.println("---------------------------------------------------");
                        } else {
                            System.out.println("---------------------------------------------------");
                            System.out.println("-------------!Please create the data!--------------");
                            System.out.println("---------------------------------------------------");
                            choice1 = 5;
                        }
                    }

                } while (choice1 != 5);
            } else if (choice2 == 3) {
                do {
                    System.out.println(
                            "-----------------Available choices-----------------\n1. Developer\n2. Clerk\n3. Manager\n4. Tester\n5. Exit");
                    System.out.println("---------------------------------------------------");
                    System.out.print("Enter your choice: ");
                    choice1 = sc.nextInt();
                    if (choice1 == 1) {
                        if (d != null) {
                            d.raiseSalary();
                            System.out.println("---------------------------------------------------");
                        } else {
                            System.out.println("---------------------------------------------------");
                            System.out.println("-------------!Please create the data!--------------");
                            System.out.println("---------------------------------------------------");
                            choice1 = 5;
                        }
                    } else if (choice1 == 2) {
                        if (c != null) {
                            c.raiseSalary();
                            System.out.println("---------------------------------------------------");
                        } else {
                            System.out.println("---------------------------------------------------");
                            System.out.println("-------------!Please create the data!--------------");
                            System.out.println("---------------------------------------------------");
                            choice1 = 5;
                        }
                    } else if (choice1 == 3) {
                        if (m != null) {
                            m.raiseSalary();
                            System.out.println("---------------------------------------------------");
                        } else {
                            System.out.println("---------------------------------------------------");
                            System.out.println("-------------!Please create the data!--------------");
                            System.out.println("---------------------------------------------------");
                            choice1 = 5;
                        }
                    } else if (choice1 == 4) {
                        if (t != null) {
                            t.raiseSalary();
                            System.out.println("---------------------------------------------------");
                        } else {
                            System.out.println("---------------------------------------------------");
                            System.out.println("-------------!Please create the data!--------------");
                            System.out.println("---------------------------------------------------");
                            choice1 = 5;
                        }
                    }
                } while (choice1 != 5);
            } else if (choice2 == 4) {
                System.out.println("---------------------------------------------------");
                System.out.println("Thank you!");
                System.out.println("---------------------------------------------------");
                System.exit(0);
            } else {
                System.out.println("---------------------------------------------------");
                System.out.println("Invalid Choice!!");
                System.out.println("---------------------------------------------------");
            }
        } while (choice2 != 4);
    }
}
