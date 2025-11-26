package model;

import java.util.ArrayList;
import java.util.List;

public class SingletonReferralManager {
    private static SingletonReferralManager instance;
    private List<SingletonReferralManager> referralQueue;

    private SingletonReferralManager() {
        referralQueue = new ArrayList<>();
    }

    public static SingletonReferralManager getInstance() {
        if (instance == null) {
            instance = new SingletonReferralManager();
        }
        return instance;
    }

    public void addReferral(SingletonReferralManager referral) {
        referralQueue.add(referral);
        // Optionally generate referral text file
    }

    public List<SingletonReferralManager> getReferralQueue() {
        return referralQueue;
    }
}
