public class EmployeeBook {
    private Employee[] collection;

    public EmployeeBook(Employee[] collection) {
        this.collection = collection;
    }

    public void printInfoEmployees() {
        for (Employee employee : collection) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }
    
    public double getTotalSalaryEmployees() {
        double result = 0;
        for (Employee employee : collection) {
            if (employee != null) {
                result += employee.getSalary();
            }
        }
        return result;
    }
    
    public void printMinSalaryEmployee() {
        double minSalary = collection[0].getSalary();
        Employee buffEmployee = collection[0];
        for (Employee employee : collection) {
            if (employee != null) {
                if (minSalary > employee.getSalary()) {
                    minSalary = employee.getSalary();
                    buffEmployee = employee;
                }
            }
        }
        System.out.println(String.format("У сотрудника %s, отдела: %s, самая маленькая зарплата: %s", buffEmployee.getFullName(), buffEmployee.getDepartmentNumber(), buffEmployee.getSalary()));
    }
    
    public void printMaxSalaryEmployee() {
        double maxSalary = 0;
        Employee buffEmployees = collection[0];
        for (Employee employee : collection) {
            if (employee != null) {
                if (maxSalary < employee.getSalary()) {
                    maxSalary = employee.getSalary();
                    buffEmployees = employee;
                }
            }
        }
        System.out.println(String.format("У сотрудника %s, отдела: %s, самая большая зарплата: %s", buffEmployees.getFullName(), buffEmployees.getDepartmentNumber(), buffEmployees.getSalary()));
    }
    
    public double getAverageSalary() {
        int count = 0;
        for (Employee employee : collection)
            if (employee != null) {
                count++;
            }
        return getTotalSalaryEmployees() / count;
    }
    
    public void printFullNameEmployees() {
        for (Employee employee : collection) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}
