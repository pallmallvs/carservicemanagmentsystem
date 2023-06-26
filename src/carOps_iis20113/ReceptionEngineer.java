package carOps_iis20113;

public class ReceptionEngineer {
	public DiagnosticCheck performDiagnosticCheck(Appointment appointment) {
        DiagnosticCheck diagnosticCheck = new DiagnosticCheck(appointment.getId(), appointment.getVehicleId());
        // Perform the diagnostic check and estimate repair works, cost, and duration
		// Perform visual inspection and tests
        RepairWork repairWork1 = new RepairWork("Engine Repair", 500.0);
        RepairWork repairWork2 = new RepairWork("Brake Replacement", 200.0);
        diagnosticCheck.addRepairWork(repairWork1);
        diagnosticCheck.addRepairWork(repairWork2);
        return diagnosticCheck;
    }
}
