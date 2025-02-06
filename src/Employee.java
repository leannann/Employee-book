import java.util.Objects;

public class Employee {
    private String fullName;
    // Поля класса
    private int department;
    private double salary;
    private int id;

    // Переменная счетчик для id
    private static int idCounter = 1;

    // Конструктор с параметрами
    public Employee(String fullName, int department, double salary){
        if (salary < 0){
            throw new IllegalArgumentException("Зарплата не может быть отрицательной");
        }

        if (department < 1 || department > 5){
            throw new IllegalArgumentException("У нас есть отделы только с номерами от 1 до 5");
        }

        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = idCounter++;
    }

    // Геттеры
    public String getFullName() {
        return this.fullName;
    }
    public int getDepartment(){
        return this.department;
    }
    public double getSalary(){
        return this.salary;
    }
    public int getId(){
        return this.id;
    }

    // Сеттеры
    public void setDepartment(int department){
        if (department < 1 || department > 5){
            throw new IllegalArgumentException("У нас есть отделы только c номерами от 1 до 5");
        }

        this.department = department;
    }
    public void setSalary(double salary){
        if (salary < 0) {
            throw new IllegalArgumentException("Зарплата не может быть отрицательной");
        }
        this.salary = salary;
    }

    // equals и hashCode (Сравнение только по полю iD, потому что
    // в данном классе объекты точно равны, если равны их id)

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ФИО: " + fullName + ", Отдел: " + department +
                ", Зарплата: " + salary +
                ", id: " + id;
    }
}
