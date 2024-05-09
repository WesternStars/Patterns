package structural.adapter;

import structural.adapter.mobel.BusinessCardDesigner;
import structural.adapter.mobel.Employee;

public class AdapterStarter {

    public static void main(String[] args) {

        /*Class Adapter*/
        EmployeeClassAdapter classAdapter = new EmployeeClassAdapter();
        populateEmployeeData(classAdapter);
        BusinessCardDesigner cardDesigner = new BusinessCardDesigner();
        System.out.println(cardDesigner.designCard(classAdapter));
        System.out.println("__________");

        /*Object Adapter*/
        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        System.out.println(cardDesigner.designCard(objectAdapter));
    }

    private static void populateEmployeeData(Employee employee) {
        employee.setFullName("Elliot Alderson");
        employee.setJobTitle("Security Engineer");
        employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
    }
}
