public class Main {
    public static void main(String[] args) {

        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Иванов Иван Иванович", 1, 135700.15);
        employee[1] = new Employee("Петров Петр Петрович", 2, 45000.25);
        employee[2] = new Employee("Семенов Семен Семенович", 3, 55000.30);
        employee[3] = new Employee("Александров Александр Александрович", 4, 35500.25);
        employee[4] = new Employee("Алексеев Алексей Алексеевич", 5, 50000.50);

        System.out.println("Cумма затрат на зарплаты в месяц " + sumOfSalaries(employee));
        minSalaryOfAnEmployee(employee);
        maxSalaryOfAnEmployee(employee);
        System.out.println("Cреднее значение зарплат " + averageValueOfSalaries(employee));
        allEmployees(employee);

    }

    public static double sumOfSalaries(Employee[] emp) {
        double totalSalary = 0;
        for (int i = 0; i < emp.length; i++) {
            if (emp[i] != null) {
                totalSalary += emp[i].getSalary();
            }
        }
        return totalSalary;
    }

    public static void minSalaryOfAnEmployee(Employee[] emp) {
        String name = emp[0].getFullName();
        double minSalary = emp [0].getSalary();
        for (int i = 0; i < emp.length; i++) {
            if (emp[i] != null && emp[i].getSalary() < minSalary) {
                minSalary = emp[i].getSalary();
                name = emp[i].getFullName();
            }
        }
        System.out.println("Cотрудник " + name + " с минимальной зарплатой " + minSalary);
    }

    public static void maxSalaryOfAnEmployee(Employee[] emp) {
        String name = "Нет такого сотрудника";
        double maxSalary = emp[0].getSalary();
        for (int i = 0; i < emp.length; i++) {
            if (emp[i] != null && emp[i].getSalary() >= maxSalary) {
                maxSalary = emp[i].getSalary();
                name = emp[i].getFullName();
            }
        }
        System.out.println("Cотрудник " + name + " с максимальной  зарплатой " + maxSalary);
    }

    public static double averageValueOfSalaries(Employee [] emp) {
        int sumEmp = 0;
        for (int i = 0; i < emp.length; i++) {
            if (emp[i] != null) {
                sumEmp++;
            }
        }
        return sumOfSalaries(emp) / sumEmp;
    }

    public static void allEmployees(Employee[] emp) {
        for (int i = 0; i < emp.length; i++) {
            if (emp[i] != null) {
                System.out.println(emp[i].getFullName());
            }
        }
    }
}
