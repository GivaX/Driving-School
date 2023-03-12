package model; 

public class Lesson extends Updater
{
    private int id;
    private Instructor instructor;
    private Client client;
    private DrivingClass danceClass;
    public Lesson(int id, Instructor instructor, Client client, DrivingClass danceClass)
    {
       this.id = id;
       this.instructor = instructor;
       this.client = client;
       this.danceClass = danceClass;
    }
    public String toString()
    {
        return id + " Instructor: " + instructor.getName() + " Client " + client.getName() + " Class " + danceClass.getName();
    }
    public void show()
    {
        System.out.println(toString());
    }
     
}
