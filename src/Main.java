public class Main {
    //Метод получения списка сотрудников
    public static void getInfo(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i]);
            }
        }
    }

    //Метод получения суммы затрат на ЗП в месяц
    public static double sumCountForSalaryEmployee(Employee[] arr) {
        double a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                a += arr[i].getSalary();
            }
        }
        return a;
//        System.out.println(String.format("Сумма затрат на ЗП в месяц: %s руб.", a));
    }

    //Метод получения сотрудника с минимальной ЗП
    public static void minSalaryEmployee(Employee[] arr) {
        double minSalary = arr[0].getSalary();
        Employee a = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (minSalary > arr[i].getSalary()) {
                    minSalary = arr[i].getSalary();
                    a = arr[i];
                }
            }
        }
        System.out.println(String.format("У сотрудника %s, отдела: %s, самая маленькая зарплата: %s", a.getFullName(), a.getDepartmentNumber(), a.getSalary()));
    }

    //Метод получения сотрудника с максимальной ЗП
    public static void maxSalaryEmployee(Employee[] arr) {
        double maxSalary = 0;
        Employee a = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (maxSalary < arr[i].getSalary()) {
                    maxSalary = arr[i].getSalary();
                    a = arr[i];
                }
            }
        }
        System.out.println(String.format("У сотрудника %s, отдела: %s, самая большая зарплата: %s", a.getFullName(), a.getDepartmentNumber(), a.getSalary()));
    }

    //Метод получения средний зарплаты
    public static double averageSalary(Employee[] arr) {
        double a = 0;
        int b = 0;
        for (Employee employee : arr)
            if (employee != null) {
                b++;
            }
        a = sumCountForSalaryEmployee(arr) / b;
        return a;
    }

    //Метод печати ФИО сотрудников
    public static void printFullName(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].getFullName());
            }
        }
    }


    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Иванов Иван Иванович", 1, 23000);
        employee[1] = new Employee("Позняк Григорий Петрович", 5, 52000);
        employee[2] = new Employee("Петров Евгений Сергеевич", 4, 100000);

        getInfo(employee);
        System.out.println();

        sumCountForSalaryEmployee(employee);
        System.out.println();

        minSalaryEmployee(employee);
        System.out.println();

        maxSalaryEmployee(employee);
        System.out.println();

        System.out.println(String.format("Средняя зарплата %s", averageSalary(employee)));
        System.out.println();

        printFullName(employee);


    }
}