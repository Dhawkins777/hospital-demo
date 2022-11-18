package hospital;

public abstract class Employee implements Comparable<Employee> {

    protected String empNumber;
    protected String empName;

    public String getEmpNumber() {
        return empNumber;
    }

    public String getEmpName(){
        return empName;
    }

    public abstract String paySalary();


    @Override
    public String toString() {
        return "Employee [empName=" + empName + "]";
    }

    @Override
    public int compareTo(Employee employee) {
        if(this.getEmpName().compareTo(employee.getEmpName()) < 0){
            return -1;
        } else if (this.getEmpName().compareTo(employee.getEmpName()) > 0) {
            return 1;
        } else {
            return 0;
        }

    }
}
