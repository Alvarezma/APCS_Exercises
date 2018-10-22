public class DogTester  {

    public static void main( String[] args )  {
        Dog rover = new Dog("Rover", "Dalmation", 1);
        Dog dog2 = new Dog("Clifford", "BigRed", 2);

        System.out.println(rover.getName());
        System.out.println(dog2.getName());

        rover.bark();
        rover.sayHi();
        dog2.sayHi();

        System.out.println(rover.getHappiness());
        rover.petted();
        System.out.println(rover.getHappiness());
        rover.scolded();
        System.out.println(rover.getHappiness());
        rover.eat();
        System.out.println(rover.getHappiness());
        rover.eat();
        System.out.println(rover.getHappiness());
        rover.scolded();
        System.out.println(rover.getHappiness());
        rover.scolded();
        System.out.println(rover.getHappiness());
        rover.eat();
        System.out.println(rover.getHappiness());
        rover.scolded();
        System.out.println(rover.getHappiness());
        System.out.println(dog2.getHappiness());

}