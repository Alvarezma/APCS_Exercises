public class CatTester  {

    public static void main( String[] args )  {
        Cat ace = new Cat("Ace", "BlackCat", 154);

        ace.meow();
        ace.sayHi();
        System.out.println(ace.getHappiness());
        ace.petted();
        System.out.println(ace.getHappiness());
        ace.scolded();
        ace.scolded();
        ace.scolded();
        System.out.println(ace.getHappiness());
        ace.eat();
        System.out.println(ace.getHappiness());

    }

}