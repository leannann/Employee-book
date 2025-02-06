public class EmployeeBook {
    // Поля
    private Employee[] employees;

    // Конструктор с параметрами
    public EmployeeBook(int capacity) {
        this.employees = new Employee[capacity];
    }

    // Методы
    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                return;
            }
        }
    }

    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public double calculateTotalSalary(){
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public Employee findMinSalaryEmployee(){
        Employee minEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minEmployee.getSalary()) {
                minEmployee = employee;
            }
        }
        return minEmployee;
    }

    public Employee findMaxSalaryEmployee(){
        Employee maxEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxEmployee.getSalary()) {
                maxEmployee = employee;
            }
        }
        return maxEmployee;
    }

    public double calculateAverageSalary(){
        int employeesCount = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                employeesCount++;
            }
        }
        return calculateTotalSalary() / employeesCount;
    }

    public void printAllFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    public void indexationSalary(double index){
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() * (1 + index / 100));
            }
        }
    }

    public Employee findMinSalaryEmployeeByDepartment(int department){
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

    public Employee findMaxSalaryEmployeeByDepartment(int department){
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

    public double calculateTotalSalaryByDepartment(int department){
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

    public double calculateAverageSalaryByDepartment(int department){
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

    public void indexationSalaryByDepartment(double index, int department){
        if (department < 1 || department > 5){
            throw new IllegalArgumentException("У нас есть отделы только с номерами от 1 до 5");
        }

        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                employee.setSalary(employee.getSalary() * (1 + index / 100));
            }
        }
    }

    public void printEmployeesByDepartment(int department) {
        if (department < 1 || department > 5){
            throw new IllegalArgumentException("У нас есть отделы только с номерами от 1 до 5");
        }

        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println("ID: " + employee.getId() + ", ФИО: " + employee.getFullName() + ", Зарплата: " + employee.getSalary());
            }
        }
    }

    public  void printEmployeesWithSalaryLessThan(double amount) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < amount) {
                System.out.println("ID: " + employee.getId() + ", ФИО: " + employee.getFullName() + ", Зарплата: " + employee.getSalary());
            }
        }
    }

    public void printEmployeesWithSalaryGreaterThanOrEqual(double amount) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= amount) {
                System.out.println("ID: " + employee.getId() + ", ФИО: " + employee.getFullName() + ", Зарплата: " + employee.getSalary());
            }
        }
    }



}
