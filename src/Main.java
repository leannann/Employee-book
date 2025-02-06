//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double calculateTotalSalary(){
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public static Employee findMinSalaryEmployee(){
        Employee minEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minEmployee.getSalary()) {
                minEmployee = employee;
            }
        }
        return minEmployee;
    }

    public static Employee findMaxSalaryEmployee(){
        Employee maxEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxEmployee.getSalary()) {
                maxEmployee = employee;
            }
        }
        return maxEmployee;
    }

    public static double calculateAverageSalary(){
        int employeesCount = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                employeesCount++;
            }
        }
        return calculateTotalSalary() / employeesCount;
    }

    public static void printAllFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    public static void indexationSalary(double index){
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() * (1 + index / 100));
            }
        }
    }

    public static Employee findMinSalaryEmployeeByDepartment(int department){
        if (department < 1 || department > 5){
            throw new IllegalArgumentException("У нас есть отделы только с номерами от 1 до 5");
        }

        Employee minEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                if (minEmployee == null || employee.getSalary() < minEmployee.getSalary()) {
                    minEmployee = employee;
                }
            }
        }
        if (minEmployee == null){
            throw new RuntimeException("В отделе " + department + " нет сотрудников");
        }

        return minEmployee;
    }

    public static Employee findMaxSalaryEmployeeByDepartment(int department){
        if (department < 1 || department > 5){
            throw new IllegalArgumentException("У нас есть отделы только с номерами от 1 до 5");
        }

        Employee maxEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                if (maxEmployee == null || employee.getSalary() > maxEmployee.getSalary()) {
                    maxEmployee = employee;
                }
            }
        }
        if (maxEmployee == null){
            throw new RuntimeException("В отделе " + department + " нет сотрудников");
        }

        return maxEmployee;
    }

    public static double calculateTotalSalaryByDepartment(int department){
        if (department < 1 || department > 5){
            throw new IllegalArgumentException("У нас есть отделы только с номерами от 1 до 5");
        }

        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public static double calculateAverageSalaryByDepartment(int department){
        if (department < 1 || department > 5){
            throw new IllegalArgumentException("У нас есть отделы только с номерами от 1 до 5");
        }

        int employeesCount = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                employeesCount++;
            }
        }
        return calculateTotalSalaryByDepartment(department) / employeesCount;
    }

    public static void indexationSalaryByDepartment(double index, int department){
        if (department < 1 || department > 5){
            throw new IllegalArgumentException("У нас есть отделы только с номерами от 1 до 5");
        }

        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                employee.setSalary(employee.getSalary() * (1 + index / 100));
            }
        }
    }

    public static void printEmployeesByDepartment(int department) {
        if (department < 1 || department > 5){
            throw new IllegalArgumentException("У нас есть отделы только с номерами от 1 до 5");
        }

        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println("ID: " + employee.getId() + ", ФИО: " + employee.getFullName() + ", Зарплата: " + employee.getSalary());
            }
        }
    }

    public static void printEmployeesWithSalaryLessThan(double amount) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < amount) {
                System.out.println("ID: " + employee.getId() + ", ФИО: " + employee.getFullName() + ", Зарплата: " + employee.getSalary());
            }
        }
    }

    public static void printEmployeesWithSalaryGreaterThanOrEqual(double amount) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= amount) {
                System.out.println("ID: " + employee.getId() + ", ФИО: " + employee.getFullName() + ", Зарплата: " + employee.getSalary());
            }
        }
    }


    public static void main(String[] args) {
        employees[0] = new Employee("Глазков Артур Александрович", 3, 50000);
        employees[1] = new Employee("Гуркина Мария Александровна", 2, 60000);
        employees[2] = new Employee("Пинаева Софья Николаевна", 1, 70000);
        employees[3] = new Employee("Потапов Семен Сергеевич", 4, 55000);
        employees[4] = new Employee("Ступакова Виктория Александровна", 5, 65000);
        employees[5] = new Employee("Струкова Виктория Вадимовна", 1, 48000);
        employees[6] = new Employee("Тельпуховская Екатерина Александровна", 2, 52000);
        employees[7] = new Employee("Терзи Андрей Сергеевич", 3, 71000);
        employees[8] = new Employee("Косачева Ксения Александровна", 4, 53000);
        employees[9] = new Employee("Шабанова Татьяна Андреевна", 5, 59000);

        // Получить список всех сотрудников со всеми имеющимися по ним данными
        // (вывести в консоль значения всех полей (toString));
        System.out.println("Список всех сотрудников со всеми имеющимися по ним данными:");
        printAllEmployees();

        //  Посчитать сумму затрат на ЗП в месяц;
        System.out.println("Сумма затрат на ЗП в месяц:");
        System.out.println(calculateTotalSalary());

        // Найти сотрудника с минимальной ЗП;
        System.out.println("Сотрудник с минимальной зарплатой:");
        System.out.println(findMinSalaryEmployee());

        // Найти сотрудника с максимальной ЗП;
        System.out.println("Сотрудник с максимальной зарплатой:");
        System.out.println(findMaxSalaryEmployee());

        // Подсчитать среднее значение зарплат;
        System.out.println("Среднее значение зарплаты:");
        System.out.println(calculateAverageSalary());

        // Распечатать ФИО всех сотрудников;
        System.out.println("Список ФИО всех сотрудников:");
        printAllFullNames();

        //  Проиндексировать зарплату всех сотрудников отдела на процент,
        //  который приходит в качестве параметра;
        indexationSalary(5); // индексируем зарплату на 5%
        System.out.println("Зарплата сотрудников после индексации на 5%:");
        printAllEmployees();

        // Сотрудники с минимальной зп по отделу;
        System.out.println("Сотрудники с минимальной зарплатой по отделам:");
        System.out.println(findMinSalaryEmployeeByDepartment(1));
        System.out.println(findMinSalaryEmployeeByDepartment(2));
        System.out.println(findMinSalaryEmployeeByDepartment(3));
        System.out.println(findMinSalaryEmployeeByDepartment(4));
        System.out.println(findMinSalaryEmployeeByDepartment(5));

        // Сотрудники с максимальной зп по отделу;
        System.out.println("Сотрудники с максимальной зарплатой по отделам:");
        System.out.println(findMaxSalaryEmployeeByDepartment(1));
        System.out.println(findMaxSalaryEmployeeByDepartment(2));
        System.out.println(findMaxSalaryEmployeeByDepartment(3));
        System.out.println(findMaxSalaryEmployeeByDepartment(4));
        System.out.println(findMaxSalaryEmployeeByDepartment(5));

        // Сумму затрат на зп по отделам;
        System.out.println("Сумма затрат на ЗП в месяц по отделам:");
        System.out.println(calculateTotalSalaryByDepartment(1));
        System.out.println(calculateTotalSalaryByDepartment(2));
        System.out.println(calculateTotalSalaryByDepartment(3));
        System.out.println(calculateTotalSalaryByDepartment(4));
        System.out.println(calculateTotalSalaryByDepartment(5));
        // Среднюю зп по отделам;
        System.out.println("Средние зп по отделам:");
        System.out.println(calculateAverageSalaryByDepartment(1));
        System.out.println(calculateAverageSalaryByDepartment(2));
        System.out.println(calculateAverageSalaryByDepartment(3));
        System.out.println(calculateAverageSalaryByDepartment(4));
        System.out.println(calculateAverageSalaryByDepartment(5));
        // Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра;
        System.out.println("Зарплата сотрудников отдела 3 до индексации на 10%");
        printEmployeesByDepartment(3);
        System.out.println("Зарплата сотрудников отдела 3 после индексации на 10%");
        indexationSalaryByDepartment(5, 3);
        printEmployeesByDepartment(3);
        // Напечатать всех сотрудников отдела (все данные, кроме отдела).
        System.out.println("Данные сотрудников отдела 2");
        printEmployeesByDepartment(2);
        //Всех сотрудников с зп меньше числа (распечатать id, фио и зп в консоль);
        System.out.println("Сотрудники с зарплатой меньше 70000:");
        printEmployeesWithSalaryLessThan(70000);
        //Всех сотрудников с зп больше (или равно) числа (распечатать id, фио и зп в консоль).
        System.out.println("Сотрудники с зарплатой больше или равно 70000:");
        printEmployeesWithSalaryGreaterThanOrEqual(70000);

    }
}