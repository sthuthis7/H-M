import java.util.Scanner;

interface Company{
    void pf();
    void cab();
}

abstract class Emp {
    int id;
    String name;
    int age;
    float salary;
    String designation;
    float pf;
    boolean cab=false;
    Emp() {

        Scanner sc = new Scanner(System.in);

        System.out.println("---------------------------------------------------\nEnter your First Name:");
        name = sc.next();

        System.out.println("Enter your ID:");
        id = sc.nextInt();

        System.out.println("Enter your Age:");
        age = sc.nextInt();
    }

    void display() {
        System.out.println("---------------------------------------------------\n**********************Details**********************");
        System.out.println("ID:\t\t" + id);
        System.out.println("Name:\t\t" + name);
        System.out.println("Salary:\t\t" + salary);
        System.out.println("Age:\t\t" + age);
        System.out.println("Designation:\t" + designation);
        System.out.println("PF:\t\t"+pf);
        System.out.println("Cab:\t\t"+cab);
    }

    abstract void raiseSalary(); //Abstraction is implemented!!
}

final class Dev extends Emp implements Company { //making the class Final so that no other class can access and modify the Dev class
    Dev() {
        designation = "Developer";
        salary = 1200000;
    }
    @Override
    void raiseSalary(){
        
            System.out.println("---------------------------------------------------\n-------------!Salary has been updated!-------------");
            salary=(float)(salary*1.1);
        
    }
    @Override
    public void pf(){
        System.out.println("---------------------------------------------------\n-------------!PF has been updated!-------------");
        if (pf==0){pf=(float)(salary*0.1);}
        else{
            pf=(float)(pf+salary*0.1);
        }
    }
    @Override
    public void cab(){
        cab=true;
    }
}

final class Clerk extends Emp implements Company{ //making the class Final so that no other class can access and modify the Clerk class
    Clerk() {
        designation = "Clerk";
        salary = 600000;
    }
    @Override
    void raiseSalary(){
        
        System.out.println("---------------------------------------------------\n-------------!Salary has been updated!-------------");
        salary=(float)(salary*1.1);
    
    }   
    @Override
    public void pf(){
        System.out.println("---------------------------------------------------\n-------------!PF has been updated!-------------");
        if (pf==0){pf=(float)(salary*0.1);}
        else{
            pf=(float)(pf+salary*0.1);
        }
    }
    @Override
    public void cab(){
        cab=true;
    }
}

final class Manager extends Emp  implements Company{ //making the class Final so that no other class can access and modify the Manager class
    Manager() {
        designation = "Manager";
        salary = 1800000;
    }
    @Override
    void raiseSalary(){
        
        System.out.println("---------------------------------------------------\n-------------!Salary has been updated!-------------");
        salary=(float)(salary*1.1);
    
    }  
    @Override
    public void pf(){
        System.out.println("---------------------------------------------------\n-------------!PF has been updated!-------------");
        if (pf==0){pf=(float)(salary*0.1);}
        else{
            pf=(float)(pf+salary*0.1);
        }
    }
    @Override
    public void cab(){
        cab=true;
    }
}

final class Tester extends Emp  implements Company{ //making the class Final so that no other class can access and modify the Tester class
    Tester() {
        designation = "Tester";
        salary = 700000;
    }
    @Override
    void raiseSalary(){
        
        System.out.println("---------------------------------------------------\n-------------!Salary has been updated!-------------");
        salary=(float)(salary*1.1);
    
    }  
    @Override
    public void pf(){
        System.out.println("---------------------------------------------------\n-------------!PF has been updated!-------------");
        if (pf==0){pf=(float)(salary*0.1);}
        else{
            pf=(float)(pf+salary*0.1);
        }
    }
    @Override
    public void cab(){
        cab=true;
    }
}

