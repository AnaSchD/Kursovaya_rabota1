public class EmployeeBook {

    private Employee[] employee = new Employee[10];


    public double sumOfSalaries() {
        double totalSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                totalSalary += employee[i].getSalary();
            }
        }
        return totalSalary;
    }

    public void minSalaryOfAnEmployee() {
        String name = employee[0].getFullName();
        double minSalary = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() < minSalary) {
                minSalary = employee[i].getSalary();
                name = employee[i].getFullName();
            }
        }
        System.out.println("Cотрудник " + name + " с минимальной зарплатой " + minSalary);
    }

    public void maxSalaryOfAnEmployee() {
        String name = "Нет такого сотрудника";
        double maxSalary = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() >= maxSalary) {
                maxSalary = employee[i].getSalary();
                name = employee[i].getFullName();
            }
        }
        System.out.println("Cотрудник " + name + " с максимальной  зарплатой " + maxSalary);
    }

    public double averageValueOfSalaries() {
        int sumEmp = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                sumEmp++;
            }
        }
        return sumOfSalaries() / sumEmp;
    }

    public void allEmployees() {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println(employee[i].getFullName());
            }
        }
    }

    public void salaryIndex(double index) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                employee[i].setSalary((employee[i].getSalary() / 100 * index) + employee[i].getSalary());
            }
        }
    }

    public void minSalaryInDepartment(int dep) {
        String name = null;
        double minSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartmentNumber() == dep) {
                name = employee[i].getFullName();
                minSalary = employee[i].getSalary();
                break;
            }
        }
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartmentNumber() == dep) {
                if (employee[i].getSalary() < minSalary) {
                    minSalary = employee[i].getSalary();
                    name = employee[i].getFullName();
                }
            }
        }
        System.out.println("Cотрудник " + name + " с минимальной зарплатой " + minSalary + " в отделе " + dep);
    }

    public void maxSalaryInDepartment(int dep) {
        String name = null;
        double maxSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartmentNumber() == dep) {
                name = employee[i].getFullName();
                maxSalary = employee[i].getSalary();
                break;
            }
        }
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartmentNumber() == dep) {
                if (employee[i].getSalary() > maxSalary) {
                    maxSalary = employee[i].getSalary();
                    name = employee[i].getFullName();

                }
            }
        }
        System.out.println("Cотрудник " + name + " с максимальной зарплатой " + maxSalary + " в отделе " + dep);
    }

    public double averageValueOfSalariesDep(int dep) {
        int sumEmpDep = 0;
        int a = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartmentNumber() == dep) {
                sumEmpDep += employee[i].getSalary();
                a++;
            }
        }
        return sumEmpDep / a;
    }

    public void sumOnDepartment(double index, int dep) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartmentNumber() == dep) {
                employee[i].setSalary((employee[i].getSalary() / 100 * index) + employee[i].getSalary());
                System.out.println("Cотрудник " + employee[i].getFullName() + " " + employee[i].getSalary());
            }
        }
    }

    public void empDepartment(int dep) {
        if (dep < 1 || dep > 5) {
            System.out.println("Такого отдела у нас нет");
            return;
        }
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartmentNumber() == dep) {
                System.out.println("Сотрудник " + employee[i].getFullName() + " зарплата " + employee[i].getSalary());
            }
        }
    }

    public void salaryLessNumber(double number) {

        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() < number) {
                System.out.println("Id: " + employee[i].getId() + " " + employee[i].getFullName() + " зарплата " + employee[i].getSalary());
            }
        }
    }

    public void salaryMoreNumber(double number) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() >= number) {
                System.out.println("Id: " + employee[i].getId() + " " + employee[i].getFullName() + " зарплата " + employee[i].getSalary());
            }
        }
    }

    public void addEmployee(Employee newEmployee) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                employee[i] = newEmployee;
                return;
            }
        }
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getId() == id) {
                employee[i] = null;
                return;
            }
        }
    }

    public void changeSalaryEmployee(String fullName, double newSalary) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getFullName() == fullName) {
                employee[i].setSalary(newSalary);
            }
        }
    }

    public void changeDepartmentEmployee(String fullName, int department) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getFullName() == fullName) {
                employee[i].setDepartmentNumber(department);
            }
        }
    }

    public void allEmployeesTwo() {


        for (int dep = 0; dep < 6; dep++) {
            for ( int i = 0; i < employee.length; i++) {
                if (employee[i] != null && employee[i].getDepartmentNumber() == dep) {
                    System.out.println("Номер отдела " + employee[i].getDepartmentNumber() + " ФИО " + employee[i].getFullName());
                }
            }
        }
    }

}

