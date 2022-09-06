public class Main {
    public static void main(String[] args) {

        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Иванов Иван Иванович", 2, 25700.15);
        employee[1] = new Employee("Петров Петр Петрович", 2, 45000.25);
        employee[2] = new Employee("Семенов Семен Семенович", 3, 55000.30);
        employee[3] = new Employee("Александров Александр Александрович", 2, 35500.25);
        employee[4] = new Employee("Алексеев Алексей Алексеевич", 2, 50000.50);
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
        empDepartment(employee, 1);
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
        double minSalary = emp[0].getSalary();
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

    public static double averageValueOfSalaries(Employee[] emp) {
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

    public static void salaryIndex(Employee[] emp, double index) {
        for (int i = 0; i < emp.length; i++) {
            if (emp[i] != null) {
                emp[i].setSalary((emp[i].getSalary() / 100 * index) + emp[i].getSalary());
            }
        }
    }

    public static void minSalaryInDepartment(Employee[] emp, int dep) {
        String name = null;
        double minSalary = 0;
        for (int i = 0; i < emp.length; i++) {
            if (emp[i] != null && emp[i].getDepartmentNumber() == dep) {
                name = emp[i].getFullName();
                minSalary = emp[i].getSalary();
                break;
            }
        }
        for (int i = 0; i < emp.length; i++) {
            if (emp[i] != null && emp[i].getDepartmentNumber() == dep) {
                if (emp[i].getSalary() < minSalary) {
                    minSalary = emp[i].getSalary();
                    name = emp[i].getFullName();
                }
            }
        }
        System.out.println("Cотрудник " + name + " с минимальной зарплатой " + minSalary + " в отделе " + dep);
    }

    public static void maxSalaryInDepartment(Employee[] emp, int dep) {
        String name = null;
        double maxSalary = 0;
        for (int i = 0; i < emp.length; i++) {
            if (emp[i] != null && emp[i].getDepartmentNumber() == dep) {
                name = emp[i].getFullName();
                maxSalary = emp[i].getSalary();
                break;
            }
        }
        for (int i = 0; i < emp.length; i++) {
            if (emp[i] != null && emp[i].getDepartmentNumber() == dep) {
                if (emp[i].getSalary() > maxSalary) {
                    maxSalary = emp[i].getSalary();
                    name = emp[i].getFullName();

                }
            }
        }
        System.out.println("Cотрудник " + name + " с максимальной зарплатой " + maxSalary + " в отделе " + dep);
    }

    public static double averageValueOfSalariesDep(Employee[] emp, int dep) {
        int sumEmpDep = 0;
        int a = 0;
        for (int i = 0; i < emp.length; i++) {
            if (emp[i] != null && emp[i].getDepartmentNumber() == dep) {
                sumEmpDep += emp[i].getSalary();
                a++;
            }
        }
        return sumEmpDep / a;
    }

    public static void sumOnDepartment(Employee[] emp, double index, int dep) {
        for (int i = 0; i < emp.length; i++) {
            if (emp[i] != null && emp[i].getDepartmentNumber() == dep) {
                emp[i].setSalary((emp[i].getSalary() / 100 * index) + emp[i].getSalary());
                System.out.println("Cотрудник " + emp[i].getFullName() + " " + emp[i].getSalary());
            }
        }
    }

    public static void empDepartment(Employee[] emp, int dep) {
        if (dep  <1 || dep > 5){
            System.out.println("Такого отдела у нас нет");
            return;
        }
        for (int i = 0; i < emp.length; i++) {
            if (emp[i] != null && emp[i].getDepartmentNumber() == dep) {
                System.out.println("Сотрудник " + emp[i].getFullName() + " зарплата " + emp[i].getSalary());
            }
        }

    }
}
