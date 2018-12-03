public class FireflyDeathmatch    {
    public static void main ( String[] args ) {

        Firefly[] swarm = new Firefly[ 10 ];

        for (int j = 0; j < swarm.length; j++)  {
            swarm[j] = new Firefly();
        }

        int survivors = 10;
        
        while(survivors > 1)    {
            int slected = (int)(Math.random() * 10);
            if  (swamr[slected].getAlive()) {
                swarm[slected].move();

                for (int j = 0; j < swarm.length; j++)  {
                    distance = 
                }
            }
        }
    }
}