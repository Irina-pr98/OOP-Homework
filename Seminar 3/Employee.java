abstract class Employee {
    protected String name;
    protected String lastName;
    protected double salary;
    protected int age;

    public Employee(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
        this.age = age;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return String.format("Сотрудник: %s %s; ежемесячная заработная плата: %.2f", name, lastName, salary);
    }
}
