package observer;

public class Program {
    public static void main(String[] args) {
        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
        Company google = new Company("Google", 100000, jobAgency);
        Company yandex = new Company("Yandex", 120000, jobAgency);

        Master ivanov = new Master("Ivanov");
        Master sidorov = new Master("Sidorov");
        Student petrov = new Student("Petrov");
        Worker smirnov = new Worker("Smirnov");
        Worker orlov = new Worker("Sokolov");

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(smirnov);
        jobAgency.registerObserver(orlov);

        for (int i = 0; i < 5; i++){
            geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();
        }
    }
}