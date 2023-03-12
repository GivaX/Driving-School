package model;

public class Client extends Record
{
    
    public Client(int id, String name)
    {
       super(id, name);
    }

    public String toString() 
    {
        return "Client: " + super.toString();
    }
}
