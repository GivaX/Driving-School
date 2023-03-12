package model;  

import java.util.*;
public class Records extends Updater
{
    protected LinkedList<Record> records = new LinkedList<Record>();
    protected int id = 0;
    protected void add(Record record)
    {
        records.add(record);
        updateViews(); //Calls the updateViews() method from the Updater class to call the attached Observer's update() method
    }
    public Record find(int id)
    {   
        for(Record record : records)
        {  
            if (record.matches(id))
                return record;  
        }
        return null;    
    }
    public int size()
    {   
        return records.size();    
    }
    public void show()
    {
        for(Record record : records)
        {
            record.show();
        }
    }
    public String toString()
    {
        String str = "";
        for(Record record : records)
        {
            str += record.toString() + "\n ";
        }
        return str;
    }
}
