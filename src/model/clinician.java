package model;

public class clinician {
    private String gp_id;
    private String first_name;
    private String last_name;
    private String title;
    private String specialty;
    private int gmc_number;
    private int phone_number;
    private String email;
    private String workplace_id;
    private String workplace_type;
    private String employment_status;
    private String start_date;

    public clinician(String gp_id, String first_name, String last_name, String title, String specialty,
                     int gmc_number, int phone_number, String email, String workplace_id,
                     String workplace_type, String employment_status, String start_date) {
        this.gp_id = gp_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.title = title;
        this.specialty = specialty;
        this.gmc_number = gmc_number;
        this.phone_number = phone_number;
        this.email = email;
        this.workplace_id = workplace_id;
        this.workplace_type = workplace_type;
        this.employment_status = employment_status;
        this.start_date = start_date;
    }

    // Getters and setters
    public String getGpId() { return gp_id; }
    public void setGpId(String gp_id) { this.gp_id = gp_id; }
    public String getFirstName() { return first_name; }
    public void setFirstName(String first_name) { this.first_name = first_name; }
    public String getLastName() { return last_name; }
    public void setLastName(String last_name) { this.last_name = last_name; }
    public String getSpecialty() { return specialty; }
    public void setSpecialty(String specialty) { this.specialty = specialty; }

    @Override
    public String toString() {
        return first_name + " " + last_name + " (" + specialty + ")";
    }
}

