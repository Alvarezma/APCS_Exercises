class RandomTest {
    public static void main (String[] args) {
        Die die = new Die(6, 31973);

        for (int i = 0; i < 5; i++) {
            die.roll();
            System.out.println(die.getVal());
        }

    }
}