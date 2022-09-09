public class Main {
    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();
        Employee employee1 = new Employee("Иванов Иван Иванович", 2, 25700.15);
        employeeBook.addEmployee(employee1);
        Employee employee2  = new Employee("Петров Петр Петрович", 4, 45000.25);
        employeeBook.addEmployee(employee2);
        Employee employee3  = new Employee("Семенов Семен Семенович", 3, 55000.30);
        employeeBook.addEmployee(employee3);
        Employee employee4  = new Employee("Александров Александр Александрович", 2, 35500.25);
        employeeBook.addEmployee(employee4);
        Employee employee5  = new Employee("Алексеев Алексей Алексеевич", 2, 50000.50);
        employeeBook.addEmployee(employee5);

       // employeeBook.allEmployees();

       // employeeBook.deleteEmployee(4);
        //employeeBook.allEmployees();

        employeeBook.allEmployeesTwo();

        //task1

//        System.out.println("Cумма затрат на зарплаты в месяц " + sumOfSalaries(employee));
//        minSalaryOfAnEmployee(employee);
//        maxSalaryOfAnEmployee(employee);
//        System.out.println("Cреднее значение зарплат " + averageValueOfSalaries(employee));
//        allEmployees(employee);


        //task2
        // salaryIndex(employee, 50);
        // minSalaryInDepartment(employee, 1);
        //sumOnDepartment(employee, 200, 1);

        //System.out.println(averageValueOfSalariesDep(employee, 1));
        // empDepartment(employee, 1);

        //  salaryLessNumber(employee, 50000);
        // salaryMoreNumber(employee, 47000);

    }


}

