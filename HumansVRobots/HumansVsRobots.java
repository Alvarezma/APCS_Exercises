public class HumansVsRobots {

    public static void main(String[] args)  {
        Human a = new Human("strong man", 1, 10);
        Human b = new Human("intellectual", 10, 1);
        Robot c = new Robot(21, 9, 5);
        Robot d = new Robot(54, 11, 5);

        System.out.println(a.sayHi(b));
        System.out.println(b.sayHi(a));
        System.out.println(a.sayHi(c));
        System.out.println(d.sayHi(a));
        System.out.println(d.sayHi(c));


        System.out.println(a.startFight(b));
        System.out.println(a.startFight(b));
        System.out.println(a.startFight(c));
        
        System.out.println(c.startFight(a));
        System.out.println(c.startFight(a));
        System.out.println(d.startFight(a));
        System.out.println(d.startFight(c));
        System.out.println(d.startFight(c));
    }
}