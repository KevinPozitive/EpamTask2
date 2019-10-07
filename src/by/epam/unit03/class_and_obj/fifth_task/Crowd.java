package by.epam.unit03.class_and_obj.fifth_task;

public class Crowd {
    private Customer[] customers;

    protected Crowd(Customer[] customers) {
        this.customers = customers;
    }

    protected void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    protected Customer[] getCustomers() {
        return customers;
    }
}
