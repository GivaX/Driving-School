package model;

public class Clients extends Records
{
   
    public Clients()
    {
       
    }

    public void add(String name)
    {
        Client client = new Client (++id, name); 
        add(client);
        updateViews(); //Calls the updateViews() method from the Updater class to call the attached Observer's update() method
    }
    public Client find(int id)
    {    
        return (Client) super.find(id); 
    }
}
