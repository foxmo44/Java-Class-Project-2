/////////////////////////////////////////////////////////////////////////////////////////
// Author:	Michael Fox
// Class:	Advanced Java
// Project: Project 1
// DateDue: 2016.09.14
/////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

public class Table extends Tag  //The containing table object that will contain the table header object and all of the table rows
{
    private TableHeaderTag theTableHeader;
    private ArrayList<TableRowTag> theDataRows; //Will hold the various data rows.  lets the number of rows be dynamic

    private int iTableWidth;
    private int iNumberOfColumns;               //Number of columns dynamically added to the table

    //Default table
    public Table()
    {
        super();

        //Instantiate the needed objects
        theDataRows = new ArrayList<TableRowTag>();
        theTableHeader = new TableHeaderTag();

        //Initialize the width of the table
        iTableWidth = 100;
        iNumberOfColumns = 0;
    }

    //Default constructor with the table width as an input
    public Table(int iTW)
    {
        super();

        //Instantiate the needed objects
        theDataRows = new ArrayList<TableRowTag>();
        theTableHeader = new TableHeaderTag();

        //Initialize the width of the table
        iTableWidth = iTW;
        iNumberOfColumns = 0;
    }

    ///////////////////////////////////////////////////////////////////////////
    // Dynamically build the header column tag
    ///////////////////////////////////////////////////////////////////////////
    public void AddHeaderColumn(String strColumnName)
    {
        theTableHeader.Add(new ItemTag(strColumnName));

        iNumberOfColumns++; //Increment the number of columns that we have
    }

    //Add a new row to the dynamic list
    public void CreateNewRow()
    {
        theDataRows.add(new TableRowTag());
    }

    //Add a value to the latest created row
    public void AddRowValue(String strRowValue)
    {
        TableRowTag lastRow = theDataRows.get(theDataRows.size() - 1);

        lastRow.Add(new ItemTag(strRowValue));
    }

    ///////////////////////////////////////////////////////////////////////////
    // Output the html that represents the data and the header for the table
    ///////////////////////////////////////////////////////////////////////////
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        sb.append("<table border=\"1\" style=\"width:" + iTableWidth +"%\">" );

        sb.append(theTableHeader);

        for(TableRowTag Row: theDataRows)
        {
            sb.append(Row);
        }

        sb.append("</table>");

        return sb.toString();
    }
}  //End of the table class


/*  Table example in html

<table style="width:100%">
  <tr>
    <th>Firstname</th>
    <th>Lastname</th>
    <th>Age</th>
  </tr>
  <tr>
    <td>Jill</td>
    <td>Smith</td>
    <td>50</td>
  </tr>
  <tr>
    <td>Eve</td>
    <td>Jackson</td>
    <td>94</td>
  </tr>
</table>

 */