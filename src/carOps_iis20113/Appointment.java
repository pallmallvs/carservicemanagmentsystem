package carOps_iis20113;

import java.time.LocalDateTime;
import java.util.UUID;

public class Appointment {
	private String id;
    private String customerId;
    private String vehicleId;
    private LocalDateTime appointmentDateTime;

    public Appointment(Customer customer, Vehicle vehicle, LocalDateTime appointmentDateTime) {
        this.id = UUID.randomUUID().toString();
        this.customerId = customer.getId();
        this.vehicleId = vehicle.getId();
        this.appointmentDateTime = appointmentDateTime;
    }
	//getters
    public String getId() {
        return id;
    }
    public String getCustomerId() {
        return customerId;
    }

    public String getVehicleId() {
        return vehicleId;
    }
    public LocalDateTime getAppointmentDateTime() {
        return appointmentDateTime;
    }


}
