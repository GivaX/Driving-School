import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
import model.*; 
//s220
public class AddPanel extends JPanel 
{
    private School school;
    public AddPanel(School school)
    {   
        this.school = school;
        setup();
        build();   
    }

    private void setup()
    {   
        setLayout(new GridLayout(4, 1));    
    }

    private void build()
    {   
        add(new AddInstructor());
        add(new AddClient());
        add(new AddClass());
        add(new AddLesson());
    }
    private class AddInstructor extends JPanel implements MyObserver
    {
        //declaring the variables to create the required components including buttons, textfields and labels.
        private JLabel title = new JLabel("Add an Instructor");
        private JLabel name = new JLabel("Instructor Name: ");
        private JTextField nameTxt = new JTextField(10);
        private JButton addBtn = new JButton("Add");
        private JLabel feedback = new JLabel();
        public AddInstructor()
        {
            school.instructors().attach(this); //attached the AddInstructor panel to the Instructors model.
            setup();
            build();
        }

        private void setup()
        {  
            setLayout(new GridLayout(3,2)); //sets a layout as a grid with 3 rows and 2 coloumns.
            title.setForeground(Color.blue); // sets title font colour to blue
            addBtn.addActionListener(new InstructorListener()); //adds a listener to the button.
        }

        private void build()
        {
            //adds all the components to the panel into a 3x2 grid
            add(title);            add(Box.createHorizontalStrut(50));
            add(name);             add(nameTxt);
            add(addBtn);           add(feedback);
        }

        public void update()
        {
            feedback.setForeground(Color.green);
            feedback.setText(" Instructor added with name: " + nameTxt.getText()); //sets the text of the feedback label to show the success message
        }
        private class InstructorListener implements ActionListener
        {   
            public void actionPerformed(ActionEvent e)
            {   
                String theName = nameTxt.getText(); //assigns entered name into variable
                school.instructors().add(theName); //calls add method from Instructors class, creates and adds an Instructor object.
                nameTxt.setText(""); //sets nameTxt field to empty
            }
        }
    }
    private class AddClient extends JPanel implements MyObserver
    {
        //declaring the variables to create the required components including buttons, textfields and labels.
        private JLabel title = new JLabel("Add a Client");
        private JLabel name = new JLabel("Client Name: ");
        private JTextField nameTxt = new JTextField(10);
        private JButton addBtn = new JButton("Add");
        private JLabel feedback = new JLabel();
        public AddClient()
        {
            school.clients().attach(this); //attached the AddClient panel to the Clients model.
            setup();
            build();
        }

        private void setup()
        {    
            setLayout(new GridLayout(3,2)); //sets a layout as a grid with 3 rows and 2 coloumn.
            title.setForeground(Color.blue); // sets title font colour to blue
            addBtn.addActionListener(new ClientListener()); //adds a listener to the button.
        }

        private void build()
        {
            //adds all the components to the panel into a 3x2 grid
            add(title);            add(Box.createHorizontalStrut(50));
            add(name);             add(nameTxt);
            add(addBtn);           add(feedback);
        }

        public void update()
        {
            feedback.setForeground(Color.green);
            feedback.setText(" Client added with name: " + nameTxt.getText()); //sets the text of the feedback label to show the success message
        }
        private class ClientListener implements ActionListener
        {   
            public void actionPerformed(ActionEvent e)
            {   
                String theName = nameTxt.getText();//assigns entered name into variable
                school.clients().add(theName); //calls add method from Clients class, creates and adds a Client object.
                nameTxt.setText(""); //sets nameTxt field to empty
            }
        }
    }
    private class AddClass extends JPanel implements MyObserver
    {
        //declaring the variables to create the required components including buttons, textfields and labels.
        private JLabel title = new JLabel("Add a Driving Class");
        private JLabel name = new JLabel("Service Name: ");
        private JTextField nameTxt = new JTextField(10);
        private JLabel price = new JLabel("Cost: ");
        private JTextField priceTxt = new JTextField(10);
        private JButton addBtn = new JButton("Add");
        private JLabel feedback = new JLabel();
        public AddClass()
        {
            school.classes().attach(this); //attached the AddClass panel to the DivingClasses model.
            setup();
            build();
        }

