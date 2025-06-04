package homework_6;

public class Main {
    public static void main(String[] args) {
        Terapevt terapevt = new Terapevt();
        Patient patient = new Patient();
        patient.setTreatPlan(2);
        terapevt.assignDoctor(patient);
        System.out.println("Согласно плану лечения назначен: " + patient.getDoctor().getClass().getSimpleName());
    }
}