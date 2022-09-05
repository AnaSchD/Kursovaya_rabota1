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

    public String setFullName( String newFullName) {
        this.fullName = newFullName;
        return newFullName;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public int setDepartmentNumber(int newDepartmentNumber) {
        this.departmentNumber = newDepartmentNumber;
        return departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    public double setSalary(double newSalary) {
        this.salary = newSalary;
        return salary;
    }

}
