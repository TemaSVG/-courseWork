public class EmployeeBook extends Employee{
   private Employee[] employees = new Employee[10];

    public EmployeeBook(String fullName, int departmentNumber, double salary, Employee[] employees) {
        super(fullName, departmentNumber, salary);
        this.employees = employees;
    }

    public void getInfo(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i]);
            }
        }
    }

}
