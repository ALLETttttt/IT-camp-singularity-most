package kz.project;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("John", "Doe", 45, "123456789", "john@example.com", 50000.0, "Manager");
        employees[1] = new Employee("Alice", "Smith", 25, "987654321", "alice@example.com", 45000.0, "Developer");
        employees[2] = new Employee("Michael", "Johnson", 35, "456789123", "michael@example.com", 60000.0, "Senior Engineer");
        employees[3] = new Employee("Emily", "Brown", 28, "789123456", "emily@example.com", 55000.0, "Designer");
        employees[4] = new Employee("Daniel", "Wilson", 32, "321654987", "daniel@example.com", 52000.0, "Analyst");

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                System.out.println(employees[i].toString());
            }
        }
    }
}
