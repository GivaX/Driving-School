package model; 
import java.util.*;
public class School extends Updater
{
    Instructors instructors = new Instructors ();
    Clients clients = new Clients ();
    DrivingClasses classes = new DrivingClasses ();
    LinkedList<Lesson> lessons = new LinkedList<Lesson>();
    int lessonId = 0;
    public School()
    {
    }
    public void lesson(int instructor, int client, int drivingClass)
    {
        lessons.add(new Lesson(++lessonId, instructors.find(instructor), clients.find(client), classes.find(drivingClass)));
        updateViews(); //Calls the updateViews() method from the Updater class to call the attached Observer's update() method
    }
    public String report()
    {
        String str = "";
        str += "Instructors \n" + instructors.toString();
        str += "Clients \n" + clients.toString();
        str += "Classes \n" + classes.toString();
        str += "Lessons \n";
        for(Lesson lesson : lessons)
        {
            str += lesson.toString();
        }
        return str;
    }
    public Instructors instructors()
    {
        return instructors;
    }
    public Clients clients()
    {
        return clients;
    }
    public DrivingClasses classes()
    {
        return classes;
    }
    public LinkedList<Lesson> lessons()
    {
        return lessons;
    }
}
