package carOps_iis20113;

import java.time.LocalDateTime;

public class CarOps {
	 private Secretariat secretariat;
	    private ReceptionEngineer receptionEngineer;
	    private SupervisingEngineer supervisingEngineer;

	    public CarOps() {
	        this.secretariat = new Secretariat();
	        this.receptionEngineer = new ReceptionEngineer();
	        this.supervisingEngineer = new SupervisingEngineer();
	    }

	    public void addCustomer(Customer customer) {
	        secretariat.addCustomer(customer);
	    }

	    public void createAppointment(Customer customer, Vehicle vehicle, LocalDateTime appointmentDateTime) {
	        Appointment appointment = new Appointment(customer, vehicle, appointmentDateTime);
	        // Save the appointment to the database or perform other operations
	        // Perform other necessary operations
	    }

	    public DiagnosticCheck performDiagnosticCheck(Appointment appointment) {
	        return receptionEngineer.performDiagnosticCheck(appointment);
	    }

	    public double calculateRepairCost(DiagnosticCheck diagnosticCheck) {
	        double totalCost = 0.0;

	        for (RepairWork repairWork : diagnosticCheck.getRepairWorks()) {
	            totalCost += repairWork.getCost();
	        }

	        return totalCost;
	    }

	    public void processPayment(Customer customer, double amount, PaymentType paymentType) {
	        secretariat.processPayment(customer, amount, paymentType);
	        // Perform other necessary operations
	    }
	
	
	
	
}
