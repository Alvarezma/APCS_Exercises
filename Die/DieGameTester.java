public class DieGameTester{
    
    public static void main (String[] args) {
        DieGame sharks = new DieGame(3, 5, 6);
        sharks.roll();
        System.out.println(sharks.getPlayerScore());

        // Die[] dice = new Die[5];
        // int score = 0;
        // for (int i = 0; i < dice.length; i++)   {
        //     dice[i] = new Die(6);
        //     dice[i].roll();
        //     score += dice[i].getVal();
        // }
        // System.out.println(score);


    }
}