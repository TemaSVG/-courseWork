public class EmployeeBook {
    private Employee[] collection;

    public EmployeeBook(Employee[] collection) {
        this.collection = collection;
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

    public Employee getMinSalaryEmployee() {
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
        return buffEmployee;
    }

    public Employee getMaxSalaryEmployee() {
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
        return buffEmployees;
    }

    public double getAverageSalaryEmployees() {
        int count = 0;
        for (Employee employee : collection)
            if (employee != null) {
                count++;
            }
        return getTotalSalaryEmployees() / count;
    }

    public Employee getEmployeeById(int id) {
        Employee buffEmployee = null;
        for (Employee employee : collection) {
            if (employee != null && employee.getId() == id) {
                buffEmployee = employee;
            }
        }
        return buffEmployee;
    }

    public Employee[] getEmployeesDepartment(int departmentNumber) {
        Employee[] buffArr = new Employee[collection.length];
        int i = 0;
        for (Employee employee : collection) {
            if (employee != null && employee.getDepartmentNumber() == departmentNumber) {
                buffArr[i] = employee;
                i++;
            }
        }
        return buffArr;
    }

    public Employee getMinSalaryEmployeeByDepartment(int departmentNumber) {
        return new EmployeeBook(getEmployeesDepartment(departmentNumber)).getMinSalaryEmployee();
    }

    public Employee getMaxSalaryEmployeeByDepartment(int departmentNumber) {
        return new EmployeeBook(getEmployeesDepartment(departmentNumber)).getMaxSalaryEmployee();
    }

    public double getTotalSalaryEmployeesToDepartment(int departmentNumber) {
        return new EmployeeBook(getEmployeesDepartment(departmentNumber)).getTotalSalaryEmployees();
    }

    public double getAverageSalaryEmployeesToDepartment(int departmentNumber) {
        return new EmployeeBook(getEmployeesDepartment(departmentNumber)).getAverageSalaryEmployees();
    }

    public void indexingSalaryEmployeesToDepartment(int departmentNumber, int index) {
        new EmployeeBook(getEmployeesDepartment(departmentNumber)).indexingSalaryEmployees(index);
    }

    public void indexingSalaryEmployees(double index) {
        double IndexingSalary = 0;
        for (Employee employee : collection) {
            if (employee != null) {
                IndexingSalary = employee.getSalary() / 100 * index;
                employee.setSalary(IndexingSalary + employee.getSalary());
            }

        }
    }

    public void printListEmployees() {
        for (Employee employee : collection) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public void printFullNameEmployees() {
        for (Employee employee : collection) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    public void printListEployeesByDepartment(int departmentNumber) {
        for (Employee employee : getEmployeesDepartment(departmentNumber)) {
            if (employee != null)
            System.out.println(String.format("Сотрудник %s: %s, заработная плата: %s руб.", employee.getId(), employee.getFullName(), employee.getSalary()));
        }

    }

    public void printEmployeesWithLessSalaryThanNumber(int number) {
        for (Employee employee : collection) {
            if (employee != null && employee.getSalary() < number) {
                System.out.println(String.format("Сотрудник %s: %s, заработная плата: %s руб.", employee.getId(), employee.getFullName(), employee.getSalary()));
            }
        }
    }

    public void printEmployeesWithMoreSalaryThanNumber(int number) {
        for (Employee employee : collection) {
            if (employee != null && employee.getSalary() > number) {
                System.out.println(String.format("Сотрудник %s: %s, заработная плата: %s руб.", employee.getId(), employee.getFullName(), employee.getSalary()));
            }
        }
    }

    public void addEmployee(Employee newEmployee) {
        int i = 0;
        for (Employee employee : collection) {
            if (employee == null) {
                collection[i] = newEmployee;
                break;
            } else {
                i++;
            }
        }
    }

    public void deleteEmployee(int id) {
        int i = 0;
        for (Employee employee : collection) {
            if (employee.getId() == id) {
                collection[i] = null;
                break;
            } else {
                i++;
            }
        }
    }

}
