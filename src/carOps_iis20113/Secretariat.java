package carOps_iis20113;

import java.util.HashMap;
import java.util.Map;

public class Secretariat {
	private Map<String, Customer> customers;

    public Secretariat() {
        this.customers = new HashMap<>();
    }

    public void addCustomer(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    public Customer getCustomer(String customerId) {
        return customers.get(customerId);
    }

    public void processPayment(Customer customer, double amount, PaymentType paymentType) {
        Payment payment = new Payment(customer.getId(), amount, paymentType);
    }

}
