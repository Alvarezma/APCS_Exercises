public class Being  {

    private int intelligence;
    private int strength;

    public Being(int intelligence, int strength)  {
        this.intelligence = intelligence;
        this.strength = strength;
    }

    public String sayHi(Being b)    {
        return "say hi broke";
    }

    public String startFight(Being b)  {
        return "fighting broke";
    }

    public int getIntelligence() {return intelligence;}
    public int getStrength() {return strength;}

    public void setIntelligence(int intelligence) {this.intelligence = intelligence;}
    public void setStrength(int strength) {this.strength = strength;}

    //Human
    public String getName() {return "";}
    public void setName() {}
    //Robot
    public int getId()  {return 0;}
    public void setId()  {}
}