public class DieGameTester{
    
    public static void main (String[] args) {
        System.out.println(getPlayerScore());
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

    public static boolean test2Pair()   {
        GroupOfDie crew = new GroupOfDie(5, 6);
        crew.setPattern(2, 5, 3, 4, 5);
        if (crew.detectPattern() != 2) {
             return false;
        }
        return true;
    }
}