public class PigTester  {

    public static void main( String[] args )  {
        Pig charlie = new Pig("Charlie", "Mangalica", 642, 50);

        charlie.sayHi();
        System.out.println(charlie.getWeight());
        charlie.eat(60);
        System.out.println(charlie.getWeight());
        charlie.exercise(15);
        System.out.println(charlie.getWeight());
        charlie.exercise(3);
        System.out.println(charlie.getWeight());
        charlie.eat(1600);
        System.out.println(charlie.getWeight());

    }

}