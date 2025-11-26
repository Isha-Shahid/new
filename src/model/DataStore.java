
package model;

import util.FileHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class DataStore {
    private List<patient> allPatients = new ArrayList<>();
    private Map<String, clinician> allClinicians = new HashMap<>();
    private List<appointment> allAppointments = new ArrayList<>();

    public void loadAllData() {
        System.out.println("Loading data from CSV files...");
        FileHandler.loadPatients("patients.csv", allPatients);
        System.out.println("Data loading complete.");
    }
    
   
    public void addPatient(patient patient) {
        this.allPatients.add(patient);
        // append to CSV if needed
    }
    // <--- Add this method
    public List<patient> getAllPatients() {
        return allPatients;
    }
}