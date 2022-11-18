package hospital;

public class HospitalApp {
    private static String Administrator;

    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Doctor derek = new Doctor("56", "Derek", "Heart");
        Surgeon mike = new Surgeon("57", "Mike", "Brain",true);
        Nurse patty = new Nurse("58", "Patty", 5);
        Receptionist nicole = new Receptionist("59", "Nicole", Administrator, false);
        Janitor dean = new Janitor("60", "Dean", Administrator, true);

        hospital.addEmployee(derek);
        hospital.addEmployee(mike);
        hospital.addEmployee(patty);
        hospital.addEmployee(nicole);
        hospital.addEmployee(dean);

        System.out.println("Here are the salary rates at the hospital:");
        hospital.showPayRates();

        System.out.println("Here are the employees who can give medical care: ");
        hospital.showAllMedicalPersonal();

        hospital.showAllEmployees();
    }
}
