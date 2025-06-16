package main.designPatterns.structural.proxy;

public class CustomerServiceProxy implements CustomerService {
    @Override
    public void fetchCustomerData(String role) {
        if(role.equalsIgnoreCase("admin")) {
            CustomerDataService customerDataService = new CustomerDataService();
            customerDataService.fetchCustomerData(role);
        } else {
            System.out.println("Access denied");
        }
    }
}
