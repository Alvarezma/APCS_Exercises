import java.util.Random;

class Die {
   
    private int value = 0;
    private int roll = 0;
    private int sides = 0;
    private int target = 0;
    private int probability = 0;
    private boolean loaded = false;
    private Random random;

    Die (int sides) {
        this.sides = sides;
        random = new Random();
        roll();
    }

    Die (int sides, int seed) {
        this.sides = sides;
        random = new Random(seed);
        roll();
    }

    public void loadTheDie(int target, int probability, boolean loaded)    {
        this.target = target;
        this.probability = probability;
        this.loaded = loaded;
    }

    public void roll() {
        if (!loaded) {
            // value = 1 + ((int) (Math.random() * (sides)));
            value = random.nextInt(sides) + 1;
        } else {
            if (((int) (Math.random() * 100)) <= probability) {
                value = target;
            } else {
                // value = 1 + ((int) (Math.random() * (sides)));
                value = random.nextInt(sides) + 1;
                while (value == target) {
                    // value = 1 + ((int) (Math.random() * (sides)));
                    value = random.nextInt(sides) + 1;
                }
            }
        }
        roll++;
    }

    public String graphValsProb(int numOfRolls) {
        int[] list = new int[numOfRolls];
        String graph = "Probablilties for " + numOfRolls + " Rolls";
        double count = 0.0;
        for (int j = 0; j < numOfRolls; j++)  {
            roll();
            list[j] = value;
        }
        for (int i = 1; i <= sides; i++)    {
            count = 0.0;
            for (int j = 0; j < numOfRolls; j++)   {
                if (list[j] == i)   {
                    count++;
                }
            }
            graph += "\n" + i + " || " + ((int)((count/numOfRolls) * 10000))/100.0 + "% ";
            for (int j = 0; j < (int)((count/numOfRolls) * 100); j++)   {
                graph += "[]";
            }
        }
        return graph;
    }

    public String graphCombinedValsProb(int numOfRolls) {
        int[] list = new int[numOfRolls];
        String graph = "Probablilties for Combinations of two die with " + numOfRolls + " Rolls";
        double count = 0.0;
        for (int j = 0; j < numOfRolls; j++)  {
            list[j] = (1 + ((int) (Math.random() * (sides)))) + (1 + ((int) (Math.random() * (sides))));
        }
        for (int i = 2; i <= (sides * 2); i++)    {
            count = 0.0;
            for (int j = 0; j < numOfRolls; j++)   {
                if (list[j] == i)   {
                    count++;
                }
            }
            graph += "\n" + i + " || " + ((int)((count/numOfRolls) * 10000))/100.0 + "% ";
            for (int j = 0; j < (int)((count/numOfRolls) * 100); j++)   {
                graph += "[]";
            }
        }
        return graph;
    }

    public boolean compareEqual(Die d) {
        if(d.getVal() == value) {
            return true;
        } else {
            return false;
        }
    }

    public boolean compareLessThan(Die d) {
        if (d.getVal() > value) {
            return true;
        } else {
            return false;
        }
    }

    public int compareOrder(Die d) {
        if (d.getVal() < value) {
            return 1;
        } else if (d.getVal() == value) {
            return 0;
        } else {
            return -1;
        }
    }

    public int getVal() {
        return value;
    }

    public void setVal(int newVal)  {
        this.value = newVal;
    }

    public int getNumRolls() {
        return roll;
    }

    public boolean loadCheck() {
        double[] diePercent = new double[sides];
        double count = 0.0;
        for (int i = 0; i < sides; i++) {
            count = 0.0;
            for (int j = 0; j < 1000000; j++)   {
                roll();
                if (value == i) {
                    count++;
                }
            }
            diePercent[i] = (count / 1000000) * 100;
        }
        double target = 100.0 / sides;
        for (int i = 0; i < sides; i++) {
            if ((diePercent[i] - 1) >= target)    {
                return true;
            }
        }
        return false;
    }

}