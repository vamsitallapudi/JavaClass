package main.designPatterns.structural.proxy;

public class CustomerDataService implements CustomerService{
    @Override
    public void fetchCustomerData(String role) {
        System.out.println("Customer details fetched");
    }
}
