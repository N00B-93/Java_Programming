package Core_Java_Concepts.Inheritance_And_Polymorphism.Employee;

import java.util.ArrayList;

public class Manager extends Employee
{
    protected ArrayList<Employee> employeesManaged;  // A list of employee ID of the Employees managed by the Manager.

    /**
     * Instantiates a new Manager.
     *
     * @param name The name of the Manager.
     * @param salary The salary of the Manager.
     * @param age The age of the Manager.
     * @param employeeID The ID number of the Manager.
     * @param department The department of the Manager.
     * @param title The title of the Manager.
     * @param employeesManaged A list of Employees managed by the Manager.
     */
    public Manager(String name, double salary, int age, int employeeID, String department, String title,
                   ArrayList<Employee> employeesManaged)
    {
        super(name, salary, age, employeeID, department, title);
        this.employeesManaged = employeesManaged;
    }

    /**
     * Displays the Manager's Data.
     */
    @Override
    public void printData()
    {
        super.printData();

        System.out.printf("\n\nEmployee Managed by %s:", this.name);
        for (Employee employee: this.employeesManaged)
            System.out.println(employee.name);
    }
}
