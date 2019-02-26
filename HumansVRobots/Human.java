public class Human extends Being {

    private String[] greetings = {"Id dint see ya th're partn'r", "lubalabadubdub", "Howdy", "Wassuup", 
    "Heyo", "Hi", "Hello", "Greetings comrade", "Pleasure to meet you", "Salutations"};

    public Human(String name, int intelligence, int strength)  {
        super(name, intelligence, strength);
    }

    public String sayHi(Being b)    {
        if (b instanceof Human) {
            return greetings[(int)(Math.random() * (9 - intelligence)) + intelligence)];
        } else if (b instanceof Robot)  {
            return "Hello robot number " + r.getId() + ". Make me a sandwich";
        }
        return "";
    }

    // public String startFight(Human h)  {

    // }
}