public class Mouse    {

    // Properties
    String name;
    String breed;
    int tagNumber;
    int safety = 50;

    // Constructor(s)
    public Mouse(String name, String breed, int tagNumber)    {
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

    public int getSafety() {
        return this.safety;
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

    // Abilities

    public void changeSafety(int ammount)   {
        safety += ammount;
        if (safety > 100)   {
            safety = 100;
        } else if (safety < 1)  {
            safety = 1;
        }
    }

    public void squeak()  {
        System.out.println("Squeak!");
    }
    
    public void sayHi()  {
        squeak();
        System.out.println("My name is " + this.name);
    }

    public void meet(Cat cat)   {
        changeSafety(-20);
        run();
    }

    public void meet(Dog dog)   {
        if (dog.getHappiness() >= 50) {
            changeSafety(20);
        } else {
            changeSafety(-20);
            run();
        }
    }

    public void run()   {
        System.out.println(this.name + " ran away at " + (100.0/safety) + " mph");
    }

}