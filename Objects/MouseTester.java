public class MouseTester  {

    public static void main( String[] args )  {
        Dog rover = new Dog("Rover", "Dalmation", 1);
        Cat ace = new Cat("Ace", "BlackCat", 154);
        Mouse miles = new Mouse("Miles", "White Mouse", 41);

        rover.sayHi();

        rover.petted();
        System.out.println(rover.getHappiness());

        ace.sayHi();

        miles.sayHi();
        miles.meet(rover);
        System.out.println(miles.getSafety());
        miles.meet(ace);
        System.out.println(miles.getSafety());


        rover.scolded();
        System.out.println(rover.getHappiness());
        miles.meet(rover);
        miles.meet(rover);
        miles.meet(rover);
        
        rover.petted();
        rover.petted();
        rover.petted();
        rover.petted();

        miles.meet(rover);
        System.out.println(miles.getSafety());
    }
}