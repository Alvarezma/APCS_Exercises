public class Human extends Being {

    private String[] greetings = {"Id dint see ya th're partn'r", "lubalabadubdub", "Howdy", "Wassuup", 
    "Heyo", "Hi", "Hello", "Greetings comrade", "Pleasure to meet you", "Salutations"};
    private String name;

    public Human(String name, int intelligence, int strength)  {
        super(intelligence, strength);
        this.name = name;
    }

    public String sayHi(Being b)    {
        if (b instanceof Human) {
            return greetings[(int)((Math.random() * (getIntelligence() / 2)) + (getIntelligence() / 2))];
        } else if (b instanceof Robot)  {
            return "Hello robot number " + b.getId() + ". Make me a sandwich";
        }
        return "";
    }

    public String startFight(Being b)  {
        if (b instanceof Human) {
            if (getIntelligence() > b.getIntelligence() * 2 && Math.random() > 0.5) {
                return name + " used his 1000 IQ to beat up " + b.getName();
            } else if(getIntelligence() * 2 < b.getIntelligence() && Math.random() > 0.5)   {
                return b.getName() + " used his 1000 IQ to beat up " + name;
            }
            if (b.getStrength() > getStrength())    {
                return name + " was to weak against " + b.getName();
            } else {
                return name + " used his muscles to beat up " + b.getName();
            }
        } else if (b instanceof Robot)  {
            b.setStrength(b.getStrength() - 1);
            return "Robot #" + b.getId() + " beat up " + name + " but got damages decreasing its strength to " + b.getStrength();
        }
        return "";
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}
}