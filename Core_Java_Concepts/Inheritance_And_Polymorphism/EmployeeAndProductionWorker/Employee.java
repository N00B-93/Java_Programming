package Inheritance_And_Polymorphism.EmployeeAndProductionWorker;

import java.util.Date;
public class Employee
{
    // Attributes of an Employee.
    private String employeeName, employeeID;
    private Date dateHired;

    /**
     * Instantiates a new Employee with the given Name and ID.
     *
     * @param employeeName The employee name.
     * @param employeeID The employee ID.
     */
    public Employee(String employeeName, String employeeID)
    {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.dateHired = new Date();
    }
    // No-arg Constructor.
    public Employee(){}

    /**
     * Gets employee name.
     *
     * @return The employee name.
     */
    public String getEmployeeName()
    {
        return this.employeeName;
    }

    /**
     * Sets employee name to the given value.
     *
     * @param newName The new name.
     */
    public void setEmployeeName(String newName)
    {
        this.employeeName = newName;
    }

    /**
     * Gets employee ID.
     *
     * @return The employee ID.
     */
    public String getEmployeeID()
    {
        return this.employeeID;
    }

    /**
     * Sets employee ID to the given value.
     *
     * @param newID The new ID.
     */
    public void setEmployeeID(String newID)
    {
        this.employeeName = newID;
    }

    /**
     * Sets date hired to the given value.
     *
     * @param newDate The new date hired.
     */
    public void setDateHired(Date newDate)
    {
        this.dateHired = newDate;
    }

    /**
     * Gets date hired.
     *
     * @return The date hired.
     */
    public Date getDateHired()
    {
        return dateHired;
    }

    /**
     * A String describing the Employee Object.
     *
     * @return Description of the Employee Object.
     */
    @Override
    public String toString()
    {
        return "\nEmployee Name: " + this.getEmployeeName() + "\n" + "Employee ID: " + this.getEmployeeID() + "\n" +
                "Date Hired: " + this.getDateHired();
    }
}
