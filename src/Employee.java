import java.util.Objects;

public class Employee {
    private String fullName;
    private int departmentNumber;
    private double salary;
    private static int count;
    private int id;


    public Employee(String fullName, int departmentNumber, double salary) {
        id = incrementId();
        this.fullName = fullName;
        this.departmentNumber = departmentNumber;
        this.salary = salary;

    }

    public int getId() {
        return id;
    }

    public static int incrementId() {
        count++;
        return count;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Employee employee)) {
            return false;
        }
        return departmentNumber == employee.departmentNumber && Double.compare(salary, employee.salary) == 0 && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, departmentNumber, salary);
    }

    @Override
    public String toString() {
        return String.format("Сотрудник %s: %s, отдел: %s, заработная плата: %s руб.", id, fullName, departmentNumber, salary);
    }

}
