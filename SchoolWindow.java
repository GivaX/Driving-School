import model.*; 
import java.awt.*;
import javax.swing.*; 
//s220
public class SchoolWindow extends JFrame
{
    public SchoolWindow(School school)
    {   
        super("Dodgems");
        setup();
        build(school);
        setVisible(true);   
    }
    private void setup()
    {   setSize(600, 750);
        setDefaultCloseOperation(EXIT_ON_CLOSE);    
    } 
    private void build(School school)
    {   
        add(new Tabber(school));  
    }
    private class Tabber extends JTabbedPane
    {
        public Tabber(School school)
        {  
            add("Add", new AddPanel(school));
            add("Show", new ShowPanel(school));
        }
    }
}
