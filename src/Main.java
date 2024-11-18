public class Main {

    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Иванов Иван Иванович", 1, 23000);
        employee[1] = new Employee("Позняк Григорий Петрович", 5, 52000);
        employee[2] = new Employee("Петров Евгений Сергеевич", 4, 100000);
        EmployeeBook book = new EmployeeBook(employee);
        book.printInfoEmployees();
        System.out.println(book.getTotalSalaryEmployees());
        book.printMinSalaryEmployee();
        book.printMaxSalaryEmployee();
        System.out.println(String.format("Средняя зарплата %.2f", book.getAverageSalary()));
        book.printFullNameEmployees();
    }
}