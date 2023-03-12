package model; 

public class Instructor extends Record
{
    
    public Instructor(int id, String name)
    {
       super(id, name);
    }
    public String toString()
    {
        return "Instructor: "+ super.toString();
    }
}
 