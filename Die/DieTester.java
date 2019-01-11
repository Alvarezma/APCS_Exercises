public class DieTester{
    
    public static void main (String[] args) {
        Die d = new Die(6);
        Die dave = new Die(6);
        Die mark = new Die(100);
        System.out.println("Dave: " + dave.getVal());
        dave.roll();
        System.out.println("Dave: " + dave.getVal());
        System.out.println("Dave Number of Rolls: " + dave.getNumRolls());
        System.out.println("D: " + d.getVal());
        System.out.println("Equality: " + dave.compareEqual(d));
        System.out.println("Less Than: " + dave.compareLessThan(d));
        System.out.println("Order: " + dave.compareOrder(d));
    //     System.out.println(dave.graphValsProb(1000000));
        // System.out.println(dave.graphCombinedValsProb(10));
        // System.out.println(dave.graphCombinedValsProb(100));
        // System.out.println(dave.graphCombinedValsProb(10000));
        mark.loadTheDie(1, 10, true);
        System.out.println(mark.graphValsProb(1000000));
        System.out.println(mark.loadCheck());
        mark.loadTheDie(0, 0, false);
        System.out.println(mark.graphValsProb(1000000));
        System.out.println(mark.loadCheck());

    }
}