        private void setup()
        {    
            setLayout(new GridLayout(4,2)); //sets a layout as a grid with 4 rows and 2 coloumn.
            title.setForeground(Color.blue); // sets title font colour to blue
            addBtn.addActionListener(new ClassListener()); //adds a listener to the button.
        }

        private void build()
        {
            //adds all the components to the panel into a 4x2 grid
            add(title);            add(Box.createHorizontalStrut(50));
            add(name);             add(nameTxt);
            add(price);             add(priceTxt);
            add(addBtn);           add(feedback);
        }

        public void update()
        {
            feedback.setForeground(Color.green);
            feedback.setText(" Class added with service: " + nameTxt.getText() + 
                "\n and cost: " + priceTxt.getText()); //sets the text of the feedback label to show the success message
        }
        private class ClassListener implements ActionListener
        {   
            public void actionPerformed(ActionEvent e)
            {   
                String theName = nameTxt.getText();//assigns entered name to variable
                double thePrice = Double.parseDouble(priceTxt.getText());//assigns entered price to a variable
                school.classes().add(theName, thePrice); //calls add method from DrivingClasses class, creates and adds a DrivingClass object.
                nameTxt.setText(""); //sets nameTxt field to empty
                priceTxt.setText(""); //sets priceTxt field to empty
            }
        }
    }
    private class AddLesson extends JPanel implements MyObserver
    {
        //declaring the variables to create the required components including buttons, textfields and labels.
        private JLabel title = new JLabel("Add an Appointment");
        private JLabel inId = new JLabel("Instructor ID: ");
        private JTextField inIdTxt = new JTextField(10);
        private JLabel clientId = new JLabel("Client ID: ");
        private JTextField clientIdTxt = new JTextField(10);
        private JLabel classId = new JLabel("Driving Class ID: ");
        private JTextField classIdTxt = new JTextField(10);
        private JButton addBtn = new JButton("Add");
        private JLabel feedback = new JLabel();
        public AddLesson()
        {
            school.attach(this); //attached the AddLesson panel to the School model.
            setup();
            build();
        }

        private void setup()
        {    
            setLayout(new GridLayout(5,2)); //sets a layout as a grid with 5 rows and 2 coloumn.
            title.setForeground(Color.blue); // sets title font colour to blue
            addBtn.addActionListener(new ClassListener()); //adds a listener to the button.
        }

        private void build()
        {
            //adds all the components to the panel into a 5x2 grid
            add(title);            add(Box.createHorizontalStrut(50));
            add(inId);             add(inIdTxt);
            add(clientId);         add(clientIdTxt);
            add(classId);          add(classIdTxt);
            add(addBtn);           add(feedback);
        }

        public void update()
        {
            feedback.setForeground(Color.green);
            feedback.setText(" Lesson Successfully Added"); //sets the text of the feedback label to show the success message
        }
        private class ClassListener implements ActionListener
        {   
            public void actionPerformed(ActionEvent e)
            {   
                int theInId = Integer.parseInt(inIdTxt.getText()); //assigns entered Instructor ID to variable
                int theClientId = Integer.parseInt(clientIdTxt.getText()); //assigns entered Client ID to a variable
                int theClassId = Integer.parseInt(classIdTxt.getText()); //assigns entered Driving Class ID to a variable
                if(school.instructors().find(theInId) == null) //checks if there is a matching Instuctor Object to the user entered Instructor ID
                {
                    feedback.setForeground(Color.red); //sets feedback label's colour to red
                    feedback.setText("No Matching Instructor"); //Displays error message because of no matching instructor
                }
                else if (school.clients().find(theClientId) == null) //checks if there is a matching Client Object to the user entered Cleint ID
                {
                    feedback.setForeground(Color.red);//sets feedback label's colour to red
                    feedback.setText("No Matching Client"); //Displays error message because of no matching client
                }
                else if (school.classes().find(theClassId) == null) //checks if there is a matching DrivingClass Object to the user entered Class ID
                {
                    feedback.setForeground(Color.red);//sets feedback label's colour to red
                    feedback.setText("No Matching Driving Class"); //Displays error message because of no matching driver class
                }
                else
                    school.lesson(theInId, theClientId, theClassId); //calls lesson method from School class, creates and adds a Lesson object.
                inIdTxt.setText(""); //sets inIdTxt field to empty
                clientIdTxt.setText(""); //sets clientIdTxt field to empty
                classIdTxt.setText(""); //sets classIdTxt field to empty
            }
        }
    }
}
