public class Being  {

    private String name;
    private int intelligence;
    private int strength;

    public Being(String name, int intelligence, int strength)  {
        this.name = name;
        this.intelligence = intelligence;
        this.strength = strength;
    }

    public String sayHi(Being b)    {
        return "hello";
    }

    // public String startFight(Human h)  {
        
    // }

    public String getName() {return name;}
    public int getIntelligence() {return intelligence;}
    public int getStrength() {return strength;}

    public void setName(String name) {this.name = name;}
    public void setIntelligence(int intelligence) {this.intelligence = intelligence;}
    public void setStrength(int strength) {this.strength = strength;}
}