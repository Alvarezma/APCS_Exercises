public class Box    {
    
    private double length ;
    private double width  ;
    private double height ;


    public Box ( double width, double height, double length )   {
        this.width  = width;
        this.height = height;
        this.length = length;
    }

    public Box ( double side )  {
        width  = side;
        height = side;
        length = side;
    }

    public Box ( Box oldBox ) {
        this.width = oldBox.getWidth();
        this.height = oldBox.getHeight();
        this.length = oldBox.getLength();
    }

    public Box biggerBox( Box oldBox )  {
        return new Box( 1.25*oldBox.getWidth(), 1.25*oldBox.getHeight(), 1.25*oldBox.getLength());
    }

    public Box smallerBox( Box oldBox )  {
        return new Box( 0.75*oldBox.getWidth(), 0.75*oldBox.getHeight(), 0.75*oldBox.getLength());
    }

    public double getWidth()   {
        return width;
    }

    public double getHeight()   {
        return height;
    }

    public double getLength()   {
        return length;
    }

    public double volume()  {
        return width * height * length;
    }

    public double area()    {
        return 2 * ( faceArea() + topArea() + sideArea() );
    }

    public boolean nests( Box outsideBox )  {
        if (height < outsideBox.getHeight() && width < outsideBox.getWidth() && length < outsideBox.getLength())    {
            return true;
        } else {
            return false;
        }
    }

    private double faceArea()   {
        return width * height;
    }

    private double topArea()   {
        return width * length;
    }

    private double sideArea()   {
        return height * length;
    }

}