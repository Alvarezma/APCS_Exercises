public class Robot extends Being {

    private int id;

    public Robot(int id, int intelligence, int strength)  {
        super(intelligence, strength);
        this.id = id;
    }

    public String sayHi(Being b)    {
        if (b instanceof Human) {
            return "HELLO HUMAN #" + b.getName() + ". IT IS A PLEASURE TO SERVE YOU";
        } else if (b instanceof Robot)  {
            return "101010101010101011001";
        }
        return "";
    }

    public String startFight(Being b)  {
        if (b instanceof Human) {
            if (getIntelligence() < 10) {
                return b.getName() + " beats up robot #" + id;
            } else  {
                setIntelligence(getIntelligence() + 1);
                return "Robot #" + id + " used 1000 IQ moves to defeat " + b.getName() + " his intelligence is now " + getIntelligence();
            }
        } else if (b instanceof Robot)  {
            if (Math.random() * getIntelligence() > Math.random() * b.getIntelligence())    {
                setIntelligence(getIntelligence() + 1);
                return "Robot #" + id + " flexed his robot brain and defeated robot #" + b.getId() + " while also making his brain bigger making his intelligence " + getIntelligence();
            } else {
                b.setIntelligence(b.getIntelligence() + 1);
                return "Robot #" + b.getId() + " flexed his robot brain and defeated robot #" + id + " while also making his brain bigger making his intelligence " + b.getIntelligence();
            }
        }
        return "";
    }

    public int getId()  {return id;}
    public void setId(int id)  {this.id = id;}

}