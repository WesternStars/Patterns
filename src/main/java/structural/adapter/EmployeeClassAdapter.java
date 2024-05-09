package structural.adapter;

import structural.adapter.mobel.Customer;
import structural.adapter.mobel.Employee;

public class EmployeeClassAdapter extends Employee implements Customer {

    @Override
    public String getName() {
        return getFullName();
    }

    @Override
    public String getDesignation() {
        return getJobTitle();
    }

    @Override
    public String getAddress() {
        return getOfficeLocation();
    }
}
