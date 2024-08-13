import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // write your code here
        var box = 5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
        box = box * 3;
        System.out.println(box);
        box = box / 4;
        System.out.println(box);
        float a = 1;
        float b = 3;
        var result1 = a + b;
        System.out.println("result1 = " + result1);
        var result2 = a - b;
        System.out.println("result2 = " + result2);
        float result3 = a / b;
        System.out.println("result3 = " + String.format("%.3f", result3));
        float result = a / 2 * b;
        System.out.println("result = " + String.format("%.3f", result));

        //Count available weight to use
        Scanner lC = new Scanner(System.in);
        System.out.println("Введите объем багажника:");
        int liftingCapacity = lC.nextInt();
        var stuffWeight = 20;
        var capacityLeft = liftingCapacity - stuffWeight;
        System.out.println("Еще можно положить - " + capacityLeft + " кг вещей");

        //Count weight of fruits
        var appleWeight = 2;
        var orangesWeight = 3;
        var fruitWeight = appleWeight + orangesWeight;
        System.out.println("Общий вес фруктов - " + fruitWeight + " кг!");

        //Count weight of all products
        var meatWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var cucumberWeight = 2;
        var peppersWeight = 2;
        var zucchiniWeight = 2;
        var vegetablesWeight = tomatoesWeight + cucumberWeight + peppersWeight + zucchiniWeight;
        float productsWeight = fruitWeight + meatWeight + waterWeight + vegetablesWeight;
        System.out.println("Общий вес продуктов - " + productsWeight + " кг!");

        //Count left weight
        float leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Места осталось - " + leftWeight + " кг!");

        //+2 people
        productsWeight = productsWeight * 2;
        System.out.println("Теперь вес продуктов - " + productsWeight + " кг!");
        //Count of overload
        //Also can use Math.abs(leftWeight)
        leftWeight = liftingCapacity - stuffWeight - productsWeight;
        var overload = (stuffWeight + productsWeight) % liftingCapacity;
        if (leftWeight < 0) {
            System.out.println("Места в машине не достаточно! Перегруз на " + overload + " кг!");
            System.out.println("Распределим поровну продукты по машинам");
            //Scanner cC = new Scanner(System.in);
            System.out.println("Введите количество машин:");
            int carCount = lC.nextInt();
            float separateWeight = productsWeight / carCount;
            if (carCount >= 5) {
                System.out.println("Все " + productsWeight + " кг были распределены в " + carCount + " машин!");
                System.out.println("Вес для одной машины составил - " + String.format("%.1f", separateWeight) + " кг.");
            } else {
                System.out.println("Все " + productsWeight + " кг были распределены в " + carCount + " машины!");
                System.out.println("Вес для одной машины составил - " + String.format("%.1f", separateWeight) + " кг.");
            }

        } else {
            System.out.println("В машине осталось - " + leftWeight + " кг!");
        }

    }
}