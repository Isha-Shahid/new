package model;

public class appointment {
    private String appointment_id;
    private String patient_id;
    private String clinician_id;
    private String facility_id;
    private String appointment_date;
    private String appointment_time;
    private int appointment_minutes;
    private String appointment_type;
    private String status;
    private String reason;
    private String notes;
    private String last_modified;

    public appointment(String appointment_id, String patient_id, String clinician_id, String facility_id,
                       String appointment_date, String appointment_time, int appointment_minutes,
                       String appointment_type, String status, String reason, String notes, String last_modified) {
        this.appointment_id = appointment_id;
        this.patient_id = patient_id;
        this.clinician_id = clinician_id;
        this.facility_id = facility_id;
        this.appointment_date = appointment_date;
        this.appointment_time = appointment_time;
        this.appointment_minutes = appointment_minutes;
        this.appointment_type = appointment_type;
        this.status = status;
        this.reason = reason;
        this.notes = notes;
        this.last_modified = last_modified;
    }

    // Getters and setters
    public String getAppointmentId() { return appointment_id; }
    public String getPatientId() { return patient_id; }
    public String getClinicianId() { return clinician_id; }
    public String getAppointmentDate() { return appointment_date; }

    @Override
    public String toString() {
        return "Appointment[" + appointment_id + "] with Clinician: " + clinician_id + " for Patient: " + patient_id;
    }
}
