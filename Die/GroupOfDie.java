class GroupOfDie {
   
    private int score = 0;
    private Die[] dice = new Die[1];

    GroupOfDie (int number, int sides) {
        dice = new Die[number];
        for (int i = 0; i < dice.length; i++)   {
            dice[i] = new Die(sides);
        }
    }

    public void rollAll()    {
        score = 0;
        for (int i = 0; i < dice.length; i++)   {
            dice[i].roll();
            score += dice[i].getVal();
        }
    }

    public int getScore() {
        return score;
    }

    public String detectPatterns()  {
        String pattern = "";
        int count = 0;
        for (int i = 0; i < dice.length; i++)   {
            
        }
    }

}