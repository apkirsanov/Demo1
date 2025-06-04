package homework_6;

public class Patient {
    int treatPlan;
    Doctor doctor;
    public int getTreatPlan() {
        return treatPlan;
    }
    public void setTreatPlan(int treatPlan) {
        this.treatPlan = treatPlan;
    }
    public Doctor getDoctor() {
        return doctor;
    }
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}