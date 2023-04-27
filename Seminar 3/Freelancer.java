class Freelancer extends Employee {
    public Freelancer(String name, String lastName, int age, double salary) {
        super(name, lastName, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary * 20 * 5;
    }

    @Override
    public String toString() {
        return String.format("Сотрудник: %s %s; %d лет; Фрилансер; почасовая заработная плата: %.2f; средняя месячная заработная плата (100 часов): %.2f", name, lastName, age, salary, calculateSalary());
    }
}
