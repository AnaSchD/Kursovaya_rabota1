public class Employee {

    private String fullName;
    private int departmentNumber;
    private double salary;

    public static int counter;
    private int id = counter;


    public Employee(String fullName, int departmentNumber, double salary) {
        this.fullName = fullName;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
        counter++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int newDepartmentNumber) {
        this.departmentNumber = newDepartmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }


}
