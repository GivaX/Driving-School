package model;
 
public class Instructors extends Records
{
    
    public Instructors()
    {
      
    }
    public void add(String name)
    {
        Instructor instructor = new Instructor (++id, name);
        add(instructor);
        updateViews(); //Calls the updateViews() method from the Updater class to call the attached Observer's update() method
    }
    public Instructor find(int id)
    {    
        return (Instructor) super.find(id); 
    }
     
}
