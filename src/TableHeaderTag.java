/////////////////////////////////////////////////////////////////////////////////////////
// Author:	Michael Fox
// Class:	Advanced Java
// Project: Project 1
// DateDue: 2016.09.14
/////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

//The class will handle the table column header
public class TableHeaderTag extends Tag{

    private ArrayList<Tag> theList; //Dynamic column header list
    int iTableWidth;

    //Default contructor
    public TableHeaderTag()
    {
        super();

        //Instantiate the needed objects
        theList = new ArrayList<Tag>();
        iTableWidth++;
    }

    //Return the html representation of the entire header
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("<tr>");

        for(Tag tColumnHeader : theList)
        {
            sb.append("<th>");
            sb.append(tColumnHeader);
            sb.append("</th>");
        }

        sb.append("</tr>");

        return sb.toString();
    }

    //Add a column to the table with the input column header
    public void Add(Tag tColumnHeader)
    {
        theList.add(tColumnHeader);
        iTableWidth = theList.size();
    }

    //what is the size of the header in numbers of columns
    public int Size()
    {
        return(iTableWidth);
    }

} //End of the TableHeaderTag Class
