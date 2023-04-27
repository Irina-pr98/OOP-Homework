import java.util.Arrays;
import java.util.Random;

public class Main {
    private static Random random = new Random();

    static Employee generateEmployee() {
        String[] names = new String[] { "Олег", "Василий", "Евгений", "Михаил", "Сергей" };
        String[] surNames = new String[] { "Миронов", "Климов", "Иванов", "Сидоров", "Петров" };
        int salary = random.nextInt(200, 300);
        int index = random.nextInt(30, 50);
        int age = random.nextInt(25, 50);
        if (random.nextBoolean())
            return new Worker(names[random.nextInt(5)], surNames[random.nextInt(5)], age, salary * index);
        else
            return new Freelancer(names[random.nextInt(5)], surNames[random.nextInt(5)], age, salary * index / 100);

    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        for (int i = 0; i < employees.length; i++)
            employees[i] = generateEmployee();

        System.out.println("Начальный список:\n");
        for (Employee employee : employees)
            System.out.println(employee);

        System.out.println("\nЕжемесячный доход:\n");

        Arrays.sort(employees, new Salary());

        for (Employee employee : employees)
            System.out.println(employee);

        System.out.println("\nСортировка по имени:\n");

        Arrays.sort(employees, new Name());

        for (Employee employee : employees)
            System.out.println(employee);
    
        System.out.println("\nСортировка по возрасту:\n");

        Arrays.sort(employees, new Age());

        for (Employee employee : employees)
            System.out.println(employee);
    }
}
