class TestExercises {

  public static void main ( String[] args ) {

    Box box = new Box( 2.5, 5.0, 6.0 );

    System.out.println("Area: "  + box.area() + " volume: " + box.volume());
    System.out.println("length: " + box.getLength() + " height: " + box.getHeight() + " width:  " + box.getWidth());

    Box copy = new Box( box );

    System.out.println("Area: "  + copy.area() + " volume: " + copy.volume());
    System.out.println("Area: "  + box.area() + " volume: " + box.volume());

    Box bigger = box.biggerBox( box );

    System.out.println("length: " + bigger.getLength() + " height: " + bigger.getHeight() + " width:  " + bigger.getWidth());

    Box smaller = box.smallerBox( box );

    System.out.println("length: " + smaller.getLength() + " height: " + smaller.getHeight() + " width:  " + smaller.getWidth());

    System.out.println( smaller.nests( box ));
    System.out.println( smaller.nests( bigger ));
    System.out.println( bigger.nests(box));

  }
}