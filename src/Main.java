//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook(10);

        // Проверка метода addEmployee
        employeeBook.addEmployee(new Employee("Глазков Артур Александрович", 3, 50000));
        employeeBook.addEmployee(new Employee("Гуркина Мария Александровна", 2, 60000));
        employeeBook.addEmployee(new Employee("Пинаева Софья Николаевна", 1, 70000));
        employeeBook.addEmployee(new Employee("Потапов Семен Сергеевич", 4, 55000));
        employeeBook.addEmployee(new Employee("Ступакова Виктория Александровна", 5, 65000));
        employeeBook.addEmployee(new Employee("Струкова Виктория Вадимовна", 1, 48000));
        employeeBook.addEmployee(new Employee("Тельпуховская Екатерина Александровна", 2, 52000));
        employeeBook.addEmployee(new Employee("Терзи Андрей Сергеевич", 3, 71000));
        employeeBook.addEmployee(new Employee("Косачева Ксения Александровна", 4, 53000));
        employeeBook.addEmployee(new Employee("Шабанова Татьяна Андреевна", 5, 59000));

        // Получить список всех сотрудников со всеми имеющимися по ним данными
        // (вывести в консоль значения всех полей (toString));
        System.out.println("Список всех сотрудников со всеми имеющимися по ним данными:");
        employeeBook.printAllEmployees();

        //  Посчитать сумму затрат на ЗП в месяц;
        System.out.println("Сумма затрат на ЗП в месяц:");
        System.out.println(employeeBook.calculateTotalSalary());

        // Найти сотрудника с минимальной ЗП;
        System.out.println("Сотрудник с минимальной зарплатой:");
        System.out.println(employeeBook.findMinSalaryEmployee());

        // Найти сотрудника с максимальной ЗП;
        System.out.println("Сотрудник с максимальной зарплатой:");
        System.out.println(employeeBook.findMaxSalaryEmployee());

        // Подсчитать среднее значение зарплат;
        System.out.println("Среднее значение зарплаты:");
        System.out.println(employeeBook.calculateAverageSalary());

        // Распечатать ФИО всех сотрудников;
        System.out.println("Список ФИО всех сотрудников:");
        employeeBook.printAllFullNames();

        //  Проиндексировать зарплату всех сотрудников отдела на процент,
        //  который приходит в качестве параметра;
        employeeBook.indexationSalary(5); // индексируем зарплату на 5%
        System.out.println("Зарплата сотрудников после индексации на 5%:");
        employeeBook.printAllEmployees();
        // Сотрудники с минимальной зп по отделу;
        System.out.println("Сотрудники с минимальной зарплатой по отделам:");
        System.out.println(employeeBook.findMinSalaryEmployeeByDepartment(1));
        System.out.println(employeeBook.findMinSalaryEmployeeByDepartment(2));
        System.out.println(employeeBook.findMinSalaryEmployeeByDepartment(3));
        System.out.println(employeeBook.findMinSalaryEmployeeByDepartment(4));
        System.out.println(employeeBook.findMinSalaryEmployeeByDepartment(5));

        // Сотрудники с максимальной зп по отделу;
        System.out.println("Сотрудники с максимальной зарплатой по отделам:");
        System.out.println(employeeBook.findMaxSalaryEmployeeByDepartment(1));
        System.out.println(employeeBook.findMaxSalaryEmployeeByDepartment(2));
        System.out.println(employeeBook.findMaxSalaryEmployeeByDepartment(3));
        System.out.println(employeeBook.findMaxSalaryEmployeeByDepartment(4));
        System.out.println(employeeBook.findMaxSalaryEmployeeByDepartment(5));

        // Сумму затрат на зп по отделам;
        System.out.println("Сумма затрат на ЗП в месяц по отделам:");
        System.out.println(employeeBook.calculateTotalSalaryByDepartment(1));
        System.out.println(employeeBook.calculateTotalSalaryByDepartment(2));
        System.out.println(employeeBook.calculateTotalSalaryByDepartment(3));
        System.out.println(employeeBook.calculateTotalSalaryByDepartment(4));
        System.out.println(employeeBook.calculateTotalSalaryByDepartment(5));
        // Среднюю зп по отделам;
        System.out.println("Средние зп по отделам:");
        System.out.println(employeeBook.calculateAverageSalaryByDepartment(1));
        System.out.println(employeeBook.calculateAverageSalaryByDepartment(2));
        System.out.println(employeeBook.calculateAverageSalaryByDepartment(3));
        System.out.println(employeeBook.calculateAverageSalaryByDepartment(4));
        System.out.println(employeeBook.calculateAverageSalaryByDepartment(5));
        // Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра;
        System.out.println("Зарплата сотрудников отдела 3 до индексации на 10%");
        employeeBook.printEmployeesByDepartment(3);
        System.out.println("Зарплата сотрудников отдела 3 после индексации на 10%");
        employeeBook.indexationSalaryByDepartment(5, 3);
        employeeBook.printEmployeesByDepartment(3);
        // Напечатать всех сотрудников отдела (все данные, кроме отдела).
        System.out.println("Данные сотрудников отдела 2");
        employeeBook.printEmployeesByDepartment(2);
        //Всех сотрудников с зп меньше числа (распечатать id, фио и зп в консоль);
        System.out.println("Сотрудники с зарплатой меньше 70000:");
        employeeBook.printEmployeesWithSalaryLessThan(70000);
        //Всех сотрудников с зп больше (или равно) числа (распечатать id, фио и зп в консоль).
        System.out.println("Сотрудники с зарплатой больше или равно 70000:");
        employeeBook.printEmployeesWithSalaryGreaterThanOrEqual(70000);

        // Проверка метода removeEmployee
        System.out.println("Удаление сотрудника:");
        employeeBook.removeEmployee(5);
        employeeBook.printAllEmployees();
        // Проверка метода получения сотрудника по ID.
        System.out.println("Получение сотрудника по ID:");
        System.out.println(employeeBook.getEmployeeById(1));
    }
}