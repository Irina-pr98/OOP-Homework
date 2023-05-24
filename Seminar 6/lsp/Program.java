package lsp;

public class Program {
    public static void main(String[] args) {
        Bird oT1 = new Bird();
        Bird oT2 = new Bird();
        Bird oT3 = new Bird();

        Duck oS1 = new Duck();
        Duck oS2 = new Duck();
        Penguin oS3 = new Penguin();

        fly(oT1);
        fly(oT2);
        fly(oT3);

        fly(oS1);
        fly(oS2);
        fly(oS3);
    }

    /**
     * P
     * @param bird
     */
    public static void fly(Bird bird){ // T
        try {
            bird.fly();
        }
        catch (Exception e){
            System.out.println("Не удалось запустить птичку в полет.");
        }
    }
}