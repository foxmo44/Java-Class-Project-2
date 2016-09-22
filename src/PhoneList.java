/////////////////////////////////////////////////////////////////////////////////////////
// Author:	Michael Fox
// Class:	Advanced Java
// Project: Project 2
// DateDue: 2016.09.28
/////////////////////////////////////////////////////////////////////////////////////////
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


/**
 * Created by foxmo on 9/17/2016.
 */
public class PhoneList {

    // Pattern to help with the regular expression parsing
    private Pattern                 patternLine = Pattern.compile( "[(]?[0-9]{3}[)]?-?[ ]?[0-9]{3}-[0-9]{4}" ); //Used to find the number
    private ArrayList<PhoneNumber>  theNumbers; //Will hold the various data rows.  lets the number of rows be dynamic
    private boolean                 bHasNumbers = false;

    public PhoneList()
    {
        //Instantiate the list
        theNumbers = new ArrayList<PhoneNumber>();

    }

    public PhoneList(Scanner inputFile)
    {
        //Instantiate the list
        theNumbers = new ArrayList<PhoneNumber>();

        ParseFile(inputFile);

    }

    private boolean ParseFile(Scanner inputFile)
    {
        boolean bRetValue = false;
        String  strInputLine = "";
        String  strFullNumber = "";

        /////////////////////////////////////////////////////
        // Read the data from the file
        /////////////////////////////////////////////////////
        try
        {

            //Loop through the input lines and look for phone numbers then add to the list
            while( inputFile.hasNext() )
            {
                strInputLine = inputFile.nextLine();

                //Evaluate the input line for phone numbers
                Matcher matchLine = patternLine.matcher( strInputLine );

                //Loop through the matches
                while( matchLine.find() )
                {
                    bRetValue = true; //we found at least something
                    bHasNumbers = true;

                    //print out the number that was found
                    strFullNumber = matchLine.group();
                    //System.out.print(strFullNumber + "\n");

                    //Instantiate a phone number object and add to the array of objects
                    theNumbers.add(new PhoneNumber(strFullNumber));
                }

            }

        }
        catch( NoSuchElementException nsee ){
            nsee.printStackTrace();
        }catch( IllegalStateException ise ){
            ise.printStackTrace();
        }


        return bRetValue;
    }

    //Return the string representing the list
    public String toString() {

        String strOutput = "";

        //Print out the numbers that were stored
        for (PhoneNumber n : theNumbers) {
            strOutput += n;
            strOutput += "\n";
        }

        return strOutput;
    }

    //Return if we have phone numbers in the list or not
    public boolean HasNumbers()
    {
        return bHasNumbers;
    }

    //return the string for the table
    public String toHtmlTableString()
    {
        return GetTable().toString();
    }

    //Return the table for the numbers in the lsit
    public Table GetTable()
    {
        Table theTable = new Table(25);	//Set the column width and the names of the columns
        theTable.AddHeaderColumn("Area Code");
        theTable.AddHeaderColumn("Phone Number");

        //Print out the numbers that were stored in a table row format
        for (PhoneNumber n : theNumbers) {
            theTable.CreateNewRow();		//Add a new row and then the values for that row
            theTable.AddRowValue(n.GetAreaCode());
            theTable.AddRowValue(n.GetPhoneNumber());
        }

        return theTable;
    }

}
