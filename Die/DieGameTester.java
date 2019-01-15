public class DieGameTester{
    
    public static void main (String[] args) {
        System.out.println(getPlayerScore());
        System.out.println(testPair());
        System.out.println(test3kind());
        System.out.println(test2Pair());
    }

    public static boolean getPlayerScore()  {
        DieGame sharks = new DieGame(3, 5, 6);
        for (int i = 0; i < sharks.getNumberOfPlayers(); i++) {
            sharks.roll(i);
            if (sharks.getPlayerScore(i) < 5 || sharks.getPlayerScore(i) > 30)    {
                return false;
            }
        }
        return true;
    }

    public static boolean testPair()   {
        GroupOfDie crew = new GroupOfDie(1, 2, 3, 1, 319173);
        if (crew.detectPattern() != 2) {
             return false;
        }
        return true;
    }

    public static boolean test3kind()   {
        GroupOfDie crew = new GroupOfDie(1, 2, 3, 1, 1);
        if (crew.detectPattern() != 3) {
             return false;
        }
        return true;
    }

    public static boolean test2Pair()   {
        GroupOfDie crew = new GroupOfDie(1, 2, 3, 1, 3);
        if (crew.detectPattern() != 4) {
             return false;
        }
        return true;
    }
}