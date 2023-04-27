class Worker extends Employee {
    public Worker(String name, String lastName, int age, double salary) {
        super(name, lastName, age, salary);
    }

    @Override
    public String toString() {
        return String.format("Сотрудник: %s %s; %d лет; Рабочий; ежемесячная заработная плата: %.2f", name, lastName, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
