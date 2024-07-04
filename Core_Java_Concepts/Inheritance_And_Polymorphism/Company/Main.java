package Core_Java_Concepts.Inheritance_And_Polymorphism.Company;

import Core_Java_Concepts.Inheritance_And_Polymorphism.Employee.Employee;
import Core_Java_Concepts.Inheritance_And_Polymorphism.Employee.Executive;
import Core_Java_Concepts.Inheritance_And_Polymorphism.Employee.Manager;
import java.util.ArrayList;

/*
    This is a driver program for the Company class.
 */

public class Main
{
    public static void main(String[] args)
    {
        // Creates 6 Employee Objects.
        Employee employee1 = new Employee("Adebisi Demilade", 253_101.52, 30, 1144,
                "Sales", "Solution Sales Specialist");
        Employee employee2 = new Employee("Atinuke Okon", 125_616.33, 29, 1123,
                "Customer Service", "Customer Service Representative");
        Employee employee3 = new Employee("Adejare Emmanuel", 96_101.25, 31, 1147,
                "Warehouse", "Warehouse Supervisor");
        Employee employee4 = new Employee("Eric Oric", 187_202.36, 31, 1154,
                "Sales", "Marketing Specialist");
        Employee employee5 = new Employee("Folashade Oriloye", 127_101.77, 30, 1098,
                "Customer service", "Customer Service Representative");
        Employee employee6 = new Employee("Ajayi Tessy", 98_554.36, 32, 1149,
                "Warehouse", "Procurement officer");


        ArrayList<Employee> salesStaffs = new ArrayList<>();
        salesStaffs.add(employee1);
        salesStaffs.add(employee4);

        Manager salesManager = new Manager("Happiness Raji", 398_121.45, 30, 1025,
                "Sales", "Sales Manager", salesStaffs);

        ArrayList<Employee> warehouseStaffs = new ArrayList<>();
        warehouseStaffs.add(employee3);
        warehouseStaffs.add(employee6);

        Manager warehouseManager = new Manager("Gbemisola Precious", 401_112.36, 27,
                1066, "Warehouse", "Warehouse Manager", warehouseStaffs);

        ArrayList<Employee> customerServiceStaffs = new ArrayList<>();
        customerServiceStaffs.add(employee2);
        customerServiceStaffs.add(employee5);

        Manager customerServiceManager = new Manager("Patience Eshett", 385_107.38, 32,
                1056, "Customer Service", "Customer Service manager", customerServiceStaffs);

        ArrayList<Employee> allManagers = new ArrayList<>();
        allManagers.add(warehouseManager);
        allManagers.add(customerServiceManager);
        allManagers.add(salesManager);
        Executive executiveManager = new Executive("Alabeni Omosheye", 505_897.55, 30,
                1063, "Operations", "Executive manager", allManagers, 20);

        // Creates an ArrayList to hold all Employees.
        ArrayList<Employee> allEmployees = new ArrayList<>();
        allEmployees.addAll(salesStaffs);
        allEmployees.addAll(customerServiceStaffs);
        allEmployees.addAll(warehouseStaffs);
        allEmployees.addAll(allManagers);
        allEmployees.add(executiveManager);

        // Creates a Company Object
        Company company = new Company("N00B's Oreo Cookies Factory", "Oreo Cookies", allEmployees);

        // Displays the Company Information.
        System.out.printf("\n\t\t\tCompany Name: %s\n\t\t\tProduct Name: %s\n", company.getCompanyName(), company.getProductName());

        // Displays the details of all Ordinary Employees in the Company.
        System.out.println("\n--------------------------------------------All Employee(s) of " + company.getCompanyName() + "-" +
                "------------------------------------------------");
        double totalSalaryOfEmployees = 0.0;
        for (Employee employee: company.getOrdinaryEmployees())
        {
            employee.printData();
            totalSalaryOfEmployees += employee.getSalary();
        }

        // Displays the details of all Managers in the Company.
        System.out.println("\n---------------------------------------------All Manager(s) of " + company.getCompanyName()
                + "------------------------------------------------------------");
        double totalSalaryOfAllManagers = 0.0;
        for (Manager manager: company.getManagers())
        {
            manager.printData();
            totalSalaryOfAllManagers += manager.getSalary();
        }

        // Displays the details of all Executive Managers in the Company.
        System.out.println("\n------------------------------------------------All Executive Manager(s) of " +
                company.getCompanyName() + "--------------------------------------------------------");
        double totalSalaryOfAllExecutiveManagers = 0.0;
        for (Executive executives: company.getExecutives())
        {
            executives.printData();
            totalSalaryOfAllExecutiveManagers += executives.getSalary();
        }

        // Displays the total salary of all Employee, Managers and executive MManagers
        System.out.printf("\nTotal Salary of Ordinary Employee(s): $%.2f\n", totalSalaryOfEmployees);
        System.out.printf("\nTotal Salary of all Manager(s): $%.2f\n", totalSalaryOfAllManagers);
        System.out.printf("\nTotal Salary of all Executive Manager(s): $%.2f\n", totalSalaryOfAllExecutiveManagers);

        // Displays the total salary of all Employees.
        System.out.printf("\nTotal Salary of all Employee: $%.2f\n", totalSalaryOfEmployees + totalSalaryOfAllManagers +
                totalSalaryOfAllExecutiveManagers);
    }
}