public class ProjectJava1 {
    public static void main(String[] args) {
        int choice1, choice2 = 0;
        Scanner sc = new Scanner(System.in);
        Tester t = null;
        Dev d = null;
        Manager m = null;
        Clerk c = null;
        do {
            System.out.println(
                    "-----------------Available choices-----------------\n1. Create\n2. Display\n3. Raise\n4. Update PF\n5. Exit\n---------------------------------------------------\nEnter your choice: ");
            choice2 = sc.nextInt();
            if (choice2 == 1) {
                do {
                    System.out.println(
                            "-----------------Available choices-----------------\n1. Developer\n2. Clerk\n3. Manager\n4. Tester\n5. Exit\n---------------------------------------------------\nEnter your choice: ");
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
                            "-----------------Available choices-----------------\n1. Developer\n2. Clerk\n3. Manager\n4. Tester\n5. Exit\n---------------------------------------------------\nEnter your choice: ");
                    choice1 = sc.nextInt();
                    if (choice1 == 1) {
                        if (d != null) {
                            d.display();
                            System.out.println("---------------------------------------------------");
                        } else {
                            System.out.println("---------------------------------------------------\n-------------!Please create the data!--------------\n---------------------------------------------------");
                            choice1 = 5;
                        }
                    } else if (choice1 == 2) {
                        if (c != null) {
                            c.display();
                            System.out.println("---------------------------------------------------");
                        } else {
                            System.out.println("---------------------------------------------------\n-------------!Please create the data!--------------\n---------------------------------------------------");
                            choice1 = 5;
                        }
                    } else if (choice1 == 3) {
                        if (m != null) {
                            m.display();
                            System.out.println("---------------------------------------------------");
                        } else {
                            System.out.println("---------------------------------------------------\n-------------!Please create the data!--------------\n---------------------------------------------------");
                            choice1 = 5;
                        }
                    } else if (choice1 == 4) {
                        if (t != null) {
                            t.display();
                            System.out.println("---------------------------------------------------");
                        } else {
                            System.out.println("---------------------------------------------------\n-------------!Please create the data!--------------\n---------------------------------------------------");
                            choice1 = 5;
                        }
                    }

                } while (choice1 != 5);
            } else if (choice2 == 3) {
                do {
                    System.out.println(
                            "-----------------Available choices-----------------\n1. Developer\n2. Clerk\n3. Manager\n4. Tester\n5. Exit");
                    System.out.println("---------------------------------------------------\nEnter your choice: ");
                    choice1 = sc.nextInt();
                    if (choice1 == 1) {
                        if (d != null) {
                            d.raiseSalary();
                            System.out.println("---------------------------------------------------");
                        } else {
                            System.out.println("---------------------------------------------------\n-------------!Please create the data!--------------\n---------------------------------------------------");
                            choice1 = 5;
                        }
                    } else if (choice1 == 2) {
                        if (c != null) {
                            c.raiseSalary();
                            System.out.println("---------------------------------------------------");
                        } else {
                            System.out.println("---------------------------------------------------\n-------------!Please create the data!--------------\n---------------------------------------------------");
                            choice1 = 5;
                        }
                    } else if (choice1 == 3) {
                        if (m != null) {
                            m.raiseSalary();
                            System.out.println("---------------------------------------------------");
                        } else {
                            System.out.println("---------------------------------------------------\n-------------!Please create the data!--------------\n---------------------------------------------------");
                            choice1 = 5;
                        }
                    } else if (choice1 == 4) {
                        if (t != null) {
                            t.raiseSalary();
                            System.out.println("---------------------------------------------------");
                        } else {
                            System.out.println("---------------------------------------------------\n-------------!Please create the data!--------------\n---------------------------------------------------");
                            choice1 = 5;
                        }
                    }
                } while (choice1 != 5);
            }else if (choice2==4){
                do {
                    System.out.println(
                            "-----------------Available choices-----------------\n1. Developer\n2. Clerk\n3. Manager\n4. Tester\n5. Exit");
                    System.out.println("---------------------------------------------------\nEnter your choice: ");
                    choice1 = sc.nextInt();
                    if (choice1 == 1) {
                        if (d != null) {
                            Company cp=d;
                            cp.pf();
                            System.out.println("---------------------------------------------------");
                        } else {
                            System.out.println("---------------------------------------------------\n-------------!Please create the data!--------------\n---------------------------------------------------");
                            choice1 = 5;
                        }
                    } else if (choice1 == 2) {
                        if (c != null) {
                            Company cp=c;
                            cp.pf();
                            System.out.println("---------------------------------------------------");
                        } else {
                            System.out.println("---------------------------------------------------\n-------------!Please create the data!--------------\n---------------------------------------------------");
                            choice1 = 5;
                        }
                    } else if (choice1 == 3) {
                        if (m != null) {
                            Company cp=m;
                            cp.pf();
                            System.out.println("---------------------------------------------------");
                        } else {
                            System.out.println("---------------------------------------------------\n-------------!Please create the data!--------------\n---------------------------------------------------");
                            choice1 = 5;
                        }
                    } else if (choice1 == 4) {
                        if (t != null) {
                            Company cp=t;
                            cp.pf();
                            System.out.println("---------------------------------------------------");
                        } else {
                            System.out.println("---------------------------------------------------\n-------------!Please create the data!--------------\n---------------------------------------------------");
                            choice1 = 5;
                        }
                    }
                } while (choice1 != 5);
            } 
            else if (choice2 == 5) {
                System.out.println("---------------------------------------------------\nThank you!\n---------------------------------------------------");
                System.exit(0);
            } else {
                System.out.println("---------------------------------------------------\nInvalid Choice!!\n---------------------------------------------------");
            }
        } while (choice2 != 5);
    }
}
