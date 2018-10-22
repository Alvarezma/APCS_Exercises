public class Dog    {

    // Properties
    String name;
    String breed;
    int tagNumber;
    int happiness = 50;
    boolean pettedSinceEating = false;


    // Constructor(s)
    public Dog(String name, String breed, int tagNumber)    {
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

    public void bark()  {
        System.out.println("Woof!");
    }
    
    public void sayHi()  {
        bark();
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
        changeHappiness(10);
        pettedSinceEating = true;
    }

    public void scolded()    {
        changeHappiness(-20);
    }

    public void eat()    {
        if (happiness >= 25 && pettedSinceEating)    {
            changeHappiness(30);
            pettedSinceEating = false;
        }
        if (happiness < 25)  {
            System.out.println(this.name + " refused to eat");
        } else {
            System.out.println(this.name + " is eating");
        }
    }

}