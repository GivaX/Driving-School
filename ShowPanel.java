import model.*; 
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
import javax.swing.*;
//s220
public class ShowPanel extends JPanel implements MyObserver
{  
    private School school;
    //declaring the variables to create the required components including buttons, textfields and labels.
    private JLabel title = new JLabel("");
    private JButton viewBtn = new JButton("View Report");
    private JLabel instructors = new JLabel("");
    private JLabel clients = new JLabel("");
    private JLabel classes = new JLabel("");
    private JLabel lessons = new JLabel("");
    public ShowPanel(School school)
    {   
        this.school = school; //delclaring the school attribute.
        setup();
        build();
    }

    public void setup()
    {
        setLayout(new GridLayout(6,1)); //sets a layout as a grid with 6 rows and 1 coloumn.
        title.setForeground(Color.blue); // sets title font colour to blue
        viewBtn.addActionListener(new ViewListener()); //adds a listener to the button.
    } 

    public void build()
    {       
        //adds all the components to the panel into a 6x1 grid
        add(viewBtn);
        add(title);
        add(instructors);
        add(clients);
        add(classes);
        add(lessons);
    }

    public void update()
    {

    }
    private class ViewListener implements ActionListener
    {   
        public void actionPerformed(ActionEvent e)
        {   
            //title.setForeground(Color.green); //sets title colour to green
            title.setText("Report"); //sets title text to Report
            instructors.setText(school.instructors().toString()); //calls the Instuctors class's toString() method which displays all Instructor objects and sets is to the instructors label
            clients.setText(school.clients().toString()); //calls the Clients class's toString() method which displays all Client objects and sets is to the clients label
            classes.setText(school.classes().toString()); //calls the DrivingClasses class's toString() method which displays all DrivingClass objects and sets is to the classes label
            LinkedList<Lesson> theLessons = school.lessons(); //calls the lessons method and sets the LinkedList to theLessons variable
            String str = "";
            for(Lesson lesson : theLessons)
            {
                str += lesson.toString(); //iterates through the lessons linked list while calling toString() on each element and adds is to the str variable
            }
            lessons.setText(str); //sets the str variable's contents to the lessons label.
        }
    }
}