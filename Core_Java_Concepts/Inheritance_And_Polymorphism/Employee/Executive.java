package Inheritance_And_Polymorphism.Employee;

import java.util.ArrayList;

public class Executive extends Manager
{
    // Attribute of an Executive.
    protected double bonusPercent = 0.1;

    /**
     * Instantiates a new Executive.
     *
     * @param name The name of the Executive.
     * @param salary The salary of the Executive.
     * @param age The age of the Executive.
     * @param employeeID The ID number of the Executive.
     * @param department The department of the Executive.
     * @param title The title of the Executive.
     * @param employeesManaged A list of Employees managed by the Executive.
     * @param bonusPercent The percentage bonus of the Executive.
     */
    public Executive(String name, double salary, int age, int employeeID, String department, String title,
                     ArrayList<Employee> employeesManaged, double bonusPercent)
    {
        super(name, salary, age, employeeID, department, title, employeesManaged);
        this.bonusPercent = bonusPercent / 100;
    }

    /**
     * Displays the Executive's data.
     */
    @Override
    public void printData()
    {
        super.printData();

    }

    /**
     * This returns the salary of an Executive.
     *
     * @return The Executive's salary.
     */
    @Override
    public double getSalary()
    {
        return this.salary + (this.salary * this.bonusPercent);
    }

    /**
     * This sets the bonus of the Executive to the specified value.
     *
     * @param bonusPercent The Executive's new bonus percent.
     */
    public void setBonusPercent(double bonusPercent)
    {
        this.bonusPercent = bonusPercent;
    }
}
