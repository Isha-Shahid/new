package util;

import model.Referral; // Corrected to standard Java naming convention
import model.patient; // Corrected to standard Java naming convention
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReferralManager {
    // 1. Static instance variable (The single instance)
    private static ReferralManager instance;

    // 2. Private constructor (Prevents external instantiation)
    private ReferralManager() {
        System.out.println("Referral Management System Initialized (Singleton)");
    }

    // 3. Public static method (Global access point) - Implementing the Singleton pattern
    public static ReferralManager getInstance() {
        if (instance == null) {
            // Added simple synchronization for thread safety, a common practice for Singleton
            synchronized (ReferralManager.class) {
                if (instance == null) {
                    instance = new ReferralManager();
                }
            }
        }
        return instance;
    }

    /**
     * Generates the content for a new referral and persists it to a file, 
     * simulating the email communication.
     * * @param referral The data object containing the specific referral details.
     * @param patient The data object containing the patient details.
     * @return true if the file was successfully written, false otherwise.
     */
    // *** CORRECTION APPLIED HERE: Changed ReferralManager parameter to Referral ***
    public boolean generateReferralLetter(Referral referral, Patient patient) {
        
        String filename = "generated_referrals.txt"; 
        
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename, true))) {
            
            // --- Content simulating an email/clinical document ---
            writer.println("===================================================");
            writer.println(" REFERRAL DOCUMENT (Simulated Email) - " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
            // *** CORRECTION: Now calling methods on the Referral data object ***
            writer.println(" URGENCY: " + referral.getUrgencyLevel()); 
            writer.println("===================================================");
            
            writer.println("\nPATIENT DETAILS:");
            writer.println("  Name: " + patient.getFirstName() + " " + patient.getLastName());
            writer.println("  NHS Number: " + patient.getNhsNumber());
            writer.println("  DOB: " + patient.getDateOfBirth());
            writer.println("  GP Surgery ID: " + patient.getGpSurgeryId());
            
            writer.println("\nREFERRAL DETAILS:");
            writer.println("  Referral ID: " + referral.getReferralId());
            writer.println("  Referred FROM: Clinician ID " + referral.getReferingClinicianId());
            writer.println("  Referred TO: Facility ID " + referral.getReferralFacilityId());
            writer.println("  Clinical Summary: " + referral.getClinicalSummary());
            writer.println("  Requested Investigations: " + referral.getRequestedInvestigations());
            writer.println("\n--- End of Referral ---\n");
            
            System.out.println("Referral letter generated and saved to " + filename);
            return true;
        } catch (IOException e) {
            System.err.println("Error writing referral file: " + e.getMessage());
            return false;
        }
    }
}