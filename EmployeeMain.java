class Employee {
    String firstName;
    String lastName;
    double monthlySalary;

    Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary > 0 ? monthlySalary : 0;
    }

    double yearlySalary() {
        System.out.println(firstName+" "+lastName);
        return monthlySalary * 12;
    }

    void giveRaise() {
        monthlySalary += monthlySalary * 0.10;
    }
}


public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee("Sneha", "Choraria", 500000);
        Employee e2 = new Employee("kanishka ", "Kumar", 400000);

        System.out.println(e1.yearlySalary());
        System.out.println(e2.yearlySalary());

        e1.giveRaise();
        e2.giveRaise();

        System.out.println(e1.yearlySalary());
        System.out.println(e2.yearlySalary());
    }
}