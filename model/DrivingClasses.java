package model; 

public class DrivingClasses extends Records
{
    
    public DrivingClasses()
    {
        
    }
    public void add(String name, double price)
    {
        DrivingClass drivingClass = new DrivingClass (++id, name, price);
        add(drivingClass);
        updateViews(); //Calls the updateViews() method from the Updater class to call the attached Observer's update() method
    } 
    public DrivingClass find(int id)
    {    
        return (DrivingClass) super.find(id); 
    }
}
