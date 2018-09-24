
public class SheepHerd {

    public static void main ( String[] args ) {
        
        int years;
        double power = 1;
        double population = 20;

        for (years = 0; population < 80; years++)   {
            population = 220 / (1 + (10 * power));
            power = power * 0.83;
        }

        System.out.println("The herd must be supervised " + (years - 1) + " years");

    }
}