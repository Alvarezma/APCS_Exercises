class GroupOfDie {
   
    private int score = 0;
    private Die[] dice = new Die[1];

    GroupOfDie (int number, int sides) {
        dice = new Die[number];
        for (int i = 0; i < dice.length; i++)   {
            dice[i] = new Die(sides);
        }
    }

    GroupOfDie (int seed1, int seed2, int seed3, int seed4, int seed5) {
        dice = new Die[5];
        dice[0] = new Die(6, seed1);
        dice[1] = new Die(6, seed2);
        dice[2] = new Die(6, seed3);
        dice[3] = new Die(6, seed4);
        dice[4] = new Die(6, seed5);
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

    public void setPattern(int die1, int die2, int die3, int die4, int die5)    {
        dice[0].setVal(die1);
        dice[1].setVal(die2);
        dice[2].setVal(die3);
        dice[3].setVal(die4);
        dice[4].setVal(die5);
    }

    public int detectPattern()  {
        int sum = 0;
        int count = 0;
        int alreadyCounted = 0;
        for (int i = 0; i < dice.length; i++)   {
            for (int j = 0; j < dice.length; j++)   {
                if((dice[i].getVal() == dice[j].getVal()) && (j != i) && (dice[i].getVal() != alreadyCounted))  {
                    if (count >= 2)  {
                        count++;
                    } else  {
                        count += 2;
                    }
                    alreadyCounted = dice[i].getVal();
                }
            }
            count = 0;
            sum += count;
        }
        return sum;
    }

}