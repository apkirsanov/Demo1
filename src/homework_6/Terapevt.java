package homework_6;

public class Terapevt extends Doctor {
    @Override
    public void treat() {
        System.out.println("Проводит осмотр и назначет лечение");
    }
    public void assignDoctor(Patient patient) {
        int treatPlan = patient.getTreatPlan();
        Doctor doctor;
        if (treatPlan == 1) {
            doctor = new Hirurg();
        } else if (treatPlan == 2) {
            doctor = new Dantist();
        } else {
            doctor = this;
        }
        patient.setDoctor(doctor);
        doctor.treat();
    }
}