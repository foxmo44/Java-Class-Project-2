/////////////////////////////////////////////////////////////////////////////////////////
// Author:	Michael Fox
// Class:	Advanced Java
// Project: Project 1
// DateDue: 2016.09.14
/////////////////////////////////////////////////////////////////////////////////////////
// Note this is the code from class and is not used in the final solution.  it is kept
// in the project in case it is needed in a future project assignment.
/////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

//This class will create the string for the list tag html
public class ListTag extends Tag{

    private boolean ordered;            //Is this an order list or not
    private ArrayList<Tag> theList;     //used to store the list items during html string creation

    //Constructor used with a ordered flag as an input
    public ListTag( boolean t)
    {
        super();
        theList = new ArrayList<Tag>();
        ordered = t;
    }

    //Setter for the ordered flag
    public void setOrdered(boolean t)
    {
        ordered = t;
    }

    //Getter for the ordered flag
    public boolean getOrdered()
    {
        return ordered;
    }

    //Add to the list
    public void appendContent(Tag t)
    {
        theList.add(t);
    }

    //Return the html string for the list tag
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        if(ordered)
        {
            sb.append( "<ol>");
        }
        else
        {
            sb.append( "<ul>");
        }

        for(Tag t : theList)
        {
            sb.append("<li>");
            sb.append(t.toString());
            sb.append("</li>");
        }

        if(ordered)
        {
            sb.append( "</ol>");
        }
        else
        {
            sb.append( "</ul>");
        }

        return sb.toString();
    }

}   //End of the List Tag Class