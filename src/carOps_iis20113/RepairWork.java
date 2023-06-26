package carOps_iis20113;

import java.util.UUID;

public class RepairWork {
	private String id;
    private String description;
    private double cost;

    public RepairWork(String description, double cost) {
        this.id = UUID.randomUUID().toString();
        this.description = description;
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }
}
