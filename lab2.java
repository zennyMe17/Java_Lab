
import java.util.*;

class Employee {
    String name;
    int eID;
    String dept;
    int age;
    String desig;
    int salary;

    void read_details() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = input.nextLine();

        System.out.print("Enter ID: ");
        eID = input.nextInt();

        System.out.print("Enter dept: ");
        dept = input.nextLine();

        System.out.print("Enter designation: ");
        desig = input.nextLine();

        System.out.print("Enter Age: ");
        age = input.nextInt();
        
        System.out.print("Enter Salary: ");
        salary = input.nextInt();
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Id: " + this.eID);
        System.out.println("Department: " + this.dept);
        System.out.println("Age: " + this.age);
        System.out.println("Designation: " + this.desig);
        System.out.println("Salary: " + this.salary);
    }
}

 class EmployeeDatabase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee[] e = new Employee[5];

        for (int i = 0; i < 5; i++) {
            e[i] = new Employee(); 
            System.out.println("Enter Details of employee " + (i + 1));
            e[i].read_details();
        }

        while (true) {
            System.out.println("Which employee's details you want (enter 0 to exit): ");
            int n = input.nextInt();

            if (n == 0) {
                break;
            }

            if (n < 1 || n > 5) {
                System.out.println("Invalid employee number. Please enter a number between 1 and 5.");
                continue;
            }

            System.out.println("Details of employee " + n);
            e[n - 1].display();
        }

        input.close();
    }
}
