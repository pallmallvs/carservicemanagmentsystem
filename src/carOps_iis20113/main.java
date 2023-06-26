package carOps_iis20113;
import java.time.LocalDateTime;
public class main {

	public static void main(String[] args) {
		
		// Example usage
        CarOps carOps = new CarOps();

        // Add customer to the system
        Customer customer1 = new Customer("John", "Doe", "1234567890", "123 Street", "john@example.com");
        carOps.addCustomer(customer1);

        // Add vehicle to the system
        Vehicle vehicle1 = new Vehicle("ABC123", "Toyota", "Camry", 2020);

        // Create an appointment
        LocalDateTime appointmentDateTime = LocalDateTime.now().plusHours(2); // Set appointment 2 hours from now
        carOps.createAppointment(customer1, vehicle1, appointmentDateTime);

        // Perform diagnostic check
        DiagnosticCheck diagnosticCheck = carOps.performDiagnosticCheck(appointment);
        double repairCost = carOps.calculateRepairCost(diagnosticCheck);

        // Process payment
        carOps.processPayment(customer1, repairCost, PaymentType.CASH);

        
		
		
		

	}

}
