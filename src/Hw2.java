public class Hw2 {
    public static void main(String[] args) {
        //First task
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("\n");

        //Second task
        dog = dog + 4;
        cat = cat +4;
        paper = paper + 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("\n");

        //Third task
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("\n");

        //Fourth task
        var friend = 19;
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println("\n");

        //Fifth task
        var frog = 3.5;
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println("\n");

        //Sixth task
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес боксеров равен " + totalWeight + " кг.");
        System.out.println("\n");

        //Seventh task
        var differenceWeight = secondBoxer % firstBoxer;
        System.out.println("Весовая разница боксеров равна " + differenceWeight + " кг.");
        System.out.println("\n");

        //Eighth task
        var totalTime = 640;
        var oneTime = 8;
        var memberCount = totalTime / oneTime;
        System.out.println("Всего работников в компании - " + memberCount + " человек.");

        memberCount = memberCount + 94;
        totalTime = memberCount * oneTime;
        System.out.println("Если в компании работает " + memberCount + " человек, то всего " + totalTime + " часа работы может быть поделено между сотрудниками.");

    }
}
