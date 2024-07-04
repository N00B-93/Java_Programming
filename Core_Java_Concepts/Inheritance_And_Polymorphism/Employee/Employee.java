package Core_Java_Concepts.Inheritance_And_Polymorphism.Employee;

public class Employee
{
    // Attributes of an Employee.
    protected String name, title, department;
    protected int employeeID, age;
    protected double salary;

    // No arg constructor.
    public Employee(){}

    /**
     * Instantiates a new Employee.
     *
     * @param name The name of the Employee.
     * @param salary The salary of the Employee.
     * @param age The age of the Employee.
     * @param employeeID The ID number of the Employee.
     * @param department The department of the Employee.
     * @param title The title of the Employee.
     */
    public Employee(String name, double salary, int age, int employeeID, String department, String title)
    {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.employeeID = employeeID;
        this.department = department;
        this.title = title;
    }

    /**
     * Displays an Employee's Information.
     */
    public void printData()
    {
        System.out.println("\n" + this.getClass().getSimpleName() + " Details:");
        System.out.printf("Name: %s\nAge: %d\nID: %d\nSalary: $%.2f\nDepartment: %s\nTitle: %s\n",
                this.name, this.age, this.employeeID, this.salary, this.department, this.title);
    }

    /**
     * Increases an Employee's salary by a specified amount.
     *
     * @param increment The increment to be added to an Employee's salary.
     */
    public void changeSalary(int increment)
    {
        if (increment <= 0)
        {
            System.out.println("\nError: Increment must be greater than $0.0");
            return;
        }
        this.salary += increment;
    }

    /**
     * Increases an Employee's salary by a specified percentage.
     *
     * @param increment The percentage increment to be added to an Employee's salary.
     */
    public void changeSalary(double increment)
    {
        if (increment < 0.0 || increment > 1.0)
        {
            System.out.println("\nError: Increment should be in the range 0.0 <= increment <= 1.0.");
            return;
        }
        this.salary = this.salary * (1 + increment);
    }

    /**
     * This returns the Employee's salary.
     *
     * @return The Employee's salary.
     */
    public double getSalary()
    {
        return salary;
    }
}
