public class Cat    {

    // Properties
    String name;
    String breed;
    int tagNumber;
    int happiness = 50;
    int scoldedSinceEating = 0;


    // Constructor(s)
    public Cat(String name, String breed, int tagNumber)    {
        this.name = name;
        this.breed = breed;
        this.tagNumber = tagNumber;
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

    public int getHappiness()   {
        return this.happiness;
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

    public void setHappiness(int happiness)   {
        this.happiness = happiness;
    }

    // Abilities

    public void meow()  {
        System.out.println("Meow!");
    }
    
    public void sayHi()  {
        meow();
        System.out.println("My name is " + this.name);
    }

    private void changeHappiness(int ammount)  {
        happiness += ammount;
        if (happiness > 100)    {
            happiness = 100;
        } else if (happiness < 0)   {
            happiness = 0;
        }
    }

    public void petted()    {
        changeHappiness(-50);
    }

    public void scolded()    {
        scoldedSinceEating++;
    }

    public void eat()    {
        if (scoldedSinceEating >= 3)    {
            changeHappiness(10);
            scoldedSinceEating = 0;
        }
    }

}