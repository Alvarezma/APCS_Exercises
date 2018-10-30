public class Pantry {
    
    private Jam  jar1 ;
    private Jam  jar2 ;
    private Jam  jar3 ;
    private Jam  selected ;


    Pantry( Jam jar1)  {
        this . jar1 = jar1 ;
        this . jar2 = null ;
        this . jar3 = null ;
        selected = null ;
    }

    Pantry( Jam jar1, Jam jar2 )  {
        this . jar1 = jar1 ;
        this . jar2 = jar2 ;
        this . jar3 = null ;
        selected = null ;
    }

    Pantry( Jam jar1, Jam jar2, Jam jar3 )  {
        this . jar1 = jar1 ;
        this . jar2 = jar2 ;
        this . jar3 = jar3 ;
        selected = null ;
    }

    public String toString()    {
        String str = "";
        if (jar1 != null)   {
            str += "1: " +  jar1.toString()  + "\n";
        }
        if  (jar2 != null)  {
            str += "2: " +  jar2.toString()  + "\n";
        }
        if  (jar3 != null)  {
            str += "3: " +  jar3.toString()  + "\n";     
        }
        return str;
    }


    public boolean select( int jarNumber ) {
        if ( jarNumber == 1 )   {
            selected =  jar1 ;
            if (jar1 == null)   {
                return false;
            }
        } else if ( jarNumber == 2 )    {
            selected = jar2 ;
            if (jar2 == null)   {
                return false;
            }
        } else {
            selected = jar3 ;
            if (jar3 == null)   {
                return false;
            }
        }
        return true;
    }

    public void spread( int oz ){
        selected.spread( oz ) ;
    }

    public void replace( Jam j, int slot)   {
        if ( slot == 1 )   {
            jar1 = j;
        } else if ( slot == 2 )    {
            jar2 = j;
        } else {
            jar3 = j;
        }
    }

    public void mixedFruit()    {
        if (jar1.getCapacity() <= 2 && jar2.getCapacity() <= 2 && jar3.getCapacity() <= 2)    {
            Jam mix = new Jam( "Mixed Fruit", "7/4/86", jar1.getCapacity() + jar2.getCapacity() + jar3.getCapacity());
            jar1 = mix;
            jar2 = null;
            jar3 = null;
        }
    }
}
