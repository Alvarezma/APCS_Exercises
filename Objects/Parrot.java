public class Parrot    {

    // Properties
    String name;
    String breed;
    int tagNumber;
    int talkCounter = 0;
    int sameWordInARow = 0;
    String word = "";
    String lastWordSpoken = "";

    // Constructor(s)
    public Parrot(String name, String breed, int tagNumber)    {
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

    public void heardWord(String word)  {
        this.word = word;
        this.lastWordSpoken = word;
        sameWordInARow = 0;
    }
    // Abilities

    public void squawk()  {
        System.out.println("Squawk!");
    }
    
    public void sayHi()  {
        squawk();
        System.out.println("My name is " + this.name);
    }

    public void talk()  {
        System.out.println(word);
        talkCounter++;
        if (talkCounter >= 3)   {
            squawk();
            talkCounter = 0;
        }
        if (lastWordSpoken.equals(word))    {
            sameWordInARow++;
        } else {
            sameWordInARow = 0;
        }
        if (sameWordInARow >= 3)    {
            squawk();
            squawk();
            sameWordInARow = 0;
        }
        lastWordSpoken = word;
    }


}