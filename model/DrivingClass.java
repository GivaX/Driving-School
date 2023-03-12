package model; 

public class DrivingClass extends Record
{
    private double cost;
    public DrivingClass(int id, String name, double cost)
    {
       super(id, name);
       this.cost = cost;
    }
    public String toString() 
    {
        return "Class: " + super.toString() + " cost $ " + cost;
    }
}
