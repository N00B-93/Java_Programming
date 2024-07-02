package Core_Java_Concepts.Inheritance_And_Polymorphism.Company;

import Core_Java_Concepts.Inheritance_And_Polymorphism.Employee.Employee;
import Core_Java_Concepts.Inheritance_And_Polymorphism.Employee.Executive;
import Core_Java_Concepts.Inheritance_And_Polymorphism.Employee.Manager;
import java.util.ArrayList;

public class Company
{
    // Attributes of a Company.
    private String companyName;
    private String productName;
    private ArrayList<Employee> employees;

    /**
     * Instantiates a new Company Object.
     *
     * @param companyName The name of the Company.
     * @param productName The product produced by the Company.
     * @param employees A list of employees employed to the Company.
     */
    public Company(String companyName, String productName, ArrayList<Employee> employees)
    {
        this.companyName = companyName;
        this.productName = productName;
        this.employees = employees;
    }

    /**
     * This returns the name of a Company.
     *
     * @return A Company's name.
     */
    public String getCompanyName()
    {
        return companyName;
    }

    /**
     * This returns the name of the product produced by a Company.
     *
     * @return The product produced by a Company.
     */
    public String getProductName()
    {
        return productName;
    }

    /**
     * This returns a list of employees employed to a Company.
     *
     * @return A list of employees employed to a Company.
     */
    public ArrayList<Employee> getEmployees()
    {
        return employees;
    }

    /**
     * This returns a list of Executive Managers working in a Company.
     *
     * @return A list of Executive Managers working in a Company.
     */
    public ArrayList<Executive> getExecutives()
    {
        ArrayList<Executive> executives = new ArrayList<>();

        for (Employee employee: this.employees)
        {
            if (employee instanceof Executive)
                executives.add((Executive) employee);
        }
        return executives;
    }

    /**
     * This returns a list of Managers working in a Company.
     *
     * @return A list of Managers working in a Company.
     */
    public ArrayList<Manager> getManagers()
    {
        ArrayList<Manager> managers = new ArrayList<>();

        for (Employee employee: this.employees)
        {
            if (employee instanceof Manager)
                managers.add((Manager) employee);
        }
        return managers;
    }

    /**
     * This returns a list of ordinary Employees working in a Company.
     *
     * @return A list of ordinary Employees working in a Company.
     */
    public ArrayList<Employee> getOrdinaryEmployees()
    {
        ArrayList<Employee> ordinaryEmployees = new ArrayList<>();

        for (Employee employee: this.employees)
        {
            if (!(employee instanceof Manager))
                ordinaryEmployees.add(employee);
        }

        return ordinaryEmployees;
    }
}
