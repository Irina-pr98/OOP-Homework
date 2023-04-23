import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        Random random = new Random();

        Cat first_cat = new Cat("First cat", random.nextInt(10, 20));
        Cat second_cat = new Cat("Second cat", random.nextInt(10, 20));
        Cat third_cat = new Cat("Third cat", random.nextInt(10, 20));
        Cat fourth_cat = new Cat("Fourth cat", random.nextInt(10, 20));
        Cat fifth_cat = new Cat("Fifth cat", random.nextInt(10, 20));

        Plate plate = new Plate(random.nextInt(50, 100));

        Cat[] cats = new Cat[] {first_cat, second_cat, third_cat, fourth_cat, fifth_cat};
        System.out.print("Start ");
        plate.info();

        for (Cat cat : cats) {
            if (plate.getFood() > cat.getAppetite()) {
                plate.setFood(plate.getFood() - cat.getAppetite());
                System.out.printf("%s eating %d foods\n", cat.getName(), cat.eat());
                cat.setSatiety(true);
                plate.info();
            }
            else if (random.nextBoolean()) {
                plate.addFood(cat.getAppetite() - plate.getFood());
                System.out.printf("%s eating %d foods\n", cat.getName(), cat.eat());
                cat.setSatiety(true);
                plate.setFood(plate.getFood() - cat.getAppetite());
                plate.info();
            }
        }
        for (Cat cat : cats)
            System.out.printf("%s satiety is %b\n", cat.getName(), cat.isSatiety());
    }
}