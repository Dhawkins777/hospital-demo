package hospital;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class Hospital {


    Map<String, HospitalEmployee> employeeList = new HashMap<>();
    Map<Integer, Patient> patientList = new HashMap<>();
    private int patientId;
    private Patient patientToAdmit;

    public void hire(HospitalEmployee employeeToHire) {
        employeeList.put(employeeToHire.getEmployeeNumber(), employeeToHire);
    }

    public HospitalEmployee findEmployee(String employeeNumber) {
        return employeeList.get(employeeNumber);
    }

    public Collection<HospitalEmployee> getAllEmployees() {
        return employeeList.values();
    }

    public Collection<HospitalEmployee> getMedicalEmployees() {
        Collection<HospitalEmployee> medicalEmployees = new ArrayList<>();
        for(HospitalEmployee employee: employeeList.values()){
            if (employee instanceof MedicalDuties){
                medicalEmployees.add(employee);
            }
        }
        return medicalEmployees;
    }
    public void admit(Patient PatientToAdmit) {
        patientId++;
        patientList.put(patientId, patientToAdmit);

    }

    public Collection<Patient> getAllPatients() {
        return patientList.values();
    }


    public void addEmployee(Doctor doctor) {
    }

    public void addEmployee(Nurse nurse) {
    }

    public void addEmployee(Receptionist receptionist) {
    }

    public void addEmployee(Janitor janitor) {
    }

    public void showPayRates() {
    }

    public void showAllMedicalPersonal() {
    }

    public void showAllEmployees() {
        ArrayList<Employee>employeeList = new ArrayList<>(employees.values());
        Collections.sort(employeeList);
        for(Employee employee: employeeList){
            System.out.println(employee.getEmpName() + " " + employee.getEmpNumber());
        }


//        for(Employee employee: employees.values()) {
//            System.out.println(employee.getEmpName() + " " + employee.getEmpNumber());
//        }
    }
}
