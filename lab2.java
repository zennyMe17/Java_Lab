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
        this.name = input.nextLine();

        System.out.print("Enter ID: ");
        this.eID = input.nextInt();
        input.nextLine(); // Consume leftover newline

        System.out.print("Enter dept: ");
        this.dept = input.nextLine();

        System.out.print("Enter designation: ");
        this.desig = input.nextLine();

        System.out.print("Enter Age: ");
        this.age = input.nextInt();
        input.nextLine(); // Consume leftover newline

        System.out.print("Enter Salary: ");
        this.salary = input.nextInt();
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
        Employee[] e = new Employee[2];

        for (int i = 0; i < 2; i++) {
            e[i] = new Employee(); 
            System.out.println("Enter Details of employee " + (i + 1));
            e[i].read_details();
        }

        while (true) {
            System.out.print("Which employee's details you want (enter 0 to exit): ");
            int n = input.nextInt();

            if (n == 0) {
                break;
            }

            if (n < 1 || n > 2) {
                System.out.println("Invalid employee number. Please enter a number between 1 and 2.");
                continue;
            }

            System.out.println("Details of employee " + n);
            e[n - 1].display();
        }

        int totalSalary = 0;
        for (int i = 0; i < 2; i++) {
            if (e[i].desig == "Sales") { // Use .equals() for string comparison
                totalSalary += e[i].salary;
            }
        }

        System.out.println("Total Salary for Sales employees is = " + totalSalary);
        input.close(); // Close the Scanner to prevent resource leak
    }
}
