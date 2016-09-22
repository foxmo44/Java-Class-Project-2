
/////////////////////////////////////////////////////////////////////////////////////////
// Author:	Michael Fox
// Class:	Advanced Java
// Project: Project 1
// DateDue: 2016.09.14
/////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

//Class to create the html for a row within the table
public class TableRowTag extends Tag{

    //List of row data elements
    private ArrayList<Tag> theList;

    //Default constructor for the table
    public TableRowTag()
    {
        super();

        //Instantiate the needed objects
        theList = new ArrayList<Tag>();

    }

    //Return the html representation of the entire header
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("<tr>");

        for(Tag tColumnHeader : theList)
        {
            sb.append("<td>");
            sb.append(tColumnHeader);
            sb.append("</td>");
        }

        sb.append("</tr>");

        return sb.toString();
    }

    //Add a column to the table with the input row data
    public void Add(Tag tDataItem)
    {
        theList.add(tDataItem);

    }

    //what is the size of the row in numbers of columns
    public int Size()
    {
        return(theList.size());
    }

}  //End of the Table Row Class
