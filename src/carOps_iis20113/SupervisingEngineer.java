package carOps_iis20113;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class SupervisingEngineer {
	private Map<LocalDateTime, List<String>> schedule;

    public SupervisingEngineer() {
        this.schedule = new HashMap<>();
    }

    public void addWorkSchedule(LocalDateTime dateTime, List<String> workers) {
        schedule.put(dateTime, workers);
    }

    public LocalDateTime getFirstAvailableTime(int numWorkers) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime currentDateTime = now.plusHours(1);

        while (true) {
            if (isAvailable(currentDateTime, numWorkers)) {
                return currentDateTime;
            }

            currentDateTime = currentDateTime.plusHours(1);
        }
    }

    private boolean isAvailable(LocalDateTime dateTime, int numWorkers) {
        List<String> workersAvailable = schedule.getOrDefault(dateTime, new ArrayList<>());
        return workersAvailable.size() >= numWorkers;
    }

    public void assignRepairTasks(DiagnosticCheck diagnosticCheck, int numBumperWorkers, int numLightWorkers) {
        // Calculate the required number of workers for each repair type
        int numBumperRepairs = 0;
        int numLightRepairs = 0;

        for (RepairWork repairWork : diagnosticCheck.getRepairWorks()) {
            if (repairWork.getDescription().equals("Bumper Replacement")) {
                numBumperRepairs++;
            } else if (repairWork.getDescription().equals("Light Replacement")) {
                numLightRepairs++;
            }
        }

        // Assign workers for bumper replacements
        List<String> bumperWorkers = chooseWorkers(numBumperWorkers);
        LocalDateTime bumperDateTime = getFirstAvailableTime(numBumperWorkers);
        addWorkSchedule(bumperDateTime, bumperWorkers);
        System.out.println("Assigning " + numBumperWorkers + " workers for bumper replacements on " +
                bumperDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")) + ": " + bumperWorkers);

        // Assign workers for light replacements
        List<String> lightWorkers = chooseWorkers(numLightWorkers);
        LocalDateTime lightDateTime = getFirstAvailableTime(numLightWorkers);
        addWorkSchedule(lightDateTime, lightWorkers);
        System.out.println("Assigning " + numLightWorkers + " workers for light replacements on " +
                lightDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")) + ": " + lightWorkers);

        // assigning repair tasks
        
    }
	//method for supervising engineers
    private List<String> chooseWorkers(int numWorkers) {
        List<String> availableWorkers = new ArrayList<>(); // Get a list of available workers
        List<String> chosenWorkers = new ArrayList<>();

        for (int i = 0; i < numWorkers; i++) {
            if (i < availableWorkers.size()) {
                chosenWorkers.add(availableWorkers.get(i));
            } else {
                break;
            }
        }

        return chosenWorkers;
    }
    
}
