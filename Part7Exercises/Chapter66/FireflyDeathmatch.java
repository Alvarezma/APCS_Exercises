public class FireflyDeathmatch    {
    public static void main ( String[] args ) {

        Firefly[] swarm = new Firefly[ 10 ];

        for (int j = 0; j < swarm.length; j++)  {
            swarm[j] = new Firefly();
        }

        int survivors = 10;
        int iterations = 0;
        int moving = 0;
        
        while(survivors > 1)    {
            iterations++;

            moving = (int)(Math.random() * 10);
            if  (swarm[moving].getAlive()) {
                swarm[moving].move();

                for (int j = 0; j < swarm.length; j++)  {
                    if (Math.sqrt(((swarm[moving].getX() - swarm[j].getX()) * (swarm[moving].getX() - swarm[j].getX())) 
                    + ((swarm[moving].getY() - swarm[j].getY()) * (swarm[moving].getY() - swarm[j].getY())) 
                    + ((swarm[moving].getZ() - swarm[j].getZ()) * (swarm[moving].getZ() - swarm[j].getZ()))) < 1.0) {
                        swarm[j].killed();
                    }
                }
            }

            survivors = 0;
            for (int j = 0; j < swarm.length; j++)  {
                if (swarm[j].getAlive())    {
                    survivors += 1;
                }
            }
        }

        System.out.println("Number " + moving + " won the fight in " + iterations + " turns\nPosition: x = " + swarm[moving].getX() + " y = " + swarm[moving].getY() + " z = " + swarm[moving].getX());
    }
}