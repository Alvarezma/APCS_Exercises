class Firefly    {

    private double x;
    private double y;
    private double z;
    private boolean alive;

    public Firefly()   {
        this.x = -10.0 + (Math.random() * 20);
        this.y = -10.0 + (Math.random() * 20);
        this.z = -10.0 + (Math.random() * 20);
        this.alive = true;
    }

    public void move()  {
        x += (-1.0 + (Math.random() * 2));
        y += (-1.0 + (Math.random() * 2));
        z += (-1.0 + (Math.random() * 2));
    }

    public double getX()  {return x;}
    public double getY() {return y;}
    public double getZ() {return z;}
    public boolean getAlive() {return alive;}
    public void killed() {alive = false;}
}