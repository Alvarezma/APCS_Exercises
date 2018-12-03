class PhoneBook { 
    private PhoneEntry[] phoneBook; 

        public PhoneBook()    {
        phoneBook = new PhoneEntry[ 10 ] ;

        phoneBook[0] = new PhoneEntry( "James", "Barclay", "(418) 665-1223" );
        phoneBook[1] = new PhoneEntry( "Grace", "Dunbar", "(860) 399-3044" );
        phoneBook[2] = new PhoneEntry( "Paul", "Kratides", "(815) 439-9271" );
        phoneBook[3] = new PhoneEntry( "Violet", "Smith", "(312) 223-1937" );
        phoneBook[4] = new PhoneEntry( "John", "Wood", "(913) 883-2874" );

    }

    public PhoneEntry search( String targetFirstName, String targetLastName )     {
        for ( int j=0; j < phoneBook.length; j++ )  {
            if ( phoneBook[ j] != null && phoneBook[ j ].getFirstName().toUpperCase().equals( targetFirstName ) 
            && phoneBook[ j ].getLastName().toUpperCase().equals( targetLastName )) {
                return phoneBook[ j ];
            }
        }

        return null;
    }

    public void search( String targetLastName )     {
        for ( int j=0; j < phoneBook.length; j++ )  {
            if ( phoneBook[ j] != null && phoneBook[ j ].getLastName().toUpperCase().equals( targetLastName)) {
                System.out.println( phoneBook[ j ].getFirstName() + " " + phoneBook[ j ].getLastName() + ": " + phoneBook[ j ].getPhone() );
            }
        }
    }

    public boolean add( String first, String last, String number)   {
        for (int i = 0; i < phoneBook.length; i++)  {
            if (phoneBook[i] == null)  {
                phoneBook[i] = new PhoneEntry(first, last, number);
                return true;
            }
        }
        return false;
    }

    public boolean delete( String targetFirstName, String targetLastName)   {
        for ( int j=0; j < phoneBook.length; j++ )  {
            if ( phoneBook[ j] != null && phoneBook[ j ].getFirstName().toUpperCase().equals( targetFirstName ) 
            && phoneBook[ j ].getLastName().toUpperCase().equals( targetLastName )) {
                phoneBook[ j ] = null;
                return true;
            }
        }
        return false;
    }

    
}