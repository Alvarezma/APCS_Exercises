public class Pantry {
    
    private Jam  jar1 ;
    private Jam  jar2 ;
    private Jam  jar3 ;
    private Jam  selected ;


    Pantry( Jam jar1, Jam jar2, Jam jar3 )  {
        this . jar1 = jar1 ;
        this . jar2 = jar2 ;
        this . jar3 = jar3 ;
        selected = null ;
    }


    public String toString()    {
        String str = "";
        str += "1: " +  jar1.toString()  + "\n";
        str += "2: " +  jar2.toString()  + "\n";
        str += "3: " +  jar3.toString()  + "\n";     
        return str;
    }


    public void select( int jarNumber ) {
        if ( jarNumber == 1 )   {
            selected =  jar1 ;
        } else if ( jarNumber == 2 )    {
            selected = jar2 ;
        } else {
            selected = jar3 ;
        }
    }

    public void spread( int oz ){
        selected.spread( oz ) ;
    }
}
