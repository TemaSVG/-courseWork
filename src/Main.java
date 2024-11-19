public class Main {

    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Иванов Иван Иванович", 1, 23000);
        employee[1] = new Employee("Позняк Григорий Петрович", 2, 52000);
        employee[2] = new Employee("Петров Евгений Сергеевич", 2, 100000);
        EmployeeBook book = new EmployeeBook(employee);
        book.printListEmployees();
        System.out.println();
        System.out.println(String.format("Общая сумма зарплат сотрудников %.2f руб.",book.getTotalSalaryEmployees()));
        System.out.println();
        System.out.println(book.getMinSalaryEmployee());
        System.out.println();
        System.out.println(book.getMaxSalaryEmployee());
        System.out.println();
        System.out.println(String.format("Средняя зарплата сотрудников %.2f руб.", book.getAverageSalaryEmployees()));
        System.out.println();
        book.indexingSalaryEmployees(2.5);
        System.out.println(book.getMinSalaryEmployeeByDepartment(2));
        System.out.println();
        System.out.println(book.getMaxSalaryEmployeeByDepartment(2));
        System.out.println();
        System.out.println(book.getTotalSalaryEmployeesToDepartment(2));
        System.out.println();
        System.out.println(book.getAverageSalaryEmployeesToDepartment(2));
        System.out.println();
        book.indexingSalaryEmployeesToDepartment(2, 10);
        book.printListEployeesByDepartment(2);
        book.addEmployee(new Employee("Артомонов Геннадий Васильевич", 2, 49000));
        book.addEmployee(new Employee("Новиков Родион Никитич", 3, 46000));
        book.addEmployee(new Employee("Пантелеев Максим Эдуардович", 4, 80000));
        System.out.println();
        book.printListEmployees();
        book.deleteEmployee(4);
        System.out.println();
        book.printListEmployees();
        System.out.println();
        System.out.println(book.getEmployeeById(1));
        System.out.println();
        book.printListEployeesByDepartment(2);
        System.out.println();
        book.printEmployeesWithLessSalaryThanNumber(60000);
        System.out.println();
        book.printEmployeesWithMoreSalaryThanNumber(25000);
    }
}