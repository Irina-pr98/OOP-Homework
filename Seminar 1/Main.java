import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BottleOfWater bottle1 = new BottleOfWater("Святой источник", "Вода", 100, 1);
        System.out.println(bottle1.displayInfo());
        
        Product bottle2 = new BottleOfWater("Шишкин лес", "Вода", 50, 2);
        System.out.println(bottle2.displayInfo());
        
        Product bottle3 = new BottleOfMilk("Домик в деревне", "Молоко", 80, 2, 3);
        System.out.println(bottle3.displayInfo());
        
        Product bottle4 = new BottleOfMilk("Простоквашино", "Молоко", 70, 1, 1);
        System.out.println(bottle4.displayInfo());
        
        Product chocolate1 = new Chocolate("Россия - щедрая душа", "Шоколад", 100, 530);
        System.out.println(chocolate1.displayInfo());
        
        Product chocolate2 = new Chocolate("Милка", "Шоколад", 130, 520);
        System.out.println(chocolate2.displayInfo());
        
        System.out.println("-----------------------------------------------------");
        
        List<Product> products = new ArrayList<>();
        products.add(bottle1);
        products.add(bottle2);
        products.add(bottle3);
        products.add(bottle4);
        products.add(chocolate1);
        products.add(chocolate2);
        
        VendingMachine machine = new VendingMachine(products);
        
        BottleOfWater bottleOfWaterRes = machine.getBottleOfWater("Вода", 2);
        if(bottleOfWaterRes != null){
            System.out.println("Вы купили воду: ");
            System.out.println(bottleOfWaterRes.displayInfo());
        }
        else
            System.out.println("Такой бутылки с водой нет в автомате");
        
        BottleOfMilk bottleOfMilkRes = machine.getBottleOfMilk("Молоко", 2);
        if(bottleOfMilkRes != null){
            System.out.println("Вы купили молоко: ");
            System.out.println(bottleOfMilkRes.displayInfo());
        }
        else
            System.out.println("Такой бутылки с молоком нет в автомате");
        
        Chocolate chocolateRes = machine.getChocolate("Шоколад", 250);
        if(chocolateRes != null){
            System.out.println("Вы купили шоколад: ");
            System.out.println(chocolateRes.displayInfo());
        }
        else
            System.out.println("Такого шоколада нет в автомате");
        
    }
}