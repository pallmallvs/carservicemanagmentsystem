package carOps_iis20113;

import java.util.UUID;

public class Vehicle {
	private String id;
    private String licensePlate;
    private String make;
    private String model;
    private int yearOfManufacture;

    public Vehicle(String licensePlate, String make, String model, int yearOfManufacture) {
        this.id = UUID.randomUUID().toString();
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }
	//getters
    public String getId() {
        return id;
    }
	public String getlicensePlate() {
        return licensePlate;
    }
	public String getmake() {
        return make;
    }
	public String getmodel() {
        return model;
    }
	public int getyear() {
        return yearOfManufacture;
    }
	//no need for setters because cars  info dont change or maybe licensePlate
	public void setlicenceplate(String newlicenceplate) {
    this.licensePlate = newlicenceplate;
	}
    
}
