package org.APCSLowell;

public class StepTracker {
    private int activeDays = 0;
    private int days = 0;
    private int steps = 0;
    private int threshold;

    public StepTracker(int activityThreshold) {
        threshold = activityThreshold;
    }

    void addDailySteps(int stepCount) {
        days++;
        if (stepCount >= threshold) activeDays++;
        steps += stepCount;
    }

    int activeDays() {
        return activeDays;
    }

    double averageSteps() {
        if (days == 0) return 0.0;
        return (double) steps / days;
    }
}