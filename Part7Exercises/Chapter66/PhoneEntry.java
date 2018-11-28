class PhoneEntry    {

    private String first_name;    // name of a person
    private String last_name;
    private String phone;   // their phone number

    public PhoneEntry( String f, String l, String p )   {
        first_name = f; 
        last_name = l;
        phone = p;
    }

    public String getFirstName()  {return first_name;}
    public String getLastName() {return last_name;}
    public String getPhone() {return phone;}
}