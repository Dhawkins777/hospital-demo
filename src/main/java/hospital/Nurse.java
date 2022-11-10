package hospital;

public class Nurse extends HospitalEmployee implements MedicalDuties{

    private int numPatients;

    public Nurse(String employeeNumber, String name, int i) {

        super(employeeNumber, name);
    }

    @Override
    public void careForPatient(Patient sickPatient) {

        sickPatient.increaseHealthLevel(5);
    }
    @Override
    public void drawBlood(Patient sickPatient) {

        sickPatient.decreaseBloodLevel(5);
    }
    @Override
    public int calculatePay() {
        return 50000;
    }
}
