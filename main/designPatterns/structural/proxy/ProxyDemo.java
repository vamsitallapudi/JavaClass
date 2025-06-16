package main.designPatterns.structural.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        CustomerService proxy = new CustomerServiceProxy();
        proxy.fetchCustomerData("admin");
        proxy.fetchCustomerData("user");
    }
}
