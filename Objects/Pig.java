public class Pig    {

    // Properties
    String name;
    String breed;
    int tagNumber;
    double weight;
    double lastMealGain = 0;
    boolean blueRibbon = false;

    // Constructor(s)
    public Pig(String name, String breed, int tagNumber, double weight)    {
        this.name = name;
        this.breed = breed;
        this.tagNumber = tagNumber;
        this.weight = weight;
        if (weight >= 1000) {
            blueRibbon = true;
        }
    }


    // Abilities

    // Getters
    
    public String getName() {
        return this.name;
    }
    
    public String getBreed() {
        return this.breed;
    }

    public int getTagNumber() {
        return this.tagNumber;
    }

    public double getWeight()  {
        return this.weight;
    }

    public boolean getBlueRibbon()    {
        return this.blueRibbon;
    }

    // Setters

    public void setName(String name)   {
        this.name = name;
    }

    public void setBreed(String breed)   {
        this.breed = breed;
    }

    public void setTagNumber(int tagNumber)   {
        this.tagNumber = tagNumber;
    }

    public void setWeight(int weight)  {
        this.weight = weight;
    }
    // Abilities

    public void oink()  {
        System.out.println("Oink!");
    }
    
    public void sayHi()  {
        oink();
        System.out.println("My name is " + this.name);
    }

    public void eat(double ammount)    {
        lastMealGain = (ammount * 3.0) / 4;
        weight += lastMealGain;
        if (weight >= 1000) {
            blueRibbon = true;
        }
    }

    public void exercise(double hours)  {
        weight -= lastMealGain;
        lastMealGain = 0;
        weight -= (hours /3);
        if (weight < 1000) {
            blueRibbon = false;
        }
    }

}